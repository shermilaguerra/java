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
        assertThrows(ArithmeticException.class, () -> {
            calc.dividir(5, 0);
        });
    }
    
    @Test
    void testPotencia() {
        assertEquals(8, calc.potencia(2, 3));
        assertEquals(1, calc.potencia(5, 0));
        assertEquals(1, calc.potencia(1, 100));
    }
    
    @Test
    void testPotenciaExpoenteNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.potencia(2, -1);
        });
    }
    
    @Test
    void testFatorial() {
        assertEquals(1, calc.fatorial(0));
        assertEquals(1, calc.fatorial(1));
        assertEquals(2, calc.fatorial(2));
        assertEquals(6, calc.fatorial(3));
        assertEquals(24, calc.fatorial(4));
        assertEquals(120, calc.fatorial(5));
    }
    
    @Test
    void testFatorialNumeroNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.fatorial(-1);
        });
    }
}
