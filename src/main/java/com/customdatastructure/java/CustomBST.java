package com.customdatastructure.java;

public class CustomBST<K extends Comparable<K>> {
    private BSTNode<K> root;
    public CustomBST(){
        root = null;
    }

    public void add(K key){
        this.root = add(root, key);
    }

    private BSTNode<K> add(BSTNode<K> current , K key){
        if(current == null)
            return new BSTNode<K>(key);
        if(key.compareTo(current.getKey()) < 0)
            current.setLeft(add(current.getLeft(), key));
        else
            current.setRight(add(current.getRight(), key));
        return current;
    }

    public int size(){
        return size(root);
    }

    private int size(BSTNode<K> current){
        if(current == null)
            return 0;
        return 1 + size(current.getLeft()) + size(current.getRight());
    }

    public boolean search(K key){
        return search(root, key);
    }

    private boolean search(BSTNode<K> current, K key){
        if(current == null)
            return false;
        int compare = key.compareTo(current.getKey());
        if(compare == 0)
            return true;
        else if(compare < 0)
            return search(current.getLeft(), key);
        else
            return search(current.getRight(),key);
    }
}
