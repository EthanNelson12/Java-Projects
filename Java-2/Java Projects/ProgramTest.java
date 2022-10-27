
	import java.util.Scanner;
public class ProgramTest 
{
	public static void main(String[] args)
	{
		Appointment[] appointment = new Appointment[6];
		appointment[0] = new OneTime(25, 12, 2017, "Root Canal");
		appointment[1] = new Monthly(25, 12, 2017, "Teeth Cleaning");
		appointment[2] = new Daily(25, 12, 2017, "Filling");
		appointment[3] = new OneTime(13, 12, 2017, "Crown");
		appointment[4] = new Monthly(15, 12, 2017, "Dentures");
		appointment[5] = new Daily(25, 2, 2017, "Cleaning");
		
		Scanner in = new Scanner(System.in);
		boolean yes = true;
		while(yes)
		{	
			System.out.println("Please input the day of the appointment (1-31) ");
			int day = in.nextInt();
			System.out.println("Please input the month of the appointment (1-12) ");
			int month = in.nextInt();
			System.out.println("Please input the year of the appointment ");
			int year = in.nextInt();
			System.out.println("Would you like to check for Monthy, Daily or an exact date?\nPress D for Daily:\nPress M for Monthly:\nPress E for an Exact Date:\nPress Q to quit");
			String input = in.next();
			for (int i = 0; i < 6; i++) 
			{
				switch(input.toUpperCase())
				{
					case "D":
						
					if(appointment[i] instanceof Daily)
					{
						Daily o = (Daily)appointment[i];
						if(o.occursOn(day, 0, 0))
						{
						
							System.out.println("\n *********** Daily Appointment ***********");
							System.out.println("You have a "+appointment[i].toString()+" appointment on: "+appointment[i].getDay()+" "+appointment[i].getMonth()+" "+appointment[i].getYear());
							System.out.println();
						}
							else
							{
								System.out.println("No appointments on that day");
							}
					}
							break;

							case"M":
							
							if(appointment[i] instanceof Monthly)
							{
								
								Monthly m = (Monthly)appointment[i];
								if(m.occursOn(0, month, 0))
								{																				
									System.out.println("\n *********** Monthly Appointment ***********");
									System.out.println("You have a "+appointment[i].toString()+" appointment on: "+appointment[i].getDay()+" "+appointment[i].getMonth()+" "+appointment[i].getYear());
									
								}
								else
								{												
									System.out.println("No appointments that Month");					
								}
							}	
							break;
							case "E":
							if(appointment[i] instanceof OneTime)
							{
							
								OneTime o = (OneTime)appointment[i];
								if(o.occursOn(day, month, year))
								{							
									System.out.println("\n *********** Onetime Appointment ***********");
									System.out.println("You have a "+appointment[i].toString()+" appointment on: "+appointment[i].getDay()+" "+appointment[i].getMonth()+" "+appointment[i].getYear());
								}
								else
								{
									System.out.println("No appointment on that date");
								}
								
							}
							case "Q":
							yes = false;
							break;
							
							
				}
					
			}
			
		}
		System.out.println("Exiting Program...");
	}

}
