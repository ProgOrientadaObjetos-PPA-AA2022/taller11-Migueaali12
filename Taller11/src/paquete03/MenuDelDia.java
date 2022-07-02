
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
    
    @Override
    public String toString() {
        String cadena = String.format("Menu del Dia:\n"
                + "\tPlato: %s\n"
                + "\tValor inicial: %.2f\n"
                + "\tValor postre: %.2f\n"
                + "\tValor bebida: %.2f\n"          
                + "\tValor del Menu: %.2f\n",
                obtenerNombreP(), valorIniM, valorPostre, valorBebida,
                 valorM);
                    
        return cadena;
    
    }
       
}
