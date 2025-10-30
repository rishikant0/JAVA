public class sumOFBT {
    public static class Node { 
        int val; 
        Node left, right;

        public Node(int val) { 
            this.val = val; 
        } 
    } 

    //Sum of BT
    public static int sum(Node root) { 
        if(root == null) return 0;
        return root.val+ sum(root.left) + sum(root.right);

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        b.right = e;
        System.out.println("SUM of Binary Tree: " + sum(root)); 

        
}
}
