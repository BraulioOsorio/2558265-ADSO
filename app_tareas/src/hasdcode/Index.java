package hasdcode;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class Index {
    
    String originalString = "1234"; //ejemplo de la contraseña
    String secretKey = "mySecretKey12345"; // Llave secreta de 16, 24 o 32 bytes
    public Index(){ }
        /*
        String encryptedString = encrypt(originalString, secretKey);
        System.out.println("Encrypted: " + encryptedString);

        String decryptedString = decrypt(encryptedString, secretKey);
        System.out.println("Decrypted: " + decryptedString);
        */
    

    public static String encrypt(String strToEncrypt, String secretKey) throws Exception {
        SecretKeySpec keySpec = new SecretKeySpec(secretKey.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, keySpec);
        byte[] encryptedBytes = cipher.doFinal(strToEncrypt.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    public static String decrypt(String strToDecrypt, String secretKey) throws Exception {
        SecretKeySpec keySpec = new SecretKeySpec(secretKey.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, keySpec);
        byte[] decodedBytes = Base64.getDecoder().decode(strToDecrypt);
        byte[] decryptedBytes = cipher.doFinal(decodedBytes);
        return new String(decryptedBytes);
    }
}
