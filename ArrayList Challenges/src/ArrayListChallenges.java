import java.util.ArrayList;
import java.util.Collections;

public class ArrayListChallenges
	{
		
		static ArrayList <String> videoGameArray = new ArrayList<String>();

		public static void main(String[] args)
			{
				//Initial commit
				createAndPrintArrayList();
				//sortAlphabetically();
				//printFirstAndLast();

			}
		
		public static void createAndPrintArrayList()
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
			System.out.println(lastGame);
			
		}
		public static void mostCommonChar()
		{
			
			for (int i = videoGameArray.size() - 1; i >= 0; i--)
				{
					
					videoGameArray.get(i);
					
				}
			
		}

	}
