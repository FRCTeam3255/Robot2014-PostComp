package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.command.PIDCommand;
import edu.wpi.first.wpilibj.templates.commands.*;

/**
 *
 *
 * @author Super NURDs
 */
public class AutoDriveTurnCommand extends CommandBase {

    double speed;
    double distance;
    boolean forward;
    private static final double FIXED_SPEED = 0.80;
    double setpoint = 90.0;
    

    /**
     * Drive the specified distance (in feet) at the specified speed (0->1)
     */
    public AutoDriveTurnCommand() {
        requires(CommandBase.drivetrain);
    }

    // Called just before this Command runs the first time
    /**
     * Set the setpoint to the stored value and enable PID on the drivetrain.
     */
    protected void initialize() {
        CommandBase.drivetrain.driveGyroscope.reset();
//        CommandBase.drivetrain.gyro.setPID(1.0, 0.0, 0.0);
//        CommandBase.drivetrain.gyro.setSetpoint(setpoint);
//        CommandBase.drivetrain.gyro.enable();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        
    }

    // Make this return true when this Command no longer needs to run execute()
    /**
     * @return true when it's close enough to the distance
     */
    protected boolean isFinished() {
//        return CommandBase.drivetrain.gyro.onTarget();
        return true;
    }

    // Called once after isFinished returns true
    /**
     * When this command ends, disable the drivetrain's PID
     */
    protected void end() {
        CommandBase.drivetrain.arcadeDrive(0.0, 0.0, true);
//        CommandBase.drivetrain.gyro.disable();
//        CommandBase.drivetrain.gyro.reset();
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