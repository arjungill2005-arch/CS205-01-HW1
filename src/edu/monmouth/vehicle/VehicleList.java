package edu.monmouth.vehicle;

public class VehicleList {

    private VehicleNode head;

    public VehicleList() {
        this.head = null;
    }

    public void insert(Vehicle v) {
        VehicleNode newNode = new VehicleNode(v);
        newNode.setNext(head);
        head = newNode;
    }

    public void insertEnd(Vehicle v) {
        VehicleNode newNode = new VehicleNode(v);
        if (head == null) {
            head = newNode;
        } else {
            VehicleNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public Vehicle first() {
        if (isEmpty()) {
            return null;
        }
        return head.getVehicle();
    }

    public Vehicle last() {
        if (isEmpty()) {
            return null;
        }
        VehicleNode current = head;
        while(current.getNext() != null) {
            current = current.getNext();
        }
        return current.getVehicle();
    }

    public Vehicle removeFirst() {
        if (head == null) {
            return null;
        }
        Vehicle firstVehicle = this.first();
        head = head.getNext();

        return firstVehicle;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int count = 0;
        VehicleNode current = head;
        while(current != null) {
            count += 1;
            current = current.getNext();
        }
        return count;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        VehicleNode current = head;
        while(current != null) {
            sb.append(current);
            sb.append(" --> ");
            current = current.getNext();
        }
        return sb.toString();
    }




}
