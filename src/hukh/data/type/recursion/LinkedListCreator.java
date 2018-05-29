package hukh.data.type.recursion;

import java.util.Arrays;
import java.util.List;

import hukh.data.type.comm.Node;

public class LinkedListCreator {
	
	public Node creator(List<Integer> data) {
		// 特殊情况处理
		if (data.isEmpty())
			return null;
			
		Node head = new Node(data.get(0));
		// 假设范围缩小1情况成立
		head.setNext(creator(data.subList(1, data.size())));
		return head;
	}

	public static void main(String[] args) {
		LinkedListCreator listLink = new LinkedListCreator();
		Node.printList(listLink.creator(Arrays.asList()));
		Node.printList(listLink.creator(Arrays.asList(1)));
		Node.printList(listLink.creator(Arrays.asList(1, 2, 3, 4, 5)));
	}

}
