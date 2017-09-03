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
package observer;

/**
 * The client here just change the state of the subject object. The client doesn't
 * even know that there are some other classes observing the subject.
 * The Client only knows the subject.
 *
 * @author Carlo <carlocentos@gmail.com>
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Subject subject = new Subject();
        
        //this initialization may not be done here.. client shouldn't know about
        //those classes
        new HexaObserver(subject);
        new BinaryObserver(subject);
        new OctalObserver(subject);
        
        System.out.println("First state change: 18");
        subject.setState(18);
        
        System.out.println("Second state change: 24");
        subject.setState(24);
        
        System.out.println("Third state change: 4");
        subject.setState(4);
    }
    
}
