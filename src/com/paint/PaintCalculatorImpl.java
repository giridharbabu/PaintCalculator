package com.paint;

import java.util.ArrayList;

public class PaintCalculatorImpl implements PaintCalculator {

	public final double AREA_PER_GALLON = 400.00;

	@Override
	public double getPaintGallons(RoomDetails roomDetails) {
		int room = getAreaToPaint(roomDetails.getWallHeight(), roomDetails.getWallWidth(), roomDetails.getWallLength());

		room = room - getNonPaintArea(roomDetails.getNonPaintArea());
		room = room * 12;
		double gallons = (double) (room / AREA_PER_GALLON);
		return gallons;
	}

	public int getAreaToPaint(int height, int width, int length) {
		int walls = 2 * (length * height) + 2 * (width * height);
		int ceiling = 1 * width;
		int room = walls + ceiling;
		return room;
	}

	public int getNonPaintArea(ArrayList nonPaintAreas) {

		int npArea = 0;
		for (int i = 0; i < nonPaintAreas.size(); i++) {

			NonPaintAreaDetails area = (NonPaintAreaDetails) nonPaintAreas.get(i);
			npArea = npArea + (area.getNonPaintHeight() * area.getNonPaintLength());
		}
		return npArea;
	}

}
