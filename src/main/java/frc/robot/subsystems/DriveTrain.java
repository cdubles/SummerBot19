/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
//import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.commands.Drive;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */

public class DriveTrain extends Subsystem {
//create talons

  public static WPI_TalonSRX driveFrontLeft = new WPI_TalonSRX(RobotMap.DriveFrontLeft);
  public static WPI_TalonSRX driveFrontRight = new WPI_TalonSRX(RobotMap.DriveFrontRight);

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
