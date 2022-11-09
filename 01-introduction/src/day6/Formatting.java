package day6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Formatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//predefinedConstant();
		
		//customPattern();
		
		localizedStyle();
	}

	private static void localizedStyle() {
		// TODO Auto-generated method stub
		DateTimeFormatter f1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println("-----LocalDate-----");
		System.out.println("Default: " + date);
		System.out.println("Long Format: " + date.format(f1));
		System.out.format("Long Format, %s\n", date.format(f1));
		System.out.println("Medium Format: " + date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
		System.out.println("Short Format: " + date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
		System.out.println("Full Format: " + date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
		
		System.out.println("-----LocalTime-----");
		System.out.println("Default: " + time);
		System.out.println("Medium Format: " + time.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
		System.out.println("Short Format: " + time.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
		
		System.out.println("-----Local Date Time-----");
		System.out.println("Medium Format: " + dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
		System.out.println("Short Format: " + dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
	}

	private static void customPattern() {
		// TODO Auto-generated method stub
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMMM dd yyyy");
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh-m-ss a");
		DateTimeFormatter f3 = DateTimeFormatter.ofPattern("MMMM dd yyyy 'at' hh:mm:ss");
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println("Default Date: " + date);
		System.out.println("Format Date: " + date.format(f1));
		System.out.println("Default Time: " + time);
		System.out.println("Format Time" + time.format(f2));
		System.out.println("Default Date & Time: " + dateTime);
		System.out.println("Format Date & Time: " + dateTime.format(f3));
		
	}

	private static void predefinedConstant() {
		// TODO Auto-generated method stub
		DateTimeFormatter f1 = DateTimeFormatter.BASIC_ISO_DATE;
		DateTimeFormatter f2 = DateTimeFormatter.ISO_LOCAL_TIME;
		DateTimeFormatter f3 = DateTimeFormatter.ISO_DATE_TIME;
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		
		String s1 = date.format(f1);
		String s2 = f1.format(date);
		
		System.out.println("Default date: " + date);
		System.out.println("ISO format: "   + s1);
		System.out.println("ISO format: "   + s2);
		
		System.out.println("Default time: " + time);
		System.out.println("ISO format: "   + time.format(f2));

		System.out.println("Default date & time: " + dateTime);
		System.out.println("ISO format: " + f3.format(dateTime));
	}

}
