/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author bladimir
 */
public class Persona {
    private String nombre;
    private int apuesta[]; 
    private int punteo;

    public Persona(String nombre, int[] apuesta) {
        this.nombre = nombre;
        this.apuesta = apuesta;
    }

    public Persona(String nombre, int[] apuesta, int punteo) {
        this.nombre = nombre;
        this.apuesta = apuesta;
        this.punteo = punteo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getApuesta() {
        return apuesta;
    }

    public void setApuesta(int[] apuesta) {
        this.apuesta = apuesta;
    }

    public int getPunteo() {
        return punteo;
    }

    public void setPunteo(int punteo) {
        this.punteo = punteo;
    }
    
        
}
