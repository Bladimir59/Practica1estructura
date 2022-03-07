/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import Clases.Caballo;
import Clases.Persona;
import java.util.*;

/**
 *
 * @author bladimir
 */
public class clasesUnion {
    //colocar los metodos a usar
    
    //llenar listado de caballos
    public Caballo lista[]=new Caballo[9];
    int contadorCaballos=0;
    public void llenar(int pista, String nombre, String raza){
        if (contadorCaballos<=9){
            lista[contadorCaballos] = new Caballo(pista, nombre, raza);
            contadorCaballos++;
        }else{
            //responder con error
        }
    }
    //borrar lista
    public void Borrar(){
        contadorCaballos=0;
        for (int i = 0; i < lista.length; i++) {
            lista[i] = new Caballo(0, "", "");
        }
    }
    //ver lista de Caballos
    public Caballo[] listado(){
        return lista;
    }
    //llenar apuesta
    ArrayList<Persona> listaApuestas = new ArrayList();
    int Xapostadores=0;
    public void apuesta(String nombre, int datos[]){
        Persona info = new Persona(nombre, datos);
        listaApuestas.add(info);
    }
    
}
