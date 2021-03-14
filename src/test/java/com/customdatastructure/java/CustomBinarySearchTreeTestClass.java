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

    @Test
    public void givenNumbers_WhenBinarySearchTreeIsCreated_ShouldReturnCorrectSize(){
        CustomBST<Integer> myBST = new CustomBST<>();
        myBST.add(56);
        myBST.add(30);
        myBST.add(70);
        myBST.add(22);
        myBST.add(40);
        myBST.add(11);
        myBST.add(3);
        myBST.add(16);
        myBST.add(60);
        myBST.add(95);
        myBST.add(65);
        myBST.add(63);
        myBST.add(67);
        int size = myBST.size();
        Assert.assertEquals(13, size);
    }

    @Test
    public void givenNumbers_CreateABinarySearchTree_AndShouldReturnTrue_WhenANumberInTreeIsSearched(){
        CustomBST<Integer> myBST = new CustomBST<>();
        myBST.add(56);
        myBST.add(30);
        myBST.add(70);
        myBST.add(22);
        myBST.add(40);
        myBST.add(11);
        myBST.add(3);
        myBST.add(16);
        myBST.add(60);
        myBST.add(95);
        myBST.add(65);
        myBST.add(63);
        myBST.add(67);
        boolean search = myBST.search(63);
        Assert.assertTrue(search);
    }

    @Test
    public void givenNumbers_CreateABinarySearchTree_AndShouldReturnFalse_WhenANumberNotInTreeIsSearched(){
        CustomBST<Integer> myBST = new CustomBST<>();
        myBST.add(56);
        myBST.add(30);
        myBST.add(70);
        myBST.add(22);
        myBST.add(40);
        myBST.add(11);
        myBST.add(3);
        myBST.add(16);
        myBST.add(60);
        myBST.add(95);
        myBST.add(65);
        myBST.add(63);
        myBST.add(67);
        boolean search = myBST.search(61);
        Assert.assertFalse(search);
    }
}
