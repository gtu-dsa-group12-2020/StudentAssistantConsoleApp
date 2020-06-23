package utils;

/**
 * This class represents a single item in an AVL tree.
 * @version 1.0
 */
public class AVLNode<T extends Comparable<T>> {
	private T data;
	private AVLNode<T> left;
	private AVLNode<T> right;
	private int height;
	private int balanceFactor;

	public AVLNode(T d) {
		data = d;
	}

	public AVLNode(T d, AVLNode<T> l, AVLNode<T> r) {
		data = d;
		left = l;
		right = r;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public AVLNode<T> getLeft() {
		return left;
	}

	public void setLeft(AVLNode<T> left) {
		this.left = left;
	}

	public AVLNode<T> getRight() {
		return right;
	}

	public void setRight(AVLNode<T> right) {
		this.right = right;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int h) {
		this.height = h;
	}

	public int getBalanceFactor() {
		return balanceFactor;
	}

	public void setBalanceFactor(int balanceFactor) {
		this.balanceFactor = balanceFactor;
	}
}
