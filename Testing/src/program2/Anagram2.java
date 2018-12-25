package program2;

public class Anagram2 {
	static boolean areAnagram(char[] str1, char[] str2) 
    { 
        // Get lenghts of both strings 
        int n1 = str1.length; 
        int n2 = str2.length; 
   
        // If length of both strings is not same, 
        // then they cannot be anagram 
        if (n1 != n2) 
            return false; 
   
        // Sort both strings 
        quickSort(str1, 0, n1 - 1); 
        quickSort(str2, 0, n2 - 1); 
   
        // Compare sorted strings 
        for (int i = 0; i < n1;  i++) 
            if (str1[i] != str2[i]) 
                return false; 
   
        return true; 
    }

	private static void quickSort(char[] str1, int i, int j) {
		// TODO Auto-generated method stub
		
	} 
	public static void main(String args[]) 
    { 
        char str1[] = {'t','e','s','a'}; 
        char str2[] = {'t','a','e','s'}; 
        if (areAnagram(str1, str2)) 
            System.out.println("The two strings are"+ 
                             " anagram of each other"); 
        else
            System.out.println("The two strings are not"+ 
                               " anagram of each other"); 
    } 

}
