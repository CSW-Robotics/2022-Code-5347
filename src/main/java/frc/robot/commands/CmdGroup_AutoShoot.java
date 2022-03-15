// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.ParallelDeadlineGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Sub_Belts;
import frc.robot.subsystems.Sub_Shooter1;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class CmdGroup_AutoShoot extends ParallelDeadlineGroup {
  /** Creates a new CmdGroup_AutoShoot. */
  public CmdGroup_AutoShoot(double timeout) {
    /*This commandgroup will encapsulate the commands to autonomously spin up shooter and then after a delay spin belts
    here is what we want: 
    1) rev up the shooting motor (Cmd_Shooting1)
    2) after two seconds run command belts (Cmd_Belts)
    3) after four seconds from start stop everything


    Program structure:
    1) parallel deadline group
      a) dealine: Cmd_Wait(timeout [ie. 4])
      b) parallel command group:
        I) Cmd_Shooting1(to rev up shooting motor)
        II) Sequential group (to handle the belts)
          A) Cmd_Wait(timeout - 2)
          B) Cmd_Belts
    */
    // Add the deadline command in the super() call. Add other commands using
    // addCommands().
    super(new Cmd_WaitCommand(timeout));
    addCommands(
      new ParallelCommandGroup(
        new Cmd_Shooting1(new Sub_Shooter1()),
        new SequentialCommandGroup(
          new Cmd_WaitCommand(timeout - 1.0),
          new Cmd_Belts(new Sub_Belts())
        )
      ) );
    // addCommands(new FooCommand(), new BarCommand());
  }
}
