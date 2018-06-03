package de.syngenio.robot;

public class Spiral {

	private Robot _robot;

	public Spiral(Robot robot) {
		_robot = robot;
	}
	
	public void walkSpiral() {
		walk2Sides(1);
		walk2Sides(2);
		walk2Sides(3);
		walk2Sides(4);
		walk2Sides(5);
	}

	
	
	
	private void walk2Sides(int steps) {
		_robot.move(steps);
		_robot.turnleft(90);
		_robot.move(steps);
		_robot.turnleft(90);
	}
}
