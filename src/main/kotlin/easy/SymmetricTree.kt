package easy

/**
Link: https://leetcode.com/problems/same-tree/
 **/
fun main(args: Array<String>) {
    val p = TreeNode(1)
    p.left = TreeNode(2)
    p.right = TreeNode(3)
    val q = TreeNode(1)
    q.left = TreeNode(2)
    q.right = TreeNode(2)
    print(Solution().isSymmetric(q))
}

class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        return if (root == null) true else isSameTree(root.left, root.right)
    }

    fun isSameTree(left: TreeNode?, right: TreeNode?): Boolean {
        if (left == null && right == null) return true else if (left == null || right == null) return false
        val cond1 = left.value == right.value
        val cond2 = isSameTree(left.left, right.right)
        val cond3 = isSameTree(left.right, right.left)
        return cond1 && cond2 && cond3
    }
}