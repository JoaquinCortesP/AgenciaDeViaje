/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencia_viaje;

/**
 *
 * @author Joaqu
 */
public class Compannia_Aerea {
   private String idCompañia, nombre, vuelosDisponibles;

    public Compannia_Aerea() {
    }

    public Compannia_Aerea(String idCompañia, String nombre, String vuelosDisponibles) {
        this.idCompañia = idCompañia;
        this.nombre = nombre;
        this.vuelosDisponibles = vuelosDisponibles;
    }

    public String getIdCompañia() {
        return idCompañia;
    }

    public void setIdCompañia(String idCompañia) {
        this.idCompañia = idCompañia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVuelosDisponibles() {
        return vuelosDisponibles;
    }

    public void setVuelosDisponibles(String vuelosDisponibles) {
        this.vuelosDisponibles = vuelosDisponibles;
    }

    @Override
    public String toString() {
        return  "idCompannia: " + "["+idCompañia +"]"+" Nombre de la compannia:" +"["+ nombre +"]"+ " VuelosDisponibles: " +"["+ vuelosDisponibles+"]";
    }
   
   
}
