package frc.robot;

import frc.robot.huskylib.src.RoboDevice;
import com.revrobotics.*;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;





import frc.robot.huskylib.src.RoboDevice;


public class BallArm extends RoboDevice{
  private BasicPID left_motor;
  private BasicPID right_motor;

  private double targPosition = 2.0;
  private double intakeSpeed = 0.0; 

  private static double positionThreshold = 0.05;

  public BallArm(){
    super("Ball Arm Sub System");

    left_motor = new BasicPID(WiringConnections.LEFT_BALL_ARM_CONTROLLER_ID);
    right_motor = new BasicPID(WiringConnections.RIGHT_BALL_ARM_CONTROLLER_ID);
  
    left_motor.setSlave(right_motor);
  }

  public void Initialize(){

  }

  // public void deploy(){
  //   //Update the double for specific values
  //   left_motor.setRotations(targPosition);
  // }

  // public boolean isDeployed(){
  //   if(Math.abs(left_motor.getPosition() - targPosition) < positionThreshold){
  //     return true;
  //   }else{
  //     return false;
  //   }
  // }

  // //because of the direction the motor was installed, we have to invert its values to go "forward"

  // public boolean isDetracted(){
  //   if(Math.abs(left_motor.getPosition()) < positionThreshold){
  //     return true;
  //   }else{
  //     return false;
  //   }
  // }

  //This moves the arm up. Change the double in setRotations() to adjust the target highest position
  public void down(){
    //Update the double for specific values
    right_motor.setRotations(0.0);
    
  }


  //This moves the arm down. Change the double in setRotations() to adjust the target lowest position
  public void up(){
    //Update the double for specific values
    right_motor.setRotations(10.0);
    
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