import java.util.LinkedList;

import java.util.Scanner;


public class LinkedListExample {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the linked list size: ");
        int n=sc.nextInt();
        LinkedList ll=new LinkedList();
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            ll.add(sc.nextInt());
        }
        if(ll.getFirst()==ll.getLast()){
            System.out.println("Linked list has a cycle");

        }
        else
            System.out.println("Not a cycle");

        System.out.println("The first element is: "+ll.getFirst());


        System.out.println("Enter the nth element to remove between 0 and "+ll.size());
        int a=sc.nextInt();
        ll.remove(ll.size()-a);
        System.out.println("Linkedlist after removing "+a+" element is "+ll);

        LinkedList ll2=new LinkedList<>();
        LinkedList ll3=new LinkedList<>();

        System.out.println("enter the elements for ll2: ");
        for(int i=0;i<n;i++){
            ll2.add(sc.nextInt());
        }

        for(Object i:ll){
            if(ll2.contains(i)){
                ll3.add(i);
            }
        }
        System.out.println("Intersection of ll and ll2: "+ll3);

        int count=0;
        for(Object i:ll){
            if(ll.contains(i)){
                count++;
            }
        }
        if(count==n-1){
            System.out.println("LinkedList ll is a Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }

        }



    }

