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
		
		verify2Sides(inorder, 1);
		verify2Sides(inorder, 2);
		verify2Sides(inorder, 3);
		verify2Sides(inorder, 4);
		verify2Sides(inorder, 5);

	}

	private void verify2Sides(InOrder inorder, int steps) {
		inorder.verify(_robot).move(steps);
		inorder.verify(_robot).turnleft(90);
		inorder.verify(_robot).move(steps);
		inorder.verify(_robot).turnleft(90);
	}

}
