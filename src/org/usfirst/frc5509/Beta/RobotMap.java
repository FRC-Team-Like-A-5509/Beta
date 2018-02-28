// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5509.Beta;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainleftMotor;
    public static SpeedController driveTrainrightMotor;
    public static DifferentialDrive driveTrainDifferentialDrive1;
    public static WPI_TalonSRX wenchDrivewench1;
    public static WPI_TalonSRX wenchDrivewench2;
    public static WPI_TalonSRX wenchDrivewench3;
    public static DoubleSolenoid shooterDriveshooterArm;
    public static SpeedController elbowDriveupDownMotor;
    public static SpeedController intakeDriveintakeMotor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainleftMotor = new PWMTalonSRX(1);
        LiveWindow.addActuator("DriveTrain", "leftMotor", (PWMTalonSRX) driveTrainleftMotor);
        driveTrainleftMotor.setInverted(true);
        driveTrainrightMotor = new PWMTalonSRX(0);
        LiveWindow.addActuator("DriveTrain", "rightMotor", (PWMTalonSRX) driveTrainrightMotor);
        driveTrainrightMotor.setInverted(true);
        driveTrainDifferentialDrive1 = new DifferentialDrive(driveTrainleftMotor, driveTrainrightMotor);
        LiveWindow.addActuator("DriveTrain", "Differential Drive 1", driveTrainDifferentialDrive1);
        driveTrainDifferentialDrive1.setSafetyEnabled(true);
        driveTrainDifferentialDrive1.setExpiration(0.1);
        driveTrainDifferentialDrive1.setMaxOutput(1.0);

        wenchDrivewench1 = new WPI_TalonSRX(0);
        
        
        wenchDrivewench2 = new WPI_TalonSRX(1);
        
        
        wenchDrivewench3 = new WPI_TalonSRX(2);
        
        
        shooterDriveshooterArm = new DoubleSolenoid(0, 0, 1);
        LiveWindow.addActuator("ShooterDrive", "shooterArm", shooterDriveshooterArm);
        
        elbowDriveupDownMotor = new VictorSP(4);
        LiveWindow.addActuator("ElbowDrive", "upDownMotor", (VictorSP) elbowDriveupDownMotor);
        elbowDriveupDownMotor.setInverted(false);
        intakeDriveintakeMotor = new VictorSP(2);
        LiveWindow.addActuator("IntakeDrive", "intakeMotor", (VictorSP) intakeDriveintakeMotor);
        intakeDriveintakeMotor.setInverted(false);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
