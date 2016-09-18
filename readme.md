PaintCalculatorRunner.java is the main class. It calls TestPaintCalculator.java which contains the test data for room, windows, door and trim dimensions. The logic is as follows
1. calculate room surface are based on the dimensions.
2. subtract door,trim,windows surface area from the room surface area. 
3. assumption is 400 sq ft can be painted with a gallon.

steps to run.

javac PaintCalculatorRunner.java
java PaintCalculatorRunner
