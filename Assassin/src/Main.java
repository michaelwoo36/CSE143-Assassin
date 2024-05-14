import java.util.*;

public class Main {

	public static void main(String[] args) {
		List <String> testList = Arrays.asList("Michael", "Benjamin");	
		AssassinManager test = new AssassinManager(testList);
		test.printKillRing();
		System.out.println(test.killRingContains("Benjamin"));
	}

}
