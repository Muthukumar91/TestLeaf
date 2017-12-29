package collections;


import java.util.Map;
import java.util.TreeMap;

public class LearningMap {
	//.dmv

	public static void main (String[] args)
	{
		String val = "CCongnizant";
		Map<Character,Integer> empRecord=new TreeMap<Character,Integer>();
		for (int i = 0; i < val.length(); i++) {
			char c = val.charAt(i);
			//empRecord.containsKey(c);
			if (empRecord.containsKey(c)){
				empRecord.put(c, empRecord.get(c)+1);
			}
			else
			{
				empRecord.put(c, 1);

			}
			}
			System.out.println(empRecord);
		}		

	}	


