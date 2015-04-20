package me.MAWood.RaidModeler;

import me.MAWood.RaidModeler.RaidMembers.*;

public class RaidModeler {
	
	static final String capacityUnit = "GB";
	static final String speedUnit = "MB/s";

	public static void main(String[] args) {
		// Planned input format 
		// 0{5{[1000,100,80][1000,100,80][1000,100,80]}5{[1000,100,80][1000,100,80][1000,100,80]}}
		// this will create this structure:
		// Raid 0:
		//    Raid 5:
		//       HDD: 1000 GB read: 100 MB/s write 80 MB/s
		//       HDD: 1000 GB read: 100 MB/s write 80 MB/s
		//       HDD: 1000 GB read: 100 MB/s write 80 MB/s
		//    Raid 5:
		//       HDD: 1000 GB read: 100 MB/s write 80 MB/s
		//       HDD: 1000 GB read: 100 MB/s write 80 MB/s
		//       HDD: 1000 GB read: 100 MB/s write 80 MB/s
		
		// use recursive method to break down a group:
		
		// Raid0 r = new Raid0();
		// r.addRaidMember(process("5{[1000,100,80][1000,100,80][1000,100,80]}"));
		// r.addRaidMember(process("5{[1000,100,80][1000,100,80][1000,100,80]}"));
		// return r;
		
		// Raid5 r = new Raid5();
		// r.addRaidMember("[1000,100,80]");
		// r.addRaidMember("[1000,100,80]");
		// r.addRaidMember("[1000,100,80]");
		// return r;
		
		// Raid5 r = new Raid5();
		// r.addRaidMember("[1000,100,80]");
		// r.addRaidMember("[1000,100,80]");
		// r.addRaidMember("[1000,100,80]");
		// return r;
		
		// 6x :
		
		// Drive r = new Drive(1000, 100, 80);
		// return r;
		
		
	}
	
	RaidMember process(String input) {
		
		return null;		
	}
	
	void outputResult(RaidMember r) {
		System.out.println("Members capacity speed: " + r.getCapacity() + " " + capacityUnit);
		System.out.println("Members read speed: " + r.getReadSpeed() + " " + speedUnit);
		System.out.println("Members write speed: " + r.getWriteSpeed() + " " + speedUnit);
	}

}