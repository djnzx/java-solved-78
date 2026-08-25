package practice.p15;

import java.util.ArrayList;
import java.util.List;

// base
// https://leetcode.com/problems/binary-tree-inorder-traversal/
public class P1 {
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    visit(root, result);
    return result;
  }

  private void visit(TreeNode node, List<Integer> result) {
    if (node == null) {
      return;
    }
    visit(node.left, result);
    result.add(node.val);
    visit(node.right, result);
  }
}
