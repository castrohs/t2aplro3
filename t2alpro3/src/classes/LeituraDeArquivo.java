/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author Guilherme
 */
public class LeituraDeArquivo {
    
    public LeituraDeArquivo(){
        try
        {
            FileReader fr = new FileReader("arquivo.txt");
	    BufferedReader br = new BufferedReader(fr);
            String linha = null;
            
            do
            {
                linha = br.readLine();
                if(linha!=null) 
                {
                    StringTokenizer st = new StringTokenizer(linha);
                    System.out.println(st.nextToken());
                    //Double.parseDouble(st.nextToken());
                    //if(st.hasMoreTokens())
                }    
            }
            while(linha!=null);
            
            br.close();
	}
        catch(IOException e)
        {
            System.out.println("Erro de escrita no arquivo: " + e.getMessage());
	}
    }
}
