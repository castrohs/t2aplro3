package classes;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Grafo1 {
 
    private int max;
    private int[][] matAdj;
    private boolean[] visitado; // CORMEN ET ALLI color[]
    private int[] distancia;// " d[]
    private int[] predecessor;// " p[] ou PI[]
    private ArrayList<ItemDeProjeto> listaDeNodosValidos = new ArrayList<>();
    
    public Grafo1(int n) {
        if (n <= 0)
            throw new IllegalArgumentException("Numero de nodos invalido!");
 
        max = listaDeNodosValidos.size();
        matAdj = new int[max][max];
        visitado = new boolean[max];
 
        distancia = new int[max];
        predecessor = new int[max];
 
    }
 
    public void addEdge(String orig, String dest, int p) {
     /*
        boolean podeCadastrar =true;
        for(String s : listaDeNodosValidos){
            if (!s.equalsIgnoreCase(orig))
    }
        if(){
            throw new IllegalArgumentException("Aresta invalida, orig: " + orig
                           + " dest:" + dest);
        }
        else*/
        for (int i = 0 ;i < listaDeNodosValidos.size();i++){
            for (int j = 0 ;j < listaDeNodosValidos.size();j++){
                ItemDeProjeto origAux = listaDeNodosValidos.get(i);
                ItemDeProjeto destgAux = listaDeNodosValidos.get(j);
                if (origAux.getNome().equalsIgnoreCase(orig) && destgAux.getNome().equalsIgnoreCase(dest) )
                       matAdj[i][j] = p;
            }
            }
    }
 
    public ArrayList<Integer> getAdjacentes(int nodo) {
        if (nodo >= max || nodo < 1)
            throw new IllegalArgumentException("Nodo inválido:" + nodo);
        ArrayList<Integer> ads = new ArrayList<Integer>();
        for (int i = 1; i < max; i++) {
            if (matAdj[nodo][i] != 0) {
                ads.add(i);
            }
        }
        return ads;
    }
 
    public void mostra() {
        System.out.println(max - 1);
        for (int i = 1; i < max; i++)
            for (int j = 1; j < max; j++)
                if (matAdj[i][j] != 0)
                    System.out.printf("%d %d\n", i, j);
    }
 
    private void clearVisitados() {
        for (int i = 1; i < max; i++)
            visitado[i] = false;
    }
 
    private void clearDistancias() {
        for (int i = 1; i < max; i++)
            distancia[i] = 0;
    }
 
    private void clearPredecessores() {
        for (int i = 1; i < max; i++)
            predecessor[i] = 0;
    }
 
    public String largura(int nodo) {
        if (nodo >= max || nodo < 1)
            throw new IllegalArgumentException("Nodo invalido: " + nodo);
 
        String result = "";
 
        // http://books.google.com.br/books?id=NLngYyWFl_YC&pg=PA531&lpg=PA531&dq=cormen+breadth+first+graph&source=bl&ots=BxTvIE8hE8&sig=y19mlkk0Vl3e0zlOLg81ABBrvc0&hl=pt-BR&sa=X&ei=sYumUea-JefO0wGd24HQDw&ved=0CDYQ6AEwAA#v=onepage&q&f=true
        // @author Gabriel D. Schmoeller
        // limpar visitados
        // colocar nodo na fila F
        // visitar nodo
        //
        // enquanto a F não está vazia
        // remover de F um nodo n
        // para cada adjacente de n
        // se adjacente não está visitado
        // visitar adjacente
        // colocar adjacente na fila
 
        clearVisitados();
        clearDistancias();
        clearPredecessores();
 
        LinkedList<Integer> f = new LinkedList<Integer>();
        f.add(nodo);
 
        visitado[nodo] = true;
        distancia[nodo] = 0;
        predecessor[nodo] = 0;
 
        result += " " + nodo;
        while (f.size() > 0) {
            int n = f.remove();
 
            for (int i = 1; i < max; i++) {
                if (matAdj[n][i] != 0 && !visitado[i]) {
                    visitado[i] = true;
                    distancia[i] = distancia[n] + 1;
                    predecessor[i] = n;
                    f.add(i);
                    result += " " + i;
                }
            }
        }
 
        return result;
    }
 
    String result;
 
    public String dfs() {
        clearVisitados(); // CORMEN ET ALLI DFS, 1,2,3
        result = "";
 
        for (int u = 1; u < max; u++) { // CORMEN ET ALLI DFS, 5, 6, 7
            if (visitado[u] == false) {
                visitar(u);
            }
        }
 
        return result;
    }
 
    public String profundidade(int u) {
        clearVisitados(); // CORMEN ET ALLI DFS, 1,2,3
        result = "";
        visitar(u);
        return result;
    }
 
    private void visitar(int u) {
        visitado[u] = true;// CORMEN ET ALLI DFS-VISIT, 1
        result += " - " + u;
        for (int i = 1; i < max; i++) {
            if (matAdj[u][i] != 0) {
                if (visitado[i] == false) {
                    visitar(i);
                }
            }
        }
    }
 
    public String getDistancias() {
        return Arrays.toString(distancia);
    }
 
    public String getPredecessores() {
        return Arrays.toString(predecessor);
    }   
    
}
 