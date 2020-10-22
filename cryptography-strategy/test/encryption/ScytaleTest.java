package encryption;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ScytaleTest {
    

    Scytale scytale = new Scytale();

    @BeforeEach
    void setUp() throws Exception {
        //
    }

    @Test
    void testEncrypt() {
        
        /**
         * Purpose: to encrypt a message
         * Method: encrypt(String text, int key)
         * Initialization: A plaintext to be decrpted  and a key
         * Parameters: "I am living my best life", 6  - "A third algorithm", 6
         * Correct Result: "Adr  itathlhigmro " "Iimt vy ai lmnbi gefl se"
        */
        
        String text = "I am living my best life";
        String anotherText = "A third algorithm";
        int key = 6;
        
        assertEquals("Adr  itathlhigmro ",scytale.encrypt(anotherText, key));
        assertEquals("Iimt vy ai lmnbi gefl se",scytale.encrypt(text, key));
        
        
        
    }

    @Test
    void testDecrypt() {
        /**
         * Purpose: to decrpyt a message
         * Method: decrypt(String text, int key)
         * Initialization: A cipher text to be decrpted and a key 
         * Parameters:"Iimt vy ai lmnbi gefl se", 6 -   "Adr  itathlhigmro ", 6
         * Correct Result: "I am living my best life", "A third algorithm "
        */
        
        String text = "Iimt vy ai lmnbi gefl se";
        String anotherText = "Adr  itathlhigmro ";
        int key = 6;
        
        
        assertEquals("I am living my best life",scytale.decrypt(text, key));
        assertEquals("A third algorithm ", scytale.decrypt(anotherText, key));
        
    }

}
