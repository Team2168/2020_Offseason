/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem. You can replace me with your own Subsystem.
 */
public class Drivetrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private VictorSP leftMotor1;
  private VictorSP leftMotor2;
  private VictorSP rightMotor1;
  private VictorSP rightMotor2;

  private static Drivetrain _instance = null;

  private Drivetrain() {
    leftMotor1 = new VictorSP(0);
    leftMotor2 = new VictorSP(1);
    rightMotor1 = new VictorSP(2);
    rightMotor2 = new VictorSP(3);
  }

  public static Drivetrain getInstance() {
    if (_instance == null) {
      _instance = new Drivetrain();
    }
    return _instance;
  }

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

  public void driveLeftMotors(double speed) {
    driveLeftMotor1(speed);
    driveLeftMotor2(speed);
  }

  public void driveRightMotors(double speed) {
    driveRightMotor1(speed);
    driveRightMotor2(speed);
  }

  public void tankDrive(double leftSpeed, double rightSpeed) {
    driveLeftMotors(leftSpeed);
    driveRightMotors(rightSpeed);
  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
