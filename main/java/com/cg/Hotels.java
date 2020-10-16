package com.cg;

public class Hotels {

	String hotelName;
	int weekdayRatesForRegulars;
	int weekendRatesForRegulars;
	int ratings;
	
	public Hotels(String hotelName, int weekdayRatesForRegulars, int weekendRatesForRegulars,int ratings) {
		this.hotelName = hotelName;
		this.weekdayRatesForRegulars = weekdayRatesForRegulars;
		this.weekendRatesForRegulars = weekendRatesForRegulars;
		this.ratings = ratings;
	}
}
