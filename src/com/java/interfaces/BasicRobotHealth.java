package com.java.interfaces;

import com.java.model.Robot;

/*
 * @author: Gaurav Garg
 */
public abstract class BasicRobotHealth {
	
	public abstract boolean canCarry(int weight);
	public abstract boolean powerCheck(Robot r, int charging);

}
