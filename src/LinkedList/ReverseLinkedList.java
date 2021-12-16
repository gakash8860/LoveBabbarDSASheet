package LinkedList;

import java.util.Scanner;

public class ReverseLinkedList {
    public static void main(String[] args) {
        NodeClass<Integer> node = takeInput();
       NodeClass<Integer> nodeClass = reverseRecursion(node);
        print(nodeClass);
    }

    public static NodeClass<Integer> reverseRecursion(NodeClass<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        NodeClass<Integer> finalHead = reverseRecursion(head.next);
        NodeClass<Integer> temp = finalHead;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        head.next = null;
        return finalHead;
    }

    public static NodeClass<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        NodeClass<Integer> head = null;
        System.out.println("Enter The data");
        int data = sc.nextInt();
        while (data != -1) {
            NodeClass<Integer> newNode = new NodeClass<>(data);
            if (head == null) {
                head = newNode;
            } else {
                NodeClass<Integer> temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            data = sc.nextInt();
        }
        return head;
    }
    public static void print(NodeClass<Integer> head){
        while (head!=null){
            System.out.print(head.data+"  ");
            head = head.next;
        }

    }
}
