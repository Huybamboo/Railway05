package com.vti.entity;

public class TypeQuestion {
	byte typeID;
	enum_type_qtion typeName;
	
	public byte getTypeID() {
		return typeID;
	}
	public void setTypeID(byte typeID) {
		this.typeID = typeID;
	}
	public enum_type_qtion getTypeName() {
		return typeName;
	}
	public void setTypeName(enum_type_qtion typeName) {
		this.typeName = typeName;
	}
}
