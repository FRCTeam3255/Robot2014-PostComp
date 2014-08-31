package edu.wpi.first.wpilibj.templates.commands;

/**
 * 
 *
 *
 * @author Super NURDs
 */
public class AutoDriveDistancePID extends CommandBase {

    double speed;
    double distance;
    
    /**
     * Drive the specified distance (in feet) at the specified speed (0->1)
     * @param d
     */
    public AutoDriveDistancePID(double d) {
        requires(drivetrain);
        this.distance = d;
    }

    // Called just before this Command runs the first time
    /**
     * Set the setpoint to the stored value and enable PID on the drivetrain.
     */
    protected void initialize() {
        drivetrain.setSetpoint(distance);
        drivetrain.driveEncodersInit();
        drivetrain.enable();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    /**
     * @return true when it's close enough to the distance
     */
    protected boolean isFinished() {
        return drivetrain.onTarget();
    }

    // Called once after isFinished returns true
    /**
     * When this command ends, disable the drivetrain's PID
     */
    protected void end() {
        drivetrain.disable();
        CommandBase.drivetrain.arcadeDrive(0.0, 0.0, true);
        drivetrain.stopEncoders();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    /**
     * When this command exits, disable the drivetrain's PID
     */
    protected void interrupted() {
        end();
    }
}