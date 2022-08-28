public class MinHeapImpl {

    //creating variables related to heap
    private int[] heap;
    private int size;
    private int maxsize;

    //constructor of the class to initialize the heap
    public MinHeapImpl(int maxsize) {
        this.maxsize = maxsize;
        this.size = 0;

        heap = new int[this.maxsize];
        heap[0] = -1;
    }

    //method to return the position of the parent of a node
    private int getParentNode(int pos) {
        return pos/2;
    }

    //method to return left child of the current node
    private int leftChild(int pos) {
        return (2* pos);
    }

    //method to return left child of the current node
    private int rightChild(int pos) {
        return (2* pos)+1;
    }

    //method to check if current node is a leaf node
    private boolean isLeafNode(int pos) {
        if (pos <= size && pos > (size/2)) {
            return true;
        }
        return false;
    }

    //method to swap two nodes of heap
    private void swapNodes(int firstPosition, int secondPosition) {
        int temp;
        temp = heap[firstPosition];
        heap[firstPosition] = heap[secondPosition];
        heap[secondPosition] = temp;
    }

    //method to heapify the node at the position
    private void heapify(int pos) {
        //check if the pos is a non-leaf node
        if (isLeafNode(pos)) {

            //check if the node at pos is greater than its child
            if (heap[pos] > heap[leftChild(pos)] || heap[pos] > heap[rightChild(pos)]) {

                //check if leftChild is greater than rightChild then swap with leftChild
                if(heap[leftChild(pos)] > heap[rightChild(pos)]) {
                    swapNodes(pos, leftChild(pos));
                    heapify(leftChild(pos));
                }
                else {
                    swapNodes(pos, rightChild(pos));
                    heapify(rightChild(pos));
                }
            }
        }
    }

    //insert a node in heap
    public void insert(int data) {
        int key = data;

        //increase the size of heap and assign the key at new position
        heap[++size] = key;

        //newSize becomes size of the heap
        int newSize = size;

        //heapify
        while(heap[newSize] < heap[getParentNode(newSize)]) {
            swapNodes(newSize, getParentNode(newSize));
            newSize = getParentNode(newSize);
        }
    }


    public static void main(String[] args) {

    }
}
