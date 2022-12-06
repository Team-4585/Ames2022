package frc.robot;

import frc.robot.huskylib.src.RoboDevice;
import com.revrobotics.*;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class BallShooter extends RoboDevice{

private CANSparkMax intakeMotor;

private double targPosition = 2.0;
private double intakeSpeed = 0.0;

private static double positionThreshold = 0.05;

  public BallShooter(){
    super("BallShooter Sub System");

    

    intakeMotor = new CANSparkMax(WiringConnections.INTAKE_CONTROLLER_ID, MotorType.kBrushless);
  }

  public void Initialize(){

  }
  //because of the direction the motor was installed, we have to invert its values to go "forward"
  public void intake(){
    setIntakeSpeed(-0.6);
    intakeMotor.set(intakeSpeed);
  }

  public void reverseIntake(){
    setIntakeSpeed(-0.6);
    intakeMotor.set(-intakeSpeed);
  }

  public void stopIntake(){
    setIntakeSpeed(0.0);
    intakeMotor.set(intakeSpeed);
  }

  public void setIntakeSpeed(double speed){
    intakeSpeed = speed;
  }

  @Override
  public void doGatherInfo() {
    super.doGatherInfo();

  }

  @Override
  public void doActions() {
    super.doActions();

  }

}
