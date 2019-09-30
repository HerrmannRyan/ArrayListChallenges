import java.util.ArrayList;
import java.util.Collections;

public class ArrayListChallenges
	{
		
		static ArrayList <String> videoGameArray = new ArrayList<String>();

		public static void main(String[] args)
			{
				//Initial commit
				createList();
				printList();
				sortAlphabetically();
				printFirstAndLast();
				mostCommonChar();
				mostAndFewest();

			}
		
		public static void createList()
		{
			 
			
			
			videoGameArray.add("Minecraft");
			videoGameArray.add("Titanfall 2");
			videoGameArray.add("Call of Duty Black Ops IV");
			videoGameArray.add("Rainbow Six Seige");
			videoGameArray.add("Player Unknown\'s Battleground");
			videoGameArray.add("Steep");
			videoGameArray.add("Call of Duty Modern Warfare");
			videoGameArray.add("Dota 2");
			videoGameArray.add("Division 2");
			videoGameArray.add("Assassin\'s Creed");
			
			
		}
		
		public static void printList()
		{
			for(String s: videoGameArray)
				{
					System.out.println(s);
				}
			
		}
		
		public static void sortAlphabetically()
		{
			
			Collections.sort(videoGameArray);
			System.out.println("\n \nThe ArrayList in alphabetical order is: \n");
			
			for(String s: videoGameArray)
				{
					System.out.println(s);
				}
		}
			
		public static void printFirstAndLast()
		{
			
			String firstGame = videoGameArray.get(0);
			String lastGame = videoGameArray.get(videoGameArray.size()-1);
			
			System.out.println("\n" + firstGame);
			System.out.println(lastGame + "\n");
			
		}
		public static void mostCommonChar()
		{
			
			for (int i = videoGameArray.size() - 1; i >= 0; i--)
				{
					
					if(videoGameArray.get(i).substring(0,1).equals("C"))
					{
						videoGameArray.remove(i);	
					}
					
				}
			
			for(String s: videoGameArray)
				{
					System.out.println(s);
				}
			
		}
		
		public static void mostAndFewest()
		{
			
			createList();
			
			int fewestCharacters = Integer.MAX_VALUE;
			int mostCharacters = 0;
			String smallestSize = "";
			String largestSize = "";
			
			for(String s: videoGameArray)
			{
				if (s.length() > mostCharacters)
				{
					mostCharacters = s.length();
					largestSize = s;
				}
				
			}
			
			for (String z: videoGameArray)
			{
				
				if (z.length() < fewestCharacters)
					{
						fewestCharacters = z.length();
						smallestSize = z;
					}
				
			}
			
			System.out.println("The object with the largest size is: " + largestSize);
			System.out.println("The object with the smallest size is: " + smallestSize);
			
			
		}

	}
