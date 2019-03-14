package modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Asignatura {

	private String nombreAsignatura;
	
	
	public String getNombreAsignatura() {
		return nombreAsignatura;
	}



	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}



	public ArrayList<String> crearListaAsignaturas(String rutaFichero){
		try {
			ArrayList<String> asignaturas = new ArrayList<String>();	
			BufferedReader fichero = new BufferedReader(new FileReader(rutaFichero));
			String registro;
			
			while((registro = fichero.readLine()) != null){
				// Romper la cadena registro
				String[] campos = registro.split(",");
				
				for (int i = 0; i < campos.length; i++) {
					asignaturas.add(campos[i]);
				}
				// Incluir cada elemento del array como elementos del ArrayList de Equip
							
			}

			fichero.close();
			return asignaturas;
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado.");
		} catch (IOException e) {
			System.out.println("IO Excepcion");
		}
		return null;
	}
	
}
