package com.suman.coderpad;

public class RobotCode {

	public static void main(String[] args) {
		String move = "UDDLLRUUUDUURUDDUULLDRRRR";
		
		int rightCount = 0, leftCount = 0, upCount = 0, downCount = 0;
		for(int i=0; i<move.length(); i++){
			switch (move.charAt(i)) {
			case 'U':
				upCount++;
				break;
			case 'D':
				downCount++;
				break;
			case 'L':
				leftCount++;
				break;
			case 'R':
				rightCount++;
			}
		}
		
		System.out.println("final coordinate: (" + (rightCount-leftCount) + ", " + (upCount-downCount) + ")");
	}
}
