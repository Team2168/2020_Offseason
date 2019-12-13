/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class Drivetrain extends Subsystem{
    private VictorSP leftMotor1 = new VictorSP(0);
    private VictorSP leftMotor2 = new VictorSP(1);
    private VictorSP rightMotor1 = new VictorSP(2);
    private VictorSP rightMotor2 = new VictorSP(3);

    public void driveLeftMotor1(double speedPerc) {
        
    }
}