import java.util.*;
public class AssassinManager {
	
	AssassinNode aliveFront;
	AssassinNode deadFront;
	private int size;
	
	AssassinManager(List<String> names){
		
		if(names.isEmpty()) {
			throw new IllegalArgumentException("good");
		}
		size = names.size();
		aliveFront = null;
		
		for(int i = size - 1; i >= 0; i--) {
			aliveFront = new AssassinNode(names.get(i), aliveFront);
		}
		
		AssassinNode current = aliveFront;
		
		while(current.next != null) {
			current = current.next;
		}
		
		current.next = aliveFront;
	}
	
	void printKillRing() {
		
		AssassinNode current = aliveFront;
		for(int i = 0; i < size; i++) {
			
			System.out.println(current.name + " is killing " + current.next.name);
			current = current.next;
		}
		
	}
	
	void printGraveyard() {
		
		AssassinNode current = deadFront;
		while(current.next != null) {
			System.out.println(current.killer + " killed " + current.name);
		}
	}
	
	boolean graveYardContains(String name) {
		
		AssassinNode current = deadFront;
		for(int i = 0; i < size; i++) {
			
			if(current.name.equals(name)) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	boolean killRingContains(String name) {
		AssassinNode current = aliveFront;
		for(int i = 0; i < size; i++) {
			
			if(current.name.equals(name)) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	boolean gameOver() {
		if(size == 1) {
			return true;
		}
		return false;
	}
	
	void kill(String name) {
		
	}
}
