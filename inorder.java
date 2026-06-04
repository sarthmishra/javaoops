class tree{
    int val;
    tree left;
    tree right;
    
    tree(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}



public class inorder {
    public static void main(String[] args){
        tree root = new tree(5);

        if(root == null){
            return;
        }
        inorder(root);
    }
    static void inorder(Tree root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
}
