package com.java.implementation;

import com.java.interfaces.BasicRobotHealth;
import com.java.model.Robot;

/*
 * @author: Gaurav Garg
 * This class checks the robot health in term of power and weight capcity. 
 * Also as it extends the BasicRObotHealth class, we can extend it in future.
 */
public class RobotHealth extends BasicRobotHealth {
	
	@Override
	public boolean canCarry(int weight){
		if(weight > 10){
			System.out.println("Overweight");
			System.out.println("************************************************");
			return false;
		}
		return true;
	}
	
	
	@Override
	public boolean powerCheck(Robot r, int requiredCharging){
		int availbleCharging = r.getChargingStatus();
		if(availbleCharging < requiredCharging){
			System.out.println("Insufficient Charging For Task");
			System.out.println("************************************************");
			return false;
		}else{
			int remaining = availbleCharging - requiredCharging;
			r.setChargingStatus(remaining);
			if(remaining < 15){
				r.setHeadLightColor(Robot.Color.RED);
				System.out.println("*********************************************");
			}
			return true;
		}
		
		
	}

}
