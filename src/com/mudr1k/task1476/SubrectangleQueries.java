package com.mudr1k.task1476;


public class SubrectangleQueries {
    private int[][] rectangle;

    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        assert row1 <= row2 && row2 <= rectangle.length && col1 <= col2 && col2 <= rectangle[0].length;

        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                rectangle[i][j] = newValue;
            }
        }


    }

    public int getValue(int row, int col) {
        return rectangle[row][col];
    }

    public void print(int[][] rectangle) {
        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[i].length; j++) {
                System.out.print(rectangle[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] getRectangle() {
        return rectangle;
    }
}
