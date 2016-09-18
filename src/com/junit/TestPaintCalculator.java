package com.junit;

import java.util.ArrayList;

import org.junit.Test;

import com.paint.NonPaintAreaDetails;
import com.paint.PaintCalculator;
import com.paint.PaintFactory;
import com.paint.RoomDetails;

public class TestPaintCalculator {

	@Test
	   public void testPaintCalculator() {

		RoomDetails roomDetails = new RoomDetails();
		
		roomDetails.setWallHeight(6);
		roomDetails.setWallLength(10);
		roomDetails.setWallWidth(5);
		
		ArrayList nonPaintList = new ArrayList();
		
		NonPaintAreaDetails window = new NonPaintAreaDetails();
		window.setNonPaintHeight(4);
		window.setNonPaintLength(8);
		nonPaintList.add(window);
		
		NonPaintAreaDetails door = new NonPaintAreaDetails();
		door.setNonPaintHeight(4);
		door.setNonPaintLength(2);
		nonPaintList.add(door);

		roomDetails.setNonPaintArea(nonPaintList);
		
	      
	      PaintCalculator paintCalculator = PaintFactory.getInstance().getPaintCalculator("rectangle");

	      double gallons = paintCalculator.getPaintGallons(roomDetails);
	      System.out.println("Total Gallons needed :: " + gallons + "gallons");
	      
	      
	   }
	
	
	
	//

	//area.getPaintGallons(area);
}
