package Coding;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime now= LocalDateTime.now();
		System.out.println("Before Formatting:"+ now);
		
		DateTimeFormatter Format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:MM:SS");
		String FormatDateTime=now.format(Format);
		System.out.println("After Formatting:"+ now);
		
		
		System.out.println(LocalTime.now().getHour());
		
		
		int curtTime=LocalTime.now().getHour();
	
		if(curtTime<12)
		{
			System.out.println("Good Morning");
		}
		else
			if(curtTime >=12 && curtTime<=16)
			{
				System.out.println("Good Afternoon");
			}
			
			else if(curtTime>=16 && curtTime<= 18)
			{
				System.out.println("Good Evening");
			}
			else if(curtTime>=18 && curtTime<=23)
			{
				System.out.println("Good Night");
			}
		
	}		

}
