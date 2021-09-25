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
    q.right = TreeNode(3)

    isSameTree(p, q)
}

fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
    if (p == null && q == null) return true
    if (p == null || q == null) return false
    if(p.value != q.value) return false
    return isSameTree(p.right, q.right) && isSameTree(p.left, q.left)
}

class TreeNode(var value: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}