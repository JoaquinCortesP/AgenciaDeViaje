/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencia_viaje;

/**
 *
 * @author Joaqu
 */
public class Reserva {
    private Vuelo vuelo;
    private String reservaAsiento;

    public Reserva() {
    }

    public Reserva(Vuelo vuelo, String reservaAsiento) {
        this.vuelo = vuelo;
        this.reservaAsiento = reservaAsiento;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public String getReservaVuelo() {
        return reservaAsiento;
    }

    public void setReservaVuelo(String reservaVuelo) {
        this.reservaAsiento = reservaVuelo;
    }

    @Override
    public String toString() {
        return "Reserva: " + "["+vuelo+"]" +"["+ reservaAsiento+"]";
    }
    
    
}
