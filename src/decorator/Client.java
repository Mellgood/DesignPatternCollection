/*
 * Copyright (C) 2017 Carlo <carlocentos@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package decorator;


/**
 * Beverage è l'interfaccia ad alto livello che userò nel main.
 * Espresso è una Beverage esattamente come AddonDecorator ma Espresso è una
 * classe concreta mentre AddonDecorator è un altra astrazione.
 * Milk è un AddonDecorator e quindi ha una Beverage ed è un AddonDecorator (quindi
 * è anche una Beverage).
 *
 * @author Carlo <carlocentos@gmail.com>
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //verifico il costo di un caffè (2)
        Beverage caffè= new Espresso();
        System.out.println("Costo di Espresso: " + caffè.cost());
        
        //verifico se nel caffè con latte viene applicata la maggiorazione di 1
        Beverage caffèConLatte= new Milk(caffè);
        System.out.println("Costo di Espresso con decoratore latte: " + caffèConLatte.cost());
        
    }
    
}
