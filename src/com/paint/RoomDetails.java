package com.paint;

import java.util.ArrayList;

public class RoomDetails {

	private int wallHeight,wallWidth,  wallLength=0;

	private ArrayList nonPaintArea= new ArrayList();
	
	public ArrayList getNonPaintArea() {
		return nonPaintArea;
	}

	public void setNonPaintArea(ArrayList nonPaintArea) {
		this.nonPaintArea = nonPaintArea;
	}

	public int getWallHeight() {
		return wallHeight;
	}

	public void setWallHeight(int wallHeight) {
		this.wallHeight = wallHeight;
	}

	public int getWallWidth() {
		return wallWidth;
	}

	public void setWallWidth(int wallWidth) {
		this.wallWidth = wallWidth;
	}

	public int getWallLength() {
		return wallLength;
	}

	public void setWallLength(int wallLength) {
		this.wallLength = wallLength;
	}

	
}