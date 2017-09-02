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
 * It is possible to have 2 objects of the same type (Duck) with completely 
 * different behaviours. We have 2 ducks d1 and d2 who are completely different
 * in their realizations but seems to be identical by the Client's point of view.
 * The Client only know that d1 and d2 are Duck objects and it is enought to ask
 * them to quack, to fly or to be displayed.   
 *
 * @author Carlo <carlocentos@gmail.com>
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //______________________________________________________________________
        //This behaviour initialization should be done in another design pattern
        //and it shouldn't be a client's responsability. (use a creational
        //pattern instead) 
        IDisplayBehaviorStrategy orangeDisplay= new OrangeDuckDisplayBehavior();
        IFlyBehaviorStrategy fastFly= new FastFlyBehavior();
        IFlyBehaviorStrategy normalFly= new NormalFlyBehavior();
        IQuackBehaviorStrategy europeanQuack= new EuropeanQuackBehavior();
        
        Duck d1= new Duck(fastFly, europeanQuack, orangeDisplay);
        Duck d2= new Duck(normalFly, europeanQuack, orangeDisplay);
        //______________________________________________________________________
        
        
        //The Client has d1 and d2 and it only knows they are Duck objects.
        System.out.println("Invoking fly(), quack() and display() on Duck d1: ");
        d1.fly();
        d1.quack();
        d1.display();
        
        System.out.println("");
                
        System.out.println("Invoking fly(), quack() and display() on Duck d2: ");
        d2.fly();
        d2.quack();
        d2.display();
    }
    
}
