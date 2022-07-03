/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import paquete02.Cuenta;
import paquete02.Menu;
import paquete03.MenuCarta;
import paquete03.MenuDelDia;
import paquete03.MenuEconomico;
import paquete03.MenuNinios;

/**
 *
 * @author reroes
 */
public class Ejecutor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MenuNinios menuN1 = new MenuNinios(1, 1.50, "Niños 01" ,2);
        menuN1.establecerValorM();
        
        MenuNinios menuN2 = new MenuNinios(1, 1.50, "Niños 02" ,3);
        menuN2.establecerValorM();
        
        MenuEconomico menuEco = new MenuEconomico(25, "Econo 001", 4);
        menuEco.establecerValorM();
        
        MenuDelDia menuD = new MenuDelDia(1, 1, "Dia 001", 5);
        menuD.establecerValorM();
        
        MenuCarta menuC = new MenuCarta(1.5, 2.0, 10, "Carta 001", 6);
        menuC.establecerValorM();
        
        ArrayList<Menu> listaMenu = new ArrayList();
        listaMenu.add(menuN1);
        listaMenu.add(menuN2);
        listaMenu.add(menuEco);
        listaMenu.add(menuD);
        listaMenu.add(menuC);       
        
        Cuenta cuenta1 = new Cuenta("René Elizalde", listaMenu, 10);
        
        System.out.println(cuenta1);
        
    }
    
    
}
// lo que debe presentar
/*
Factura
Cliente: René Elizalde
Menu del Día:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50

Menu del Día:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50

Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00

Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00

Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10

Subtotal: 30,1
IVA: 10,0%
Total a pagar: 33,110

*/