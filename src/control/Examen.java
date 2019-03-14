package control;

import java.util.ArrayList;
import java.util.Arrays;

import modelo.Alumno;
import modelo.Asignatura;
import modelo.NotaAlumno;

public class Examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> asignaturas = new Asignatura().crearListaAsignaturas("ficheros/asignaturas.txt");
		ArrayList<String> alumnos = new Alumno().crearListaAlumnos("ficheros/notasAlumnos.txt");
		ArrayList<Integer[]> notasAlumnos = new NotaAlumno().crearListaNotaAlumnos("ficheros/notasAlumnos.txt");
		
		int notaMediaAsignatura, notaMediaAlumno;
		
		// Muestra por pantalla alumnos, notas y asignaturas
		for (int i = 0; i < notasAlumnos.size(); i++) {
			for (int j = 0; j < notasAlumnos.get(i).length; j++) {
				System.out.print("[" + asignaturas.get(j) + ": " + notasAlumnos.get(i)[j] + "] ");
			}
			System.out.println(alumnos.get(i));
		}

		
		// Nota media de cada asignatura
		System.out.println("\nNota media asignaturas:");
		
		for (int i = 0; i < notasAlumnos.get(0).length; i++) {
			notaMediaAsignatura = 0;
			for (int j = 0; j < notasAlumnos.size(); j++) {
				notaMediaAsignatura += notasAlumnos.get(j)[i];
			}
			System.out.print("[" + asignaturas.get(i) + ": " + notaMediaAsignatura / notasAlumnos.size() + "] ");
		}
		
		// Nota media de cada alumno
		System.out.println("\n\nNota media de cada alumno:");
		
		for (int i = 0; i < notasAlumnos.size(); i++) {
			notaMediaAlumno = 0;
			for (int j = 0; j < notasAlumnos.get(i).length; j++) {
				notaMediaAlumno += notasAlumnos.get(i)[j];
			}
			System.out.println("[" + notaMediaAlumno / notasAlumnos.get(i).length + "] " + alumnos.get(i));
		}
		
		
	}

}
