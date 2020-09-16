package tw.com.web;

public class Tools {
  private static final String[] SKILL_ARRAY= {"Java",
		  		"Python","Golang",
		  		"JavaScript"};
  
  public static String[] getSkillArray(String[] indexs ) {
	  if (indexs == null || indexs.length == 0) return new String[0];
	  
	  String[] skills = new String[indexs.length];
	  	int count = 0;
	  for (String  skiIndex : indexs) {
		 int skiIndexInt =  Integer.parseInt(skiIndex);
		 skills[count++] = SKILL_ARRAY[skiIndexInt];
	  }	  
	  return skills;
  }
  
}
