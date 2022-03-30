package com.company;

public class Table {

    private int[][] values;
    public Table(int rows, int columns) {
        values = new int[rows][columns];
    }
    public void set(int i, int j, int n) {
        values[i][j] = n;
    }

    public double neighborAverage(int row, int column){
        int numberOfNeighbor = 0 ;
        int sumOfNeighbor = 0 ;
        int rowLength = values.length;
        int columnLength = values[0].length;

        if(row-1 >= 0 && column-1 >= 0){
            sumOfNeighbor = sumOfNeighbor + values[row-1][column-1];
            numberOfNeighbor = numberOfNeighbor + 1 ;
        }
        if(row-1 >= 0 && column == column){
            sumOfNeighbor = sumOfNeighbor + values[row-1][column];
            numberOfNeighbor = numberOfNeighbor + 1 ;
        }
        if(row-1 >= 0 && column+1 < columnLength){
            sumOfNeighbor = sumOfNeighbor + values[row-1][column+1];
            numberOfNeighbor = numberOfNeighbor + 1 ;
        }
        if(row == row && column-1 >= 0){
            sumOfNeighbor = sumOfNeighbor + values[row][column-1];
            numberOfNeighbor = numberOfNeighbor + 1 ;
        }
        if(row == row  && column+1 < columnLength){
            sumOfNeighbor = sumOfNeighbor + values[row][column+1];
            numberOfNeighbor = numberOfNeighbor + 1 ;
        }
        if(row+1 < rowLength && column-1 >= 0){
            sumOfNeighbor = sumOfNeighbor + values[row+1][column-1];
            numberOfNeighbor = numberOfNeighbor + 1 ;
        }
        if(row+1 < rowLength && column == column){
            sumOfNeighbor = sumOfNeighbor + values[row+1][column];
            numberOfNeighbor = numberOfNeighbor + 1 ;
        }
        if(row+1 < rowLength && column+1 < columnLength){
            sumOfNeighbor = sumOfNeighbor + values[row+1][column+1];
            numberOfNeighbor = numberOfNeighbor + 1 ;
        }
        return (double)  sumOfNeighbor/numberOfNeighbor;
    }

}
