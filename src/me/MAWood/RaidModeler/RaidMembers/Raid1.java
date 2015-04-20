package me.MAWood.RaidModeler.RaidMembers;

public class Raid1 extends RaidArray {

	public Raid1() {
		super();
	}

	@Override
	public int getCapacity() {
		if (members.size() >1) {
		return getMinMemberCapacity();
		} else {
			return -1;
		}
	}

	@Override
	public int getReadSpeed() {
		if (members.size() >1) {
		return getMinMemberReadSpeed() * members.size();
		} else {
			return -1;
		}
	}

	@Override
	public int getWriteSpeed() {
		if (members.size() >1) {
		return getMinMemberWriteSpeed();
		} else {
			return -1;
		}
	}

}
