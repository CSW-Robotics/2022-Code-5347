// RobotBuilder Version: 4.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

// ROBOTBUILDER TYPE: RobotContainer.

package frc.robot;

import frc.robot.commands.*;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.*;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {

  private static RobotContainer m_robotContainer = new RobotContainer();

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
// The robot's subsystems
    public final Sub_Belts m_sub_Belts = new Sub_Belts();
    public final Sub_IntakeElev m_sub_IntakeElev = new Sub_IntakeElev();
    public final Sub_Climbing m_sub_Climbing = new Sub_Climbing();
    public final Sub_Shooter2 m_sub_Shooter2 = new Sub_Shooter2();
    public final Sub_Shooter1 m_sub_Shooter1 = new Sub_Shooter1();
    public final Sub_Drivetrain m_sub_Drivetrain = new Sub_Drivetrain();
    public final Sub_IntakeSpin m_sub_IntakeSpin = new Sub_IntakeSpin();
    public final Sub_AutoDrive m_sub_AutoDrive = new Sub_AutoDrive();
 

// Joysticks and Controller
private final XboxController controller = new XboxController(Constants.controllerPort);
private final Joystick Joystick = new Joystick(Constants.joystickPort);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

  
  // A chooser for autonomous commands
  SendableChooser<Command> m_chooser = new SendableChooser<>();

  public void startDrivetrain() {
      if (m_sub_Drivetrain.getCurrentCommand() != null) {m_sub_Drivetrain.getCurrentCommand().cancel();}
    m_sub_Drivetrain.setDefaultCommand(new RunCommand(()->m_sub_Drivetrain.DrivingNow(Joystick.getRawAxis(1)*0.9, Joystick.getRawAxis(2)*0.75), m_sub_Drivetrain));
}

public void clearDrivetrain() {
    if (m_sub_Drivetrain.getCurrentCommand() != null) {m_sub_Drivetrain.getCurrentCommand().cancel();}
    m_sub_Drivetrain.setDefaultCommand(new RunCommand(()->{}, m_sub_Drivetrain));
}

  /**
  * The container for the robot.  Contains subsystems, OI devices, and commands.
  */
  private RobotContainer() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SMARTDASHBOARD
    // Smartdashboard Subsystems
    startDrivetrain();
    // SmartDashboard Buttons
    SmartDashboard.putData("Autonomous Command", new CmdGroup_Autonomouse());

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SMARTDASHBOARD
    // Configure the button bindings
    configureButtonBindings();

    // Configure default commands
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SUBSYSTEM_DEFAULT_COMMAND


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SUBSYSTEM_DEFAULT_COMMAND

    // Configure autonomous sendable chooser
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS

    m_chooser.setDefaultOption("Autonomous Command", new AutonomousCommand());

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS

    SmartDashboard.putData("Auto Mode", m_chooser);
  }

  public static RobotContainer getInstance() {
    return m_robotContainer;
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=BUTTONS
// Create some buttons

/*
final JoystickButton intakeSpinButton = new JoystickButton(controller, XboxController.Button.kA.value);        
intakeSpinButton.whileHeld(new Cmd_IntakeSpin( m_sub_IntakeSpin ) ,true);
    SmartDashboard.putData("IntakeSpinButton",new Cmd_IntakeSpin( m_sub_IntakeSpin ) );

final JoystickButton climbingDownButton = new JoystickButton(controller, XboxController.Button.kA.value);        
climbingDownButton.whileHeld(new Cmd_ClimbingDown( m_sub_Climbing ) ,true);
    SmartDashboard.putData("ClimbingDownButton",new Cmd_ClimbingDown( m_sub_Climbing ) );

final JoystickButton climbingUpButton = new JoystickButton(controller, XboxController.Button.kA.value);        
climbingUpButton.whileHeld(new Cmd_ClimbingUp( m_sub_Climbing ) ,true);
    SmartDashboard.putData("ClimbingUpButton",new Cmd_ClimbingUp( m_sub_Climbing ) );

final JoystickButton beltsButton = new JoystickButton(controller, XboxController.Button.kA.value);        
beltsButton.whileHeld(new Cmd_Belts( m_sub_Belts ) ,true);
    SmartDashboard.putData("BeltsButton",new Cmd_Belts( m_sub_Belts ) );

final JoystickButton intakeElevUpButton = new JoystickButton(controller, XboxController.Button.kA.value);        
intakeElevUpButton.whileHeld(new Cmd_IntakeElevUP( m_sub_IntakeElev ) ,true);
    SmartDashboard.putData("IntakeElevUpButton",new Cmd_IntakeElevUP( m_sub_IntakeElev ) );

final JoystickButton intakeElevDownButton = new JoystickButton(controller, XboxController.Button.kA.value);        
intakeElevDownButton.whileHeld(new Cmd_IntakeElevOut( m_sub_IntakeElev ) ,true);
    SmartDashboard.putData("IntakeElevDownButton",new Cmd_IntakeElevOut( m_sub_IntakeElev ) );

final JoystickButton shooting1Button = new JoystickButton(controller, XboxController.Button.kA.value);        
shooting1Button.whileHeld(new Cmd_Shooting1( m_sub_Shooter1 ) ,true);
    SmartDashboard.putData("Shooting1Button",new Cmd_Shooting1( m_sub_Shooter1 ) );

final JoystickButton shooting2Button = new JoystickButton(controller, XboxController.Button.kA.value);        
shooting2Button.whBileHeld(new Cmd_Shooting2( m_sub_Shooter2 ) ,true);
    SmartDashboard.putData("Shooting2Button",new Cmd_Shooting2( m_sub_Shooter2 ) );
*/


    
    new JoystickButton(controller, 3).whenHeld(new Cmd_Belts(m_sub_Belts));
    //Climbing down brings arm down and robot up
    new JoystickButton(controller, 9).whileHeld(new Cmd_ClimbingDown(m_sub_Climbing));
    new JoystickButton(controller, 10).whileHeld(new Cmd_ClimbingUp(m_sub_Climbing));
    new JoystickButton(controller, 7).whenHeld(new Cmd_IntakeElevOut(m_sub_IntakeElev));
    new JoystickButton(controller, 5).whenHeld(new Cmd_IntakeElevUP(m_sub_IntakeElev));
    new JoystickButton(controller, 8).whenHeld(new Cmd_IntakeSpin(m_sub_IntakeSpin));
    //new JoystickButton(controller, 15).whenHeld(new Cmd_Shooting1(m_sub_Shooter1));
    new JoystickButton(controller, 6).whenPressed(new CmdGroup_AutoShoot(3));
    new JoystickButton(controller, 2).whenHeld(new Cmd_BeltsReverse(m_sub_Belts));
    new JoystickButton(controller, 2).whenHeld(new Cmd_ShootingReverse(m_sub_Shooter1));

    //Testing
    //new JoystickButton(controller, 4).whenHeld(new Cmd_AutoDrive(m_sub_AutoDrive));

    //run Autonomous(e)
    //new JoystickButton(controller, 1).whenPressed(new CmdGroup_Autonomouse());





        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=BUTTONS
  }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
public XboxController getController() {
      return controller;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
  */
  public Command getAutonomousCommand() {
    // The selected command will be run in autonomous
    return m_chooser.getSelected();
  }
  

}

