
package org.usfirst.frc4486.TTH4486_2013;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc4486.TTH4486_2013.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
    public static JoystickButton turboLeft;
    public static JoystickButton slowLeft;
    public JoystickButton pickupLeft;
    public JoystickButton ejectLeft;
    public static Joystick leftStick;
    public static JoystickButton turboRight;
    public static JoystickButton slowRight;
    public JoystickButton pickupRight;
    public JoystickButton ejectRight;
    public static Joystick rightStick;
    public JoystickButton shoot;
    public JoystickButton shootReverse;
    public static JoystickButton startAutoShoot;
    public static JoystickButton stopAutoShoot;
    public static Joystick shooterStick;
    
    public OI() {
        //Joystick
        leftStick = new Joystick(1);
        rightStick = new Joystick(2);
        shooterStick = new Joystick(3);
        
        //Shooter Button Init
        shootReverse = new JoystickButton(shooterStick, 2);
        shoot = new JoystickButton(shooterStick, 1);
        startAutoShoot = new JoystickButton(shooterStick, 8);
        stopAutoShoot = new JoystickButton(shooterStick, 9);
        //Right Button Init
        ejectRight = new JoystickButton(rightStick, 4);
        pickupRight = new JoystickButton(rightStick, 3);
        slowRight = new JoystickButton(rightStick, 2);
        turboRight = new JoystickButton(rightStick, 1);
        //Left Button Init
        ejectLeft = new JoystickButton(leftStick, 4);
        pickupLeft = new JoystickButton(leftStick, 3);
        slowLeft = new JoystickButton(leftStick, 2);
        turboLeft = new JoystickButton(leftStick, 1);
        
        //Shooter Commands
        shootReverse.whileHeld(new ShootReverseControl());
        shoot.whileHeld(new ShootContol());
        //Right Commands
        ejectRight.whileHeld(new EjectControl());
        pickupRight.whileHeld(new PickupControl());
        //Left Commands
        ejectLeft.whileHeld(new EjectControl());
        pickupLeft.whileHeld(new PickupControl());
        
       
        
        // SmartDashboard Buttons
        SmartDashboard.putData("ShootContol", new ShootContol());
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("DriveControl", new DriveControl());
        SmartDashboard.putData("PickupContol", new PickupControl());
        SmartDashboard.putData("WinchContol", new WinchControl());
        SmartDashboard.putData("ShootSpeedContol", new ShootSpeedControl());
        SmartDashboard.putData("EjectControl", new EjectControl());
        SmartDashboard.putData("ShootReverseControl", new ShootReverseControl());
    
    }
    
   
    public Joystick getLeftStick() {
        return leftStick;
    }
    public Joystick getRightStick() {
        return rightStick;
    }
    public Joystick getShooterStick() {
        return shooterStick;
    }
    public static double getTankYLeft(){
        return (leftStick.getY());
    }
    public static double getTankYRight(){
        return (rightStick.getY());
    }
    public static boolean getTurboButton(){
        if (turboLeft.get() && turboRight.get()){
            return true;
        }
        return false;
    }
    public static boolean getSlowButton(){
         if (slowLeft.get() && slowRight.get()){
            return true;
        }
        return false;
    }
    public static double getShooterY(){
        return shooterStick.getY();
    }
    
    public static double getThrottle() {
        return (shooterStick.getTwist() + 1) / 2;
    }
    
    public static boolean getStartAutoShooterButton(){
        return startAutoShoot.get();
    }
    
    public static boolean getStopAutoShooterButton(){
        return stopAutoShoot.get();
    }
}


//// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    
    