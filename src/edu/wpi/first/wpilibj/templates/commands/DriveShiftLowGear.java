package edu.wpi.first.wpilibj.templates.commands;

/**
 *
 * @author Super NURDs
 */
public class DriveShiftLowGear extends CommandBase {

    public DriveShiftLowGear() {
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
        // Changes the state of the drive solenoid and shifts the robot to low gear
        drivetrain.shiftLowGear();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        // Returns true so the gear only shifts once per time called
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
        // None currently
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        // Failsafe
        end();
    }
}