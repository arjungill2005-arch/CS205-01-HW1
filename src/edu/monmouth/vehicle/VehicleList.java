package edu.monmouth.vehicle;

public class VehicleList {

    private VehicleNode head;

    public VehicleList() {
        this.head = null;
    }

    public void insert(Vehicle v) {
        VehicleNode newNode = new VehicleNode(v); //
        newNode.setNext(head);
        head = newNode;
    }

    public void insertEnd(Vehicle v) {
        VehicleNode newNode = new VehicleNode(v);
        if (head == null) {
            head = newNode;
        } else {
            // finding the last node
            VehicleNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode); // the newNode is being placed to the next of our last node
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
        while(current != null) {  // what's at the current stage (not next)
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

    public Vehicle removeLast() {
        VehicleNode current = head;
        VehicleNode previous = null;

        if (head == null) {
            return null;
        }
        while (current.getNext() != null) {
            previous = current;
            current = current.getNext();

        }
        if (previous != null) {
            previous.setNext(null);
        } else {
            head = null;
        }

        return current.getVehicle();
    }

    public boolean remove(Vehicle v) {
        VehicleNode current = head;
        VehicleNode previous = null;

        // when list is empty, return false
        if (head == null) {
            return false;
        }
        while (current != null && !current.getVehicle().equals(v)) {
            previous = current;
            current = current.getNext();
        }
        // when v isn't found, return false
        if (current == null) {
            return false;
        }

        if (previous != null) {
            // remove any node (not the first)
            previous.setNext(current.getNext());
        } else {
            // remove the first node (point head to the node after)
            head = current.getNext();
        }

        return true;


    }


}
