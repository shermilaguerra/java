/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    
    private Calculadora calc;
    
    @BeforeEach
    void setUp() {
        calc = new Calculadora();
    }
    
    @Test
    void testSomar() {
        assertEquals(5, calc.somar(2, 3));
        assertEquals(0, calc.somar(-2, 2));
        assertEquals(-5, calc.somar(-2, -3));
    }
    
    @Test
    void testSubtrair() {
        assertEquals(1, calc.subtrair(3, 2));
        assertEquals(-1, calc.subtrair(2, 3));
        assertEquals(0, calc.subtrair(5, 5));
    }
    
    @Test
    void testMultiplicar() {
        assertEquals(6, calc.multiplicar(2, 3));
        assertEquals(0, calc.multiplicar(5, 0));
        assertEquals(-6, calc.multiplicar(2, -3));
    }
    
    @Test
    void testDividir() {
        assertEquals(2.5, calc.dividir(5, 2), 0.001);
        assertEquals(0.333, calc.dividir(1, 3), 0.001);
    }    

    @Test
    void testDividirPorZero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0));
        assertEquals("Divisão por zero!", exception.getMessage());
    }
    
    
    
    
}
