public class peroder {
    static int size = 0;

    public static class Node {
        int val; // 0
        Node left; // null
        Node right; // null

        public Node(int val) {
            this.val = val;
        }
    }

    public static void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        size++;
        preorder(root.left);
        preorder(root.right);
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

        preorder(root);
        System.out.println("Size of BT is " + size);
    }

}