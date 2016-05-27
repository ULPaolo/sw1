package dominio.com.test;

import dominio.com.gestion.Gestion;


public class Test {

    public static void main(String[] args) {
       String archivo1 = "c:\\documentos\\data\\jugadores.txt";
        
        Gestion gestion = new Gestion();
       
        gestion.leerData(archivo1);
              
        System.out.println("....Se registraron " + gestion.getJugadores().size()+ "  jugadores.....");
      
        //Datos de las ciudades
        System.out.println("\n....DATOS DE LOS JUGADORES ..........\n");
 
        System.out.println("nombre::club::liga::nacionalidad::posicion::puntaje::tiro::pase::dribbling::defensa::fisico"); 
        gestion.mostrarJugadores();
    }
    
}
