
public class SentenceReverse {

	public static void main(String[] args) {

		String input = "hello how you are doing";
				//o/p = "DoinG ArE YoU HoW HellO";
		
		String[] split = input.split(" ");
		String result="";
		for (int i = split.length-1;i>=0; i--) {
			
			result=result+FirstAndLast(split[i]);
			result=result+" ";
			
		}
		
		System.out.println(result);
		
		//System.out.println(FirstAndLast("abcd"));

	}
	
	static String FirstAndLast(String str)
    {
        // Create an equivalent char array of given string
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {

            // k stores index of first character and i is going to store index of last character.
            int k = i;
            while (i < ch.length && ch[i] != ' ')
                i++;

            // Check if the character is a small letter If yes, then Capitalise
            ch[k] = (char)(ch[k] >= 'a' && ch[k] <= 'z'
                               ? ((int)ch[k] - 32)
                               : (int)ch[k]);
            ch[i - 1] = (char)(ch[i - 1] >= 'a' && ch[i - 1] <= 'z'
                                   ? ((int)ch[i - 1] - 32)
                                   : (int)ch[i - 1]);
        }
        return new String(ch);
    }

}
