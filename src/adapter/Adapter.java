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
 * this class translates the call to the method "request", calling the real 
 * method "specificRequest" on adaptee class
 *
 * @author Carlo <carlocentos@gmail.com>
 */
public class Adapter implements ITargetAdapter {

    private final Target adaptee;
    
    public Adapter(Target a) {
        this.adaptee= a;
    }

    @Override
    public void request() {
        // in order to perform the call i need to call the right method SpecificRequest()
        this.adaptee.SpecificRequest();

    }
    
}
