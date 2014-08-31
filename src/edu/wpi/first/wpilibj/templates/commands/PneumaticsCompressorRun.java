package edu.wpi.first.wpilibj.templates.commands;

/**
 *
 * @author Super NURDs
 */
public class PneumaticsCompressorRun extends CommandBase {

    public PneumaticsCompressorRun() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(pneumatics);
    }

    // Called just before this Command runs the first time
    /**
     * Start the Compressor when called upon
     */
    protected void initialize() {
        // A method from Pneumatics that turns on the compressor
        pneumatics.runCompressor();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        // None currently
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        // Returns false so that this dosen't end
        return false;
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