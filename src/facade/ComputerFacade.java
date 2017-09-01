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
public class ComputerFacade {
    private CentralProcessingUnit processor;
    private Memory ram;
    private HardDrive hd;
    
    //Setting some parameters (in real life i know exactly those values)
    long BOOT_ADDRESS = 12;
    long BOOT_SECTOR =3;
    int SECTOR_SIZE = 4;
    
    public ComputerFacade(){
        this.processor = new CentralProcessingUnit();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }
    
    /**
     * At pc power on, i have to boot... so i freeze the processor, load the os
     * then set the processor's next instruction to the BOOT_ADDRESS and at the
     * end i can execute
     */
    public void start(){
        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
        
    }
    
}
