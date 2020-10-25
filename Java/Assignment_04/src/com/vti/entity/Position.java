package com.vti.entity;

public class Position {
	short positionID;
	enum_position positionName;
	
	
	public short getPositionID() {
		return positionID;
	}
	public void setPositionID(short positionID) {
		this.positionID = positionID;
	}
	public enum_position getPositionName() {
		return positionName;
	}
	public void setPositionName(enum_position positionName) {
		this.positionName = positionName;
	}
	
}
