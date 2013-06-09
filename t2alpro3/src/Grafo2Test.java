

import java.util.ArrayList;



public class Grafo2Test {


	public void testDG1() {
		Grafo2 g;
		g = AppGrafo2.loadFile("dg1.txt");
		ArrayList<Integer> expected = new ArrayList<Integer>();
		ArrayList<Integer> actual = g.getFontes();
		
	}

}
