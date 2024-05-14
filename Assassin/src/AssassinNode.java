
public class AssassinNode {
	
	
	 public String name; // this person's name
	 public String killer; // name of who killed this person
	 public AssassinNode next; // next node in the list
	 // constructs a node with the given name and a null link
	 public AssassinNode(String name) {
	 this(name, null);
	 }
	 // constructs a node with the given name and link
	 public AssassinNode(String name, AssassinNode next) {
	 this.name = name;
	 this.killer = null;
	 this.next = next;
	 }
}

