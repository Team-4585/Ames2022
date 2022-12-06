package frc.robot;

import frc.robot.huskylib.devices.HuskyJoystick;

public class WeaponsJoystick extends HuskyJoystick{
  private static final int WEAPONS_JOYSTICK_PORT = 0;
 
  private static final int TRIGGER_BUTTON = 0;
  private static final int BUTTON_2 = 1;
  private static final int BUTTON_3 = 2;
  private static final int BUTTON_4 = 3;
  private static final int BUTTON_5 = 4;
  private static final int BUTTON_6 = 5;

  public WeaponsJoystick(){
      super(WEAPONS_JOYSTICK_PORT);
  }

  public Boolean triggerPushed(){
    return isButtonPushed(TRIGGER_BUTTON);
  }

  public Boolean triggerPressEvent(){
    return buttonPressEvent(TRIGGER_BUTTON);
  }
    
  public Boolean triggerReleaseEvent(){
    return buttonReleaseEvent(TRIGGER_BUTTON);
  }

  public Boolean button2ReleaseEvent(){
    return buttonReleaseEvent(BUTTON_2);
  }

  public Boolean button3ReleaseEvent(){
    return buttonReleaseEvent(BUTTON_3);
  }

  public Boolean button4ReleaseEvent(){
    return buttonReleaseEvent(3);
  }

  public Boolean button5ReleaseEvent(){
    return buttonReleaseEvent(BUTTON_5);
  }

  public Boolean button6Pushed(){
    return isButtonPushed(BUTTON_6);
  }

  public Boolean button6ReleaseEvent(){
    return buttonReleaseEvent(BUTTON_6);
  }

  public Boolean button4PressEvent(){
      return buttonPressEvent(3);
  }
  public Boolean ballarmUpButtonPressed(){
    return isButtonPushed(8);
  }
  
  public Boolean ballarmDownButtonPressed(){
    return isButtonPushed(6); //Button written here is 1 less than actual button
  }

  public Boolean ballarmUpButtonReleased(){
    return buttonReleaseEvent(8);
  }
  
  public Boolean ballarmDownButtonReleased(){
    return buttonReleaseEvent(6); //Button written here is 1 less than actual button
  }
  public Boolean button6Pressed(){
    return isButtonPushed(5);
  }

  public boolean button6Released(){
    return buttonReleaseEvent(5);
  }
}

