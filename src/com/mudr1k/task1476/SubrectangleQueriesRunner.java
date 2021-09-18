package com.mudr1k.task1476;

public class SubrectangleQueriesRunner {

    public static void main(String[] args) {
        int [][] num = {
                {1,2,1},
                {4,3,4},
                {3,2,1},
                {1,1,1}
        };
        SubrectangleQueries subrectangleQueries = new SubrectangleQueries(num);
        subrectangleQueries.print(subrectangleQueries.getRectangle());

        System.out.println(subrectangleQueries.getValue(0, 2));

        subrectangleQueries.updateSubrectangle(0, 0, 3, 2, 5);
        subrectangleQueries.print(subrectangleQueries.getRectangle());

        System.out.println(subrectangleQueries.getValue(0, 2));
        System.out.println(subrectangleQueries.getValue(3, 1));

        subrectangleQueries.updateSubrectangle(3, 0, 3, 2, 10);
        subrectangleQueries.print(subrectangleQueries.getRectangle());
        System.out.println(subrectangleQueries.getValue(0, 2));
        System.out.println(subrectangleQueries.getValue(3, 1));

        subrectangleQueries.updateSubrectangle(3, 0, 3, 2, 10);
    }
}
