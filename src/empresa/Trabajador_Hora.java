
package empresa;

public class Trabajador_Hora extends Trabajador{
    //Declaracion de la variable de la clase
    private int horasMensuales;
    
    //Declaracion del constructor
    public Trabajador_Hora(int horasMensuales, char tipoTrabajador, char tipoContrato, String rut, String nomCompleto) {
        super(tipoTrabajador, tipoContrato, rut, nomCompleto);
        this.horasMensuales = horasMensuales;
    }
    @Override
    public int calculoMonto(){
        switch(tipoTrabajador){
            case 'O': return (10000*horasMensuales);
            case 'I': return (26000*horasMensuales);
            case 'A': return (40000*horasMensuales);
            default: return 0;
        }
        //return 0;
    }
    
    @Override
    public String mostrarDatos() {
        String datos = super.mostrarDatos();
        datos += "Monto a pagar por " + horasMensuales + " horas es " + calculoMonto() + "\n";
        //super.mostrarDatos();
        return datos;
    }
    
    
    
}
