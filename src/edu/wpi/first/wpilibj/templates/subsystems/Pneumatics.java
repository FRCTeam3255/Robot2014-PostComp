package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.*;

/**
 *
 * @author Super NURDs
 *
 */
public class Pneumatics extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private final Compressor compressor;

    public Pneumatics() {
        compressor = new Compressor(RobotMap.PNEUMATICS_PRESSURE_SWITCH_CHANNEL, RobotMap.PNEUMATICS_COMPRESSOR_RELAY);
    }

    public boolean isMaxPSI() {
        // Check to see if we are at the maximum pressure stored in the air tanks
        return compressor.getPressureSwitchValue();
    }

    public void runCompressor() {
        // Turn the compressor on
        compressor.start();
    }

    public void stopCompressor() {
        // Turn the compressor off
        compressor.stop();
    }

    protected void initDefaultCommand() {
        // Set the default command for a subsystem here.
        this.setDefaultCommand(new PneumaticsCompressorRun());
    }
}