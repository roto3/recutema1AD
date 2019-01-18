package pkt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Buscastring {

	public Buscastring() {
		
	}
	
	public static BufferedReader abrirFichero(String archivo) throws FileNotFoundException, IOException {
	     
	      FileReader fr = new FileReader(archivo); 
	      BufferedReader br = new BufferedReader(fr); 
	   
	      return br;      
	}
	public static void cerrarFichero(BufferedReader br) throws IOException {
		br.close();
	}
	
	
	public int compararContenido (String fichero, String palabra) throws IOException, IOException{
		BufferedReader br = abrirFichero(fichero);	
		String cadenaFichero = null ; 
		String palabratemp = null;
		int contador = 0;
		
		while((cadenaFichero = br.readLine())!=null) {
			cadenaFichero.compareTo(palabra);
			System.out.println(cadenaFichero);
	    }
		
		cerrarFichero(br);
		
		
		return contador;
		
	
	}
	
}
