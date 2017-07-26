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
package decoratorpattern;

/**
 *
 * @author Carlo <carlocentos@gmail.com>
 */
public class Milk extends AddonDecorator{
    Beverage beverage; //il decorator ha una Beverage
    int myCost= 1;
    
    public Milk(Beverage b){
        this.beverage= b;
    }

    @Override
    public int cost() {
        int cost= this.beverage.cost(); 
        cost += this.myCost;
        
        return cost;
    }
    
}
