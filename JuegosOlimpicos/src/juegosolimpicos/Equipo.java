/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegosolimpicos;

/**
 *
 * @author ANDRES JIMENEZ
 */
public class Equipo extends Participante {
    private String nombreEquipo;
    private Participante[] deportistas;
    
    public Equipo(){
        super();
        this.nombreEquipo = "";
        this.deportistas = new Participante[0];
    }
    
    public Equipo(String nombreEquipo, Participante[] deportistas, String nombre, String pais, int edad, int numeroDeIdentificacionOlimpico, int numeroTotalDeMedallasObtenidas ){
        super(nombre, pais, edad, numeroDeIdentificacionOlimpico, numeroTotalDeMedallasObtenidas);
        this.nombreEquipo = nombreEquipo;
        this.deportistas = deportistas;
    }
    
    public Equipo(Equipo c){
        super(c);
        this.nombreEquipo = c.nombreEquipo;
        this.deportistas = c.deportistas;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public Participante[] getDeportistas() {
        return deportistas;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void setDeportistas(Participante[] deportistas) {
        this.deportistas = deportistas;
    }
    
    @Override
    public int calcularNumeroTotalDeMedallasObtenidas(int Medallas){
        
        return super.getNumeroTotalDeMedallasObtenidas();
    }
    
    @Override
    public String toString() {
        return "Equipo{" + "nombreEquipo=" + nombreEquipo + ", deportistas=" + deportistas + '}';
    }
    
    
}
