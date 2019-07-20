/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import frc.robot.commands.Drive;

/**
 * Add your docs here.
 */

public class DriveTrain extends Subsystem {

  public static Talon driveFrontLeft = new Talon(1);
  public static Talon driveFrontRight = new Talon(2);
  public static Talon driveBackRight = new Talon(3);
  public static Talon driveBackLeft = new Talon(4);
  
  public static double x = 0;
  public static double y = 0;
  public static double z = 0;
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  
  public static MecanumDrive mecDrive = new MecanumDrive(driveFrontLeft, driveBackLeft, driveFrontRight, driveBackRight);
  
  
       
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
     setDefaultCommand(new Drive());
  }
}
