import java.io.Serializable;
import java.util.Scanner;

/**
 * Class for a binary tree that stores type E objects.
 * @param <E> Type for data
 */
public class BinaryTree<E> {

    /**
     * The root of the binary tree
     */
    protected Node<E> root;

    /**
     * Constructs an empty binary tree
     */
    public BinaryTree() {
        root = null;
    }

    /**
     * Constructs a binary tree with the given node as the root
     * @param root new root
     */
    protected BinaryTree(Node<E> root){
        this.root = root;
    }

    /**
     *  Constructs a new binary tree with data in its root leftTree
     *  as its left subtree and rightTree as its right subtree.
     * @param data root data
     * @param leftTree root left subtree
     * @param rightTree root right subtree
     */
    public BinaryTree(E data, BinaryTree<E> leftTree, BinaryTree<E> rightTree){
        root = new Node<>(data);

        if(leftTree != null) {
            root.left = new Node<>(leftTree.root.data);
        } else {
            root.left = null;
        }
        if(rightTree != null) {
            root.right = new Node<>(rightTree.root.data);
        } else {
            root.right = null;
        }
    }

    /**
     *  Return the left subtree.
     * @return The left subtree or null if either the root or
     * the left subtree is null
     */
    public BinaryTree<E> getLeftSubtree() {
        if(root != null && root.left != null)
            return new BinaryTree<>(root.left);
        else
            return null;
    }

    /**
     *  Return the right subtree.
     * @return The right subtree or null if either the root or the right subtree is null
     */
    public BinaryTree<E> getRightSubtree() {
        if(root != null && root.right != null)
            return new BinaryTree<>(root.right);
        else
            return null;
    }

    /**
     *  Determine whether this tree is a leaf.
     @return true if the root has no children
     */
    public boolean isLeaf() {
        return (root.left == null && root.right == null);
    }

    /**
     *  Returns a String representation of the tree
     * @return string of tree representation
     */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        toString(root, sb);
        return sb.toString();
    }

    /**
     * Converts a subtree to a string.
     * Performs a preorder traversal.
     * @param node The local root
     * @param sb The StringBuilder to save the output
     */
    private void toString(Node<E> node, StringBuilder sb) {

        if (node == null) {
            sb.append("null\n");
        } else {
            sb.append(node.toString());
            sb.append("\n");
            toString(node.left, sb);
            toString(node.right, sb);
        }
    }

    /**
     * Method to read a binary tree.
     * pre: The input consists of a preorder traversal
     * of the binary tree. The line "null" indicates a null tree.
     * @param scan the Scanner attached to the input file.
     * @return The binary tree
     */
    public BinaryTree<String> readBinaryTree(Scanner scan) {
        String data = scan.nextLine().trim();
        if (data.equals("null")) {
            return null;
        } else {
            BinaryTree<String> leftTree = readBinaryTree(scan);
            BinaryTree<String> rightTree = readBinaryTree(scan);
            return new BinaryTree<>(data, leftTree, rightTree);
        }
    }

    /**
     * Class to encapsulate a tree node.
     * @param <E> Type for object
     */
    protected static class Node<E> implements Serializable {
        /**
         * The information stored in this node.
         */
        protected E data;

        /**
         *  Reference to the left child.
         */
        protected Node<E> left;

        /**
         *  Reference to the right child.
         */
        protected Node<E> right;

        /**
         * Construct a node with given data and no children.
         * @param data The data to store in this node
         */
        public Node(E data){
            this.data = data;
            left = null;
            right = null;
        }


        /**
         * Return a string representation of the node.
         * @return A string representation of the data fields
         */
        public String toString(){
            return data.toString();
        }
    }

}
