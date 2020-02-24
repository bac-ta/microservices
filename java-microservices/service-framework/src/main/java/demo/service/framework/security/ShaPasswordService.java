package demo.service.framework.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.springframework.security.crypto.codec.Utf8;
import org.springframework.stereotype.Service;

@Service(value = "shaPasswordService")
public class ShaPasswordService implements EncryptService {

    // Static variables
    // ------------------------------------------------------------------------
    private static final String ALGORITHM = "SHA-512";
    private static final String SALT = "demo";

    // Override methods
    // ------------------------------------------------------------------------
    @Override public String encrypt(String rawValue) {

        MessageDigest messageDigest = getMessageDigest();
        messageDigest.update(Utf8.encode(rawValue));
        byte[] bytes = messageDigest.digest(Utf8.encode(SALT));
        String hash = convertToHex(bytes);

        return hash;
    }

    @Override public boolean matches(String rawValue, String encryptedValue) {

        if (rawValue == null || encryptedValue == null) {
            return false;
        }

        String hash = encrypt(rawValue);
        boolean result = encryptedValue.equals(hash);

        return result;
    }

    // Private methods
    // ------------------------------------------------------------------------

    /**
     * Get a MessageDigest instance for the given algorithm. Throws an IllegalArgumentException if
     * <i>algorithm</i> is unknown
     *
     * @return MessageDigest instance
     * @throws IllegalArgumentException if NoSuchAlgorithmException is thrown
     */
    private MessageDigest getMessageDigest() throws IllegalArgumentException {
        try {
            return MessageDigest.getInstance(ALGORITHM);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException("No such algorithm [" + ALGORITHM + "]");
        }
    }

    /**
     * Converts the given byte[] to a hex string.
     *
     * @param raw the byte[] to convert
     * @return the string the given byte[] represents
     */
    private String convertToHex(byte[] raw) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < raw.length; i++) {
            sb.append(Integer.toString((raw[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }
}
