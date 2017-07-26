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
package strategy;

/**
 *
 * @author Carlo <carlocentos@gmail.com>
 */
public class StrategyPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inizializzo alcuni comportamenti che voglio applicare alle anatre
        IDisplayBehavior orangeDisplay= new OrangeDuckDisplayBehavior();
        IFlyBehavior fastFly= new FastFlyBehavior();
        IFlyBehavior normalFly= new NormalFlyBehavior();
        IQuackBehavior europeanQuack= new EuropeanQuackBehavior();
        
        Duck d1= new Duck(fastFly, europeanQuack, orangeDisplay);
        Duck d2= new Duck(normalFly, europeanQuack, orangeDisplay);
        
        System.out.println("Provo in sequenza fly, quack e display: ");
        d1.fly();
        d1.quack();
        d1.display();
        
        System.out.println("");
        
        
        System.out.println("Provo in sequenza fly, quack e display della seconda anatra: ");
        d2.fly();
        d2.quack();
        d2.display();
    }
    
}
