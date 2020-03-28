package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        MyBinarySearchTree m = new MyBinarySearchTree();
        MyQueue q = new MyQueue();
        TreeNode root;
        root = new TreeNode(10);
        m.insert(root, 6);
        m.insert(root, 2);
        m.insert(root, 16);
        m.insert(root, 8);
        m.insert(root, 6);
        m.insert(root, 13);
        m.insert(root, 31);
        m.insert(root, 24);
        m.insert(root, 39);
        m.insert(root, 46);
        m.insert(root, 7);
        q.preOrder(root);
        q.queuePrint(q);
        System.out.print("Enter to find preorder Successor : ");
        q.printSuccessor(sc.nextInt());
    }
}