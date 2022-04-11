package com.github.wang.sort;

import org.junit.Assert;
import org.junit.Test;

public class SortTest {

    @Test
    public void SelectionTest() {
        Integer[] arr = new Integer[] {4, 3, 5, 4, 2, 1};
        Integer[] res = new Integer[] {1, 2, 3, 4, 4, 5};
        Selection.sort(arr);
        Assert.assertArrayEquals(arr, res);
    }

    @Test
    public void InsertTest() {
        Integer[] arr = new Integer[] {4, 3, 5, 4, 2, 1};
        Integer[] res = new Integer[] {1, 2, 3, 4, 4, 5};
        Insert.sort(arr);
        Assert.assertArrayEquals(arr, res);
    }

    @Test
    public void ShellTest() {
        Integer[] arr = new Integer[] {4, 3, 5, 4, 2, 1};
        Integer[] res = new Integer[] {1, 2, 3, 4, 4, 5};
        Shell.sort(arr, 2);
        Assert.assertArrayEquals(arr, res);
    }
}
