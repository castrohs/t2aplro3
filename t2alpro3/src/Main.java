
import classes.Grafo1;
import classes.ItemDeProjeto;
import classes.Projeto;
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
//        lista.add(new ItemDeProjeto("", 0));
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
        Projeto p = new Projeto();
        p.setLista_itens(lista);
       

        
        p.addAresta("GMZ", "WNJ", 3);
        p.addAresta("YUY", "FPK", 9);
        p.addAresta("NAL", "QMR", 8);
        p.addAresta("NAL", "SQD", 1);
        p.addAresta("SQD", "YUY", 1);
        p.addAresta("MCX", "YUY", 4);
        p.addAresta("GMZ", "MCX", 9);
        p.addAresta("GGW", "QMR", 9);
        p.addAresta("GGW", "SQD", 7);
        p.addAresta("MCX", "FPK", 3);
        p.addAresta("GMZ", "TUM", 6);
        p.addAresta("GMZ", "NAL", 1);
        p.addAresta("TUM", "GGW", 2);
//        System.out.println("digraph G {");
       // g.excuta("GMZ");
       
        System.out.println( p.calcula());

    }
}
