/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centralpacientes;

/**
 *
 * @author sierr
 */
public class Paciente {
    
     private int id;
    private String nombre;
    private int edad;
    private String clinica;

    public Paciente(int id, String nombre, int edad, String clinica) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.clinica = clinica;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getClinica() {
        return clinica;
    }
    
     public String toString(){
        return "ID: " + id + " | Nombre: " + nombre + " | Edad: " + edad + " | Clínica: " + clinica;
    }
    


    
}
