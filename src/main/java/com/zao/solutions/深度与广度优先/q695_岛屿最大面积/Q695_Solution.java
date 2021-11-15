package com.zao.solutions.深度与广度优先.q695_岛屿最大面积;

import org.junit.Test;

public class Q695_Solution {
    @Test
    public void test() {
        System.out.println("result = "+ maxAreaOfIsland(
                new int[][]{
                        new int[]{0,0,1,0,0,0,0,1,0,0,0,0,0},
                        new int[]{0,0,0,0,0,0,0,1,1,1,0,0,0},
                        new int[]{0,1,1,0,1,0,0,0,0,0,0,0,0},
                        new int[]{0,1,0,0,1,1,0,0,1,0,1,0,0},
                        new int[]{0,1,0,0,1,1,0,0,1,1,1,0,0},
                        new int[]{0,0,0,0,0,0,0,0,0,0,1,0,0},
                        new int[]{0,0,0,0,0,0,0,1,1,1,0,0,0},
                        new int[]{0,0,0,0,0,0,0,1,1,0,0,0,0}

                }
        ));
    }

    public int maxAreaOfIsland(int[][] grid) {
        int[][] flag = new int[grid.length][grid[0].length];
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && flag[i][j] ==0) {
                    int area = getArea(grid, flag, i,j);
                    System.out.println(area);
                    result = Math.max(result,area);
                }
            }
        }
        return result;
    }

    public int getArea(int[][] grid, int[][] flag, int i, int j) {
        if (i >= 0 && i<grid.length && j >= 0 && j< grid[0].length && grid[i][j] == 1 && flag[i][j]==0) {
            flag[i][j] = 1;
            int res = 1 + getArea(grid, flag, i+1, j) + getArea(grid, flag, i, j+1) + getArea(grid, flag, i-1, j) + getArea(grid, flag, i, j-1);
            return res;
        } else {
            return 0;
        }
    }
}

