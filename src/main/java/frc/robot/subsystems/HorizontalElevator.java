package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class HorizontalElevator extends SubsystemBase {
    public WPI_TalonFX HorElvator = new WPI_TalonFX(Constants.Elevator.HorizontalElevator);
   
    public HorizontalElevator(){
        HorElvator.configFactoryDefault();
        HorElvator.setNeutralMode(NeutralMode.Brake);
    }
    
    public void elevatorStop(){
        HorElvator.set(0);
    }
    public void elevatorUp(double speed){
        HorElvator.set(speed);
    }
    public void elevatorDown(double speed){
        HorElvator.set(-speed);
    }
}
