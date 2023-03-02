package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import frc.robot.Constants;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase{
    private final WPI_TalonSRX intakeLeft = new WPI_TalonSRX(Constants.Intake.intakeLeft);
    private final WPI_TalonSRX intakeRight = new WPI_TalonSRX(Constants.Intake.intakeRight);
    private final double speed = 0.25;

public Intake(){
    intakeLeft.configFactoryDefault();
    intakeRight.configFactoryDefault();

    intakeLeft.setInverted(true);
    intakeRight.setInverted(false);
    
    intakeLeft.setNeutralMode(NeutralMode.Brake);
    intakeRight.setNeutralMode(NeutralMode.Brake);
}

public void runIntake() {
    intakeLeft.set(speed);
    intakeRight.set(speed);
}

public void reverseIntake() {
    intakeLeft.set(-speed);
    intakeRight.set(-speed);
}

public void stopIntake(){
    intakeLeft.set(0);
    intakeRight.set(0);
}


}
