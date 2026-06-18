import java.util.ArrayList;

public class BoundaryNodes {
    void addLeftBoundary(Node root, ArrayList<Integer>res){
        Node curr = root.left;
        while(curr != null){
            if(isLeaf(curr) == false)res.add(curr.data);
            if(curr.left != null) curr = curr.left;
            else curr = curr.right;
        }
    }
    void addRightBoundary(Node root, ArrayList<Integer>res){
        Node curr = root.Right;
        ArrayList<Integer>tmp = new ArrayList<>();
        while(curr != null){
            if(sLeaf(curr) == false)res.add(curr.data);
            if(curr.Right != null) curr = curr.Right;
            else curr = curr.left;
        }
        int i;
        for(i = tmp.size() - 1; i >= 0; --i){
            res.add(tmp.get(i));
        }

    }
    void addLeaves(Node root, ArrayList<Integer>res){
        if(isLeaf(root)){
            res.add(root.data);
            return;
        }
        if(root.left != null) addLeaves(root.left,res);
        if(root.Right != null) addLeaves(root.Right,res);

    }



    public static void main(String[] args){
        ArrayList<Integer> printBoundary(Node node){
        ArrayList<Integer> ans = new ArrayList<>();
        if(isLeaf(node) == false) ans.add(node.data);
        addLeftBoundary(node,ans);
        addLeaved(node,ans);
        addRightBoundary(node,ans);
        return ans;
        }
    }
}
