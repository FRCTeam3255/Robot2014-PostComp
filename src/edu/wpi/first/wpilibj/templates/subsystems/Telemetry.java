package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.templates.commands.CommandBase;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.templates.commands.TelemetryUpdate;

/**
 *
 * @author Super NURDs
 *
 */
public class Telemetry extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public Telemetry() {
    }

    public void update() {
        // show Drivetrain telemetry
        SmartDashboard.putNumber("Move Speed", CommandBase.drivetrain.driveMoveSpeed());
        SmartDashboard.putNumber("Rotate Speed", CommandBase.drivetrain.driveRotateSpeed());
        SmartDashboard.putNumber("Drivetrain Left Encoder Value", CommandBase.drivetrain.driveEncodersLeftValue());
        SmartDashboard.putNumber("Drivetrain Right Encoder Value", CommandBase.drivetrain.driveEncodersRightValue());
        SmartDashboard.putBoolean("Gear State", CommandBase.drivetrain.gearState());
        SmartDashboard.putNumber("Gyroscope Angle", CommandBase.drivetrain.getGyroAngle());
        SmartDashboard.putNumber("X Acceleration", CommandBase.drivetrain.getAcceleration("x"));
        SmartDashboard.putNumber("Y Acceleration", CommandBase.drivetrain.getAcceleration("y"));
        SmartDashboard.putNumber("Z Acceleration", CommandBase.drivetrain.getAcceleration("z"));
        SmartDashboard.putBoolean("Gyro PID Enabled", CommandBase.drivetrain.gyroscope.isEnable());
        SmartDashboard.putNumber("Gyro P", CommandBase.drivetrain.gyroscope.getP());
        SmartDashboard.putNumber("Gyro I", CommandBase.drivetrain.gyroscope.getI());
        SmartDashboard.putNumber("Gyro D", CommandBase.drivetrain.gyroscope.getD());
       
        // show Pneumatics telemetry
        SmartDashboard.putBoolean("Pneumatics is Charged", CommandBase.pneumatics.isMaxPSI());
        
        SmartDashboard.putNumber("Voltage", DriverStation.getInstance().getBatteryVoltage());
        SmartDashboard.putNumber("Match Time", (DriverStation.getInstance().getMatchTime() - 15.0));
        SmartDashboard.putNumber("Analog Input 1", DriverStation.getInstance().getAnalogIn(1));
    }

    public void init() {
        SmartDashboard.putData(CommandBase.drivetrain);
        SmartDashboard.putData(CommandBase.pneumatics);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        this.setDefaultCommand(new TelemetryUpdate());
    }
}