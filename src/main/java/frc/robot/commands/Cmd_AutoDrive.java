// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Sub_AutoDrive;

public class Cmd_AutoDrive extends CommandBase {
  private final Sub_AutoDrive m_sub_Drivetrain;
 
  /** Creates a new Cmd_AutoDrive. */
  public Cmd_AutoDrive(Sub_AutoDrive subsystem) {

    m_sub_Drivetrain = subsystem;
    addRequirements(m_sub_Drivetrain);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_sub_Drivetrain.Forward();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
