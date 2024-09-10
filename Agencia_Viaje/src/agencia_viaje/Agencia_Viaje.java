/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agencia_viaje;

import java.util.Scanner;

/**
 *
 * @author Joaqu
 */
public class Agencia_Viaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        
        Compannia_Aerea skyAirlines = new Compannia_Aerea("jk23", "Sky Airlines", "Miami - Hawai");
        Compannia_Aerea skyAirlinesLatinoamerica = new Compannia_Aerea("jk23", "Sky Airlines Latinoamerica", "Santiago - japon");
        Compannia_Aerea skyAirlinesAsia = new Compannia_Aerea("jk23", "Sky Airlines Asia", "Corea del sur- Corea del norte");
        Compannia_Aerea skyAirlinesRusia = new Compannia_Aerea("jk23", "Sky Airlines Rusia", "Rusia - Archipielago J.F");
        Compannia_Aerea skyAirlinesOceania = new Compannia_Aerea("jk23", "Sky Airlines Oceania", "Australia - rapa nuy");
        
        Vuelo vuelo1 = new Vuelo(" 32432", " Miami", " Hawai", " A -1");
        Vuelo vuelo2 = new Vuelo(" 33455", " santiago", " Japon", " b-4");
        Vuelo vuelo3 = new Vuelo(" 35675", " Corea del sur", " Corea del norte"," h-5" );
        Vuelo vuelo4 = new Vuelo(" 36786", " rusia", " Archipielago de Juan fernandez"," j-10" );
        Vuelo vuelo5 = new Vuelo(" 33432", " Australia", " Rapa nui","o - 10" );
        
        
        Reserva reservanueva = new Reserva(vuelo1, " A -1");       
        Reserva reservanueva2 = new Reserva(vuelo2, " b-4");
        Reserva reservanueva3 = new Reserva(vuelo3, " h-5");
        Reserva reservanueva4 = new Reserva(vuelo4, "j-10");
        Reserva reservanueva5 = new Reserva(vuelo5, "o - 10");
        Pasajero_Frecuente pasajerofrecuente =  new Pasajero_Frecuente("3242", 0);
        Cliente cliente1 = new Cliente("3242", "Joaquin", null, pasajerofrecuente);
        
        
        
        
        int opcion = 0;
        while(opcion != 5){
            System.out.println("=====Menu=====");
            System.out.println("Vuelos disponibles [1]");
            System.out.println("Compannias [2]");
            System.out.println("puntos acumulados [3]");
            System.out.println("Perfil [4] ");
            System.out.println("Salir [5]");
            System.out.println("Ingrese una opcion: ");
            opcion = entrada.nextInt();
            
            
            
         switch(opcion){
              case 1:    
                  Cliente.clearConsole();
                  System.out.println("Reservar vuelos");
                  Scanner entrada1 = new Scanner(System.in);
                    int opcion1 = 0;    
                    while(opcion != 6){
                    System.out.println("=====Vuelos=====");
                    System.out.println("[1] " + vuelo1);
                    System.out.println("[2] " + vuelo2);
                    System.out.println("[3] " + vuelo3);
                    System.out.println("[4] " + vuelo4);
                    System.out.println("[5] " + vuelo5);
                    System.out.println("Elimina ultima reserva[6]");
                    System.out.println("Atrás" + "[7]");
                    opcion1 = entrada1.nextInt();
                    
                    switch(opcion1){
                        case 1:
                            cliente1.sumadorpuntos();                    
                            cliente1.setReserva(reservanueva);                        
                            System.out.println("Reserva Realizada con exito: "+ reservanueva );
                            
                            break;                          
                        case 2:
                            cliente1.setReserva(reservanueva2);
                            cliente1.sumadorpuntos();
                            System.out.println("Reserva Realizada con exito: "+ reservanueva2 );
                            break;
                        case 3:
                            cliente1.setReserva(reservanueva3);
                            cliente1.sumadorpuntos();
                            System.out.println("Reserva Realizada con exito: " + reservanueva3);
                            break;
                        case 4:
                            cliente1.setReserva(reservanueva4);
                            cliente1.sumadorpuntos();
                            System.out.println("Reserva Realizada con exito: " + reservanueva4);
                            break;
                        case 5:
                            cliente1.setReserva(reservanueva5);
                            cliente1.sumadorpuntos();
                            System.out.println("Reserva Realizada con exito: " + reservanueva5);
                            break;
                        case 6:
                            System.out.println("Reserva eliminada con exito.");
                            cliente1.setReserva(null);
                            break;
                        case 7:
                            break;
                        default:
                            System.out.println("Opción invalida, seleccione un numero. . .");
                        
                    }       
                    break;
                    }
              case 2:
                  Cliente.clearConsole();
                  System.out.println("compañias ");
                  System.out.println(skyAirlines);
                  System.out.println(skyAirlinesLatinoamerica);
                  System.out.println(skyAirlinesRusia);
                  System.out.println(skyAirlinesOceania);
                  System.out.println(skyAirlinesAsia);
                  
                  break;
              case 3:
                  Cliente.clearConsole();
                  System.out.println("Datos de cliente Frecuente: " +cliente1.getPasajeroFrecuente());
                  cliente1.getPasajeroFrecuente();
                  break;
              case 4:
                  Cliente.clearConsole();
                  System.out.println("perfil");
                  System.out.println(cliente1);
                  break;
              case 5:
                  Cliente.clearConsole();
                  System.out.println("Saliendo...");
                  break;
              default:
                  System.out.println("Opcion no válida, ingrese un número. . .");
             
              
               
           
        }
    }
    
}
}
