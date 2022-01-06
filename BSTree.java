import java.util.Scanner;

public class BSTree {
    static Scanner sc = null;
    static class Node{
        Node left, right;
        int data;

        public Node(int data){
            this.data = data;
        }
    }

    static Node createTree(){
        Node root = null;
        System.out.println("Enter Data :");
        int data = sc.nextInt();
        if(data == -1) 
            return null;
        root = new Node(data);  
        System.out.println("Enter Left of "+data);  
        root.left = createTree();
        System.out.println("Enter Rigth of "+data);
        root.right = createTree();
        return root;
    }

    static void inOrder(Node root){
        if(root == null) 
            return;
        inOrder(root.left);
        System.out.print(" "+root.data+" ");
        inOrder(root.right);
    }

    static void preOrder(Node root){
        if(root == null) 
            return;
        System.out.print(" "+root.data+" ");    
        preOrder(root.left);
        preOrder(root.right);
    }

    static void postOrder(Node root){
        if(root == null) 
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(" "+root.data+" ");   
    }

    static Node searchKey(Node root, int key){
        if(root==null || root.data == key)
            return root;
        if(key<root.data)
            return searchKey(root.left, key);
        else    
            return searchKey(root.right, key);                     
    }

    static int heightTree(Node root){
        if(root == null)
            return 0;
        return Math.max(heightTree(root.left),heightTree(root.right))+1;
    }
    public static void main(String[] args){
        sc = new Scanner(System.in);
        Node root = createTree();
        System.out.print("\nInorder :");
        inOrder(root);
        System.out.print("\nPreorder :");
        preOrder(root);
        System.out.print("\nPostorder :");
        postOrder(root);
        // System.out.print("Enter key");
        // int key = sc.nextInt();
        // Node root1 = searchKey(root, key);
        // System.out.println("Root found :"+root1.data);
        int height = heightTree(root);
        System.out.println("Height of tree is :"+height);
    }
}
