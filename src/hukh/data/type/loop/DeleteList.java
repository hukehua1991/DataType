package hukh.data.type.loop;

import java.util.Arrays;

import hukh.data.type.comm.Node;
import hukh.data.type.recursion.LinkedListCreator;

public class DeleteList {

	
	public Node delete(Node head, int value) {
		
		while (head != null && head.getValue() == value) {
			head = head.getNext();
		}
		
		if (head == null) {
			return head;
		}
		
		Node previous = head;
		Node current = head.getNext();
		
		while (current != null) {
			if (current.getValue() == value) {
				previous.setNext(current.getNext());
			} else {
				previous = current;
			}
			current = current.getNext();
		}
		
		return head;
	}
	
	public static void main(String[] args) {
		LinkedListCreator listLink = new LinkedListCreator();
		DeleteList delList = new DeleteList();
		Node.printList(delList.delete(listLink.creator(Arrays.asList()), 2));
		Node.printList(delList.delete(listLink.creator(Arrays.asList(1, 1, 1, 2)), 1));
		Node.printList(delList.delete(listLink.creator(Arrays.asList(1, 2, 2, 3, 4, 5, 2)), 2));
	}
}
