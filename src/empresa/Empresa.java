
package empresa;

/**
 *
 * @author ncarrasco
 * Integrante: Nicolas Carrasco Cares
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String rut, String nomCompleto, char tipoJornada, char tipoTrabajador, char tipoContrato
        //123-0, Pedro Pérez, Obrero, Fijo, Completa
        //456-K, María Castillo, Arquitecto, Fijo, Media
        Persona perfij = new Trabajador_Fijo("123-0","Pedro Pérez", 'C', 'O','F');
        Persona perfij2 = new Trabajador_Fijo("456-K","María Catillo", 'M', 'A','F');
        
        //int horasMensuales, char tipoTrabajador, char tipoContrato, String rut, String nomCompleto
        //789-3, Ana Vidal, Ingeniero, Horas, 30                       
        //305-7, Jorge Araus, Obrero, Horas, 80
        Persona perhor = new Trabajador_Hora(30, 'I', 'H', "789-3","Ana Vidal");
        Persona perhor2 = new Trabajador_Hora(80, 'O', 'H', "305-7","Jorge Araus");
         Persona perhor3 = new Trabajador_Hora(60, 'A', 'F', "310-9","Alexis Tigo");
        
        System.out.println(perfij.mostrarDatos());
        System.out.println(perfij2.mostrarDatos());
        System.out.println(perhor.mostrarDatos());
        System.out.println(perhor2.mostrarDatos());
    }
    
}
