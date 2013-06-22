/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class ItemDeProjeto {

    private String nome;
    private double valor; 
    private ArrayList<Aresta> listaDeArestas = new ArrayList<>();
    private boolean  temPai = false;

    public ItemDeProjeto(String nome, double valor) {
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

    public String toString() {
        return nome;
    }
    
    public ArrayList<Aresta> getListaDeArestas() {
        return listaDeArestas;
    }

    public void setListaDeArestas(ArrayList<Aresta> listaDeArestas) {
        this.listaDeArestas = listaDeArestas;
    }
    public void addAresta(Aresta aresta){
    listaDeArestas.add(aresta);
    }

    public boolean isTemPai() {
        return temPai;
    }

    public void setTemPai(boolean temPai) {
        this.temPai = temPai;
    }
    
}
