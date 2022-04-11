package com.github.wang.sort;

public class Insert {
    public static <T extends Comparable<T>> void sort(T[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (Util.less(arr, j, j - 1)) {
                    Util.exch(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
}
