package encryption;
/**
 * EncryptionAlgotihm  is an interface the contains methods to be 
 * implemented by the various types of algorithms
 * @author Nana Aba Turkson
 * @version 01/10/2020
 */

public interface EncryptionAlgorithm {
  
    /**
     * @param text plaintext to be encrypted 
     * @param key purpose depends on what specific encryption algorithm is chosen
     * @return String encypted text
     */
    public String encrypt(String text, int key);
  
    /**
     * @param text cipherText to be decrypted
     * @param key purpose depends on what specific encryption algorithm is chosen
     * @return String decrypted text
     */
    public String decrypt(String text, int key);

}
