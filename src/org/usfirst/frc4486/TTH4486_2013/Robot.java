
package org.usfirst.frc4486.TTH4486_2013;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc4486.TTH4486_2013.commands.*;
import org.usfirst.frc4486.TTH4486_2013.subsystems.*;
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
    Command autonomousCommand;
    public static OI oi;
    
    public static Conveyor conveyor;
    public static Drivetrain drivetrain;
    public static Pickup pickup;
    public static Shooter shooter;
    public static Winch winch;
    public static Hopper hopper;
    public static LCD lcd;
    
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
	RobotMap.init();
        
        conveyor = new Conveyor();
        drivetrain = new Drivetrain();
        pickup = new Pickup();
        shooter = new Shooter();
        winch = new Winch();
        lcd = new LCD();
    
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();
	
        // instantiate the command used for the autonomous period
        
        autonomousCommand = new AutonomousCommand();
        
    
    }
    public void autonomousInit() {
        // schedule the autonomous command (example)
        if (autonomousCommand != null){ autonomousCommand.start();}
    }
    
    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }
    public void teleopInit() {
	// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null){ autonomousCommand.cancel();}
        
    }
    
    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    /**
     * This function called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
