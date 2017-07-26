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
public class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;
    IDisplayBehavior displayBehavior;
    
    public Duck(IFlyBehavior fb, IQuackBehavior qb, IDisplayBehavior db){
        this.flyBehavior= fb;
        this.quackBehavior= qb;
        this.displayBehavior= db;
        
    }
    
    public void fly(){
        this.flyBehavior.fly();
    }
    
    public void quack(){
        this.quackBehavior.quack();
    }
    
    public void display(){
        this.displayBehavior.display();
    }
}
