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
 *
 * @author Carlo <carlocentos@gmail.com>
 */
public class BinaryObserver extends Observer{
    
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);//be carefull here!! It is better to use a factory to build object and then pass the result of Factory construction. this way the object this may not be completely ready yo use and may result in a null pointer
    }

    @Override
    public void update() {
        System.out.println("Binary string: " + Integer.toBinaryString(subject.getState()));
        
    }
    
}
