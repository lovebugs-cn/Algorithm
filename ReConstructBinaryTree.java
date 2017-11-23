package algorithm;

public class ReConstructBinaryTree {
	
	public static class BinaryTreeNode{
		int value;
		BinaryTreeNode left;
		BinaryTreeNode right;
	}
	
	public static BinaryTreeNode construct(int[] preorder,int[] inorder) {
		
		if(preorder == null || inorder == null || preorder.length != inorder.length || inorder.length < 1)
			return null;
		
		return construct(preorder ,0, preorder.length - 1, inorder, 0, inorder.length - 1);
		
	}
	
	public static BinaryTreeNode construct(int[] preorder,int pstart,int pend,int[] inorder,int istart,int iend) {
		// 开始位置大于结束位置说明已经没有需要处理的元素了
		if(pstart > pend)
			return null;
		
		// 取前序遍历的第一个数字，就是当前的根结点 
		int value = preorder[pstart];
		int index = istart;
		
		// 在中序遍历的数组中找根结点的位置 
		while(index <= iend && inorder[index] != value)
			index ++;
		
		// 如果在整个中序遍历的数组中没有找到，说明输入的参数是不合法的，抛出异常  
        if (index > iend) {  
            throw new RuntimeException("Invalid input");  
        }
		
		// 创建当前的根结点，并且为结点赋值
		BinaryTreeNode node = new BinaryTreeNode();
		node.value = value;
		
		// 递归构建当前根结点的左子树，左子树的元素个数(包括根)：index-istart+1个  
        // 左子树对应的前序遍历的位置在[pstart+1, pstart+index-istart]  
        // 左子树对应的中序遍历的位置在[istart, index-1]
		node.left = construct(preorder,pstart+1,pstart+index-istart,inorder,istart,index-1);
		
		// 递归构建当前根结点的右子树，右子树的元素个数：iend-index个  
        // 右子树对应的前序遍历的位置在[pstart+index-istart+1, pend]  
        // 右子树对应的中序遍历的位置在[index+1, iend] 
		node.right = construct(preorder,pstart+index-istart+1,pend,inorder,index+1,iend);
		
		//返回创建的根结点
		return node;
		
	}
	
	// 中序遍历二叉树
	public static void printTree(BinaryTreeNode root) {
		if(root != null) {
			printTree(root.left);
			System.out.print(root.value + "");
			printTree(root.right);
			
		}
	}
	
	//测试
	
	// 普通二叉树  
    //              1  
    //           /     \  
    //          2       3  
    //         /       / \  
    //        4       5   6  
    //         \         /  
    //          7       8  
    private static void test1() {  
        int[] preorder = {1, 2, 4, 7, 3, 5, 6, 8};  
        int[] inorder = {4, 7, 2, 1, 5, 3, 8, 6};  
        BinaryTreeNode root = construct(preorder, inorder);  
        printTree(root);  
    }  
    // 所有结点都没有右子结点  
    //            1  
    //           /  
    //          2  
    //         /  
    //        3  
    //       /  
    //      4  
    //     /  
    //    5  
    private static void test2() {  
        int[] preorder = {1, 2, 3, 4, 5};  
        int[] inorder = {5, 4, 3, 2, 1};  
        BinaryTreeNode root = construct(preorder, inorder);  
        printTree(root);  
    }  
    // 所有结点都没有左子结点  
    //            1  
    //             \  
    //              2  
    //               \  
    //                3  
    //                 \  
    //                  4  
    //                   \  
    //                    5  
    private static void test3() {  
        int[] preorder = {1, 2, 3, 4, 5};  
        int[] inorder = {1, 2, 3, 4, 5};  
        BinaryTreeNode root = construct(preorder, inorder);  
        printTree(root);  
    }  
    // 树中只有一个结点  
    private static void test4() {  
        int[] preorder = {1};  
        int[] inorder = {1};  
        BinaryTreeNode root = construct(preorder, inorder);  
        printTree(root);  
    }  
    // 完全二叉树  
    //              1  
    //           /     \  
    //          2       3  
    //         / \     / \  
    //        4   5   6   7  
    private static void test5() {  
        int[] preorder = {1, 2, 4, 5, 3, 6, 7};  
        int[] inorder = {4, 2, 5, 1, 6, 3, 7};  
        BinaryTreeNode root = construct(preorder, inorder);  
        printTree(root);  
    }  
    // 输入空指针  
    private static void test6() {  
        construct(null, null);  
    }  
    // 输入的两个序列不匹配  
    private static void test7() {  
        int[] preorder = {1, 2, 4, 5, 3, 6, 7};  
        int[] inorder = {4, 2, 8, 1, 6, 3, 7};  
        BinaryTreeNode root = construct(preorder, inorder);  
        printTree(root);  
    }  
    public static void main(String[] args) {  
        test1();  
        System.out.println();  
        test2();  
        System.out.println();  
        test3();  
        System.out.println();  
        test4();  
        System.out.println();  
        test5();  
        System.out.println();  
        test6();  
        System.out.println();  
        test7();  
    }  
}
