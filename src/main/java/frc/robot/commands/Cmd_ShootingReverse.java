// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import frc.robot.subsystems.Sub_Shooter1;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class Cmd_ShootingReverse extends CommandBase {
  private final Sub_Shooter1 m_sub_Shooter1;
  /** Creates a new Cmd_ShootingReverse. */
  public Cmd_ShootingReverse(Sub_Shooter1 subsystem) {
    m_sub_Shooter1 = subsystem;
    addRequirements(m_sub_Shooter1);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_sub_Shooter1.reverse_shooter();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_sub_Shooter1.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
