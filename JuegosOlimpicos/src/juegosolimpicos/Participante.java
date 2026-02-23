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
public class Participante {
    private String nombre;
    private String pais;
    private int edad;
    private int numeroDeIdentificacionOlimpico;
    private int numeroTotalDeMedallasObtenidas;
    
    protected Participante(){
        this.nombre ="";
        this.pais = "";
        this.edad = 0;
        this.numeroDeIdentificacionOlimpico = 0;
        this.numeroTotalDeMedallasObtenidas= 0;
        
    }
    
    protected Participante(String nombre, String pais, int edad, int numeroDeIdentificacionOlimpico, int numeroTotalDeMedallasObtenidas){
        this.nombre = nombre;
        this.pais = pais;
        this.edad = edad;
        this.numeroDeIdentificacionOlimpico = numeroDeIdentificacionOlimpico;
        this.numeroTotalDeMedallasObtenidas = numeroTotalDeMedallasObtenidas;
    }
    
    protected Participante( Participante p){
        this.nombre = p.nombre;
        this.edad = p.edad;
        this.pais = p.pais;
        this.numeroDeIdentificacionOlimpico = p.numeroDeIdentificacionOlimpico;
        this.numeroTotalDeMedallasObtenidas = p.numeroTotalDeMedallasObtenidas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public int getEdad() {
        return edad;
    }

    public int getNumeroDeIdentificacionOlimpico() {
        return numeroDeIdentificacionOlimpico;
    }

    public int getNumeroTotalDeMedallasObtenidas() {
        return numeroTotalDeMedallasObtenidas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNumeroDeIdentificacionOlimpico(int numeroDeIdentificacionOlimpico) {
        this.numeroDeIdentificacionOlimpico = numeroDeIdentificacionOlimpico;
    }

    public void setNumeroTotalDeMedallasObtenidas(int numeroTotalDeMedallasObtenidas) {
        this.numeroTotalDeMedallasObtenidas = numeroTotalDeMedallasObtenidas;
    }
    
    public int calcularNumeroTotalDeMedallasObtenidas(int numeroTotalDeMedallasObtenidas){
        int total = 0;
        
        return total;
    }
}
