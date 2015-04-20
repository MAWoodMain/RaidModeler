package me.MAWood.RaidModeler;

import me.MAWood.RaidModeler.RaidMembers.*;

public class RaidModeler {

	public static void main(String[] args) {
		String capacityUnit = "GB";
		String speedUnit = "MB/s";
		
		// RAID 50 with 8 4tb drives
		
		Drive HDD = new Drive(4000, 100, 80);
		
		Raid0 r1 = new Raid0();
		
		Raid5 r2 = new Raid5();
		r2.addRaidMember(HDD);
		r2.addRaidMember(HDD);
		r2.addRaidMember(HDD);
		r2.addRaidMember(HDD);
		
		Raid5 r3 = new Raid5();
		r3.addRaidMember(HDD);
		r3.addRaidMember(HDD);
		r3.addRaidMember(HDD);
		r3.addRaidMember(HDD);
		
		r1.addRaidMember(r2);
		r1.addRaidMember(r3);
		
		System.out.println("Members capacity speed: " + r1.getCapacity() + " " + capacityUnit);
		System.out.println("Members read speed: " + r1.getReadSpeed() + " " + speedUnit);
		System.out.println("Members write speed: " + r1.getWriteSpeed() + " " + speedUnit);
	}

}
