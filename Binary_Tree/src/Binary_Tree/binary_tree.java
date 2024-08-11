package Binary_Tree;

public class binary_tree {


    class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

 
    class BinaryTree {
    
        Node root;

   
        void inorderTraversal(Node node) {
            if (node == null) {
                return;
            }

      
            inorderTraversal(node.left);

      
            System.out.print(node.data + " ");

     
            inorderTraversal(node.right);
        }

      
        void preorderTraversal(Node node) {
            if (node == null) {
                return;
            }

            
            System.out.print(node.data + " ");

        
            preorderTraversal(node.left);

      
            preorderTraversal(node.right);
        }

    
        void postorderTraversal(Node node) {
            if (node == null) {
                return;
            }

         
            postorderTraversal(node.left);

        
            postorderTraversal(node.right);

      
            System.out.print(node.data + " ");
        }
    }

  
    public static void main(String[] args) {
        binary_tree bt = new binary_tree(); 
        BinaryTree tree = bt.new BinaryTree(); 

       

        tree.root = bt.new Node(1); 
        tree.root.left = bt.new Node(2);
        tree.root.right = bt.new Node(3);
        tree.root.left.left = bt.new Node(4);
        tree.root.left.right = bt.new Node(5);
        tree.root.right.left = bt.new Node(6);
        tree.root.right.right = bt.new Node(7);

        System.out.println("Inorder traversal of the binary tree:");
        tree.inorderTraversal(tree.root);

        System.out.println("\nPreorder traversal of the binary tree:");
        tree.preorderTraversal(tree.root);

        System.out.println("\nPostorder traversal of the binary tree:");
        tree.postorderTraversal(tree.root);
    }
}
