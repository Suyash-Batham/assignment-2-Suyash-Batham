package problem1.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

public class MyMain
{
    public static void main(String[] args)
    {
        MyBinarySearchTree mst = new MyBinarySearchTree();
        TreeNode root;
        root = new TreeNode(11);
        mst.insert(root, 4);
        mst.insert(root, 2);
        mst.insert(root, 5);
        mst.insert(root, 7);
        mst.insert(root, 8);
        mst.insert(root, 42);
        mst.insert(root, 17);
        mst.insert(root, 45);
        mst.insert(root, 34);
        mst.insert(root, 23);
        mst.insert(root, 12);
        mst.leftView(root);
    }
}
