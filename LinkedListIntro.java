import javax.sound.midi.SysexMessage;

public class LinkedListIntro {
    NewNode head;
    NewNode tail;
    int length = 0;

    LinkedListIntro(int data) {
        NewNode firstNode = new NewNode(data);
        head = firstNode;
        tail = firstNode;
        length++;
    }

    class NewNode {
        int data;
        NewNode next;

        NewNode(int data) {
            this.data = data;
            this.next = null;
            length++;
        }
    }

    void appendNode(int data) {
        NewNode newNode = new NewNode(data);
        this.tail.next = newNode;
        this.tail = newNode; // Update the tail reference
    }

    void prependNode(int data){
        NewNode newNode = new NewNode(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    void insertNode(int data,int pos){
        // here pos means after which node it should be inserted
        NewNode currentNode = head;
        NewNode newNode = new NewNode(data);
        if(pos>length){
            System.out.println("Invalid Position");
        } else if (pos == 1) {
            System.out.println("Use prepend()");

        } else if (pos==length) {
            System.out.println("Use append()");
        } else{
            for(int i=2; i<pos;i++){
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
            length++;
        }
    }

        NewNode deleteNode(int pos){
        NewNode currentNode = head;
        NewNode temp;
        if(pos ==1){
            temp = head;
            head = head.next;
            currentNode = head;
            temp.next = null;
            return temp;
        }
        else if(pos<length){
            for(int i = 2; i<pos;i++){
                currentNode = currentNode.next;
            }
            temp = currentNode.next;
            currentNode.next = currentNode.next.next;
            temp.next = null;
            return temp;
        }
        else{
            for(int i=2; i<length;i++){
                currentNode = currentNode.next;
            }
            currentNode.next = null;
            return  currentNode;
        }
    }

    void reverseLL(){
        tail = head;
        NewNode currentNode = head.next;
        NewNode temp;
        head.next = null;

        while(currentNode!=null){
            temp = currentNode.next;
            currentNode.next = head;
            head = currentNode;
            currentNode = temp;
        }
    }

    static void printNode(NewNode head){
        NewNode currentNode = head;
        while(currentNode!=null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListIntro newLinkedList = new LinkedListIntro(4);
        newLinkedList.appendNode(6); // Correct way to call instance method
        newLinkedList.appendNode(9);
        newLinkedList.appendNode(11);
        newLinkedList.prependNode(1);
        newLinkedList.insertNode(55,4);
//        NewNode deleted = newLinkedList.deleteNode(1);
//        System.out.println("Deleted data:"+deleted.data);
        newLinkedList.printNode(newLinkedList.head);
        newLinkedList.reverseLL();
        newLinkedList.printNode(newLinkedList.head);
    }
}