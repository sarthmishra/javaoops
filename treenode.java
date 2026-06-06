public class treenode {
    int val;
    treenode left;
    treenode right;

    treenode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
    public static void main(String[] args){
        treenode root = new treenode(10);
        root.left = new treenode(5);
        root.right = new treenode(15);

        treenode leftnode  = root.left;
        treenode rightnode  = root.right;
        leftnode.left = new treenode(2);
        rightnode.left = new treenode(14);
        rightnode.right = new treenode(25);
        System.out.print(root.val);
        //System.out.print();
    }
}
/*class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
class Main {
    public static void inordertraversal(TreeNode root) {
        if(root == null){
            return;
        }
        inordertraversal(root.left);
        System.out.print(root.val + "->");
        inordertraversal(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        inordertraversal(root);  // Output: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 
    }
} */
