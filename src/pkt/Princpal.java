package pkt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Princpal {
	
	public static boolean localizar(File carpeta, String nomFich) throws FileNotFoundException{
		boolean isValid = true;
		
		if(!carpeta.exists()) throw new FileNotFoundException("La carpeta no existe.");
		if(!carpeta.isDirectory()) throw new RuntimeException("La carpeta no es un directorio.");
		
						
		return isValid;
	}
	public static boolean comparar(File carpeta, String nomFich) throws FileNotFoundException{
		boolean enc = false;
		
		if(localizar(carpeta, nomFich)) {
			File[] fich = carpeta.listFiles();
			for(int i = 0; i < fich.length; i++) {
				String nom = fich[i].getName();
				if(nomFich.compareTo(nom) == 0) enc = true;
			}
		}
		
		
		return enc;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String archivo = null;
		String palabra = null;
		String dir = null;
		
		do {
			System.out.println("Introduce la ruta de la carpeta en la que quieres buscar.");
			dir = sc.next();
			System.out.println("Introduce el nombre del archivo en el que buscar");
			archivo = sc.next();
			System.out.println("Introduce la palabra a buscar");
			palabra = sc.next();
		}while (archivo == null && palabra == null && dir == null|| archivo == "" && palabra == "" && dir == ""); 
		
		File carpeta = new File(dir);
		
		try {
			if(comparar(carpeta, archivo)) System.out.println("Se encontró el fichero.");
			else System.out.println("No se ha encontrado el fichero.");
		} catch (FileNotFoundException e) {
			System.err.println("Error de IO.");
			e.printStackTrace();
		}
		
		
	}

}
