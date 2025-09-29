/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {
    
    @Test
    void testCriarProdutoComPrecoValido() {
        Produto produto = new Produto("Notebook", 1500.00);
        assertEquals(1500.00, produto.aplicarDesconto(0), 0.01);
    }
    
    @Test
    void testAplicarDescontoValido() {
        Produto produto = new Produto("Mouse", 100.00);
        double precoComDesconto = produto.aplicarDesconto(10);
        assertEquals(90.00, precoComDesconto, 0.01);
    }
    
    @Test
    void testAplicarDescontoInvalido() {
        Produto produto = new Produto("Teclado", 200.00);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
            () -> produto.aplicarDesconto(150));
        assertEquals("Desconto inválido", exception.getMessage());
    }
}
