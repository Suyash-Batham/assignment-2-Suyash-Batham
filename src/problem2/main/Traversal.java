package problem2.main;

import problem1.node.TreeNode;

public class Traversal
{
    void printPostOrder(TreeNode node)
    {
        if (node == null)
            return;
        printPostOrder(node.getLeft());
        printPostOrder(node.getRight());
        System.out.print(node.getData() + " ");
    }

    void printInorder(TreeNode node)
    {
        if (node == null)
            return;
        printInorder(node.getLeft());
        System.out.print(node.getData() + " ");
        printInorder(node.getRight());
    }

    void printPreorder(TreeNode node)
    {
        if (node == null)
            return;
        System.out.print(node.getData() + " ");
        printPreorder(node.getLeft());
        printPreorder(node.getRight());
    }
}
