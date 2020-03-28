package problem2.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

public class MyMain
{
    public static void main(String[] args)
    {
        Traversal t = new Traversal();
        MyBinarySearchTree mst = new MyBinarySearchTree();
        TreeNode root = new TreeNode(11);
        mst.insert(root, 6);
        mst.insert(root, 2);
        mst.insert(root, 14);
        mst.insert(root, 10);
        mst.insert(root, 6);
        mst.insert(root, 13);
        mst.insert(root, 29);
        mst.insert(root, 24);
        mst.insert(root, 41);
        mst.insert(root, 46);
        mst.insert(root, 7);
        mst.insert(root, 4);
        t.printPreorder(root);
        System.out.println();
        t.printPostOrder(root);
    }
}
