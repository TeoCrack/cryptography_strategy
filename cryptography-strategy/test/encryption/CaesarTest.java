package encryption;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CaesarTest {
    
    Caesar caesar = new Caesar();

    @BeforeEach
    void setUp() throws Exception {
        //
    }

    @Test
    void testEncrypt() {
        
        /**
         * Purpose: to encrypt a message
         * Method: encrypt(String text, int key)
         * Initialization: A plaintext to be decrpted and a key
         * Parameters: ("hello",3) ("i love ou", 7)
         * Correct Result: "khoor", "p'sv}l'v|"
        */
        
        String name = "hello";
        String word = "i love ou";
        int key = 3;
        int keyOne = 7;
        
        //caesar.encrypt(name,key);
        
        assertEquals("khoor", caesar.encrypt(name,key));
        assertEquals("p'sv}l'v|", caesar.encrypt(word, keyOne));
    }
    
    @Test
    void testEncryptEmptyString() {
        
        /**
         * Purpose: to encrypt a message
         * Method: encrypt(String text, int key)
         * Initialization: A plaintext to be decrpted and a key
         * Parameters: ("",3), ("",7)
         * Correct Result: "", ""
        */
        String name = "";
        //String word = "i love ou";
        int key = 3;
        int keyOne = 7;
        
        //caesar.encrypt(name,key);
        
        assertEquals("",caesar.encrypt(name,key));
        assertEquals("",caesar.encrypt(name, keyOne));
    }
    
    
    @Test
    void testEncryptWithSpace() {
        /**
         * Purpose: to encrypt a message
         * Method: encrypt(String text, int key)
         * Initialization: A plaintext to be decrpted and a key
         * Parameters: (" ",3), (" ", 7)
         * Correct Result: "#", "\'"
        */
        
        String name = " ";
        //String word = "i love ou";
        int key = 3;
        int keyOne = 7;
        
        //caesar.encrypt(name,key);
        
        assertEquals("#",caesar.encrypt(name,key));
        assertEquals("\'",caesar.encrypt(name, keyOne));
    }
    
    
  

    @Test
    void testDecrypt() {
        
        /**
         * Purpose: to decryptic a message
         * Method: decrypt(String text, int key)
         * Initialization: A cipher text to be decrpted and a key 
         * Parameters: ("khoor", 3)
         * Correct Result: "hello"
        */
        String name = "khoor";
        int key = 3;
        
        //caesar.encrypt(name,key);
        
        assertEquals("hello", caesar.decrypt(name,key));
    }
    
    

}
