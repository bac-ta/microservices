package demo.service.framework.security;

public interface EncryptService {

    String encrypt(String rawValue);

    boolean matches(String rawValue, String encryptedValue);
}
