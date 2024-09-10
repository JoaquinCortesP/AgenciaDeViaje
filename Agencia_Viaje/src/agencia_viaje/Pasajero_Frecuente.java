/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencia_viaje;

/**
 *
 * @author Joaqu
 */
public class Pasajero_Frecuente {
    private String numeroPasajero;
    private int puntos;
    
    

    public Pasajero_Frecuente() {
    }

    public Pasajero_Frecuente(String numeroPasajero, int puntos) {
        this.numeroPasajero = numeroPasajero;
        this.puntos = puntos;
    }

    public String getNumeroPasajero() {
        return numeroPasajero;
    }

    public void setNumeroPasajero(String numeroPasajero) {
        this.numeroPasajero = numeroPasajero;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = 0;
        
          
     
    }
    public int contador(){
      
      return puntos += 100;
      
    }
    
    @Override
    public String toString() {
        return "Pasajero Frecuente: " +"["+ numeroPasajero +"]"+
                "puntos: " +"["+ puntos+"]";
    }
   
    
    }
    
        
       
        
    


