/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc4486.TTH4486_2013.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4486.TTH4486_2013.RobotMap;

/**
 *
 * @author Karl
 */
public class Hopper extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    SpeedController hopperMotor = RobotMap.HopperMotor;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
