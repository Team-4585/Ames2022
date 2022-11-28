package frc.robot;

public class Ames2022AutonomousDecisionMaker {

  private Ames2022Chassis m_Chassis;
  private BallArm m_BallArm;
  private BallShooter m_BallShooter;
  private BasicPID m_BasicPID;


  Ames2022AutonomousDecisionMaker(){
  }

  public void initialize(){
  }

  public void doDecisions(){
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
