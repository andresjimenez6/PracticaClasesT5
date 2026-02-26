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
public class JuegosOlimpicos {
    private String nombreDelEvento;
    private int año;
    private String ciudadSede;
    private Deporte[] listaDeDeportes;
    private Participante[] listaDeParticipantes;
    
    public JuegosOlimpicos(){
        this.nombreDelEvento = "";
        this.año = 0;
        this.ciudadSede = "";
        this.listaDeDeportes = new Deporte[0];
        this.listaDeParticipantes = new Participante[0];
    }
    public JuegosOlimpicos(String nombreDelEvento, int año, String ciudadSede, Deporte[] listaDeDeportes, Participante[] listaDeParticipantes){
        this.nombreDelEvento = nombreDelEvento;
        this.año = año;
        this.listaDeDeportes = listaDeDeportes;
        this.listaDeParticipantes = listaDeParticipantes;
    }
    public JuegosOlimpicos(JuegosOlimpicos c){
        this.nombreDelEvento =c.nombreDelEvento;
        this.año = c.año;
        this.listaDeDeportes = c.listaDeDeportes;
        this.listaDeParticipantes = c.listaDeParticipantes;
    }

    public String getNombreDelEvento() {
        return nombreDelEvento;
    }

    public int getAño() {
        return año;
    }

    public String getCiudadSede() {
        return ciudadSede;
    }

    public Deporte[] getListaDeDeportes() {
        return listaDeDeportes;
    }

    public Participante[] getListaDeParticipantes() {
        return listaDeParticipantes;
    }

    public void setNombreDelEvento(String nombreDelEvento) {
        this.nombreDelEvento = nombreDelEvento;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setCiudadSede(String ciudadSede) {
        this.ciudadSede = ciudadSede;
    }

    public void setListaDeDeportes(Deporte[] listaDeDeportes) {
        this.listaDeDeportes = listaDeDeportes;
    }

    public void setListaDeParticipantes(Participante[] listaDeParticipantes) {
        this.listaDeParticipantes = listaDeParticipantes;
    }
    
    public boolean registrarNuevosDeportes(){
        
        
        return true;
    }
    
    public boolean registrarNuevosDeportistas(){
        
        return true;
    }
    
    public boolean crearEquipos(){
        return true;
    }
    
    public boolean inscribirParticipantesEnPruebas(){
        return true;
    }
            
    public void mostrarElMedalleroGeneralPorPais(){
        
    }
    
    public void mostrarElParticipanteConMasMedallas(){
        
    }
}
