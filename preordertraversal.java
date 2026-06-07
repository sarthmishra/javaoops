class treenode{
    int val;
    treenode left;
    treenode right;
    treenode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class preordertraversal {
    public static void preorder(treenode root){
        if(root == null){
            return;
        }
         System.out.print(root.val + "->");
         preorder(root.left);
         preorder(root.right);
    }
    public static void main(String[] args){
        treenode root = new treenode(4);
        root.left = new treenode(2);
        root.right = new treenode(6);
        root.left.left = new treenode(1);
        root.left.right = new treenode(3);
        root.right.left = new treenode(5);
        root.right.right = new treenode(7);
        preorder(root);
    }
    
}
