package me.MAWood.RaidModeler.RaidMembers;

public class Raid0 extends RaidArray {

	public Raid0() {
		super();
	}
	
	@Override
	public int getCapacity() {
		int min = getMinMemberCapacity();
		return min * members.size();
	}

	@Override
	public int getReadSpeed() {
		int min = getMinMemberReadSpeed();
		return min * members.size();
	}

	@Override
	public int getWriteSpeed() {
		int min = getMinMemberWriteSpeed();
		return min * members.size();
	}

}
