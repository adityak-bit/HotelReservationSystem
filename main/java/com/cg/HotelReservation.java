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
		TreeMap<Integer, Integer> totalPrice = new TreeMap<>();

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
		System.out.println("TotalDays: " + totalDays);

		for (Hotels h : hotelList) {
			int price = 0;

			for (int i = 0; i < totalDays; i++) {
				LocalDate dateIn = LocalDate.parse(checkInDate, dtf);
				LocalDate date = dateIn.plusDays(i);
				DayOfWeek day = date.getDayOfWeek();
				if (day == DayOfWeek.SUNDAY || day == DayOfWeek.SATURDAY) {
					price = price + h.weekendRatesForRegulars;
				} else {
					price = price + h.weekdayRatesForRegulars;
				}
			}
			totalPrice.put(price, h.ratings);
		}

		System.out.println("Cheapest hotel: " + totalPrice.firstEntry());
	}
}
