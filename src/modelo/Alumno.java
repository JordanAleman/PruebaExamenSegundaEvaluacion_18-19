package modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Alumno extends Persona {

	private  String curso;
	private String matricula;
	private char turno; // 'M', 'T', 'N'
	
	public Alumno() {
		super();
	}
	
	public Alumno(String nombre) {
		super(nombre);
	}

	public Alumno(String nif, String nombre, int longitudPaso, String fecha_nac, char sexo) {
		super(nif, nombre, longitudPaso, fecha_nac, sexo);
		
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public char getTurno() {
		return turno;
	}

	public void setTurno(char turno) {
		this.turno = turno;
	}
	
	public ArrayList<String> crearListaAlumnos(String rutaFichero){
		try {
			ArrayList<String> alumnos = new ArrayList<String>();	
			BufferedReader fichero = new BufferedReader(new FileReader(rutaFichero));
			String registro;
			
			while((registro = fichero.readLine()) != null){
				// Romper la cadena registro
				String[] campos = registro.split("#");
				
				alumnos.add(campos[0]);
				
				// Incluir cada elemento del array como elementos del ArrayList de Equip
							
			}

			fichero.close();
			return alumnos;
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado.");
		} catch (IOException e) {
			System.out.println("IO Excepcion");
		}
		return null;
	}
	
	public ArrayList<String[]> crearListaAlumnosConNotas(String rutaFichero){
		try {
			ArrayList<String[]> alumnos = new ArrayList<String[]>();	
			BufferedReader fichero = new BufferedReader(new FileReader(rutaFichero));
			String registro;
			
			
			
			while((registro = fichero.readLine()) != null){
				// Romper la cadena registro
				String[] campos = registro.split("#");
				
				String[] datosAlumnos = {campos[0],campos[1]};
				alumnos.add(datosAlumnos);
				
				// Incluir cada elemento del array como elementos del ArrayList de Equip
							
			}
			
			Collections.sort(alumnos, new Comparator<String[]>() {
				   public int compare(String[] obj1, String[] obj2) {
				      return obj1[0].compareTo(obj2[0]);
				   }
			});

			fichero.close();
			return alumnos;
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado.");
		} catch (IOException e) {
			System.out.println("IO Excepcion");
		}
		return null;
	}

}