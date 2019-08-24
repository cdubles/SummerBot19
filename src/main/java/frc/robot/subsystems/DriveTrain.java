/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.commands.Drive;
import frc.robot.RobotMap;


public class DriveTrain extends Subsystem {
  // create spark motor controllers and give value

  public static Spark driveFrontLeft = new Spark(RobotMap.DriveFrontLeft);
  public static Spark driveFrontRight = new Spark(RobotMap.DriveFrontRight);

 //make drive train
 public static DifferentialDrive diffDrive = new DifferentialDrive(driveFrontLeft, driveFrontRight);

 //make drivetrain function
 public void arcadeDrive(double moveSpeed, double rotateSpeed ){
    diffDrive.arcadeDrive(moveSpeed, rotateSpeed);
 }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
     setDefaultCommand(new Drive());
  }
}
