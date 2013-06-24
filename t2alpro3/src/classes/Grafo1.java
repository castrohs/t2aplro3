package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Grafo1 {

    private int max;
    private int[][] matAdj;
    private boolean[][] visitado; // CORMEN ET ALLI color[]
    private int[] distancia;// " d[]
    private int[] predecessor;// " p[] ou PI[]
    private ArrayList<ItemDeProjeto> listaDeNodosValidos = new ArrayList<>();
    private ArrayList<ItemDeProjeto> listabusca = new ArrayList<>();
    private double resultadoDaSoma;
    public Grafo1(ArrayList<ItemDeProjeto> lista) {
        if (lista.size() <= 0) {
            throw new IllegalArgumentException("Numero de nodos invalido!");
        }
        listaDeNodosValidos = lista;
        max = listaDeNodosValidos.size();
        matAdj = new int[max][max];
        visitado = new boolean[max][max];

        distancia = new int[max];
        predecessor = new int[max];
        resultadoDaSoma = 0;

    }

    public void addAresta(String orig, String dest, int p) {
     
        for (int i = 0; i < listaDeNodosValidos.size(); i++) {
            ItemDeProjeto origAux = listaDeNodosValidos.get(i);
            if (orig.equalsIgnoreCase(origAux.getNome())) {
                for (int j = 0; j < listaDeNodosValidos.size(); j++) {
                    ItemDeProjeto destgAux = listaDeNodosValidos.get(j);
                    if (dest.equalsIgnoreCase(destgAux.getNome())) {
                        matAdj[i][j] = p;
                        break;
                    }
                }
                break;
            }
        }
    }

    public ArrayList<Integer> getAdjacentes(String n) {
        int nodo = 0;
        for (int i = 0; i < listaDeNodosValidos.size(); i++) {

            if (n.equalsIgnoreCase(listaDeNodosValidos.get(i).getNome())) {
                nodo = i;
                break;
            }
        }

        ArrayList<Integer> ads = new ArrayList<Integer>();
        for (int i = 0; i < max; i++) {
            if (matAdj[nodo][i] != 0) {
                ads.add(i);
            }
        }

        return ads;
    }

    public void mostra() {
        System.out.println(max - 1);
        for (int i = 1; i < max; i++) {
            for (int j = 1; j < max; j++) {
                if (matAdj[i][j] != 0) {
                    System.out.printf("%d %d\n", i, j);
                }
            }
        }
    }

    private void clearVisitados() {
        for (int i = 1; i < max; i++) {
            for (int j = 1; j < max; j++) {
            visitado[i][j] = false;
        }
    }
    }

    private void clearDistancias() {
        for (int i = 1; i < max; i++) {
            distancia[i] = 0;
        }
    }

    private void clearPredecessores() {
        for (int i = 1; i < max; i++) {
            predecessor[i] = 0;
        }
    }

    String result;

    public String profundidade(int k,int u) {
        clearVisitados(); // CORMEN ET ALLI DFS, 1,2,3
        result = "";
        visitar(k,u,0);
              
        return result;
    }


    private void visitar(int k,int u,int p) {
         
        ItemDeProjeto get = listaDeNodosValidos.get(u);
        for (int i = 0; i < max; i++) {
            if (matAdj[u][i] != 0) {
                   resultadoDaSoma +=  resultadoTemporario;
                
                     resultadoTemporario=0;
                     p = matAdj[u][i];   
                     result +="[label="+p+"]"+get.getNome() + "->";
                      
                    resultadoTemporario = 0;
                    visitar(u, i,p);     
                    //result +="[label="+p+"]";
                  //   result +="[label="+p+"]";
            }
           
       
        }
        char a = result.charAt(result.length()-1);
        if(a!=';'){
            result +=get.getNome()+"[label="+p+"]"+";";
            

        }

     
    }
    
    private double resultadoTemporario =0;

    public double calculaResultado(int u) {

        return resultadoDaSoma;
    }



    public String getDistancias() {
        return Arrays.toString(distancia);
    }

    public String getPredecessores() {
        return Arrays.toString(predecessor);
    }

    public void imprimeGrafico(ItemDeProjeto nodoRaiz) {
        String lista = "digraph g{\n";
        for (int i = 1; i < listaDeNodosValidos.size(); i++) {

            if (listaDeNodosValidos.get(i)  == nodoRaiz) {
                String prof = profundidade(i,i);
                try {
                    String charAt = (String) prof.substring(1, 3);
                    if ("->".equals(charAt)) {
                        lista += prof;
                    }
                } catch (Exception e) {
                }
            }
        }


        for (int i = 0; i < listaDeNodosValidos.size(); i++) {
            String aux = "" + i;

            String nome = listaDeNodosValidos.get(i).getNome();
            String replace = lista.replace(aux, nome);
            lista = replace;
        }
        
        System.out.println(lista);
        System.out.println("}");

    }

    public void excuta(ItemDeProjeto nodoRAiz) {
        imprimeGrafico(nodoRAiz);
//        ArrayList<Integer> adjacentes = getAdjacentes("GGW");

        /*       for (int i =0;i<adjacentes.size();i++){
            
         System.out.print(listaDeNodosValidos.get(i).getNome() +" ");
       
         }
         * */
        System.out.print(result);
        System.out.print("\n");
    }
}
