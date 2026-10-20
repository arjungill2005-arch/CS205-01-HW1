package edu.monmouth.vehicle;

public class VehicleNode {
    private Vehicle vehicle;
    private VehicleNode next;

    public VehicleNode(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.next = null;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public VehicleNode getNext() {
        return next;
    }

    public void setNext(VehicleNode next) {
        this.next = next;
    }

    public String toString() {
        return "(" + vehicle + ")";
    }


}
