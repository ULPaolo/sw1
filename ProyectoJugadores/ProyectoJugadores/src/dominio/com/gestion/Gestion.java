/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.com.gestion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import dominio.com.bean.Jugador;

/**
 *
 * @author Vsanchez
 */
public class Gestion {
    private   List<Jugador> jugadores;
          
    public Gestion() {
        
      jugadores = new ArrayList<>();
     
    }
    
   public void leerData(String archivo) {
        File f = new File(archivo);
        Scanner s;
        String linea;
        try {
            s = new Scanner(f);
            while ( s.hasNext() ) {
            //El método  nextLine() retorna una linea
             //del archivo 
                linea = s.nextLine();
                crearJugador(linea);
            }
            s.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            
        }
        
    }
    
     private void crearJugador(String linea) {
       String[] cadenas;
       Jugador refJugador;
       
       cadenas = linea.split("::");
           
       String nombre = cadenas[0];
       String club = cadenas[1];
       String liga = cadenas[2];
       String nacionalidad = cadenas[3];
       String posicion = cadenas[4];
       int puntaje = Integer.parseInt(cadenas[5]);
       int tiro = Integer.parseInt(cadenas[6]);
       int pase = Integer.parseInt(cadenas[7]);
       int dribbling = Integer.parseInt(cadenas[8]);
       int defensa = Integer.parseInt(cadenas[9]); 
       int fisico = Integer.parseInt(cadenas[10]);

           //Jugador(String nombre, String club, String liga, String nacionalidad, String posicion, int puntaje, int tiro, int pase,
           //int dribbling, int defensa, int fisico) 

       refJugador = new Jugador(nombre, club, liga, nacionalidad, posicion, puntaje, tiro, pase, dribbling, defensa, fisico);

       agregarJugador(refJugador);
    }
    
     //Agregar ciudad a la listat
    public void agregarJugador(Jugador ref){
         jugadores.add(ref);
    } 
    
     //Mostrar la lista de ciudades
    public void mostrarJugadores(){
        for(Jugador ref:jugadores){
              System.out.println(ref);
         }
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    
}
