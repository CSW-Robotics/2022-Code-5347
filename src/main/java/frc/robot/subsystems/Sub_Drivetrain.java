// RobotBuilder Version: 4.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

// ROBOTBUILDER TYPE: Subsystem.

package frc.robot.subsystems;


import frc.robot.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;





/**
 *
 */
public class Sub_Drivetrain extends SubsystemBase {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
private WPI_TalonSRX leftDriveFrontTalon;
private WPI_TalonSRX leftDriveRearTalon;
private MotorControllerGroup drivetrainGroupLeft;
private WPI_TalonSRX rightDriveFrontTalon;
private WPI_TalonSRX rightDriveRearTalon;
private MotorControllerGroup drivetrainGroupRight;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    /**
    *
    */
    public Sub_Drivetrain() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
leftDriveFrontTalon = new WPI_TalonSRX(2);
 leftDriveFrontTalon.setInverted(false);

leftDriveRearTalon = new WPI_TalonSRX(4);
 leftDriveRearTalon.setInverted(false);

drivetrainGroupLeft = new MotorControllerGroup(leftDriveFrontTalon, leftDriveRearTalon);

 

rightDriveFrontTalon = new WPI_TalonSRX(5);
 rightDriveFrontTalon.setInverted(false);

rightDriveRearTalon = new WPI_TalonSRX(3);
 rightDriveRearTalon.setInverted(false);

drivetrainGroupRight = new MotorControllerGroup(rightDriveFrontTalon, rightDriveRearTalon);
 


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run

    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run when in simulation

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

