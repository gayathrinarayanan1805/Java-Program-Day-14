class Node{
int data;
Node left, right;
Node(int data){
this.data = data;
}
}
public class bst{
static Node insert(Node root, int value){
if(root == null)
return new Node(value);
if(value<root.data)
root.left = insert(root.left, value);
else if(value>root.data)
root.right = insert(root.right, value);
return root;
}
static void inorder(Node root){
if(root == null)
return;
inorder(root.left);
System.out.print(root.data+" ");
inorder(root.right);
}
public static void main(String[] args){
Node root = null;
root = insert(root,5);
root = insert(root,3);
root = insert(root,7);
root = insert(root,2);
root = insert(root,4);
inorder(root);
}
}
