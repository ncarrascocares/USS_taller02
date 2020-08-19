
package empresa;

public class Persona {
    //Declaracion de las variables
    protected String rut;
    protected String nomCompleto;
    
    //Constructor de la clase

    public Persona(String rut, String nomCompleto) {
        this.rut = rut;
        this.nomCompleto = nomCompleto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNomCompleto() {
        return nomCompleto;
    }

    public void setNomCompleto(String nomCompleto) {
        this.nomCompleto = nomCompleto;
    }
    
    public String mostrarDatos(){
        String datos;
        datos =  "Numero de rut: " + rut + "\n";
        datos += "Nombre del trabajador: " + nomCompleto + "\n";
        return datos;
    }
}
