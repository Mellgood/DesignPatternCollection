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
package adapter;

/**
 *
 * @author Carlo <carlocentos@gmail.com>
 */
public class Client {

    /**
     * The Client wants to call request method on Target class wich hasn't got 
 that method.
     * The Client knows that there is an Adapter that knows how to adapt the
 request to whatever should be called on Target.
 The Client can use ITargetAdapter interface of Adapter to use the Target's unknown
 method.
 The Client instantiate an Adapter passing an Target to it. The Adapter
 has the responsability to adapt and perform the request on the Target object
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //this declaration may be done in another place and by another pattern..
        ITargetAdapter target= new Adapter(new Target());
        
        //now we have a target which implements ITargetAdapter interface and we can call
        // the "request()" method on it. note that the client has no idea about
        // what is the name of the real method invoked on Target class.
        target.request();
    }
    
}
