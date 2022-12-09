import java.util.Scanner;
public class RecursionDelete3{

    public static Node<Integer> Input(){
        Scanner s= new Scanner(System.in);
        Node<Integer> head =null , tail = null;
        int data = s.nextInt();
        while(data!=-1){
            Node<Integer> currnode = new Node<Integer> (data);
            if(head==null){
                head=currnode;
                tail=currnode;
            }
            else{
                tail.next=currnode;
                tail=currnode;
            }
            data=s.nextInt();
        }
        return head;
    }

    public static Node<Integer> deleteR(Node<Integer> head , int pos){
        if(head==null){
            return head;
        }
        if(pos==0){
            return head.next;
        }
        head.next=deleteR(head.next , pos-1);
        return head;
    }




    public static void print(Node<Integer> head){
        Node<Integer> temp =head;
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        print(head.next);
    }

    public static void main(String[] args) {
        Node<Integer> head = Input();
        head = deleteR(head,3);
        print(head);
    }
}