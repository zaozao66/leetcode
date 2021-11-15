package com.zao.solutions.深度与广度优先.q733_图像渲染;

import org.junit.Test;

public class Q733_Solution {
    @Test
    public void test() {
        int[][] arr = floodFill(new int[][]{new int[]{0, 0, 0}, {0, 0, 0}}, 0, 0, 2);
        for (int[] ar : arr) {
            for (int i : ar) {
                System.out.printf(i + " ");
            }
            System.out.println();
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int[][] flag = new int[image.length][image[0].length];
        int oldColor = image[sr][sc];
        fill(image, sr, sc,oldColor, newColor, flag);
        return image;
    }

    public void fill(int[][] image, int sr, int sc,int oldColor, int newColor, int[][] flag) {

        if (sr>=0 && sr < image.length && sc >=0 && sc < image[0].length && image[sr][sc] == oldColor && flag[sr][sc] ==0) {
            image[sr][sc] = newColor;
            flag[sr][sc] = 1;
            fill(image, sr, sc + 1,oldColor, newColor, flag);
            fill(image, sr, sc - 1,oldColor, newColor, flag);
            fill(image, sr + 1, sc,oldColor, newColor, flag);
            fill(image, sr - 1, sc,oldColor, newColor, flag);
        }
    }
}

