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
package factory;

/**
 * The Client knows the factory and the name of the objects he want to initialize.
 * It doesn't know how to initialize them so the Client delegates the factory to
 * build objects
 *
 * @author Carlo <carlocentos@gmail.com>
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //initialize the factory
        ShapeFactory shapeFactory = new ShapeFactory();
        
        //using the factory
        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();
        
        Shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();
        
        Shape shape3 = shapeFactory.getShape("square");
        shape3.draw();
    }
    
}
