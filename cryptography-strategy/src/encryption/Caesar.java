package encryption;

/**
 * The Caesar cipher is a very simple algorithm. Each letter is shifted
 * a constant amount as shown in the figure below. Here the top
 * row shows an unencrypted character. The arrow connects the character
 * to the character 3 positions later in ASCII, which is the encrypted letter.
 * @author turkson
 * @version 01/10/2020
 */

public class Caesar implements EncryptionAlgorithm {

    /**
     * Encrypts the plain text
     * @param text plain text
     * @param key the number of shits to the left
     * @return String encodedtext
     */
    @Override
    public String encrypt(String text, int key) {

        //stores new character at its specific integer
        String str;

        //saves the encodedText
        String encodedText = "";

        for(int i = 0; i < text.length(); i ++){

            //first character
            char character = text.charAt(i);

            //converts the character to an ascii integer
            int ascii = character;

            //add the number of shits to the ascii number
            int newAscii = ascii + key;

            //stores the new string for that new ascii number
            str = Character.toString((char)newAscii);

            //saves the string
            encodedText += str;
          }


        return encodedText ;
    }

    /**
     * Decrypt the ciphered text
     * @param text plain text
     * @param key tthe number of shits to the left
     * @return String encodedtext
     */
    @Override
    public String decrypt(String text, int key) {
        //stores new character at its specific integer
        String str;

        //saves the encodedText
        String decodedText = "";

        for(int i = 0; i < text.length(); i ++){
            //first character
            char character = text.charAt(i);

            //converts the character to an ascii integer
            int ascii = character;

            //substract the number of shits to the ascii number
            int newAscii = ascii - key;

            //stores the new string for that new ascii number
            str = Character.toString((char)newAscii);

            //saves the string
            decodedText += str;

        }

        return decodedText;

    }

}
