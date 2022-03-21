// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Sub_AutoDrive extends SubsystemBase {
  private PWMTalonSRX frontRight;
  private PWMTalonSRX backRight;

  private PWMTalonSRX frontLeft;
  private PWMTalonSRX backLeft;
  /** Creates a new Sub_AutoDrive. */
  public Sub_AutoDrive() {
    frontLeft = new PWMTalonSRX(Constants.drivetrainFrontLeftTalonPort);
    frontLeft.setSafetyEnabled(false);
    backLeft = new PWMTalonSRX(Constants.drivetrainRearLeftTalonPort);
    frontLeft.setSafetyEnabled(false);

    frontRight = new PWMTalonSRX(Constants.drivetrainFrontRightTalonPort);
    frontRight.setSafetyEnabled(false);
    backRight = new PWMTalonSRX(Constants.drivetrainRearRightTalonPort);
    backRight.setSafetyEnabled(false);
  }


  public void Forward(){
    double oppercent = 0.5;
    frontLeft.set(oppercent);
    backLeft.set(oppercent);

    frontRight.set(oppercent);
    backRight.set(oppercent);
    SmartDashboard.putNumber("Autodrive working", 5);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
