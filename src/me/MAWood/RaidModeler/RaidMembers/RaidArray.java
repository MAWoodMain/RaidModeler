package me.MAWood.RaidModeler.RaidMembers;

import java.util.ArrayList;
import java.util.List;

public abstract class RaidArray extends RaidMember {
	List<RaidMember> members;

	RaidArray() {
		members = new ArrayList<RaidMember>();
	}
	
	public void addRaidMember(RaidMember member) {
		members.add(member);
	}
	
	int getMinMemberCapacity() {

		int min = 0;
		for  (RaidMember member : members) {
			if (min == 0) {
				min = member.getCapacity();
			} else {
				if (member.getCapacity() < min) min = member.getCapacity();
			}
		}
		return min;
	}
	
	int getMinMemberReadSpeed() {

		int min = 0;
		for  (RaidMember member : members) {
			if (min == 0) {
				min = member.getReadSpeed();
			} else {
				if (member.getReadSpeed() < min) min = member.getReadSpeed();
			}
		}
		return min;
	}
	
	int getMinMemberWriteSpeed() {

		int min = 0;
		for  (RaidMember member : members) {
			if (min == 0) {
				min = member.getWriteSpeed();
			} else {
				if (member.getWriteSpeed() < min) min = member.getWriteSpeed();
			}
		}
		return min;
	}

}
