package runnable;

import base.Cube;
import base.derived.*;

public class CubeTest {

	public static void main(String[] args) {
		Cube c1 = new Cylinder(12, 0.5);
		System.out.println(c1);
		
		Cube c2 = new Brick(5, 3, 4);
		System.out.println(c2);

		System.out.println(c1.hasGreaterVolume(c2));
		
	}

}
