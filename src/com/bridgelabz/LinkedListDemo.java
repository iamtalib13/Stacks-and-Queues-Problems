package com.bridgelabz;

import java.util.Scanner;

class Node {
    public int data;
    public Node next;

    //Node Constructor for Creating New Node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    int location = 0;

    Node head;
    Node tail;
    //Insert Data in New Node
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        //Adding Data in Node
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        location++;
        System.out.println("Location:"+location);
    }

    //Insert Data from Last
    public void insertLast(int data) {
        Node newNode = new Node(data);
        if(tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        location++;
        System.out.println("Location:"+location);
    }

    //Insert New Node after Given Node
    public void insertNthPosition(int data,int nthdata) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            Node nextNode;
            while (temp != null) {
                nextNode = temp.next;
                if(temp.data == nthdata) {
                    temp.next = newNode;
                    newNode.next = nextNode;
                }
//                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
        }
    }

    //Method to Delete First Node from Linked List
    public void pop() {
        if(head == null) {
            System.out.println("Linked List is Empty.");
        } else {
            head = head.next;
        }
    }

    //Method for Peak Pop in Stack
    public void peakPop(String struct) {
        if(head == null) {
            System.out.println(struct+" is Empty.");
        } else {
            while(head != null) {
                System.out.println("Deleted : "+head.data);
                head = head.next;
            }
            head = null;
        }
    }

    //Method to Delete Last Node from Linked List
    public void popLast() {
        if(head == null) {
            System.out.println("Linked List is Empty.");
        } else {
            Node second_Last = head;
            while(second_Last.next.next != null)
                second_Last = second_Last.next;
            second_Last.next = null;
        }
    }

    //Method to Search given Node in Linked List
    public void searchNode(int data) {
        if(head == null) {
            System.out.println("Linked List is Empty.");
        } else {
            int foundLocation = 1;
            Node temp = head;
            while(temp != null) {
                if(temp.data == data) {
                    System.out.println("Node found at Location : "+foundLocation);
                }
                foundLocation++;
                temp = temp.next;
            }
        }
    }

    //Method to Insert Given Node at Specific Location
    public void insertAtLocation(int data,int nthdata) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            Node nextNode;
            while (temp != null) {
                nextNode = temp.next;
                if(temp.data == nthdata) {
                    temp.next = newNode;
                    newNode.next = nextNode;
                }
//                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
        }
    }

    //Method to Get Size of Linked List
    public int size() {
        int count = 0;
        if(head == null) {
            return count;
        } else {
            Node temp = head;
            while(temp != null) {
                count ++;
                temp = temp.next;
            }
        }
        return count;
    }

    //Method to Delete Given Node from Linked List
    public void deleteNode(int data) {
        if(head == null) {
            System.out.println("Linked List is Empty.");
        } else {
            if(data == head.data) {
                head = head.next;
            } else {
                Node prevNode = head;
                Node temp = head.next;
                while(prevNode != null) {
                    if(temp.data == data) {
                        prevNode.next = temp.next;
                    }
                    prevNode = prevNode.next;
                    temp = temp.next;
                }
            }
        }
    }

    //Display Node in Linked List
    public void showLinkedList() {
        if(head == null) {
            System.out.println("Linked List is Empty.");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
        }
    }
}
