package com.cg;

import java.util.*;

public class HotelReservation {

	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation System");
		Hotels Lakewood = new Hotels("Lakewood",110);
		Hotels Bridgewood = new Hotels("Bridgewood",160);
		Hotels Ridgewood = new Hotels("Ridgewood",220);
		
		List<Hotels> hotelList = new ArrayList<>();
		
		hotelList.add(Lakewood);
		hotelList.add(Bridgewood);
		hotelList.add(Ridgewood);
		System.out.println(hotelList);
	}
}
