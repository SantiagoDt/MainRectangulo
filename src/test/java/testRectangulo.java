/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.mainrectangulo.Rectangulo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Santiago
 */
public class testRectangulo {
    
   
    
    @Test
    public void testperimetro(){
       Rectangulo rec1 = new Rectangulo();
       assertEquals(7,rec1.perimetro());
        
    }
    
    @Test
    public void testArea(){
       Rectangulo rec1 = new Rectangulo();
       assertEquals(7,rec1.getArea());
        
    }
    

    
}