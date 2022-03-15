// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Sub_NavxGryo;

public class Cmd_ReadGyro extends CommandBase {
  /** Creates a new Cmd_ReadGyro. */
  public Cmd_ReadGyro() {
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    //AHRS gyro = new Sub_NavxGryo().gyro;
    try {
      AnalogGyro gyro = new Sub_NavxGryo().gyro;
      SmartDashboard.putNumber("GryoReading", gyro.getRate() );
    // SmartDashboard.putBoolean("Is connected", gyro.isConnected());
    }  catch (Exception e) {
    // If error, ignore
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
