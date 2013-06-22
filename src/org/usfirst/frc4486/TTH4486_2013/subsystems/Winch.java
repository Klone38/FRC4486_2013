//Finished
package org.usfirst.frc4486.TTH4486_2013.subsystems;
import org.usfirst.frc4486.TTH4486_2013.RobotMap;
import org.usfirst.frc4486.TTH4486_2013.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4486.TTH4486_2013.OI;
/**
 *
 */
public class Winch extends Subsystem {
    
    SpeedController winchMotors = RobotMap.WinchMotors;
    
    public void winchControl(){
        RobotMap.WinchMotors.set(OI.getShooterY());
    }
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
    
	setDefaultCommand(new WinchControl());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
