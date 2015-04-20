package me.MAWood.RaidModeler;

import me.MAWood.RaidModeler.RaidMembers.*;

public class RaidModeler {
	
	static final String capacityUnit = "GB";
	static final String speedUnit = "MB/s";

	public static void main(String[] args) {
		// Planned input format 0{5{[1000,100,80][1000,100,80][1000,100,80]}5{[1000,100,80][1000,100,80][1000,100,80]}}
		// That statement would define a raid 0 array or two raid 5 arrays each consisting of three 1tb HDD 100 MB/s read 80 MB/s write.
		
		
	}
	
	void outputResult(RaidMember r) {
		System.out.println("Members capacity speed: " + r.getCapacity() + " " + capacityUnit);
		System.out.println("Members read speed: " + r.getReadSpeed() + " " + speedUnit);
		System.out.println("Members write speed: " + r.getWriteSpeed() + " " + speedUnit);
	}

}
