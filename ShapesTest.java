/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.github;

import static java.time.Duration.ofMillis;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author Adrian
 */
public class ShapesTest {
    
    private Shapes Rectangle1;
    private Shapes Rectangle2;
    private Shapes Rectangle3;

    public ShapesTest(){
        
    }
    //Adrian Bennett
    @BeforeEach
    public void setUp(){
    Shapes Rectangle1 = new Shapes("rec1",12,5);
    Shapes Rectangle2 = new Shapes("rec2",99,6);
    Shapes Rectangle3 = Rectangle1;
        
    }

    
    //Adrian Bennett
    @Test
    public void testEquality(){

        assertEquals(Rectangle1, Rectangle3);
    }
    
    //Adrian Bennett
    @Test
    public void testIdentity(){
        
        assertSame(Rectangle3,Rectangle1);
    }
    
    //Adrian Bennett
     @Test
    void timeoutExceeded() {

        assertTimeout(ofMillis(10), () -> {
            Thread.sleep(100);
        });
    }

    //Adrian Bennett
    @Test
    @Disabled
    public void testSetShapes () {
    System.out.println("Ignore test");
    }

}
