package de.syngenio.robot;

import static org.mockito.Mockito.inOrder;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestSpiral {
	
	@Mock private Robot _robot;
	private Spiral _spiral;

	@Before
	public void setUp() {
		_spiral = new Spiral(_robot);
	}
	
	@Test
	public void assureThatRobotWalksSpiral() {
		InOrder inorder = inOrder(_robot);
		
		_spiral.walkSpiral();
		
		for (int steps = 1; steps <= 5; steps++) {
			verify2Sides(inorder, steps);
		}

	}

	private void verify2Sides(InOrder inorder, int steps) {
		inorder.verify(_robot).move(steps);
		inorder.verify(_robot).turnleft(90);
		inorder.verify(_robot).move(steps);
		inorder.verify(_robot).turnleft(90);
	}

}
