package demo.service.framework.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service(value = "bCryptService")
public class BCryptService implements EncryptService {

    private final PasswordEncoder encoder;

    public BCryptService() {
        this(new BCryptPasswordEncoder());
    }

    public BCryptService(PasswordEncoder encoder) {
        this.encoder = encoder;
    }

    @Override public String encrypt(String rawValue) {
        return encoder.encode(rawValue);
    }

    @Override public boolean matches(String rawValue, String encryptedValue) {
        return encoder.matches(rawValue, encryptedValue);
    }
}
