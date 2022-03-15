// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class CmdGroup_Autonomouse extends SequentialCommandGroup {
  /** Creates a new CmdGroup_Autonomouse. */
  public CmdGroup_Autonomouse() {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(
      // shimmy to get intake down
      new CmdGroup_DriveUntilTimeout(.35,-0.8),
      //wait
      new Cmd_WaitCommand(1.5),
      //move toward Hub
      new CmdGroup_DriveUntilTimeout(0.6, 0.75),
      //wait again
      new Cmd_WaitCommand(1.5),
      //pull ball out of shooter
      new CmdGroup_BeltsSetup(0.5),
      //wait
      new Cmd_WaitCommand(0.25),
      //shoot, dang it
      new CmdGroup_AutoShoot(3.0),
      //get out of the paint
      new CmdGroup_DriveUntilTimeout(3.0, 0.5)
    );
  }
}
