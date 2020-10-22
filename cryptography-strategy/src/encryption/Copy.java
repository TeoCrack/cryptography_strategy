package encryption;

/**
 * Copy algorithm copies the plain text to cipher text and vice versa
 * @author turkson
 * @version 01/10/2020
 */
public class Copy implements EncryptionAlgorithm {

    /**
     * Copies the plain text
     * @param text plaintext
     * @param key a number that is not used in this method
     * @return String a copy of the plainText
     */
    @Override
    public String encrypt(String text, int key) {
        //returns the same copy of the plaintext
        return text;
    }

    /**
     * Copies the cipher text
     * @param text cipher text
     * @param key a number that is not needed
     * @return String a copy of the cipher text
     */
    @Override
    public String decrypt(String text, int key) {
        //returns the same copy of the cipher text
        return text;
    }

}
