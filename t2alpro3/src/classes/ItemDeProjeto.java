/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Gustavo
 */
public class ItemDeProjeto {
    private String nome;
    private double valor;

    public ItemDeProjeto(String nome, int valor) {
       this.nome = nome;
       this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public String toString(){
    return nome;
    }
}
