/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc4486.TTH4486_2013.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4486.TTH4486_2013.OI;
import org.usfirst.frc4486.TTH4486_2013.Robot;
import org.usfirst.frc4486.TTH4486_2013.RobotMap;

/**
 *
 * @author Karl
 */
public class PrintLCD extends Command {
    
    public PrintLCD() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.lcd);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {

        boolean autoShoot = false;
        double shootSpeed;
        
        if (OI.getStartAutoShooterButton()){
            autoShoot = true;
        }else if (OI.getStopAutoShooterButton()){
            autoShoot = false;
        }

        if (autoShoot){
            shootSpeed = RobotMap.shooterSpeed;
        }else{
            shootSpeed = OI.getThrottle();
        }
        
        Robot.lcd.printStatus(OI.getTankYLeft(),OI.getTankYRight()
                ,shootSpeed,autoShoot,false,false);
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
