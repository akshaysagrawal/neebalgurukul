package com.gurukul.day16;

public class MatrixDemo_InterchangeRow {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	int a[][] = { { 7, 8, 9, 10 }, { 11, 12, 13 }, { 14, 15, 16, 17 } };
	int min = 1000000;
	int max = 0;
	int minimumRow = 0;
	int maximumRow = 0;
	int temp[];
	for (int i = 0; i < a.length; i++) {
	    for (int j = 0; j < a[i].length; j++) {
		if (a[i][j] < min) {
		    min = a[i][j];
		    minimumRow = i;

		}
		if (a[i][j] > max) {
		    max = a[i][j];
		    maximumRow = i;
		}
	    }

	}

	temp = a[minimumRow];
	a[minimumRow] = a[maximumRow];
	a[maximumRow] = temp;

	for (int i = 0; i < a.length; i++) {
	    for (int j = 0; j < a[i].length; j++) {
		System.out.print(a[i][j] + " ");
	    }
	    System.out.println();

	}
    }

}
