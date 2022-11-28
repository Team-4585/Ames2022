package frc.robot;

public class Ames2022TeleopDecisionMaker {
  private Ames2022Joystick m_TheJoystick = new Ames2022Joystick();

  private Ames2022Chassis m_Chassis;
  private BallArm m_BallArm;
  private BallShooter m_BallShooter;
  private BasicPID m_BasicPID;



  Ames2022TeleopDecisionMaker(){

  }

  public void initialize(){
  }

  public void doDecisions(){

    // System.out.println("-- F/B: " + m_TheJoystick.getForwardBackwardValue() + 
    //                    "   S/S: " + m_TheJoystick.getSideToSideValue() + 
    //                    "   Rot: " + m_TheJoystick.getTwistValue());

    m_Chassis.setTargForwardBack(m_TheJoystick.getForwardBackwardValue());
    m_Chassis.setTargSideToSide(m_TheJoystick.getSideToSideValue());
    m_Chassis.setTargRotation(m_TheJoystick.getTwistValue());

    if (m_TheJoystick.triggerReleaseEvent()){
      m_BallArm.down();
      System.out.println("Down");
    }

    if (m_TheJoystick.triggerPressEvent()){
      m_BallArm.up();
      System.out.println("Up)");
    }
  }

  public void setChassis(Ames2022Chassis TheChassis){
    m_Chassis = TheChassis;
  }

  public void setBallArmSubSystem(BallArm BallArmSys){
    m_BallArm = BallArmSys;
  }

  public void setBallShooterSubSystem(BallShooter BallShooterSys){
    m_BallShooter = BallShooterSys;
  }

  public void setBasicPIDSubSystem(BasicPID BasicPIDSys){
    m_BasicPID = BasicPIDSys;
  }


}
