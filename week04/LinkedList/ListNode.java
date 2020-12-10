class Node {
    int data;  // 정수 데이터를 가진다.
    Node next = null;  

    Node(int d) {
        this.data = d;
    }

    void add(int d) { 
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) { // 마지막 값을 찾아간다.
            n = n.next;
        }
        n.next = end; // 마지막 값에 붙인다.
    }

    void remove(int d) {
        Node n = this;
        while (n.next != null) { // 마지막 전 노드까지 돈다.
            if (n.next.data == d) {
                n.next = n.next.next; // 다음 노드의 데이터 값이 매개변수와 같으면 다음 노드에 대한 link를 다다음 노드에 연결한다. 
            } else {
                n = n.next; // 아니면 다음 노드로 간다.
            }
        }
    }

    void retrive() {
        Node n = this;
        while (n.next != null) {
            System.out.print(n.data + "->");
            n = n.next;
        }
        System.out.println(n.data);
    }
}

class SinglyLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.add(2);
        head.add(3);
        head.add(4);
        head.retrive();
        head.remove(2);
        head.remove(3);
        head.retrive();
    }
}

public class ListNode {
    ListNode head;
    ListNode next;

    ListNode add(ListNode head, ListNode nodeToAdd, int position) {

        return null;
    }

    ListNode remove(ListNode head, int positionToRemove) {
        

        return null;
    }

    boolean contains(ListNode head, ListNode nodeTocheck) {
        

        return false;
    }
}