
package empresa;

public abstract class Trabajador extends Persona{
    
    //Declaracion de las variables de mi clase
    protected char tipoTrabajador;
    protected char tipoContrato;
    
    //Constructor de la clase

    public Trabajador(char tipoTrabajador, char tipoContrato, String rut, String nomCompleto) {
        super(rut, nomCompleto);
        this.tipoTrabajador = tipoTrabajador;
        this.tipoContrato = tipoContrato;
    }
    
    //Metodos get y set

    public char getTipoTrabajador() {
        return tipoTrabajador;
    }

    public void setTipoTrabajador(char tipoTrabajador) {
        this.tipoTrabajador = tipoTrabajador;
    }

    public char getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(char tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
    
    //Metodo abstracto, con lo cual nuestar clase se vuelve una clase abstracta
    public abstract int calculoMonto();
    
    public String tipTrab(){
        switch(tipoTrabajador){
            case 'O': return "Obrero";
            case 'I': return "Ingeniero";
            case 'A': return "Arquitecto";
             default: return "Error";
        }
    }
    
    public String tipCont(){
        switch(tipoContrato){
            case 'F': return "Fijo";
            case 'H': return "Horas";
            default: return "Error";
        }
    }

    @Override
    public String mostrarDatos() {
        String datos = super.mostrarDatos();
        datos +=  "Tipo de trabajador: " + tipTrab() + "\n";
        datos += "Tipo de Contrato: " + tipCont() + "\n";
        //super.mostrarDatos();
        return datos;
    }
    
    
}
