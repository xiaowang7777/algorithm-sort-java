package com.github.wang.sort;

public class Selection {
    public static  <T extends Comparable<T>> void sort(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_idx = i;
            for (int j = i; j < arr.length; j++) {
                if (Util.less(arr, j, min_idx)) {
                    min_idx = j;
                }
            }
            if (min_idx != i) {
                Util.exch(arr, min_idx, i);
            }
        }
    }
}
