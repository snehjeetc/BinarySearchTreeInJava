package com.customdatastructure.java;

public class BSTNode<K extends Comparable<K>> {
    private K key;
    private BSTNode<K> left, right;
    public BSTNode(K key){
        this.key = key;
        left = right = null;
    }

    public K getKey() { return key; }
    public BSTNode<K> getLeft() { return left ;}
    public BSTNode<K> getRight() { return right; }

    public void setLeft(BSTNode<K> left){ this.left = left; }
    public void setRight(BSTNode<K> right) { this.right = right; }
}
