package encryption;


/**
 * The Scytale cipher is a cipher that uses transposition rather than substitution,
 * meaning that it changes the order of letters. This algorithm works by first writing
 * the letters in rows with a fixed number of columns. This Scytale class encrypts the plainText
 * and decrypt the cipher text provided in the CryptographyGUI.java
 * @author turkson
 * @version 01/10/2020
 */
public class Scytale implements EncryptionAlgorithm {




    /**
     * Prints out the encrypted text using  fixed number of columns
     * provided as keys, and divided the text into a 2D array.
     * @param text plainText to be encrypted
     * @param key represent the number of columns
     * @return String encodedText
     */
    @Override
    public String encrypt(String text, int key) {

        //stores the encodedText
        String encodedText = "";


        //find the number of rows
        int numRows = (int) Math.ceil((double)text.length() / key);

        //create a 2D array to store the plainText
        String [][] textText = new String[numRows][key];

        //index to track position
        int index = 0;

        //split plainText seperated by no whitespace
        String [] words = text.split("");
       // System.out.println("NumRows: "+ numRows);

        //fills the 2D array
        for(int i = 0; i <  numRows ; i ++) {
            for(int j = 0; j < key ; j++) {

                 //index of the text being split reaches its full capacity
                 //and the array is not empty, the current index position
                 //should be filled with a space character.
                 if(index == words.length) {
                    textText[i][j] = " ";
                    }
                 else{
                  textText[i][j] = words[index];
                  index ++;
                  }
           }
        }

        //building the encoded text
        //the encoded text is formed by printing out the the element in this form [row0][col0],[row1][col0]...
        //row by row
        for (int i = 0; i < key; ++i) {
            for(int j = 0; j < numRows; ++j) {
                encodedText+=textText[j][i];
            }
        }

        return encodedText;
    }

    /**
     * Prints out the decrypted text using fixed number of columns
     * provided as keys, and divided the text into a 2D array
     * @param text ciphered Text
     * @key number of fixed columns
     * @return String decrypted text
     */
    @Override
    public String decrypt(String text, int key) {

        //stores the decoded text
        String decodedText = "";

        //finds the number of rows
        int rows = (int)Math.ceil(text.length()/key);

        //create a 2D array to store the cipherText
        String [][] array = new String[rows][key];

      //split cipherText seperated by no whitespace
        String [] word = text.split("");

        //index to track position
        int num = 0;

      //fills the 2D array
        for(int i = 0; i <  key ; i ++) {
            for(int j = 0; j < rows ; j++) {

                //index of the text being split reaches its full capacity
                //and the array is not empty, the current index position
                //should be filled with a space character.
                 if(num == word.length) {

                    array [j][i] = " ";

                }
                else{
                  array [j][i] = word[num];
                 num ++;
              }
           }
        }



        //building the decoded text
        //the decoded text is formed by printing out the the element in this form [row0][col0],[row0][col1]...
        //column by column
        for (int i = 0; i < rows; ++i) {
            for(int j = 0; j < key; ++j) {
                decodedText+=array[i][j];
            }
        }
        return decodedText;


    }

}
