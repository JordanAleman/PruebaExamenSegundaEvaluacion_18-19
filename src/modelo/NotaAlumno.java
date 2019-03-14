package modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class NotaAlumno {
	
	public ArrayList<Integer[]> crearListaNotaAlumnosPorFichero(String rutaFichero){
		try {
			ArrayList<Integer[]> notaAlumnos = new ArrayList<Integer[]>();	
			BufferedReader fichero = new BufferedReader(new FileReader(rutaFichero));
			String registro;
			Integer[] notas;
			
			while((registro = fichero.readLine()) != null){
				// Romper la cadena registro
				String[] campos = registro.split("#");
				
				String[] camposAlumnos = campos[1].split(",");
				notas = new Integer[camposAlumnos.length];
				
				for (int i = 0; i < camposAlumnos.length; i++) {
					notas[i] = Integer.parseInt(camposAlumnos[i]);
				}
				
				notaAlumnos.add(notas);
				
				// Incluir cada elemento del array como elementos del ArrayList de Equip
							
			}

			fichero.close();
			return notaAlumnos;
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado.");
		} catch (IOException e) {
			System.out.println("IO Excepcion");
		}
		return null;
	}
	
}
