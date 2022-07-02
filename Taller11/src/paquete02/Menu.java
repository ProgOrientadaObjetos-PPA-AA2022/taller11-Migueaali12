
package paquete02;


public abstract class Menu {
    
    protected String nombreP;
    protected double valorM;
    protected double valorIniM;

    public Menu(String nombre, double valor) {
        nombreP = nombre;
        valorIniM = valor;
    }
    
    public void establecerNombreP(String n) {
        nombreP = n;
    }
    
    public void establecerValorIniM(double n) {
        valorIniM = n;
    }
    
    public abstract void establecerValorM();

    public String obtenerNombreP() {
        return nombreP;
    }

    public double obtenerValorM() {
        return valorM;
    }

    public double obtenerValorIniM() {
        return valorIniM;
    }
    
    
    
}
