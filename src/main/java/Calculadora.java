/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Calculadora {
    
    public int somar(int a, int b) {
        return a + b;
    }
    
    public int subtrair(int a, int b) {
        return a - b;
    }
    
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida");
        }
        return (double) a / b;
    }
    
    public int potencia(int base, int expoente) {
        if (expoente < 0) {
            throw new IllegalArgumentException("Expoente não pode ser negativo");
        }
        
        int resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }
    
    public int fatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Número não pode ser negativo");
        }
        
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
