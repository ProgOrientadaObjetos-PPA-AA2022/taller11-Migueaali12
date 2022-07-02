
package paquete03;

import paquete02.Menu;


public class MenuNinios extends Menu {
    
    private double valorHelado;
    private double valorPastel;

    public MenuNinios(double valorH, double valorP, String nombre, 
            double valor) {
        super(nombre, valor);
        this.valorHelado = valorH;
        this.valorPastel = valorP;
    }
    
    public void establecerValorHelado(double valorPostre) {
        this.valorHelado = valorPostre;
    }

    public void establecerValorPastel(double valorBebida) {
        this.valorPastel = valorBebida;
    }
    
    @Override
    public void establecerValorM(){
        valorM = (valorIniM + valorHelado + valorPastel);      
    }

    public double obtenerValorHelado() {
        return valorHelado;
    }

    public double obtenerValorPastel() {
        return valorPastel;
    }
    
}
