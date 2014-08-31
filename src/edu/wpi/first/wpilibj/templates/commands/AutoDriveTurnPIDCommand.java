package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.command.PIDCommand;

/**
 *
 *
 * @author Super NURDs
 */
public class AutoDriveTurnPIDCommand extends PIDCommand {

    double setpoint;
    
    /**
     * @param s = the setpoint angle
     */
    public AutoDriveTurnPIDCommand(double s) {
        super(4.0, 3.0, 4.0);
        this.setpoint = s;
        requires(CommandBase.drivetrain);
    }

    // Called just before this Command runs the first time
    /**
     * Set the setpoint to the stored value and enable PID on the drivetrain.
     */
    protected void initialize() {
        CommandBase.drivetrain.initGyroscope(4.0, 3.0, 4.0, setpoint);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        usePIDOutput(CommandBase.drivetrain.gyroscope.get());
    }

    // Make this return true when this Command no longer needs to run execute()
    /**
     * @return true when it's close enough to the distance
     */
    protected boolean isFinished() {
        return CommandBase.drivetrain.gyroscope.onTarget();
    }

    // Called once after isFinished returns true
    /**
     * When this command ends, disable the drivetrain's PID
     */
    protected void end() {
        CommandBase.drivetrain.gyroscope.disable();
        CommandBase.drivetrain.arcadeDrive(0.0, 0.0, true);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    /**
     * When this command exits, disable the drivetrain's PID
     */
    protected void interrupted() {
        end();
    }
    
    protected double returnPIDInput() {
        double gyroAngle = CommandBase.drivetrain.gyroscope.get();
        return gyroAngle;
    }

    protected void usePIDOutput(double d) {
        CommandBase.drivetrain.setTurnSpeed(d);
    }
    
    protected void setSetpoint() {
        CommandBase.drivetrain.gyroscope.setSetpoint(setpoint);
    }
}