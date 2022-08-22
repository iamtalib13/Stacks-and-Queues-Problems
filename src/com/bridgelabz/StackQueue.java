package com.bridgelabz;

import java.util.Scanner;

public class StackQueue {
    public static void main(String[] args) {
        //Welcome Message for User
        System.out.println("Welcome to Stacks and Queues Problems using Linked List ");

        Scanner sc = new Scanner(System.in);

        LinkedList linkedList = new LinkedList();

        int choice;
        do {
            System.out.println("STACK & QUEUE OPERATIONS");
            System.out.println("1. PUSH in STACK \n2. POP from STACK \n3. DISPLAY STACK \n4. ENQUEUE in QUEUE \n5. DEQUEUE in QUEUE \n6. DISPLAY QUEUE \n7. EXIT \nEnter the Choice for Operation : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the Data to Push in Stack : ");
                    linkedList.insertFirst(sc.nextInt());
                    break;
                case 2:
                    linkedList.peakPop("Stack");
                    break;
                case 3:
                    linkedList.showLinkedList();
                    break;
                case 4:
                    System.out.println("Enter the Data to Enqueue in Queue : ");
                    linkedList.insertLast(sc.nextInt());
                    break;
                case 5:
                    linkedList.peakPop("Queue");
                    break;
                case 6:
                    linkedList.showLinkedList();
                    break;
            }
        }while(choice != 7);
    }
}