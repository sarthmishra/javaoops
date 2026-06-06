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
