
package paquete02;

import java.util.ArrayList;


public class Cuenta {
    
    protected String nombreC;
    protected ArrayList<Menu> listaMenu;
    protected double valorT;
    protected double subtotal;
    protected double iva;

    public void establecerNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public void establecerListaMenu(ArrayList<Menu> listaMenu) {
        this.listaMenu = listaMenu;
    }

    public void calcularValorT() {
        this.valorT = (subtotal + iva);
    }

    public void calcularSubtotal() {
        double suma = 0;
        for (int i = 0; i < listaMenu.size() ; i++) {
            suma = suma + listaMenu.get(i).obtenerValorM();
            
        }
        
        subtotal = suma;
    }

    public void establecerIva(double iva) {
        this.iva = ((subtotal * iva) / 100);
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
            
            cadena = String.format("%s%s",cadena ,listaMenu);            
        }
        
        return cadena;
    
    }
    
}
