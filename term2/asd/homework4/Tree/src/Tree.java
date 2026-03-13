public class Tree<T extends Comparable<T>> {
    private TreeNode<T> root;
    private int height;

    public Tree() {
        this.height = 0;
    }

    public Tree(TreeNode<T> root) {
        this.root = root;
        this.height = 1;
    }

    public void add(T value) {
        TreeNode<T> node = new TreeNode<>(value);

        if (this.root == null) {
            this.root = node;
            this.height = 1;
        } else {
            add(this.root, value);
        }
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setRoot(TreeNode<T> root) {
        this.root = root;
    }

    public TreeNode<T> getRoot() {
        return root;
    }

    private void add(TreeNode<T> current, T value) {
        if (current.getValue().compareTo(value) > 0) {
            if (current.getLeft() == null) {
                current.setLeft(new TreeNode<>(value));
                height++;
            } else {
                add(current.getLeft(), value);
            }
        } else if (current.getValue().compareTo(value) <= 0) {
            if (current.getRight() == null) {
                current.setRight(new TreeNode<>(value));
                height++;
            } else {
                add(current.getRight(), value);
            }
        }
    }

    public void preOrder() {
        preOrder(root);
    }

    public void preOrder(TreeNode<T> node) {
        if (node != null) {
            System.out.println(node.getValue());
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    public void inOrder() {
        inOrder(root);
    }

    public void inOrder(TreeNode<T> node) {
        if (node != null) {
            inOrder(node.getLeft());
            System.out.println(node.getValue());
            inOrder(node.getRight());
        }
    }

    public void postOrder() {
        postOrder(root);
    }

    public void postOrder(TreeNode<T> node) {
        if (node != null) {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.println(node.getValue());
        }
    }
}