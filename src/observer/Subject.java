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

import java.util.ArrayList;
import java.util.List;

/**
 * The subject is the object we want to observe. It needs a list of the registered 
 * observers and a way to notify them of a status change.
 *
 * @author Carlo <carlocentos@gmail.com>
 */
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;
    
    public int getState(){
        return state;
    }
    
    public void setState(int state){
        this.state = state;
        notifyAllObservers();
    }
    
    public void attach(Observer observer){
        observers.add(observer);
    }
    
    public void notifyAllObservers(){
        for (Observer observer : observers){
            observer.update();
        }
    }
}
