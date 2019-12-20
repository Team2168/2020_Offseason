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
public class Drivetrain extends Subsystem {

    private VictorSP leftMotor1;
    private VictorSP leftMotor2;
    private VictorSP rightMotor1;
    private VictorSP rightMotor2;

    private static Drivetrain _instance = null;

    //private constructor
    private Drivetrain() {
        leftMotor1 = new VictorSP(0);
        leftMotor2 = new VictorSP(1);
        rightMotor1 = new VictorSP(2);
        rightMotor2 = new VictorSP(3);
    }

    public static Drivetrain getInstance() {
        if (_instance == null){
            _instance = new Drivetrain();
        }

        return _instance;
    }

    //next four functions allow you to set individual speeds for each motor
    public void driveLeftMotor1(double speed) {
        leftMotor1.setSpeed(speed);
    }
    public void driveLeftMotor2(double speed) {
        leftMotor2.setSpeed(speed);
    }
    public void driveRightMotor1(double speed) {
        rightMotor1.setSpeed(speed);
    }
    public void driveRightMotor2(double speed) {
        rightMotor2.setSpeed(speed);
    }

    public void driveLeftSide(double speed) { //sets left side motors to same speed
        driveLeftMotor1(speed);
        driveLeftMotor2(speed);
    }
    public void driveRightSide(double speed) { //sets right side motors to same speed
        driveRightMotor1(speed);
        driveRightMotor2(speed);
    }

    public void driveAllSame(double speed) { //sets all motors to same speed
        driveLeftMotor1(speed);
        driveLeftMotor2(speed);
        driveRightMotor1(speed);
        driveRightMotor2(speed);
    }
    
    public void tankDrive(double leftSpeed, double rightSpeed) {
        driveLeftSide(leftSpeed);
        driveRightSide(rightSpeed);
    }
}