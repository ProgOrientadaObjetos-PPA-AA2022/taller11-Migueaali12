
package paquete03;

import paquete02.Menu;

public class MenuEconomico extends Menu {
    
    private double descuento;

    public MenuEconomico(double desc, String nombre, double valor) {
        super(nombre, valor);
        this.descuento = desc;
    }
    
    public void establecerDescuento(double desceunto) {
        this.descuento = ((valorIniM * desceunto) / 100);
    }
    
    @Override
    public void establecerValorM(){
        valorM = (valorIniM  - descuento);      
    }

    public double obtenerDescuento() {
        return descuento;
    }
        
}
