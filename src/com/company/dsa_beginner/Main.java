package com.company.dsa_beginner;

public class Main {

    public static void main(String[] args) {
        BST bst2 = new BST(2);
        BST bst1 = new BST(1);
        BST bst3 = new BST(3);
        BST bst4 = new BST(4);

        bst2.left = bst1;
        bst2.right = bst3;
        bst3.right = bst4;

        System.out.println(search(bst2, 4));
    }

    private static boolean search(BST root, int target) {
        if (root == null) {
            return false;
        }
        
        if (target < root.val) {
            return search(root.left, target);
        } else if (target > root.val) {
            return search(root.right, target);
        } else {
            return true;
        }

    }
}

class BST {
    int val;
    BST left;
    BST right;

    public BST(int val) {
        this.val = val;
    }
}
