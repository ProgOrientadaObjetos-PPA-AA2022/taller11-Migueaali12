
package paquete03;

import paquete02.Menu;


public class MenuCarta extends Menu {
    
    private double valorPGuarnicion;
    private double valorBebida;
    private double porcentaje;

    public MenuCarta(double valorG, double valorB, 
            double prctj, String nombre, double valor) {
        super(nombre, valor);
        this.valorPGuarnicion = valorG;
        this.valorBebida = valorB;
        porcentaje = prctj;
        establecerPorcentaje(prctj);
    }
    
    public MenuCarta(String nombre, double valor, double valorG, double valorB, 
            double prctj) {
        super(nombre, valor);
        this.valorPGuarnicion = valorG;
        this.valorBebida = valorB;
        porcentaje = prctj;
        establecerPorcentaje(prctj);
    }
    
     
    public void establecerValorPGuarnicion(double valorPGuarnicion) {
        this.valorPGuarnicion = valorPGuarnicion;
    }

    public void establecerValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public void establecerPorcentaje(double porcentaje) {
        this.porcentaje = ((valorIniM * porcentaje) / 100);
    }
    
    @Override
    public void establecerValorM(){
        valorM = (valorIniM + valorPGuarnicion + valorBebida + porcentaje);
       
    }

    public double obtenerValorPGuarnicion() {
        return valorPGuarnicion;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public double obtenerPorcentaje() {
        return porcentaje;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Menu a la Carta:\n"
                + "\tPlato: %s\n"
                + "\tValor inicial: %.2f\n"
                + "\tValor por Guarnicion: %.2f\n"
                + "\tValor bebida: %.2f\n"
                + "\tPorcentaje adicional: %.2f\n"          
                + "\tValor del Menu: %.2f\n",
                obtenerNombreP(), valorIniM, valorPGuarnicion, valorBebida,
                porcentaje, valorM);
                    
        return cadena;
    
    }
    
   
}
