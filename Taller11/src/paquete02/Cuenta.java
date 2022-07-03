
package paquete02;

import java.util.ArrayList;


public class Cuenta {
    
    protected String nombreC;
    protected ArrayList<Menu> listaMenu;
    protected double valorT;
    protected double subtotal;
    protected double iva;

    public Cuenta(String nombreC, ArrayList<Menu> listaMenu, double iva) {
        this.nombreC = nombreC;
        this.listaMenu = listaMenu;
        this.iva = iva;
        calcularSubtotal();
        calcularValorT();
        this.valorT = obtenerValorT();
        this.subtotal = obtenerSubtotal();
        
    }
    
    public void establecerNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public void establecerListaMenu(ArrayList<Menu> listaMenu) {
        this.listaMenu = listaMenu;
    }

    public void calcularValorT() {
        double ive = (subtotal * iva) / 100;
        this.valorT = (subtotal + ive);
    }

    public void calcularSubtotal() {
        for (int i = 0; i < listaMenu.size() ; i++) {
            subtotal += listaMenu.get(i).obtenerValorM();
            
        }
        
    }

    public void establecerIva(double iva) {
        this.iva = iva;
    }

    public String obtenerNombreC() {
        return nombreC;
    }

    public ArrayList<Menu> obtenerListaMenu() {
        return listaMenu;
    }

    public double obtenerValorT() {
        return valorT;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }

    public double obtenerIva() {
        return iva;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Factura\n"
                + "Cliente: %s\n",              
                obtenerNombreC());
        
        for (int i = 0; i < listaMenu.size() ; i++) {
            
            cadena = String.format("%s%s\n",cadena ,listaMenu.get(i));            
        }
        
        String porcentaje = "%";
        
        cadena = String.format("%s\n"
                + "Subtotal: %.2f\n"
                + "Iva: %.1f%s\n"
                + "Total a pagar: %.2f\n",
                cadena, subtotal, iva, porcentaje, valorT);
        
        return cadena;
    
    }
    
}
