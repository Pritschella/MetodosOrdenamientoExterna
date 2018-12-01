/*import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

class IntercalacionDeArchivos{
	
	public static void main(String[] args) {
		
		File archivo = new File("./src/Archivo.txt");
		File archivo2 = new File("./src/Archivo2.txt");
		
		FileReader frA1 = null;
		BufferedReader brA1;
		FileReader frA2 = null;
		BufferedReader brA2 = null;
		
		FileWriter archivo3 = null;
		PrintWriter pr = null;
		
try {
archivo3 =  new FileWriter("./src/ArchivoSalida.txt", false);
pr = new PrintWriter(archivo3);
	try {
		frA1 = new FileReader(archivo);
		brA1 = new BufferedReader(frA1);
		String lineaArchivo1;
	try {
		frA1 = new FileReader(archivo2);
		brA2 = new BufferedReader(frA2);
		String lineaArchivo2;
		boolean repetir = true;
		lineaArchivo1 = brA1.readLine();
		lineaArchivo2 = brA2.readLine();
		do {
			if(Integer.parseInt(lineaArchivo1)<Integer.parseInt(lineaArchivo2)) {
				pr.println(lineaArchivo1);
				if((lineaArchivo1 = brA1.readLine()) == null) {
					pr.println(lineaArchivo2);
					while((lineaArchivo2 = brA2.readLine())!= null) {
						pr.println(lineaArchivo1);
					}
					repetir = false;
				}
			}
			else {
				pr.println(lineaArchivo1);
				pr.println(lineaArchivo2);
				if((lineaArchivo1 = brA1.readLine()) == null) {
					pr.println(lineaArchivo2);
					while((lineaArchivo2 =  brA2.readLine()) != null) {
						pr.print(lineaArchivo2);
					}
					repetir = false;
				}
				if((lineaArchivo2 =  brA2.readLine()) == null) {
					pr.println(lineaArchivo1);
					while((lineaArchivo1 =  brA1.readLine()) != null) {
						pr.println(lineaArchivo1);
					}
					repetir = false;
				}
			}
		}
		while(repetir);
*/
		
		
		
		/*
		
	}//Metodo
	
	
}//class



public class Prueba {

	public static void main(String[] args) {
		

	}//main

}//clase

			*/