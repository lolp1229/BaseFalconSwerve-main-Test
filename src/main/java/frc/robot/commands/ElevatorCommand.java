package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.Elevator;
import frc.robot.RobotContainer;
public class ElevatorCommand extends CommandBase {
   private final Elevator Elevator; 
   private Joystick elevatorController;
   

public ElevatorCommand(Elevator elevator, Joystick elevatorController){

   this.Elevator = elevator;
   this.elevatorController = elevatorController;

   addRequirements(elevator);

}

@Override
public void execute(){
   double elevatorMain = -elevatorController.getRawAxis(0);
   Elevator.elevatorUp(elevatorMain);
}
   



}
