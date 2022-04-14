package com.github.wang.sort;

public class Quick {
    public static <T extends Comparable<T>> void sort(T[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    static <T extends Comparable<T>> void sort(T[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int p = partition(arr, lo, hi);
        sort(arr, lo, p - 1);
        sort(arr, p + 1, hi);
    }

    static <T extends Comparable<T>> int partition(T[] arr, int lo, int hi) {
        int i = lo;
        int j = hi;

        int p = lo;

        while (true) {
            while (Util.less(arr, i, p)) {
                if (i == p) {
                    break;
                }
                i++;
            }
            while (Util.less(arr, p, j)) {
                if (j == p) {
                    break;
                }
                j--;
            }

            if (i >= j) {
                break;
            }
            Util.exch(arr, i, j);
            i++;
            j--;
        }
        Util.exch(arr, p, j);
        return j;
    }
}
