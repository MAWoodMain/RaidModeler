package me.MAWood.RaidModeler.RaidMembers;

public class Raid5 extends RaidArray {

	public Raid5() {
		super();
	}

	@Override
	public int getCapacity() {
		if (members.size() > 2) {
		return getMinMemberCapacity() * (members.size() -1);
		} else {
			return -1;
		}
	}

	@Override
	public int getReadSpeed() {
		if (members.size() > 2) {
		return getMinMemberReadSpeed() * members.size();
		} else {
			return -1;
		}
	}

	@Override
	public int getWriteSpeed() {
		if (members.size() > 2) {
		return getMinMemberWriteSpeed() * (members.size() -1);
		} else {
			return -1;
		}
	}

}
