package day7;

public class StringAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Inherited Will, The Destiny Of Age, The Dreams Of Its People.I'm gonna be the world's greatest swordsman... So, I can't afford to lose!";
		String [] arr = str.split(" ");
		int count = str.split("[!?.:]+").length;
		
		System.out.println("total words: " + arr.length);
		System.out.println("Number of Sentence: " + count);
	}

}
