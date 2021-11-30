package com.suman.coderpad;

public class LengthOfCycle {

	public static void main(String[] args) {
		System.out.println(lengthOfCycle(new int[]{1, 2, 0}, 0)); // 3
		System.out.println(lengthOfCycle(new int[]{1, 0}, 0)); // 2;
		System.out.println(lengthOfCycle(new int[]{1, 2, 3, 1}, 0)); // 3;
		System.out.println(lengthOfCycle(new int[]{1, 2, 3, 4}, 0)); // -1;
		System.out.println(lengthOfCycle(new int[]{1, 2, 3, 4}, -1)); // -1;
		System.out.println(lengthOfCycle(new int[]{1, 2, 3, 4}, 4)); // -1;
		System.out.println(lengthOfCycle(new int[]{2, 3, 4, 0}, 0)); // -1;
		System.out.println(lengthOfCycle(new int[]{2, 3, 0}, 0)); // 2;
	}

	public static int lengthOfCycle(int[] arr, int startInd) {
		if (startInd < 0 || startInd >= arr.length) {
			return -1;
		}
		int slow = arr[startInd];
		int fast = arr[arr[startInd]];
		// trying to detect a cycle at first
		while (slow != fast) {
			// out of bounds - no cycle
			if (fast >= arr.length) {
				return -1;
			}
			slow = arr[slow];
			fast = arr[arr[fast]];
		}
		// yes, there is a cycle for sure, we need to find the starting point
		fast = 0;
		while (fast != slow) {
			fast = arr[fast];
			slow = arr[slow];
		}
		// okay, we have found the starting point, so move away from it again and count the length of the cycle
		int length = 1;
		slow = arr[slow];
		while (fast != slow) {
			length++;
			slow = arr[slow];
		}
		return length;
	   
	}
}
