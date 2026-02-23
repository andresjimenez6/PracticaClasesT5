/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosolimpicos;

/**
 *
 * @author EAG
 */
public class Prueba {
    private String nombre;
    private String fechaDeCelebracion;
    private Participante[] listaDeParticipantes;
    
    public Prueba(){
        this.nombre = "";
        this.fechaDeCelebracion="";
        this.listaDeParticipantes = new Participante[0];
    }
    public Prueba(String nombre, String fechaDeCelebracion, Participante[] listaDeParticipantes){
        this.nombre = nombre;
        this.listaDeParticipantes= listaDeParticipantes;
        this.fechaDeCelebracion = fechaDeCelebracion;
    }
    public Prueba(Prueba copia){
        this.nombre = copia.nombre;
        this.fechaDeCelebracion = copia.fechaDeCelebracion;
        this.listaDeParticipantes = copia.listaDeParticipantes;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaDeCelebracion() {
        return fechaDeCelebracion;
    }

    public Participante[] getListaDeParticipantes() {
        return listaDeParticipantes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeCelebracion(String fechaDeCelebracion) {
        this.fechaDeCelebracion = fechaDeCelebracion;
    }

    public void setListaDeParticipantes(Participante[] listaDeParticipantes) {
        this.listaDeParticipantes = listaDeParticipantes;
    }
    
    
    public boolean registrarParticipantes(){
        
        
        return true;
    }
    
    
}
