import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class L094BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> tmp = new Stack<TreeNode>();
        if(root!=null)
            tmp.push(root);
        TreeNode q;
        while (!tmp.isEmpty()){
            q = tmp.peek();

            while(q.left!=null){
                tmp.push(q.left);
                q = q.left;
            }
            q = tmp.pop();
            res.add(q.val);
            if(q.right!=null){
                tmp.push(q.right);
            }
            else if(!tmp.isEmpty()){
                q = tmp.peek();
                q.left=null;
            }
        }
        return res;
    }
    public static void main(String[] args){
//        int[] case1={1,null,2,3};
        TreeNode p,q;
        TreeNode root1 = new TreeNode(1);
        root1.left = null;
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(3);
        root1.right.right = null;
        L094BinaryTreeInorderTraversal solution = new L094BinaryTreeInorderTraversal();
        for(int x:solution.inorderTraversal(root1)){
            System.out.println(x+" ");
        }
    }
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

