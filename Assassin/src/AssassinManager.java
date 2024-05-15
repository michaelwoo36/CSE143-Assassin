import java.util.*;
public class AssassinManager {
	
	AssassinNode aliveFront;
	AssassinNode deadFront;
	private int sizeAlive;
	private int sizeDead;
	
	AssassinManager(List<String> names){
		
		if(names.isEmpty()) {
			throw new IllegalArgumentException("good");
		}
		
		sizeAlive = names.size();
		aliveFront = null;
		
		for(int i = sizeAlive - 1; i >= 0; i--) {
			aliveFront = new AssassinNode(names.get(i), aliveFront);
		}
	}
	
	void printKillRing() {
		
		AssassinNode current = aliveFront;
		while(current.next != null) {
			System.out.println(current.name + " is killing " + current.next.name);
			current = current.next;
		}
		System.out.println(current.name + " is killing " + aliveFront.name);
		
	}
	
	void printGraveyard() {
		
		AssassinNode current = deadFront;
		while(current.next != null) {
			
			System.out.println(current.killer + " killed " + current.name);
			current = current.next;
		}
		
	}
	
	boolean graveYardContains(String name) {
		
		AssassinNode current = deadFront;
		for(int i = 0; i < sizeDead; i++) {
			
			if(current.name.equals(name)) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	boolean killRingContains(String name) {
		AssassinNode current = aliveFront;
		for(int i = 0; i < sizeAlive; i++) {
			
			if(current.name.equals(name)) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	boolean gameOver() {
		if(sizeAlive == 1) {
			return true;
		}
		return false;
	}
	
	void kill(String name) {
		
		AssassinNode current = aliveFront;
		while(current.next != null) {
			
			if(current.next.name.equals(name)) {
				
				deadFront = current.next;
				deadFront.killer = current.name;
				current.next = current.next.next;
				break;
			}
			
			current = current.next;
		}
		
		if(aliveFront.name.equals(name)) {
			
			deadFront = aliveFront;
			deadFront.killer = current.name;
			aliveFront = aliveFront.next;
		}
		
		
	}
}
