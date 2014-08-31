package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.templates.OI;

/**
 *
 * @author Super NURDs
 */
public class DriveArcadeDrive extends CommandBase {

    public DriveArcadeDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        // None currently
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        // A method from drivetrain that requires two joystick axis, allows the driver to drive during teleop
//        drivetrain.arcadeDrive(
//                oi.GetDriverJoystickLeftYAxis(),
//                oi.GetDriverJoystickRightXAxis(),
//                true);
        drivetrain.arcadeDriveAxes();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        // Returns false so the command does not end after being run through once
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        // None currently
        //myDriveTrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        // Failsafe
        end();
    }
}