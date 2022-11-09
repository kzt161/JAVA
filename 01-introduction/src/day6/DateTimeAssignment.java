package day6;

import java.time.DayOfWeek;
import java.time.temporal.ChronoField;
import java.time.LocalDate;

public class DateTimeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
	      DayOfWeek day = DayOfWeek.of(date.get(ChronoField.DAY_OF_WEEK));
	      switch (day) {
	         case SATURDAY:
	            System.out.println(DayOfWeek.of(date.get(ChronoField.DAY_OF_WEEK)));
	            System.out.println("********");
	            System.out.println("Today is my Holiday!");
	            break;
	         case SUNDAY:
	        	 System.out.println(DayOfWeek.of(date.get(ChronoField.DAY_OF_WEEK)));
		            System.out.println("********");
		            System.out.println("Today is my Holiday!");
		            break;
	         default:
	            System.out.println(DayOfWeek.of(date.get(ChronoField.DAY_OF_WEEK)));
	            System.out.println("********");
	            System.out.println("I have no time. I am studying.");
	            break;
	         
	      }
	   }
	}

