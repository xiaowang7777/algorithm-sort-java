package com.github.wang.sort;

public class Util {
    public static <T extends Comparable<T>> boolean less(T[] arr, int lo, int hi) {
        return arr[lo].compareTo(arr[hi]) < 0;
    }

    public static <T> void exch(T[] arr, int lo, int hi) {
        T tmp = arr[lo];
        arr[lo] = arr[hi];
        arr[hi] = tmp;
    }
}
