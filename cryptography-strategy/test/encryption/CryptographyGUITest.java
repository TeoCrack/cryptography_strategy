package encryption;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CryptographyGUITest {
    
    CryptographyGUI cryptic =  new CryptographyGUI();

    @BeforeEach
    void setUp() throws Exception {
        //
    }
    

    @Test
    void encryptWithKeyWithCopy() {
        /**
         * Purpose: to encrypt a plain text with its selection algorithm = COPY
         * Method: encryptWithKey(String plainText, int key)
         * Initialization: A plaintext to be decrpted  and a key
         * Parameters: 
         * Correct Result: 
        */
        
        
        cryptic.selectedEncryption = "Copy";
        String plainText = "Hello";
        
        assertEquals(plainText, cryptic.encryptWithKey(plainText, 0));
  
    }
    
    @Test
    void encryptWithKeyWithCaesar() {
        /**
         * Purpose: to encrypt a plain text with its selection algorithm = CAESAR
         * Method: encryptWithKey(String plainText, int key)
         * Initialization: A plaintext to be decrpted  and a key
         * Parameters: 
         * Correct Result: "Qnuux"
        */
        
        cryptic.selectedEncryption = "Caesar cipher";
        String plainText = "Hello";
        
        assertEquals("Qnuux", cryptic.encryptWithKey(plainText, 9));
        
        
    }
    
    @Test
    void encryptWithKeyWithScytale() {
        /**
         * Purpose: to encrypt a plain text with its selection algorithm = SCYTALE
         * Method: encryptWithKey(String plainText, int key)
         * Initialization: A plaintext to be decrpted  and a key
         * Parameters: 
         * Correct Result: "To hxle a jzquyum ipdcsok g o.bv re or w  nt  h fe "
        */
        
        cryptic.selectedEncryption = "Scytale";
        String plainText = "The quick brown fox jumps over the lazy dog.";
        
        assertEquals("To hxle a jzquyum ipdcsok g o.bv re or w  nt  h fe ", cryptic.encryptWithKey(plainText, 17));   
        
    }
    
    
    @Test
    void decryptWithKeyWithCopy() {
        
        /**
         * Purpose: to decrypt a plain text with its selection algorithm = COPY
         * Method: decryptWithKey(String cipherText, int key)
         * Initialization: A cipher text to be decrpted and a key 
         * Parameters: ("Hello",0)
         * Correct Result: "Hello"
        */
        
        cryptic.selectedEncryption = "Copy";
        String plainText = "Hello";
        
        assertEquals(plainText, cryptic.decryptWithKey(plainText, 0));
  
    }
    
    @Test
    void decryptWithKeyWithCaesar() {
        
        /**
         * Purpose: to decrypt a plain text with its selection algorithm = CAESAR
         * Method: decryptWithKey(String cipherText, int key)
         * Initialization: A cipher text to be decrpted and a key 
         * Parameters: ("Qnuux",9)
         * Correct Result: "Hello"
        */
        
        cryptic.selectedEncryption = "Caesar cipher";
        String plainText = "Qnuux";
        
        assertEquals("Hello", cryptic.decryptWithKey(plainText, 9));
        
        
    }
    
    @Test
    void decryptWithKeyWithScytale() {
        /**
         * Purpose: to decrypt a plain text with its selection algorithm = SCYTALE
         * Method: decryptWithKey(String cipherText, int key)
         * Initialization: A cipher text to be decrpted and a key 
         * Parameters: ("To hxle a jzquyum ipdcsok g o.bv re or w  nt  h fe ", 17)
         * Correct Result: "The quick brown fox jumps over the lazy dog.       "
        */
        
        cryptic.selectedEncryption = "Scytale";
        String plainText = "To hxle a jzquyum ipdcsok g o.bv re or w  nt  h fe ";
        
        assertEquals("The quick brown fox jumps over the lazy dog.       ", cryptic.decryptWithKey(plainText, 17));   
        
    }
    
    
    @Test
    void testSelectedAlgorithmCopy(){
        /**
         * Purpose: check if the selected algorithm is Copy
         * Method: selectEncryption(String selected)
         * Initialization: selectedEncryption = "Copy"
         * Parameters: "Copy"
         * Correct Result: "Copy"
         */
        
        cryptic.selectedEncryption = "Copy";
        
        
        
        assertEquals("Copy", cryptic.selectEncryption("Copy"));
    }
    
    @Test
    void testSelectedAlgorithmCaesar(){
        /**
         * Purpose: check if the selected algorithm is Caesar
         * Method: selectEncryption(String selected)
         * Initialization: selectedEncryption = "Scytale"
         * Parameters: "Caesar cipher"
         * Correct Result: "Caesar cipher"
         */
        
        
        cryptic.selectedEncryption = "Caesar cipher";
        
        
        assertEquals("Caesar cipher", cryptic.selectEncryption("Caesar cipher"));
    }
    
    @Test
    void testSelectedAlgorithmScytale(){
        /**
         * Purpose: check if the selected algorithm is Scytale
         * Method: selectEncryption(String selected)
         * Initialization: selectedEncryption = "Scytale"
         * Parameters: "Scytale"
         * Correct Result: "Scytale"
         */
        
        
        cryptic.selectedEncryption = "Scytale";
        
        assertEquals("Scytale", cryptic.selectEncryption("Scytale"));
    }



}
