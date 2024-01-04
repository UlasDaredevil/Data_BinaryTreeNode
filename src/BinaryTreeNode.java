public class BinaryTreeNode {

    public BinaryTreeNode left;
    public int key;
    public BinaryTreeNode right;



    public static BinaryTreeNode CreateNode(int key){

        BinaryTreeNode node = new BinaryTreeNode();
        node.key = key;
        node.left = null;
        node.right = null;

        return node;


    }






}
