/*
(Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30
seconds. Write a program that displays the average speed in miles per hour. (Note
that 1 mile is 1.6 kilometers.)
*/
public class Exercise_01_10 {
	public static void main(String[] args) {
		
		/* 
		--> 1 mile = 1.609344 km; 
		    we need to transform the km in miles:
		    14km / 1.609344 = A miles in 45.5 minutes 
		    (45 minutes and 30 seconds is: 45.5 given that 1 minute is 60 seconds)
	
		--> we need to calculate the resulted miles for 60 minutes (miles per hour)
		    (A * 60) / 45.5 
		*/
		
		System.out.println(((14 /1.609344) * 60)/45.5); 
	}
}
