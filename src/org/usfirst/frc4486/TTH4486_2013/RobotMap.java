
package org.usfirst.frc4486.TTH4486_2013;
    
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    
    public static SpeedController ConveyorMotor;
    public static SpeedController LeftDrive;
    public static SpeedController RightDrive;
    public static SpeedController LowerPickupMotor;
    public static SpeedController UpperPickupMotor;
    public static SpeedController ShooterMotors;
    public static SpeedController WinchMotors;
    public static SpeedController HopperMotor;
    public static RobotDrive drive;
    
    //DriveTrain
    public static final int leftMotor = 1;
    public static final int rightMotor = 2;
    
    //Shooter
    public static final int shooterMotor = 3;
    public static final double shooterSpeed = .75;
    
    //Conveyor
    public static final int conveyor = 7;
    public static final double conveyorSpeed = .2;

    //OI
    public static final int leftJoystick = 1;
    public static final int rightJoystick = 2;
    public static final int shooterjoystick = 3;
    
    //Drive Speeds
    public static final double normalSpeed = .6;
    public static final double fastSpeed = 1;
    public static final double slowSpeed = .4;
    
    //Pickup
    public static final int upperPickup = 6;
    public static final int lowerPickup = 5;
    public static final double pickupSpeed = .60;
    
    //Winch
    public static final int winchMotor = 4;
    public static final double winchSpeed = 1;
    
    //Hopper
    public static final int hopperMotor = 8;
    
    public static void init() {
        
        
        LeftDrive = new Jaguar(leftMotor);
	LiveWindow.addActuator("Drivetrain", "LeftDrive", (Jaguar) LeftDrive);
        
        RightDrive = new Jaguar(rightMotor);
	LiveWindow.addActuator("Drivetrain", "RightDrive", (Jaguar) RightDrive);
        
        ShooterMotors = new Talon(shooterMotor);
	LiveWindow.addActuator("Shooter", "ShooterMotors", (Talon) ShooterMotors);
        
        WinchMotors = new Jaguar(winchMotor);
	LiveWindow.addActuator("Winch", "WinchMotors", (Jaguar) WinchMotors);
        
        LowerPickupMotor = new Victor(lowerPickup);
	LiveWindow.addActuator("Pickup", "LowerPickupMotor", (Victor) LowerPickupMotor);
        
        UpperPickupMotor = new Victor(upperPickup);
	LiveWindow.addActuator("Pickup", "UpperPickupMotor", (Victor) UpperPickupMotor);
        
        ConveyorMotor = new Jaguar(conveyor);
	LiveWindow.addActuator("Conveyor", "ConveyorMotor", (Jaguar) ConveyorMotor);
      
        HopperMotor = new Jaguar(hopperMotor);
        LiveWindow.addActuator("Hopper", "HopperMotor", (Jaguar) HopperMotor);
        
        drive = new RobotDrive(LeftDrive, RightDrive);
	
        /*
        drive.setSafetyEnabled(true);
        drive.setExpiration(0.1);
        drive.setSensitivity(0.5);
        drive.setMaxOutput(1.0);
        */
        
        
    
    }
}
