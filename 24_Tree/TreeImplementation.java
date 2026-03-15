// All Required Concept of Tree

import java.util.*;

public class TreeImplementation {
    public static class Node{
        int val;
        Node left ;
        Node right; 
        public Node( int val){
            this.val = val;
        }
    }
    public static void display( Node root){
        if( root == null) return ;
        System.out.print(root.val + " -> ");
        if(root.left != null) System.out.print(root.left.val + ",");
        if( root.right != null) System.out.print(root.right.val);
        System.out.println();
        display(root.left);
        display(root.right);
    }
    public static int size(Node root){
        if( root == null) return 0;

        return 1 + size(root.left) + size(root.right);
    }
    public static int sum (Node root){
        if( root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    
    public static int maxValue(Node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(maxValue(root.left), maxValue(root.right)));
    }

    public static int Height( Node root){
        if( root == null) return 0;
        if( root.left == null && root.right == null ) return 0;

        return 1 + Math.max(Height(root.left) , Height(root.right));
    }
    public static void preOrder( Node root){
        if( root== null) return;

        System.out.println(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void nthLevel(Node root , int n){
        if(root == null) return ;
        if( n == 1) System.out.print(root.val + " ");
        nthLevel(root.left , n-1);
        nthLevel(root.right , n-1);

    }
     
     public static void BFS(Node root){
        Queue<Node> q = new LinkedList<>();

        if(root != null ) q.add(root);

        while(!q.isEmpty()){
            Node temp = q.peek();

            if(temp.left != null) q.add( temp.left);
            if(temp.right != null) q.add(temp.right);

            System.out.print(temp.val + " ");

            q.remove();
        }
     }

    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(10);
        root.left = a;
        root.right = b;
        Node c= new Node(6);
        Node d= new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(11);
        b.right = e;
        Node f = new Node(69);
        e.right = f;
        //display(root);
        //System.out.println("Size of the " + size(root));
        //System.out.println(" sum of the root is " + sum(root));
        //System.out.println("Max Value of the tree is " + maxValue(root));
        // System.out.println("Height of the tree is = " + Height(root));
        // preOrder(root);

        
        // priting element of nth Level 

        // int level = Height(root) + 1;
        // for( int i = 0 ; i <= level ; i++){
        //     nthLevel(root, i);
        //     System.out.println();
        // }

        BFS(root);
    }

     
}
