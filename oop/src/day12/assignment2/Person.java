package day12.assignment2;

import java.util.Arrays;

public class Person {
	//field
	private String name;
	private String nrcno;
	private String address;
	private String phone;
	
	//constructors
	public Person(String name, String nrcno, String address, String phone) {
		this.name = name;
		this.nrcno =  nrcno;
		this.address = address;
		this.phone = phone;	
	}
	
	//getters/setters
	public String getname() {
		return name;
	}
	public String getnrcno() {
		return nrcno;
	}
	public String getaddress() {
		return address;
	}
	public String getphone() {
		return phone;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setNrcno(String nrcno) {
		this.nrcno = nrcno;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//methods
	public void showInfo() {
		System.out.println("Name: " + name);
		System.out.println("NRCNO: " + nrcno);
		System.out.println("Address: " + address);
		System.out.println("Phone: " + phone);
	}
	public void IdentificationInfo() {
		
		String[] divisions = {"Kachin", "Kayar", "Kayin", "Chin", "Sagaing", "Tanintharyi", "Bago", "Magway", "Mandalay", "Mon", "Rakhing", "Yangon", "Shan", "Ayeyawady"};
		
		int index1 = nrcno.indexOf("/");
		int index2 = nrcno.indexOf("(");
		int index3 = nrcno.indexOf(")");
		int index4 = nrcno.length();
		
		String nrcD = null;
		int inputD = Integer.parseInt(nrcno.substring(0, index1));
		for(int i =0; i < divisions.length; i++) {
			if((inputD - 1) == Arrays.asList(divisions).indexOf(divisions[i])) {
				nrcD = divisions[i];
				break;
			}
		}
		
		String nrcC = nrcno.substring(index1 + 1, index2);
		String nrcNum = nrcno.substring(index3 + 1, index4);
		
		System.out.println("Division/State: " + nrcD);
		System.out.println("City: " + nrcC);
		System.out.println("NRC number: " + nrcNum);
		
		
	}
}
