package com.suman.java;

public class MirrorOfTree {
	public static void main(String[] args) {
		BTree btree = new BTree();
		btree.add(18);
		btree.add(35);
		btree.add(10);
		btree.add(9);
		btree.add(27);
		btree.add(3);
		
		btree.sortData();
		System.out.println("-----------------");
		btree.mirror();
		btree.sortData();
	}
}

class BTree{
	Node root;
	BTree(){
		root = null;
	}
	class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	
	public void add(int data){
		root = addElement(root, data);
	}

	private Node addElement(Node node, int data) {
		if(node == null){
			node = new Node(data);
			return node;
		}
		else if(data < node.data){
			node.left = addElement(node.left, data);
		}
		else if(data > node.data){
			node.right = addElement(node.right, data);
		}
		return node;
	}
	
	public void sortData(){
		inOrder(root);
	}

	private void inOrder(Node root) {
		if(root != null){
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
		}
	}
	
	public void mirror(){
		root = mirror(root);
	}

	private Node mirror(Node node) {
		if(node == null)
			return node;
		Node left = mirror(node.left);
		Node right = mirror(node.right);
		node.left = right;
		node.right = left;
		
		return node;
	}
}
