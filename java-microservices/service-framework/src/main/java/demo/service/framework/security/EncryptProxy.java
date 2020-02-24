package demo.service.framework.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EncryptProxy {

    private final EncryptService bCryptService;
    private final EncryptService shaPasswordService;

    @Autowired
    public EncryptProxy(
            @Qualifier(value = "bCryptService") EncryptService bCryptService,
            @Qualifier(value = "shaPasswordService") EncryptService shaPasswordService) {
        this.bCryptService = bCryptService;
        this.shaPasswordService = shaPasswordService;
    }

    public String encrypt(String password) {
        return bCryptService.encrypt(password);
    }

    public boolean matches(String password, String encryptedValue) {
        if (shaPasswordService.matches(password, encryptedValue)) {
            return true;
        }
        return bCryptService.matches(password, encryptedValue);
    }
}
