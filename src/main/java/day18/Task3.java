package day18;


public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        int[] numbers = {14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};
        for (int number : numbers)
            addNode(number, root);

        dfs(root);

    }
    private static void  dfs(Node node){
        if(node == null)
            return;
        dfs(node.getLeftNodeChild());
        System.out.print(node.getValue() + " ");
        dfs(node.getRightNodeChild());
    }

    private static void addNode(int value, Node root){
        if(root == null)
            throw new IllegalArgumentException("Корневой узел null");

        Node parentNode = root;
        Node currentNode = null;

        while (parentNode != null) { // цикл для нахождения улза без левого/правого потомка
            currentNode = parentNode;

            if (value < currentNode.getValue())
                parentNode = currentNode.getLeftNodeChild();
            else
                parentNode = currentNode.getRightNodeChild();
        }

        // Находимся на последнем узле, у которого нет правого/левого потомка

        if(value < currentNode.getValue())
            currentNode.setLeftNodeChild(new Node(value));
        else
            currentNode.setRightNodeChild(new Node(value));

        // Вставили правого/левого сына для текушего узла

    }
}

class Node {
    private int value;
    private Node leftNodeChild;
    private Node rightNodeChild;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getLeftNodeChild() {
        return leftNodeChild;
    }

    public void setLeftNodeChild(Node leftNodeChild) {
        this.leftNodeChild = leftNodeChild;
    }

    public Node getRightNodeChild() {
        return rightNodeChild;
    }

    public void setRightNodeChild(Node rightNodeChild) {
        this.rightNodeChild = rightNodeChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", leftNodeChild=" + leftNodeChild +
                ", rightNodeChild=" + rightNodeChild +
                '}';
    }
}