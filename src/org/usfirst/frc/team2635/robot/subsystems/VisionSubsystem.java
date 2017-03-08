package org.usfirst.frc.team2635.robot.subsystems;

import org.usfirst.frc.team2635.robot.model.GearVision;
import org.usfirst.frc.team2635.robot.model.ShooterVision;
import org.usfirst.frc.team2635.robot.model.Vision;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * The camera vision
 */
public class VisionSubsystem extends Subsystem{

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Vision vision;
	ShooterVision shooterVision;
	GearVision gearVision;
	public VisionSubsystem()
	{
		vision = new Vision();
		
		shooterVision = new ShooterVision();
		//shooterVision.camInit();
		gearVision = new GearVision();
		gearVision.camInit();
		
	}
    public void aim()
    {
    
    	
    	
    	shooterVision.createBox();
		shooterVision.confirmBox();
		shooterVision.viewShooter();
    }
    
    public void gearAim()
    {
		gearVision.createBox();
		gearVision.confirmBox();
		gearVision.viewShooter();
    }
    
    public Double getAngleToBoiler()
    {
    	Double angle = shooterVision.getAngle();
    	shooterVision.viewShooter();
    	return angle;
    }
    public Double getDistanceToBoiler()
    {
    	return shooterVision.getDistance();
    }
    public Double getAngleToGear()
    {
    	Double angle = gearVision.getAngle();
    	gearVision.viewShooter();
    	return angle;
    }
    public Double getDistanceToGear()
    {
    	return gearVision.getDistance();
    }
    
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
}