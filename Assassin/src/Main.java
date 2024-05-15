import java.util.*;

public class Main {

	public static void main(String[] args) {
		List <String> testList = Arrays.asList("Alex", "Benjamin", "Cade");	
		AssassinManager test = new AssassinManager(testList);
		test.printKillRing();
		test.kill("Alex");
		test.kill("Cade");
		System.out.println();
		test.printKillRing();
		System.out.println();
		test.printGraveyard();
		System.out.println("alldone");
	}

}
