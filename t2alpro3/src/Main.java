
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
       
  
        g.addAresta("GMZ", "WNJ", 3);
        g.addAresta("YUY", "FPK", 9);
        g.addAresta("NAL", "QMR", 8);
        g.addAresta("NAL", "SQD", 1);
        g.addAresta("SQD", "YUY", 1);
        g.addAresta("MCX", "YUY", 4);
        g.addAresta("GMZ", "MCX", 9);
        g.addAresta("GGW", "QMR", 9);
        g.addAresta("GGW", "SQD", 7);
        g.addAresta("MCX", "FPK", 3);
        g.addAresta("GMZ", "TUM", 6);
        g.addAresta("GMZ", "NAL", 1);
        g.addAresta("TUM", "GGW", 2);
        
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

       
        System.out.println( p.calcula());
        p.imprimeGrafico();
        //ArrayList<ItemDeProjeto> encontrarORaiz = p.encontrarORaiz();
   //     g.excuta(encontrarORaiz.get(0));
        
    }
}
