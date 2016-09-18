package com.paint;

public class PaintFactory {

	private static PaintFactory instance = null;

	private PaintFactory() {

	}

	public static synchronized PaintFactory getInstance() {

		if (instance == null) {
			instance = new PaintFactory();
		}
		return instance;

	}

	public static PaintCalculator getPaintCalculator(String shape) {
		PaintCalculator paintCalculator = null;
		if (shape.equalsIgnoreCase("rectangle")) {
			paintCalculator = new PaintCalculatorImpl();
		}
		return paintCalculator;

	}
}
