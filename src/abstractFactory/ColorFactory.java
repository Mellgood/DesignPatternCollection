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
 *
 * @author Carlo <carlocentos@gmail.com>
 */
public class ColorFactory extends AbstractFactory{

    @Override
    Color getColor(String color) {
        color = color.toUpperCase();
        switch(color){
            case "RED": 
                return new RedColor();
            case "GREEN":
                return new GreenColor();
            case "BLUE":
                return new BlueColor();
            default: 
                return null;
        }
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
    
}
