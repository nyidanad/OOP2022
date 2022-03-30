package base.array;

import base.Cube;
import base.derived.*;

public class CubeArray {
	private Cube[] array;
	
	public CubeArray(int size) {
		array = new Cube[size];
	}
	
	public void setItem(int index, Cube c) {
		array[index] = c;
	}
	
	public int getMaxSize() {
		return array.length;
	}
	
	public Cube getItem(int index) {
		return array[index];
	}
	
	public int getNumberOfItems() {
		int cnt = 0;
		for (int i = 0; i < array.length; i++){
			if(array[i] != null)
				cnt++;
		}
		
		return cnt;
	}
	
	public double getAvgVolume() {
		double avg = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] != null)
				avg += array[i].getVolume();
		}
		
		return avg / getNumberOfItems();
	}
	
	public int getNumberOfCylinders() {
		int cnt = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] != null){
				if(array[i] instanceof Cylinder)
					cnt++;
			}
		}
		
		return cnt;
	}
	
	public int getNumberOfBricks() {
		int cnt = 0;
		for (int i = 0; i < array.length && array[i] != null; i++) {
			if(array[i] instanceof Brick)
				cnt++;
		}
		
		return cnt;
	}
}
