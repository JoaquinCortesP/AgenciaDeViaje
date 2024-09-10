/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencia_viaje;

/**
 *
 * @author Joaqu
 */
// Atributos:
// idCliente (String): Identificador único del cliente.
// nombre (String): Nombre del cliente.
// reserva (Reserva): Reserva de vuelo asociada al cliente.
// pasajeroFrecuente (PasajeroFrecuente): Información de pasajero
//frecuente asociada al cliente.

public class Cliente {
    private String idCliente, nombre;
    private Reserva reserva;
    private Pasajero_Frecuente pasajeroFrecuente;

    public Cliente() {
    }

    public Cliente(String idCliente, String nombre, Reserva reserva, Pasajero_Frecuente pasajeroFrecuente) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.reserva = reserva;
        this.pasajeroFrecuente = pasajeroFrecuente;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Pasajero_Frecuente getPasajeroFrecuente() {
        return pasajeroFrecuente;
    }

    
    
    
    public void setPasajeroFrecuente(Pasajero_Frecuente pasajeroFrecuente) {
        this.pasajeroFrecuente = pasajeroFrecuente;
    }
    public int sumadorpuntos(){
    if (reserva != null){
        pasajeroFrecuente.contador(); 
        
    }else{
        reserva = null;
    }
        return pasajeroFrecuente.contador();
    }
    
    
    
    
    
    
    @Override
    public String toString() {
        return "id: " + "["+idCliente+"]" + " Nombre: " + "["+ nombre+"]" + " Reserva: " +"[" + reserva+"]" ;
    }
     public static void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
    
    
        
        
    
}
