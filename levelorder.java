import java.util.*;
public class levelorder {
    // simple binary tree node
    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }
    Queue<TreeNode> q = new LinkedList<>();
    List<List<Integer>> ans = new ArrayList<>();
    if(root == null) return ans;
    q.offer(root);
    while(!q.isEmpty()){
        int levelnum = q.size();
        List<Integer> sublist = new LinkedList<>();
        for(int i = 0; i < levelnum; i++){
            if(q.peek().left != null) q.offer(q.peek().left);
            if(q.peek().right != null)q.offer(q.peek().right);
            sublist.add(q.poll().val);
        }
        ans.add(sublist);
    }

    return ans;
    
}
