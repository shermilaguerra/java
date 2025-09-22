/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Produto {
    private String nome;
    private double preco;
    
    public Produto(String nome, double preco) {
        if (preco < 0) throw new IllegalArgumentException("Preço não pode ser negativo");
        this.nome = nome;
        this.preco = preco;
    }
    
    public double aplicarDesconto(double percentual) {
        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException("Desconto inválido");
        }
        return preco * (1 - percentual/100);
    }
}