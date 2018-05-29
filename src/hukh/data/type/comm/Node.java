package hukh.data.type.comm;

public class Node {
	private final int value;
	private Node next;
	
	public Node(int value) {
		this.value = value;
	}
	
	int getValue() {
		return this.value;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public static void printList(Node head) {
		while (head != null) {
			System.out.print(head.getValue());
			System.out.print(" ");
			head = head.getNext();
		}
		System.out.println();
	}
}
