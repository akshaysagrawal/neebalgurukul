package com.gurukul.day18;

import java.util.Arrays;

public class TopologicalSortingDemo {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int a[][] = { { 0, 1, 0, 0, 0, 1, 0 }, { 0, 0, 0, 0, 0, 0, 0 }, { 0, 1, 0, 0, 0, 1, 1 },
		{ 1, 0, 0, 0, 1, 1, 0 }, { 0, 0, 0, 0, 0, 1, 1 }, { 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 1, 0 } };

	int nodes = a.length;
	boolean visited[] = new boolean[nodes];
	Arrays.fill(visited, false);
	String ans = "";
	int count = 0;
	while (count < nodes) {
	    boolean isLoop = true;

	    int i, j;
	    for (j = 0; j < nodes; j++) {
		boolean flag = true;
		for (i = 0; i < nodes; i++) {
		    if (a[i][j] != 0 && !visited[j]) {
			flag = false;
			break;
		    }
		}
		if (flag && !visited[j]) {
		    ans += (char) (j + 65)+", ";
		    visited[j] = true;
		    count++;
		    isLoop = false;
		    for (int k = 0; k < a.length; k++) {
			a[j][k] = 0;
		    }
		    break;
		}

		}
	    if (isLoop) {
		System.out.println("There is a loop");

	    }

	}
	System.out.println(ans);
    }

}
