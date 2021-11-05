package serialize_root;

import java.util.*;

public class Node{
    String val;
    Node left;
    Node right;
    public Node(String val, Node left, Node right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public static String serialize(Node root) {
        ArrayList<String> working_string = new ArrayList<>();
        Node working_node = root;
        if (working_node.val != null) {
            working_string.add(working_node.val);
            if(working_node.left != null){
                working_string.add(serialize(working_node.left));
            }else{
                working_string.add(null);
            }
            if(working_node.right != null){
                working_string.add(serialize(working_node.right));
            }
            else{
                working_string.add(null);
            }
        }
        return String.join(",", working_string);

    }
    public static Node helper(Queue<String> q) {
        String next = q.peek();
        if (next != null) {
            return new Node(q.poll(), helper(q), helper(q));
        }
        return null;
    }
    public static Node deserialize(String s) {
        String[] working_array = s.split(",");
        Queue<String> q = new LinkedList<>();
        for (String a: working_array){
            q.add(a);
        }
        return helper(q);
    }

    public static void main(String[] args){
        Node node1 = new Node("root", new Node("left", new Node("left.left", null, null), null), new Node("right", null, null));
        Node node2 = new Node("test", null, null);
        System.out.println(serialize(node1));
        System.out.println((deserialize(serialize(node1))).left.left.val.equals("left.left"));
    }
}
