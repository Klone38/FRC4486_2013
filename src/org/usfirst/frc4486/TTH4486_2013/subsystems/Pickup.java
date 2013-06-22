
package org.usfirst.frc4486.TTH4486_2013.subsystems;
import org.usfirst.frc4486.TTH4486_2013.RobotMap;
import org.usfirst.frc4486.TTH4486_2013.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class Pickup extends Subsystem {
    
    SpeedController lowerPickupMotor = RobotMap.LowerPickupMotor;
    SpeedController upperPickupMotor = RobotMap.UpperPickupMotor;
    
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
