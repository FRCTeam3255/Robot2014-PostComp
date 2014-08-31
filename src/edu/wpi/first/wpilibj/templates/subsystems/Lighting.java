package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author Super NURDs
 */
public class Lighting extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public Relay lightingRedRelay;
    public Relay lightingBlueRelay;
    public Relay lightingGreenRelay;
    public Relay lightingCyanRelay;
    public Relay lightingChocolateRelay;
    public Relay lightingYellowRelay;
    public Relay lightingBlackRelay;
    

    public Lighting() {
        try {
            lightingRedRelay = new Relay(RobotMap.LIGHTING_RED_RELAY, Relay.Direction.kForward);
            lightingBlueRelay = new Relay(RobotMap.LIGHTING_BLUE_RELAY, Relay.Direction.kForward);
            lightingGreenRelay = new Relay(RobotMap.LIGHTING_GREEN_RELAY, Relay.Direction.kForward);
            lightingCyanRelay = new Relay(RobotMap.LIGHTING_CYAN_RELAY, Relay.Direction.kForward);
            lightingChocolateRelay = new Relay(RobotMap.LIGHTING_CHOCOLATE_RELAY, Relay.Direction.kForward);
            lightingYellowRelay = new Relay(RobotMap.LIGHTING_YELLOW_RELAY, Relay.Direction.kForward);
            lightingBlackRelay = new Relay(RobotMap.LIGHTING_BLACK_RELAY, Relay.Direction.kForward);         
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void initDefaultCommand() {
    }
    
    public void setRedValue(boolean on) {
        if (on) {
            lightingRedRelay.set(Relay.Value.kOn);
        } else {
        lightingRedRelay.set(Relay.Value.kOff);
        }
    }

    public void setBlueValue(boolean on) {
        if (on) {
            lightingBlueRelay.set(Relay.Value.kOn);
        } else {
        lightingBlueRelay.set(Relay.Value.kOff);
        }
    }

    public void setGreenValue(boolean on) {
        if (on) {
            lightingGreenRelay.set(Relay.Value.kOn);
        } else {
        lightingGreenRelay.set(Relay.Value.kOff);
        }
    }

    public void setCyanValue(boolean on) {
        if (on) {
            lightingCyanRelay.set(Relay.Value.kOn);
        } else {
        lightingCyanRelay.set(Relay.Value.kOff);
        }
    }

    public void setChocolateValue(boolean on) {
        if (on) {
            lightingChocolateRelay.set(Relay.Value.kOn);
        } else {
        lightingChocolateRelay.set(Relay.Value.kOff);
        }
    }

    public void setYellowValue(boolean on) {
        if (on) {
            lightingYellowRelay.set(Relay.Value.kOn);
        } else {
        lightingYellowRelay.set(Relay.Value.kOff);
        }
    }

    public void setBlackValue(boolean on) {
        if (on) {
            lightingBlackRelay.set(Relay.Value.kOn);
        } else {
        lightingBlackRelay.set(Relay.Value.kOff);
        }
    }

}