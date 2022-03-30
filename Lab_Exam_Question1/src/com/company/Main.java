package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Table table = new Table(3,3);
        int[][] personalTable = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int i = 0 ; i<3 ; i++){
            for(int j = 0 ; j<3 ; j++){
                table.set(i,j,personalTable[i][j]);
            }
        }
        System.out.println(table.neighborAverage(1,1));
        System.out.println(table.neighborAverage(2,0));
        System.out.println(table.neighborAverage(0,2));
    }
}
