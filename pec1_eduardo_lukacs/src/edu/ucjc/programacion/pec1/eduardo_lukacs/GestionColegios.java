package edu.ucjc.programacion.pec1.eduardo_lukacs;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionColegios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre del colegio: ");
        String nombreColegio = scanner.nextLine();

        System.out.print("Introduce la dirección del colegio: ");
        String direccionColegio = scanner.nextLine();

        System.out.print("Introduce el número de aulas del colegio: ");
        int numAulas = scanner.nextInt();

        ArrayList<Aula> aulas = new ArrayList<>();
        for (int i = 1; i <= numAulas; i++) {
            System.out.print("Introduce la capacidad del aula " + i + ": ");
            int capacidad = scanner.nextInt();
            scanner.nextLine();
            Aula aula = new Aula("Aula " + i, capacidad);
            aulas.add(aula);
        }

        System.out.print("Introduce el número de alumnos del colegio: ");
        int numAlumnos = scanner.nextInt();
        scanner.nextLine();

        Colegio colegio = new Colegio(nombreColegio, direccionColegio, aulas);

        for (int i = 1; i <= numAlumnos; i++) {
            System.out.print("Introduce el nombre del alumno " + i + ": ");
            String nombreAlumno = scanner.nextLine();

            System.out.print("Introduce el DNI del alumno " + i + ": ");
            String dniAlumno = scanner.nextLine();

            Alumno alumno = new Alumno(nombreAlumno, dniAlumno);
            colegio.asignarAsiento(alumno);
        }

        scanner.close();
    }

    public static void asignarAsientos(Colegio colegio, ArrayList<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            boolean asignado = false;
            for (Aula aula : colegio.getAulas()) {
                if (aula.tieneAsientosLibres()) {
                    Asiento asiento = aula.getAsiento();
                    asiento.setAlumno(alumno);
                    System.out.println("Asignado el asiento " + asiento.getNumero() + " en el aula " + aula.getNombre() + " al alumno " + alumno.getNombre() + " con DNI " + alumno.getDni());
                    asignado = true;
                    break;
                }
            }
            if (!asignado) {
                System.out.println("No hay asientos libres para el alumno " + alumno.getNombre() + " con DNI " + alumno.getDni());
            }
        
        }
    }
}

