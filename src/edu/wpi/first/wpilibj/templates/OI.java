package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.templates.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    public Joystick DriverHID = new Joystick(RobotMap.DRIVER_HID);
    Joystick ManipulatorHID = new Joystick(RobotMap.MANIPULATOR_HID);
    
    Button D1 = new JoystickButton(DriverHID, 1);
    Button D2 = new JoystickButton(DriverHID, 2);
    Button D3 = new JoystickButton(DriverHID, 3);
    Button D4 = new JoystickButton(DriverHID, 4);
    Button D5 = new JoystickButton(DriverHID, 5);
    Button D6 = new JoystickButton(DriverHID, 6);
    Button D7 = new JoystickButton(DriverHID, 7);
    Button D8 = new JoystickButton(DriverHID, 8);
    Button D9 = new JoystickButton(DriverHID, 9);
    Button D10 = new JoystickButton(DriverHID, 10);
    Button D11 = new JoystickButton(DriverHID, 11);
    Button D12 = new JoystickButton(DriverHID, 12);
    
    Button M1 = new JoystickButton(ManipulatorHID, 1);
    Button M2 = new JoystickButton(ManipulatorHID, 2);
    Button M3 = new JoystickButton(ManipulatorHID, 3);
    Button M4 = new JoystickButton(ManipulatorHID, 4);
    Button M5 = new JoystickButton(ManipulatorHID, 5);
    Button M6 = new JoystickButton(ManipulatorHID, 6);
    Button M7 = new JoystickButton(ManipulatorHID, 7);
    Button M8 = new JoystickButton(ManipulatorHID, 8);
    Button M9 = new JoystickButton(ManipulatorHID, 9);
    Button M10 = new JoystickButton(ManipulatorHID, 10);
    Button M11 = new JoystickButton(ManipulatorHID, 11);
    Button M12 = new JoystickButton(ManipulatorHID, 12);

    public OI() {

        //Driver dual action controller button allocations
        D1.whenPressed(new DriveShiftHighGear());
        D2.whenPressed(new DriveShiftLowGear());
        // D3 through D10 free

        //Custom control interface for the shooter button allocations
        // M1 through M12 free
    }

    public double GetDriverHIDLeftXAxis() {
        return DriverHID.getRawAxis(1);
    }

    public double GetDriverHIDLeftYAxis() {
        return DriverHID.getRawAxis(2);
    }

    public double GetDriverHIDCenterAxis() {
        return DriverHID.getRawAxis(3);
    }

    public double GetDriverHIDRightXAxis() {
        return DriverHID.getRawAxis(4);
    }
    
    public double GetDriverHIDRightYAxis() {
        return DriverHID.getRawAxis(5);
    }
    
    public double GetManipulatorHIDXAxis() {
        return ManipulatorHID.getX();
    }
    
    public double GetManipulatorHIDYAxis() {
        return ManipulatorHID.getY();
    }
    
    public double GetManipulatorHIDZAxis() {
        return ManipulatorHID.getThrottle();
    }
    
    public double GetManipulatorHIDTwist() {
        return ManipulatorHID.getTwist();
    }
}