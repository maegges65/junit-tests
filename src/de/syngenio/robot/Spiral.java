package de.syngenio.robot;

public class Spiral {

	private Robot _robot;

	public Spiral(Robot robot) {
		_robot = robot;
	}
	
	public void walkSpiral() {
		for (int steps = 1; steps <= 5; steps++) {
			walk2Sides(steps);
		}
	}

	
	
	
	private void walk2Sides(int steps) {
		_robot.move(steps);
		_robot.turnleft(90);
		_robot.move(steps);
		_robot.turnleft(90);
	}
}
