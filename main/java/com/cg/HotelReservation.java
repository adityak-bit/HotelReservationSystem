package com.cg;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class HotelReservation {

	
	public static Scanner in;

	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation System");

		Hotels Lakewood = new Hotels("Lakewood", 110);
		Hotels Bridgewood = new Hotels("Bridgewood", 160);
	    Hotels Ridgewood = new Hotels("Ridgewood", 220);
	    
		List<Hotels> hotelList = new ArrayList<>();
		List<Integer> totalPrice = new ArrayList<>();
		
		hotelList.add(Lakewood);
		hotelList.add(Bridgewood);
		hotelList.add(Ridgewood);

		in = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMMyyyy");
		System.out.println("Enter checkInDate as ddMMyyyy: ");
		String checkInDate = in.nextLine();
		System.out.println("Enter checkOutDate as ddMMyyyy: ");
		String checkOutDate = in.nextLine();

		
	    LocalDate date1 = LocalDate.parse(checkInDate, dtf);
		LocalDate date2 = LocalDate.parse(checkOutDate, dtf);
		int difference = (int) ChronoUnit.DAYS.between(date1, date2);
		int totalDays = difference + 1;
		System.out.println("TotalDays: "+totalDays);
		
		for(Hotels h : hotelList) {
			totalPrice.add(totalDays*h.weekdayRatesForRegulars);
		}
		
		Collections.sort(totalPrice);
		System.out.println("The cheapest hotel for given date range is: "+hotelList.get(0).hotelName+" ,Total price: "+totalPrice.get(0));
	}
}
