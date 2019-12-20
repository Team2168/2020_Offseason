/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import java.nio.channels.Channel;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem. You can replace me with your own Subsystem.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private VictorSP leftMotor1;
  private VictorSP leftMotor2;
  private VictorSP rightMotor1;
  private VictorSP rightMotor2;
  
  private static DriveTrain _instance = null;  

  private DriveTrain(){
    leftMotor1 = new VictorSP(0);
    leftMotor2 = new VictorSP(1);
    rightMotor1 = new VictorSP(2);
    rightMotor2 = new VictorSP(3);
  }
  
  public static DriveTrain getInstance() {
    if(_instance == null) {
      _instance = new DriveTrain();

    }
    return _instance;
  }
  public void driveleftMotor1(double speed) {
    leftMotor1.setSpeed(speed);
  }

  public void driveleftMotor2(double speed) {
    leftMotor2.setSpeed(speed);
  }

  public void driverightMotor1(double speed) {
    rightMotor1.setSpeed(speed);
  }

  public void driverightMotor2(double speed) {
    rightMotor2.setSpeed(speed);
  }

  public void driveleftMotors(double speed) {
    driveleftMotor1(speed);
    driveleftMotor2(speed);
  }

  public void driverightMotors(double speed) {
    driverightMotor1(speed);
    driverightMotor2(speed);
  }
  public void TAnkDRivE(double leftMotor, double rightMotor) {
    driveleftMotors(leftMotor);
    driverightMotors(rightMotor);
  } 
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    /// setDefaultCommand(new MySpecialCommand());
 
 
  }
}
