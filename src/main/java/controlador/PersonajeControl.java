/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Personaje;
import servicio.PersonajeServicio;

/**
 *
 * @author Usuario
 */
public class PersonajeControl {
     private final PersonajeServicio personajeServicio = new PersonajeServicio();
     
     public Personaje crear(String [] args){
        Personaje personaje = new Personaje(args[0], args[1], Integer.valueOf(args[2]), Integer.valueOf(args[3])); 
        this.personajeServicio.crear(personaje); 
        return personaje; 
    }
     
      public List<Personaje>listar(){
        return this.personajeServicio.listar(); 
    }
}
