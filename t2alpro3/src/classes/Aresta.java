/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Gustavo
 */
public class Aresta {

    private ItemDeProjeto destino;
    private double valor;


    Aresta(ItemDeProjeto destino, double valor) {
       this.destino = destino;
     this.valor = valor;
    }

 

    public ItemDeProjeto getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
      //  this.destino = destino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    
    
}
