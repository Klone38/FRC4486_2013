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
public class Drivetrain extends Subsystem {
   
    SpeedController leftDrive = RobotMap.LeftDrive;
    SpeedController rightDrive = RobotMap.RightDrive;
    RobotDrive drive = RobotMap.drive;
    
    public void tankDrive(){
        if (OI.getTurboButton()) {
            drive.setMaxOutput(RobotMap.fastSpeed);
        }
        if (OI.getSlowButton()) {
            drive.setMaxOutput(RobotMap.slowSpeed);
        }
        if (!OI.getTurboButton()&&!OI.getSlowButton()){
            drive.setMaxOutput(RobotMap.normalSpeed);
        }
        drive.tankDrive(OI.getTankYLeft(), OI.getTankYRight(), true);
    }
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        setDefaultCommand(new DriveControl());
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
