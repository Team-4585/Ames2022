package frc.robot;

public class Ames2022TeleopDecisionMaker {
  private Ames2022Joystick m_TheJoystick = new Ames2022Joystick();
  private WeaponsJoystick m_weaponsJoystick = new WeaponsJoystick();

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

    if (m_weaponsJoystick.ballarmDownButtonPressed()){
      System.out.println("Down");
      m_BallArm.down();
    }

    if (m_weaponsJoystick.ballarmUpButtonPressed()){
      System.out.println("Up)");
      m_BallArm.up();
    }

    if (m_weaponsJoystick.ballarmDownButtonReleased() || m_weaponsJoystick.ballarmUpButtonReleased()){
      m_BallArm.stop();
    }

    if(m_weaponsJoystick.button4PressEvent()){
      m_BallShooter.intake();
    }

    if(m_weaponsJoystick.button4ReleaseEvent()){
      m_BallShooter.stopIntake();
    }
    
    if(m_weaponsJoystick.button6Pressed()){
      m_BallShooter.reverseIntake();
    }

    if(m_weaponsJoystick.button6Released()){
      m_BallShooter.stopIntake();
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
