package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Wrist extends SubsystemBase {

    public WPI_TalonFX wristMotor = new WPI_TalonFX(Constants.Wrist.Wrist);

    public Wrist(){
        wristMotor.configFactoryDefault();
        wristMotor.setNeutralMode(NeutralMode.Brake);
    }
    public void wristUp(double speed){
        wristMotor.set(speed);
    }
    public void wristDown(double speed){
        wristMotor.set(-speed);
    }
}
