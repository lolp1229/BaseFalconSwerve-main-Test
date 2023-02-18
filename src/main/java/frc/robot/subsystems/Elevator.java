package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;


import frc.robot.Constants;
import frc.robot.RobotContainer;
public class Elevator extends SubsystemBase{
    public WPI_TalonFX elevatorMain = new WPI_TalonFX(Constants.Elevator.elevatorMotor);
    private double encoder_value = 0;

    public Elevator(){
        elevatorMain.configFactoryDefault();
        elevatorMain.setNeutralMode(NeutralMode.Brake);          
    }
    public void elevatorLevelOne() {
        //elevatorMain.set(speed);
        while(encoder_value < 0){

        }
    }
    public void elevatorStop(){
        elevatorMain.set(0);
    }
    public void elevatorUp(double speed){
        elevatorMain.set(speed);
    }
    public void elevatorDown(double speed){
        elevatorMain.set(-speed);
    }
    
    
    
}
