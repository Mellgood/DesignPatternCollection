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
package abstractFactory;

/**
 * The client doesn't create any object using the new keyword. It uses the
 * AbstractFactory instead to delegate the creation responsability
 * The abstract factory is a kind of an index for all the available factories
 * so the client can get the object he needs asking the specialized factory.
 *
 * @author Carlo <carlocentos@gmail.com>
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //get shape and color factoryes
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //get 3 different shapes and 3 different colors from the relatives factories
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        Shape shape2 = shapeFactory.getShape("SQUARE");
        Shape shape3 = shapeFactory.getShape("CIRCLE");

        Color color1 = colorFactory.getColor("RED");
        Color color2 = colorFactory.getColor("GREEN");
        Color color3 = colorFactory.getColor("BLUE");

        //calling object's methods
        shape1.draw();
        shape2.draw();
        shape3.draw();
        
        color1.fill();
        color2.fill();
        color3.fill();
    }
    
}
