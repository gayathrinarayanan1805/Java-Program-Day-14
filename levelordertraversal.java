import java.util.*;
class Node{
int data;
Node left, right;
Node(int data){
this.data = data;
}
}
public class levelordertraversal{
static void levelorder(Node root){
Queue<Node> q = new LinkedList<>();
q.add(root);
while(!q.isEmpty()){
Node temp = q.poll();
System.out.print(temp.data+" ");
if(temp.left != null)
q.add(temp.left);
if(temp.right != null)
q.add(temp.right);
}
}
public static void main(String[] args){
Node root = new Node(10);
root.left = new Node(20);
root.right = new Node(30);
root.left.left = new Node(40);
root.left.right = new Node(50);
root.right.left = new Node(60);
root.right.right = new Node(70);
levelorder(root);
}
}
