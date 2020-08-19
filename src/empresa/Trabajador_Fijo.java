
package empresa;

public class Trabajador_Fijo extends Trabajador{
    //Declaracion de la variable
    private char tipoJornada;
    
    //Constructor de la clase

    public Trabajador_Fijo(String rut, String nomCompleto, char tipoJornada, char tipoTrabajador, char tipoContrato) {
        super(tipoTrabajador, tipoContrato, rut, nomCompleto);
        this.tipoJornada = tipoJornada;
    }
    
    public String tipJorn(){
        if(tipoJornada == 'M')
            return "Media";
        else
            return "Completa";
    }
    
    @Override
    public int calculoMonto(){
        switch(tipoJornada){
            case'M': if(tipoTrabajador == 'O')
                        return 200000;
                     if(tipoTrabajador == 'I')
                        return 600000;
                     else
                        return 800000;
            case 'C': if(tipoTrabajador == 'O')
                        return 500000;
                      if(tipoTrabajador == 'I')
                        return 1300000;
                      else 
                        return 1800000;
        }
        return 0;
    };
    
    @Override
    public String mostrarDatos() {
        String datos = super.mostrarDatos();
        datos += "Tipo de Jornada: " + tipJorn() + "\n";
        datos += "Monto a pagar: " + calculoMonto() + "\n";
        //super.mostrarDatos();
        return datos;
    }

  
    
}
