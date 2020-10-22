package encryption;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CopyTest {
    
    Copy copy = new Copy();

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
         * Parameters: (text, 6) (anotherText, 6)
         * Correct Result: text, anotherText
        */
        
        String text = "I am living my best life";
        String anotherText = "A third algorithm";
        int key = 6;
        
        
        assertEquals("I am living my best life", copy.encrypt(text, key));
        assertEquals("A third algorithm", copy.encrypt(anotherText, key));
        
    }

    @Test
    void testDecrypt() {
        /**
         * Purpose: to decrpyt a message
         * Method: decrypt(String text, int key)
         * Initialization: A cipher text to be decrpted and a key 
         * Parameters: (text, 6) (anotherText, 6)
         * Correct Result: text, anotherText
        */
        
        String text = "I am living my best life";
        String anotherText = "A third algorithm";
        int key = 6;
        
        
        assertEquals("I am living my best life", copy.decrypt(text, key));
        assertEquals("A third algorithm", copy.decrypt(anotherText, key));
    }

}
