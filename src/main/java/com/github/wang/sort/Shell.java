package com.github.wang.sort;

public class Shell {
    public static <T extends Comparable<T>> void sort(T[] arr, int step) {
        for (int s = step; s > 0; s--) {
            for (int i = s; i < arr.length; i++) {
                for (int j = i; j >= s; j -= s) {
                    if (Util.less(arr, j, j - s)) {
                        Util.exch(arr, j, j - s);
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
