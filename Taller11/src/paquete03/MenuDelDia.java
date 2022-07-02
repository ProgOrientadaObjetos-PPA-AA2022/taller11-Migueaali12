
package paquete03;

import paquete02.Menu;


public class MenuDelDia extends Menu {
    
    private double valorPostre;
    private double valorBebida;

    public MenuDelDia(double valorP, double valorB, String nombre, 
            double valor) {
        super(nombre, valor);
        this.valorPostre = valorP;
        this.valorBebida = valorB;
    }
    
    public void establecerValorPostre(double valorPostre) {
        this.valorPostre = valorPostre;
    }

    public void establecerValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }
    
    @Override
    public void establecerValorM(){
        valorM = (valorIniM + valorPostre + valorBebida);      
    }

    public double obtenerValorPostre() {
        return valorPostre;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }
    
    
       
}
