
package org.usfirst.frc4486.TTH4486_2013.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4486.TTH4486_2013.Robot;
/**
 *
 */
public class  PickupControl extends Command {
    public PickupControl() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
	
        
        requires(Robot.pickup);
    
    }
    
    // Called just before this Command runs the first time
    protected void initialize() {
    }
    
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }
    
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }
    
    // Called once after isFinished returns true
    protected void end() {
    }
    
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
