package com.example.mountainresortandspa;

// Imports
import java.util.ArrayList;
import java.util.List;

public class MountainResortAndSpa {

	// Fields
	private String name;
	private int capacity;
	private List<Reservation> reservations;

	// Constructor
	public MountainResortAndSpa(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
		this.reservations = new ArrayList<>();
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	// Methods
	public void addReservation(Reservation reservation) {
		if (this.reservations.size() < this.capacity) {
			this.reservations.add(reservation);
		} else {
			System.out.println("Sorry, no more reservations are available at this time.");
		}
	}

    public void removeReservation(Reservation reservation) {
		if (this.reservations.contains(reservation)) {
			this.reservations.remove(reservation);
		} else {
			System.out.println("This reservation does not exist.");
		}
	}
	
	public void printReservations() {
		System.out.println("Mountain Resort & Spa Reservations:");
		for (Reservation reservation : this.reservations) {
			System.out.println(reservation);
		}
	}
	
	public int getNumOfReservations() {
		return this.reservations.size();
	}
	
	public double getTotalPrice() {
		double total = 0;
		for (Reservation reservation : this.reservations) {
			total += reservation.getPrice();
		}
		return total;
	}
	
	@Override
    public String toString() {
		return this.name;
	}

}