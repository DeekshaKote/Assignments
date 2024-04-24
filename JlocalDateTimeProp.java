package Coding;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import org.junit.jupiter.api.Test;


class JlocalDateTimeProp {

	@Test
	void CheckGreeting() throws IOException {
		LocalDateTime now= LocalDateTime.now();
		System.out.println("Before Formatting: " + now);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatDateTime = now.format(format);
		System.out.println("AfterFormatting: " + formatDateTime);
		
		Properties p = new Properties();
		
		FileInputStream fis = new FileInputStream("D://Selenium//UST Project//Config.properties");
		p.load(fis);
		
		String ExpectedGreet = p.getProperty("ExpectedGreet");
		System.out.println(ExpectedGreet);
		String ExpectedGreeted = ExpectedGreet;
		System.out.println("ExpectedGreet"+ExpectedGreet);
		
		String ActualGreeting = null;
		int T= LocalTime.now().getHour();	
		System.out.println(T);
		if(T<12)
		{
		ActualGreeting = "GoodMorning";
			System.out.println(ActualGreeting);
	
	}
		else 
			if(T>12 && T<=15)
			{
		ActualGreeting = "GoodAfternoon";
		System.out.println(ActualGreeting);
			}
			else 
			
	if(T>15 && T<19)
				{
			ActualGreeting = "GoodEvening";
			System.out.println(ActualGreeting);
				}
assertEquals(ExpectedGreeted, ActualGreeting);
	}

	
}