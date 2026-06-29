class Node{
int data;
Node left, right;
Node(int data){
this.data = data;
}
}
public class del{
static Node delete(Node root, int key){
if(root == null)
return null;
if(key < root.data)
root.left = delete(root.left, key);
else if(key > root.data)
root.right = delete(root.right, key);
else{
if(root.left == null && root.right == null)
return null;
}
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
Node root = new Node(50);
root.left = new Node(30);
root.right = new Node(70);
root.left.left = new Node(5);
root.left.right = new Node(15);
root = delete(root, 70);
inorder(root);
}
}
