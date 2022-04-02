// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import frc.robot.Constants.Controllers;

public class Motors extends SubsystemBase {
  CANSparkMax motor;
  /** Creates a new Motors. */
  public Motors() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  private void InitilizeMotor() {
    if(motor != null) motor.close();
    motor = new CANSparkMax(RobotContainer.id, MotorType.kBrushless);
  }
  public void RunMotorPositive() {
    if(motor == null) InitilizeMotor();
    if(RobotContainer.id != motor.getDeviceId()) InitilizeMotor();
    motor.set(0.2);
  }
  public void RunMotorNegative() {
    if(motor == null) InitilizeMotor();
    if(RobotContainer.id != motor.getDeviceId()) InitilizeMotor();
    motor.set(-0.2);
  }
  public void StopMotor() {
    if(Controllers.XBOX.getYButton() || Controllers.XBOX.getAButton()) return;
    motor.set(0);
  }
  public void IncreaseID() {
    RobotContainer.id++;
    SmartDashboard.putNumber("id", RobotContainer.id);
  }
  public void DecreaseID() {
    if (RobotContainer.id > 1) RobotContainer.id--;
    SmartDashboard.putNumber("id", RobotContainer.id);
  }
}
