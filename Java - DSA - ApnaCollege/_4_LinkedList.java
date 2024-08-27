
import java.util.ArrayList;
import java.util.Vector;

public class _4_LinkedList {
    //class of node
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void printList(){
        Node currNode = head;
        if (currNode == null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Printing the list: ");

        while (currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NUll");
    }

    Node head;

    //insert at first
    public void insertAtFirst(int data){
        Node newNode = new  Node(data);
        if (this.head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void deleteNode(int pos){
        if (head == null) {
            System.out.println("Head is already empty!");
            return;
        }
        if (pos == 0) {
            head = head.next;
            return;
        } else  {
            Node currNode = head;
            int count = 0;
            Node prevNode = null;

            while (count != pos){
                count = count + 1;
                prevNode = currNode;
                currNode = currNode.next;
            }

            prevNode.next = currNode.next;

//            System.out.println(count + " " + currNode.data
//            + " " + prevNode.next.data);

            System.out.println(currNode.data + "" +
                    " is deleted from the list.");

        }
    }

    public void reverseLL(){
        if (head == null)
        {
            return;
        }
        else {
//          Node prev = head;
//          Node curr = head.next;
//            Node forward = null;
//
//          while(curr != null){
//              forward = curr.next;
//              curr.next = prev;
//
//              //update
//              prev = curr;
//              curr = forward;
//          }
//
//          head.next = null;
//            head = prev;

            Node prev = null;
            Node curr = head;
            Node forward = null;

            while (curr != null){
                forward = curr.next;
                curr.next = prev;

                //update
                prev = curr;
                curr = forward;

            }

            head = prev;
            System.out.println("List is reversed!");
        }
    }

    public void reverseLLUsingRC(Node curr, Node prev){
        //Base Case
        if (curr == null) {
            head  = prev;
            System.out.println("Linked List is reversed using recursive calls!");
            return;
        }

        reverseLLUsingRC(curr.next, curr);
        curr.next = prev;

    }

    public boolean vectorCheck(Vector<Integer> data){
        int start = 0;
        int end = data.size() - 1;

        while (start <= end){

            if (data.get(start) != data.get(end)) {
                return false;

            } else {
                start++;
                end--;
            }

        }
        return true;
    }

    public boolean palindrome(){

        Vector<Integer> data = new Vector<>();

        Node temp = head;
        while (temp != null){
            data.add(temp.data);
            temp = temp.next;
        }

        return vectorCheck(data);
    }

    public static void main(String[] args) {
        _4_LinkedList list = new _4_LinkedList();
        list.insertAtFirst(23);
        list.insertAtFirst(4);
        list.insertAtFirst(73);
        list.insertAtEnd(88);
        list.insertAtEnd(35);
        list.insertAtEnd(10);

        list.printList();

        list.deleteNode(5);
        list.printList();
        list.reverseLL();
        list.printList();
        list.reverseLLUsingRC(list.head, null);
        list.printList();
        _4_LinkedList list2 = new _4_LinkedList();
        System.out.println(list.palindrome());

        list2.insertAtFirst(1);
        list2.insertAtFirst(2);
        list2.insertAtFirst(2);
        list2.insertAtFirst(1);

        list2.printList();
        System.out.println(list2.palindrome());
;
    }



}
