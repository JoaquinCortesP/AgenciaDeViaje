/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencia_viaje;

/**
 *
 * @author Joaqu
 */
//idVuelo (String): Identificador único del vuelo.
// origen (String): Ciudad de origen del vuelo.
// destino (String): Ciudad de destino del vuelo.
// asientosDisponibles (String): Cadena de caracteres que contiene la
//disponibilidad de asientos para el vuelo. *Se agrupa en una cadena
//de String debido a que aún no se usan colecciones.

public class Vuelo {
    private String id_Vuelo, origen, destino, AsientosDisponibles;

    public Vuelo() {
    }

    public Vuelo(String id_Vuelo, String origen, String destino, String AsientosDisponibles) {
        this.id_Vuelo = id_Vuelo;
        this.origen = origen;
        this.destino = destino;
        this.AsientosDisponibles = AsientosDisponibles;
    }

    public String getId_Vuelo() {
        return id_Vuelo;
    }

    public void setId_Vuelo(String id_Vuelo) {
        this.id_Vuelo = id_Vuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getAsientosDisponibles() {
        return AsientosDisponibles;
    }

    public void setAsientosDisponibles(String AsientosDisponibles) {
        this.AsientosDisponibles = AsientosDisponibles;
    }

    @Override
    public String toString() {
        return "IdVuelo:" +"[" +id_Vuelo +"]"+
               " Origen:" +"[" + origen +"]"+ 
               " Destino: " +"[" +destino +"]"+
               " AsientosDisponibles:" + "["+AsientosDisponibles+"]";
    }
    

    
}
