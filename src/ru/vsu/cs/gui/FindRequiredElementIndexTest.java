package ru.vsu.cs.gui;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.cs.gui.common.FindRequiredElementIndex;


public class FindRequiredElementIndexTest {
    @Test
    public void test1FindRequiredElementIndex() {
        int actualArray1 = FindRequiredElementIndex.findRequiredElementIndex(new int[]{1, 2, -4, -5, 3});
        int resultOfIndexElement1 = 2;
        Assert.assertEquals(resultOfIndexElement1, actualArray1);
    }

    @Test
    public void test2FindRequiredElementIndex() {
        int actualArray2 = FindRequiredElementIndex.findRequiredElementIndex(new int[]{2, 5, 3, 7, 9, 5, 2});
        int resultOfIndexElement2 = -1;
        Assert.assertEquals(resultOfIndexElement2, actualArray2);
    }

    @Test
    public void test3FindRequiredElementIndex() {
        int actualArray3 = FindRequiredElementIndex.findRequiredElementIndex(new int[]{-2, -3, 7, -4});
        int resultOfIndexElement3 = 0;
        Assert.assertEquals(resultOfIndexElement3, actualArray3);
    }

    @Test
    public void test4FindRequiredElementIndex() {
        int actualArray4 = FindRequiredElementIndex.findRequiredElementIndex(new int[]{-4, -5, -9, -1, -4});
        int resultOfIndexElement4 = 0;
        Assert.assertEquals(resultOfIndexElement4, actualArray4);
    }

    @Test
    public void test5FindRequiredElementIndex() {
        int actualArray5 = FindRequiredElementIndex.findRequiredElementIndex(new int[]{1, 2, 3, -3, 4, 7});
        int resultOfIndexElement5 = -1;
        Assert.assertEquals(resultOfIndexElement5, actualArray5);
    }

    @Test
    public void test6FindRequiredElementIndex() {
        int actualArray6 = FindRequiredElementIndex.findRequiredElementIndex(new int[]{9, -8, 8, -5, -6});
        int resultOfIndexElement6 = 4;
        Assert.assertEquals(resultOfIndexElement6, actualArray6);
    }
}
