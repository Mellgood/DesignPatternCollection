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
package facade;

/**
 *
 * @author Carlo <carlocentos@gmail.com>
 */
public class Client {

    /**
     * The client doesn't know anything about specialized classes (Memory, 
     * HardDrive, CentralProcessingUnit) and he is allowed to call just the
     * facade's methods. In this case ComputerFacade has got only the start() 
     * method so it just invokes it.
     * The facade has the responsability to perform the requested hi-level task
     * and will demand to specialized classes the responsability to answer the
     * call.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
    
}
