// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Sub_NavxGryo extends SubsystemBase {

  // public AHRS gyro = new AHRS();
  public AnalogGyro gyro = new AnalogGyro(1);

  /** Creates a new Sub_NavxGryo. */
  public Sub_NavxGryo() {
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
