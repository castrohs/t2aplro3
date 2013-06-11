
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Arestas valoradas.
 *
 * Utilize o arquivo dg1.txt.
 *
 * @author marco.mangan@pucrs.br
 *
 */
public class AppGrafo2 {

    public static void main(String[] argc) {
        Grafo2 grafo = null;

        if (argc.length < 1) {
            System.out.println("uso: java Grafo0 <arquivo>");
        } else {
            grafo = loadFile(argc[0]);
            grafo.mostra();

            System.out.printf("largura(%d): %s\n", 1, grafo.largura(1));
            System.out.printf("Distancias: %s\n", grafo.getDistancias());
            System.out.printf("Predecessores: %s\n", grafo.getPredecessores());

            // System.out.printf("largura(%d): %s\n", 3, grafo.largura(3));
            // System.out.printf("largura(%d): %s\n", 5, grafo.largura(5));

            System.out.printf("\nprofundidade(%d): %s\n", 1,
                    grafo.profundidade(1));
            System.out.printf("profundidade(%d): %s\n", 3,
                    grafo.profundidade(3));
            System.out.printf("profundidade(%d): %s\n", 5,
                    grafo.profundidade(4));

            System.out.printf("Fontes: %s\n", grafo.getFontes());
            System.out.printf("Sumidouros: %s\n", grafo.getSumidouros());

            System.out.printf("Conexo: %b", grafo.isConexo(1));
        }
    }

    public static Grafo2 loadFile(String filename) {
        Grafo2 g = null;
        String linha;

        try {
            BufferedReader buff = new BufferedReader(new FileReader(filename));
            try {
                linha = buff.readLine();
                while (linha.charAt(0) == '%') {
                    linha = buff.readLine();
                }
                g = new Grafo2(Integer.parseInt(linha));
                linha = buff.readLine();

                while (linha != null) {
                    String[] dados = linha.split(" ");
                    g.addEdge(Integer.parseInt(dados[0]),
                            Integer.parseInt(dados[1]),
                            Integer.parseInt(dados[2]));
                    linha = buff.readLine();
                }
            } finally {
                buff.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return g;
    }
}
