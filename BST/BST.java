import java.util.Stack;

class List {
    Node root;

        class Node {
            int data;
            Node left;
            Node right;

                Node(int a) {
                    data = a;
                    left = null;
                    right = null;
                }
        }

        public void insert_BST(int a) {
            Node nnode = new Node(a);
            if(root == null) {
                root = nnode;
            }
            else {
                Node temp = root;
                while(temp.left!=null || temp.right!=null) {
                    if(nnode.data>=temp.data && temp.right!=null) {
                        temp = temp.right;
                    }
                    else if(nnode.data<temp.data && temp.left!=null) {
                        temp = temp.left;
                    }
                    else{
                        break;
                    }
                }
                if(nnode.data>=temp.data) {
                    temp.right = nnode;
                }
                else {
                    temp.left = nnode;
                }
            }
        } 

        public void display_inorder() {
            if(root == null) {
                System.out.println("Tree is empty");
            }
            else{
                System.out.println("Inorder :");
                Node temp = root;
                Stack<Node> st = new Stack<Node>();

                while(temp!=null || st.size()>0) {
                    while(temp!=null) {
                        st.push(temp);
                        temp = temp.left;
                    }
                        temp = st.pop();
                        System.out.print("["+temp.data+"] ");
                        temp = temp.right;
                }
                    System.out.println();
            }
        }

        public void display_preorder() {
            if(root == null) {
                System.out.println("Tree is empty");
            }
            else {
                System.out.println("Preorder :");
                Stack<Node> st = new Stack<Node>();
                st.push(root);

                while(st.size()>0) {
                    Node temp = st.pop();
                    System.out.print("["+temp.data+"] ");

                    if(temp.right!=null) {
                        st.push(temp.right);
                    }
                    if(temp.left!=null) {
                        st.push(temp.left);
                    }
                }
                System.out.println();
            }
        }

        public void display_postorder() {
            System.out.println("Postorder :");
            Stack<Node> st1 = new Stack<Node>();
            Stack<Node> st2 = new Stack<Node>();
            st1.push(root);

            while(st1.size()>0) {
                Node temp = st1.pop();
                st2.push(temp);

                if(temp.left!=null) {
                    st1.push(temp.left);
                }
                if(temp.right!=null) {
                    st1.push(temp.right);
                }
            }

            while(st2.size()>0) {
                Node temp = st2.pop();
                System.out.print("["+temp.data+"] ");
            }
            System.out.println();
        }

        public void delete_leaf_node(int a) {
            Node parent = null;
            Node temp = root;

            while(temp!=null && temp.data!=a) {
                parent = temp;

                if(a > temp.data) {
                    temp = temp.right;
                }
                else {
                    temp = temp.left;
                }
            }

            if(temp.left==null && temp.right==null) {
                if(parent.data > temp.data) {
                    parent.left = null;
                }
                else {
                    parent.right = null;
                }
            }
        } 

        public void delete_1child_node(int a) {
            Node parent = null;
            Node temp = root;

            while(temp!=null && temp.data!=a) {
                parent = temp;

                if(a > temp.data) {
                    temp = temp.right;
                }
                else {
                    temp = temp.left;
                }
            }

            if(temp.left!=null && temp.right==null) {
                if(temp.data > parent.data) {
                    parent.right = temp.left;
                }
                else {
                    parent.left = temp.left;
                }
            }
            if(temp.left==null && temp.right!=null) {
                if(temp.data > parent.data) {
                    parent.right = temp.right;
                }
                else {
                    parent.left = temp.right;
                }
            }
        }

        public void delete_2child_node(int a) {
            Node parent = null;
            Node temp = root;

            while(temp!=null && temp.data!=a) {
                parent = temp;

                if(a > temp.data) {
                    temp = temp.right;
                }
                else {
                    temp = temp.left;
                }
            }

            if(temp.left!=null && temp.right!=null) {
                Node t = inorderSuccesor(temp);
                temp.data = t.data;
            }
        }

            Node inorderSuccesor(Node N) {
                boolean rightChild = true;
                Node parentNode = N;
                N = N.right;

                if(N.left!=null) {
                    rightChild = false;
                }
                while(N.left!=null) {
                    parentNode = N;
                    N = N.left;
                }
                if(rightChild) {
                    parentNode.right = N.right;
                }
                else {
                    parentNode.left = N.right;
                }
                return N;
            }
        
}

public class BST { 
    public static void main(String[] args) {
        List obj = new List();

        obj.insert_BST(8);
        obj.insert_BST(3);
        obj.insert_BST(11);
        obj.insert_BST(5);
        obj.insert_BST(9);
        obj.insert_BST(12);
        obj.insert_BST(13);
        obj.insert_BST(4);
        obj.insert_BST(6);
        obj.insert_BST(20);
        obj.display_inorder();
        System.out.println();
        obj.display_preorder();
        System.out.println();
        obj.display_postorder();
        System.out.println();
        obj.delete_leaf_node(20);
        obj.delete_1child_node(12);
        obj.delete_2child_node(8);
        obj.display_inorder();

      


    }
}