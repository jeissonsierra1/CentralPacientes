/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package centralpacientes;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author sierr
 */
public class CentralPacientes {

    private static ArrayList<Paciente> listaPacientes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void agregarPaciente() {
        System.out.print("Ingrese ID del paciente: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Ingrese Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese Clinica: ");
        String clinica = scanner.nextLine();

        Paciente nuevo = new Paciente(id, nombre, edad, clinica);
        listaPacientes.add(nuevo);
        System.out.println("Paciente agregado con exito.");
    }

    public static void buscarPaciente() {
        System.out.print("Ingrese ID del paciente a buscar: ");
        int id = scanner.nextInt();
        for (Paciente p : listaPacientes) {
            if (p.getId() == id) {
                System.out.println(" Paciente encontrado:\n" + p);
                return;
            }
        }
        System.out.println(" Paciente no encontrado.");
    }

    public static void eliminarPaciente() {
        System.out.print("Ingrese ID del paciente a eliminar: ");
        int id = scanner.nextInt();
        for (Paciente p : listaPacientes) {
            if (p.getId() == id) {
                listaPacientes.remove(p);
                System.out.println("️\nPaciente eliminado con exito.");
                return;
            }
        }
        System.out.println(" Paciente no encontrado.");
    }

    public static void listarPacientes() {
        if (listaPacientes.isEmpty()) {
            System.out.println("️No hay pacientes registrados.");
            return;
        }
        for (Paciente p : listaPacientes) {
            System.out.println(p);
        }
    }
    
    public static void main(String[] args) {
        
        int opcion;
        do {
            System.out.println("\n ||Central de Pacientes|| ");
            System.out.println("\n[1]Registrar Paciente");
            System.out.println("\n[2]Buscar Paciente por ID");
            System.out.println("\n[3]Eliminar Paciente");
            System.out.println("\n[4]Listar Pacientes");
            System.out.println("\n[5]Salir");
            
            System.out.print("\nSeleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> agregarPaciente();
                case 2 -> buscarPaciente();
                case 3 -> eliminarPaciente();
                case 4 -> listarPacientes();
                case 5 -> System.out.println("Sistema terminado. |Gracias|");
                default -> System.out.println(" Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);
        
        
        
    }
    
}
