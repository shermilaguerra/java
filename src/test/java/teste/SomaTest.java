/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SomaTest {
    
    @Test
    public void testSomarDoisNumeros() {
        Soma soma = new Soma();
        assertEquals(5, soma.somar(2, 3));
    }
    
    @Test
    public void testSomarTresNumeros() {
        Soma soma = new Soma();
        assertEquals(10, soma.somar(2, 3, 5));
    }
    
    @Test
    public void testSomarArray() {
        Soma soma = new Soma();
        int[] numeros = {1, 2, 3, 4, 5};
        assertEquals(15, soma.somar(numeros));
    }
    
    @Test
    public void testSomarComZero() {
        Soma soma = new Soma();
        assertEquals(7, soma.somar(7, 0));
    }
    
    @Test
    public void testSomarNegativos() {
        Soma soma = new Soma();
        assertEquals(-5, soma.somar(-2, -3));
    }
}
