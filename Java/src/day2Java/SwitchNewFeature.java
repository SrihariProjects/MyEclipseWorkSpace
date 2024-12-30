package day2Java;

public class SwitchNewFeature {

	public static void main(String[] args) {

		String day="Sunday";
		String res="";
		switch(day) {
		case "Saturday","Sunday" ->res ="6am";
		case "Monday" ->System.out.println("8am");
//		case "Tuesday" : yield "8am";
		default -> System.out.println("7am");
		};
		System.out.println(res);
	}

}
