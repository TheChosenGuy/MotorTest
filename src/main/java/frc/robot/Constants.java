// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class Controllers {
        public static final XboxController XBOX = new XboxController(0);
    }
    public static final class Buttons {
        public static final JoystickButton XBOX_A = new JoystickButton(Controllers.XBOX, XboxController.Button.kA.value);
        public static final JoystickButton XBOX_Y = new JoystickButton(Controllers.XBOX, XboxController.Button.kY.value);
        public static final JoystickButton XBOX_B = new JoystickButton(Controllers.XBOX, XboxController.Button.kB.value);
        public static final JoystickButton XBOX_X = new JoystickButton(Controllers.XBOX, XboxController.Button.kX.value);

        // Using number values instead of Button.something.value makes setting up simulated controller easy 
        // public static final JoystickButton XBOX_A = new JoystickButton(Controllers.XBOX, 1);
        // public static final JoystickButton XBOX_Y = new JoystickButton(Controllers.XBOX, 2);
        // public static final JoystickButton XBOX_B = new JoystickButton(Controllers.XBOX, 3);
        // public static final JoystickButton XBOX_X = new JoystickButton(Controllers.XBOX, 4);
    }
}