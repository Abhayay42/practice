import java.util.Scanner;
public class reverseRecurson {

    public static Node<Integer> input(){
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head=null,tail=null;
        while(data!=-1){
            Node<Integer> newnode=new Node<Integer> (data);
            if(head==null){
            head=newnode;
            tail=newnode;
            }
            else{
                tail.next=newnode;
                tail=newnode;
            }
            data=s.nextInt();
        }
        return head;
    }


    public static Node<Integer> reverseR(Node<Integer> head){
        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> smallhead =reverseR(head.next);
        Node<Integer> tail = smallhead;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=head;
        head.next=null;

        return smallhead;
    }


    public static void print(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    //haha
    //yay
    //nonoc

    public static void main(String[] args) {
        Node<Integer> head = input();
        head = reverseR(head);
        print(head);
    }
}
