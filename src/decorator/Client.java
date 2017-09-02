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
 * The Client just knows Beverage class and it's methods.
 * When i add a decorator to the Beverage class, it will be a Beverage too for
 * the Client point of view. I can add as decorator as i want to the Beverage
 * object and it will still remain a Beverage object usable for the Client.
 *
 * @author Carlo <carlocentos@gmail.com>
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //this initialization can be moved to a creational pattern
        Beverage beverage1= new Espresso();
        Beverage beverage2= new Milk(beverage1); //adding some milk..
        
        //checking beverage1 price (expected: 2)
        System.out.println("Costo di Espresso: " + beverage1.cost());
        
        //checking beverage2 price (expected 2 + 1)
        System.out.println("Costo di Espresso con decoratore latte: " + beverage2.cost());
        
    }
    
}
