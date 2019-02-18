public class Exercise_01_11 {
	public static void main(String[] args) {
		System.out.println("Population projection");
		System.out.println("Current population: 312032486");
		System.out.println("One birth every 7 seconds.");
		System.out.println("One death every 13 seconds.");
		System.out.println("One new immigrant every 45 seconds.");
		System.out.println("Yearly Population projection formula: ");
		System.out.println("Current population + ((births per year)");
		System.out.println("                   - (deaths per year)");
		System.out.println("                   + (new immigrants per year))");
		System.out.println("                   * year.");
		System.out.println("Year 1 projection: ");
		System.out.println(312032486 + (((31536000 / 7)
									 - (31536000 / 13)
									 + (31536000 / 45)) * 1));
		System.out.println("Year 2 projection: ");
		System.out.println(312032486 + (((31536000 / 7)
									 - (31536000 / 13)
									 + (31536000 / 45)) * 2));
		System.out.println("Year 3 projection: ");
		System.out.println(312032486 + (((31536000 / 7)
									 - (31536000 / 13)
									 + (31536000 / 45)) * 3));
		System.out.println("Year 4 projection: ");
		System.out.println(312032486 + (((31536000 / 7)
									 - (31536000 / 13)
									 + (31536000 / 45)) * 4));
		System.out.println("Year 5 projection: ");
		System.out.println(312032486 + (((31536000 / 7)
									 - (31536000 / 13)
									 + (31536000 / 45)) * 5));
	
		/* better/easier code version of this exercise
		
		int birth = 7;
		int death = 13;
		int immigrant = 45;
		int year = 365;
		int currentPopulation = 312032486;
		int yearBirth = (60 * 60 * 24 * year) / birth;
		int yearDeath = (60 * 60 * 24 * year) / death;
		int yearImmigrant = (60 * 60 * 24 * year) / immigrant;
		int yearPopulation = yearBirth + yearImmigrant - yearDeath;
		
		System.out.println ("Current population= " + (currentPopulation));
		System.out.println ("1st year population= " + (currentPopulation + (1 * yearPopulation)));
		System.out.println ("2nd year population= " + (currentPopulation + (2 * yearPopulation)));
		System.out.println ("3rd year population= " + (currentPopulation + (3 * yearPopulation)));
		System.out.println ("4th year population= " + (currentPopulation + (4 * yearPopulation)));
		System.out.println ("5th year population= " + (currentPopulation + (5 * yearPopulation)));
		
		*/
		
	}
}
