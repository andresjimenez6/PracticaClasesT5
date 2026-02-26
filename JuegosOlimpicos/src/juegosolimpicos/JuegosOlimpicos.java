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
        for (Deporte d : listaDeDeportes) {
            if (d != null && d.getNombre().equalsIgnoreCase(nuevoDeporte.getNombre())) {
                return false;
            }
        }
        Deporte[] nuevaLista = new Deporte[listaDeDeportes.length + 1];
        for (int i = 0; i < listaDeDeportes.length; i++) {
            nuevaLista[i] = listaDeDeportes[i];
        }
        nuevaLista[nuevaLista.length - 1] = nuevoDeporte;
        this.listaDeDeportes = nuevaLista;
        return true;
    }
    
    public boolean registrarNuevosDeportistas(){
        for (Participante p : listaDeParticipantes) {
            if (p != null && p.getNumeroDeIdentificacionOlimpico() == nuevoParticipante.getNumeroDeIdentificacionOlimpico()) {
                return false;
            }
        }
        Participante[] nuevaLista = new Participante[listaDeParticipantes.length + 1];
        for (int i = 0; i < listaDeParticipantes.length; i++) {
            nuevaLista[i] = listaDeParticipantes[i];
        }
        nuevaLista[nuevaLista.length - 1] = nuevoParticipante;
        this.listaDeParticipantes = nuevaLista;
        return true;
    }
    
    public boolean crearEquipos(){
        for (Participante p : listaDeParticipantes) {
            if (p != null && p.getNumeroDeIdentificacionOlimpico() == equipo.getNumeroDeIdentificacionOlimpico()) {
                return false;
            }
        }
        Participante[] nuevaLista = new Participante[listaDeParticipantes.length + 1];
        for (int i = 0; i < listaDeParticipantes.length; i++) {
            nuevaLista[i] = listaDeParticipantes[i];
        }
        nuevaLista[nuevaLista.length - 1] = equipo;
        this.listaDeParticipantes = nuevaLista;
        return true;
    }
    
    public boolean inscribirParticipantesEnPruebas(){
        // Verificar límite máximo
        if (inscritos.length >= deporte.getNumeroMaximoDeParticipantesPorPrueba()) {
            return false;
        }

        // Verificar que no esté ya inscrito
        for (Participante p : inscritos) {
            if (p != null && p.getNumeroDeIdentificacionOlimpico() == participante.getNumeroDeIdentificacionOlimpico()) {
                return false;
            }
        }

        // Inscribir al participante
        Participante[] nuevaLista = new Participante[inscritos.length + 1];
        for (int i = 0; i < inscritos.length; i++) {
            nuevaLista[i] = inscritos[i];
        }
        nuevaLista[nuevaLista.length - 1] = participante;
        prueba.setListaDeParticipantes(nuevaLista);
        return true;
    }
            
    public void mostrarElMedalleroGeneralPorPais(){
        System.out.println("=== Medallero General por País ===");

        // Recopilar países únicos de los participantes
        String[] paises = new String[listaDeParticipantes.length];
        int totalPaises = 0;
        for (Participante p : listaDeParticipantes) {
            if (p == null) continue;
            boolean yaRegistrado = false;
            for (int i = 0; i < totalPaises; i++) {
                if (paises[i].equals(p.getPais())) {
                    yaRegistrado = true;
                    break;
                }
            }
            if (!yaRegistrado) {
                paises[totalPaises++] = p.getPais();
            }
    }
    
    

        public String mostrarElParticipanteConMasMedallas() {
        System.out.println("=== Participante con Más Medallas ===");

        if (listaDeParticipantes == null || listaDeParticipantes.length == 0) {
            System.out.println("No hay participantes registrados.");
            return;
        }

        Participante ganador = null;
        int maxMedallas = -1;

        for (Participante p : listaDeParticipantes) {
            if (p == null) continue;
            int total = p.calcularNumeroTotalDeMedallasObtenidas(maxMedallas);
            if (total > maxMedallas) {
                maxMedallas = total;
                ganador = p;
            }
        }

        if (ganador == null) {
            System.out.println("No se encontró ningún participante.");
        } else {
            System.out.println(ganador.mostrarInformacion());
            System.out.println("Total de medallas: " + maxMedallas);
        }
    }
    }


//bua, marina lo siento por el dolor de ojos pero asi se va a quedar. (23.41 del 27/2/2026, he dado tantas vueltas que no se si tengo metodos personalizados todavia sin hacer, mb si es asi, y suerte corrigiendo esta.... cosa? nose suerte)
