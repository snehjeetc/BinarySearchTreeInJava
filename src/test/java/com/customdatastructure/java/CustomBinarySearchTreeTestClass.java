package com.customdatastructure.java;

import org.junit.Assert;
import org.junit.Test;

public class CustomBinarySearchTreeTestClass {
    @Test
    public void given3NumbersWhenAddedToBinarySearchTreeShouldReturnSizeThree(){
        CustomBST<Integer> myBST = new CustomBST<>();
        myBST.add(56);
        myBST.add(30);
        myBST.add(70);
        int size = myBST.size();
        Assert.assertEquals(3, size);
    }
}
