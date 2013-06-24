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
public class ProjetoImpressao {
ArrayList<ItemDeProjeto> lista_itens = new ArrayList<>();
private String result;
        //static int valortotal = 0;

        public void adicionaItensDeProjeto(String nome, double valor)
        {
            
            lista_itens.add(new ItemDeProjeto(nome, valor));
        }
        
        public void addAresta(String origem, String destino, double valor)
        {
            
            for (ItemDeProjeto item: lista_itens)
            {
                if (item.getNome().equalsIgnoreCase(origem))
                {
                    result += origem;
                    for (ItemDeProjeto itemDestino: lista_itens)
                    {
                        if (itemDestino.getNome().equalsIgnoreCase(destino))
                        {
                            result += "->"+destino;
                            itemDestino.setTemPai(true);
                            Aresta aresta = new Aresta(itemDestino,valor);
                            item.addAresta(aresta);
                        }
                    }
                }
            }
        }

        public  ArrayList<ItemDeProjeto> encontrarORaiz()
        {
            ArrayList<ItemDeProjeto> listaaux = new ArrayList<>();
            for (ItemDeProjeto i : lista_itens){
            
                if (!i.isTemPai()){
                     
                   System.out.println("O raiz é : "+i.getNome());
                   listaaux.add(i);
                }
            }
            
            return listaaux;
        
        }
        

        public double calcula()
        {
            ArrayList<ItemDeProjeto> encontrarORaiz = encontrarORaiz();
            if (encontrarORaiz.size()>1)
                System.out.println("Mais de uma raiz encontrada não posso calcular");
            if (encontrarORaiz.size()==1)
                return calcula(encontrarORaiz.get(0));
          
            return 0.0;  
        }

        public double calcula(ItemDeProjeto raiz)
        {
            double valor = raiz.getValor();
            for (Aresta arestas: raiz.getListaDeArestas())
            {
                valor = valor + (arestas.getValor() * calcula(arestas.getDestino()));
            }
            return valor;
        }

    public void setLista_itens(ArrayList<ItemDeProjeto> lista_itens) {
        this.lista_itens = lista_itens;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
    
    
    
    
    
    
    
    
    
    
    
        
    }





