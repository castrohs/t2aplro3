
import classes.Grafo1;
import classes.ItemDeProjeto;
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gustavo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
         * digraph G {
         main -> parse -> execute;
         main -> init;
         main -> cleanup;
         execute -> make_string;
         execute -> printf
         init -> make_string;
         main -> printf;
         execute -> compare;
         }
         */
        ArrayList<ItemDeProjeto> lista = new ArrayList<>();
        //lista.add(new ItemDeProjeto("", 0));
        lista.add(new ItemDeProjeto("NAL", 3));
        lista.add(new ItemDeProjeto("TUM", 4));
        lista.add(new ItemDeProjeto("GGW", 9));
        lista.add(new ItemDeProjeto("SQD", 10));
        lista.add(new ItemDeProjeto("YUY", 15));
        lista.add(new ItemDeProjeto("QMR", 17));
        lista.add(new ItemDeProjeto("FPK", 16));
        lista.add(new ItemDeProjeto("GMZ", 15));
        lista.add(new ItemDeProjeto("WNJ", 12));
        lista.add(new ItemDeProjeto("MCX", 3));


        Grafo1 g = new Grafo1(lista);
        g.addEdge("GMZ", "WNJ", 3);
        g.addEdge("YUY", "FPK", 9);
        g.addEdge("NAL", "QMR", 8);
        g.addEdge("NAL", "SQD", 1);
        g.addEdge("SQD", "YUY", 1);
        g.addEdge("MCX", "YUY", 4);
        g.addEdge("GMZ", "MCX", 9);
        g.addEdge("GGW", "QMR", 9);
        g.addEdge("GGW", "SQD", 7);
        g.addEdge("MCX", "FPK", 3);
        g.addEdge("GMZ", "TUM", 6);
        g.addEdge("GMZ", "NAL", 1);
        g.addEdge("TUM", "GGW", 1);
        System.out.println("digraph G {");
        g.excuta("GMZ");
        System.out.println("}");
    }
}
