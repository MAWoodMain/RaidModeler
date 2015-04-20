package me.MAWood.RaidModeler.RaidMembers;

public class Raid6 extends RaidArray {

	public Raid6() {
		super();
	}

	@Override
	public int getCapacity() {
		if (members.size() > 3) {
		return getMinMemberCapacity() * (members.size() -2);
		} else {
			return -1;
		}
	}

	@Override
	public int getReadSpeed() {
		if (members.size() > 3) {
		return getMinMemberReadSpeed() * members.size();
		} else {
			return -1;
		}
	}

	@Override
	public int getWriteSpeed() {
		if (members.size() > 3) {
		return getMinMemberWriteSpeed() * (members.size() -2);
		} else {
			return -1;
		}
	}

}
