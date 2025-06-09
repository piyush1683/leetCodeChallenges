package leetcodechallenges;

// Java Program to Implement
// Huffman Coding
import java.util.PriorityQueue;
import java.util.HashMap;

// Class representing a node in the Huffman Tree
class HuffmanNode {
    // Character data
    char data;

    // Frequency of the character
    int frequency;

    // Left and right child nodes
    HuffmanNode left, right;

    // Constructor to initialize the node
    HuffmanNode(char data, int frequency) {
        this.data = data;
        this.frequency = frequency;
        left = right = null;
    }
}

// Driver Class
public class HuffmanCoding {
    // Main Function
    public static void main(String[] args) {

        // The message to be encoded
        String message = "Huffman coding is a lossless data compression algorithm.";

        // Create a frequency map to count the frequency of each character
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : message.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Create a priority queue to build the Huffman Tree
        PriorityQueue<HuffmanNode> priorityQueue = new PriorityQueue<>((a, b) -> a.frequency - b.frequency);

        // Create a Huffman node for each character and add it to the priority queue
        for (char c : frequencyMap.keySet()) {
            priorityQueue.add(new HuffmanNode(c, frequencyMap.get(c)));
        }

        // Build the Huffman Tree
        while (priorityQueue.size() > 1) {
            // Remove the two nodes with the lowest frequency
            HuffmanNode left = priorityQueue.poll();
            HuffmanNode right = priorityQueue.poll();

            // Create a new internal node with these two nodes
            // as children and add it back to the queue
            HuffmanNode newNode = new HuffmanNode('$', left.frequency + right.frequency);

            newNode.left = left;
            newNode.right = right;
            priorityQueue.add(newNode);
        }

        // The remaining node is the root of the Huffman Tree
        HuffmanNode root = priorityQueue.poll();

        // Print the Huffman codes for each character
        System.out.println("Huffman codes:");
        printCodes(root, new StringBuilder());
    }

    // Method to print the Huffman codes
    public static void printCodes(HuffmanNode root, StringBuilder code) {
        if (root == null)
            return;

        // If this is a leaf node, print the character and its code
        if (root.data != '$') {
            System.out.println(root.data + ": " + code);
        }

        // Traverse the left subtree
        if (root.left != null) {
            printCodes(root.left, code.append('0'));
            code.deleteCharAt(code.length() - 1);
        }

        // Traverse the right subtree
        if (root.right != null) {
            printCodes(root.right, code.append('1'));
            code.deleteCharAt(code.length() - 1);
        }
    }
}