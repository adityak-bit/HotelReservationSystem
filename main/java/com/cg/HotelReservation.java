package com.cg;

import java.text.ParseException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class HotelReservation {

	public static Scanner in;

	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation System");

		Hotels Lakewood = new Hotels("Lakewood", 110, 90, 3);
		Hotels Bridgewood = new Hotels("Bridgewood", 150, 50, 4);
		Hotels Ridgewood = new Hotels("Ridgewood", 220, 150, 5);

		List<Hotels> hotelList = new ArrayList<>();

		hotelList.add(Lakewood);
		hotelList.add(Bridgewood);
		hotelList.add(Ridgewood);

		System.out.println("Hotel Ratings added successfully");
	}
}
