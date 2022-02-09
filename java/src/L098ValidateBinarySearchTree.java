import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class L098ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
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
            if(res.size()!=0&&res.get(res.size()-1)>=q.val)
                return false;
            else
                res.add(q.val);
            if(q.right!=null){
                tmp.push(q.right);
            }
            else if(!tmp.isEmpty()){
                q = tmp.peek();
                q.left=null;
            }
        }

        return true;
    }

    public static void main(String[] args){
//       [10,5,15,null,null,6,20]
        TreeNode root = new TreeNode(1);
        TreeNode l=root,r=root;
        l.left = new TreeNode(1);
//        r.right = new TreeNode(15);
//        r = r.right;
//        r.left = new TreeNode(6);
//        r.right= new TreeNode(20);
        L098ValidateBinarySearchTree solution = new L098ValidateBinarySearchTree();
        System.out.println(solution.isValidBST(root));
    }
}

