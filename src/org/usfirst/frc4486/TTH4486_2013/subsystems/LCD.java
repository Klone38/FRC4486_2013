/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc4486.TTH4486_2013.subsystems;

import edu.wpi.first.wpilibj.DriverStationLCD;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4486.TTH4486_2013.commands.PrintLCD;

/**
 *
 * @author Karl
 */
public class LCD extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public static void printStatus(double leftDrive, double rightDrive, double shootSpeed,
            boolean autoShooter, boolean bottomLimit, boolean topLimit){
        String autoShooterFinal = "Variable Compare Failure";
        String limitWarning = "Variable Compare Failure";
        
        if (autoShooter){autoShooterFinal = "on ";}
        if (!autoShooter){autoShooterFinal = "off";}
        
        if(bottomLimit){limitWarning = "BOTTOM LIMIT REACHED        ";}
        if(!bottomLimit){limitWarning = "                             ";}
        if(topLimit){limitWarning = "TOP LIMIT REACHED           ";}
        if(!topLimit){limitWarning = "                            ";}
        
        
        DriverStationLCD lcd = DriverStationLCD.getInstance();
        DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1,leftDrive+" "+rightDrive);
        DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser2, 1,"Shooter Speed: "+shootSpeed);
        DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser3, 1,"Auto Speed is "+autoShooterFinal);
        DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser4, 1,limitWarning);
        DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser5, 1,"DON'T PANIC");
        
        lcd.updateLCD();
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new PrintLCD());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
