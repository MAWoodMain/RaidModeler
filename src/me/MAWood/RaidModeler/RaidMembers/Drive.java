package me.MAWood.RaidModeler.RaidMembers;

public class Drive extends RaidMember {

	int capacity, read, write;
	
	public Drive(int cap, int read, int write) {
		this.capacity = cap;
		this.read = read;
		this.write = write;
	}
	
	@Override
	int getCapacity() {
		return this.capacity;
	}

	@Override
	int getReadSpeed() {
		return this.read;
	}

	@Override
	int getWriteSpeed() {
		return this.write;
	}

}
