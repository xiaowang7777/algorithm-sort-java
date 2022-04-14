package com.github.wang.sort;

public class Merge {

    public static <T extends Comparable<T>> void sort(T[] arr) {
        merge(arr, (T[]) new Comparable[arr.length], 0, arr.length - 1);
    }

    static <T extends Comparable<T>> void merge(T[] arr, T[] aux, int hi, int lo) {
        if (hi >= lo) {
            return;
        }

        int mid = hi + (lo - hi) / 2;

        merge(arr, aux, hi, mid);
        merge(arr, aux, mid + 1, lo);

        sort(arr, aux, hi, lo, mid);
    }

    static <T extends Comparable<T>> void sort(T[] arr, T[] aux, int hi, int lo, int mid) {

        if (lo + 1 - hi >= 0) {
            System.arraycopy(arr, hi, aux, hi, lo + 1 - hi);
        }

        int lt = hi;
        int rt = mid + 1;

        for (int i = hi; i <= lo; i++) {
            if (rt > lo) {
                arr[i] = aux[lt];
                lt++;
            } else if (lt > mid) {
                arr[i] = aux[rt];
                rt++;
            } else if (Util.less(aux, lt, rt)) {
                arr[i] = aux[lt];
                lt++;
            } else {
                arr[i] = aux[rt];
                rt++;
            }
        }

    }

}
