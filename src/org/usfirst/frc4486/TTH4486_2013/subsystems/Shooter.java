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
public class Shooter extends Subsystem {
    
    SpeedController shooterMotors = RobotMap.ShooterMotors;
    
    
    public static boolean startAuto;
    public static boolean stopAuto;
    
    public static void shooterSpeed() {
        
        
        if (OI.getStartAutoShooterButton()){
            startAuto = true;
            stopAuto = false;
        }
        if (OI.getStopAutoShooterButton()){
            startAuto = false;
            stopAuto = true;
        }
        if (startAuto){
            RobotMap.ShooterMotors.set(RobotMap.shooterSpeed);
            
        }
        if (stopAuto){
            RobotMap.ShooterMotors.set(OI.getThrottle());
        }
    }
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        
	setDefaultCommand(new ShootSpeedControl());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
