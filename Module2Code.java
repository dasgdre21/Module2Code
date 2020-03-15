import java.io.*;

public class Module2Code {

	public static void main(String[] args) throws IOException {
		
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in), 1);
		
		System.out.print("Number of Strings: ");
		int num = Integer.parseInt(stdin.readLine()); //number of Strings to be read
		System.out.println();
		
		String[] words = new String[num]; //creates new array to store user's Strings
		
		int count = 1; //String # when inputting
		for (int i = 0; i < num; i++) {
			
			//adds user's Strings to array
			System.out.print("Enter String " + count + ": ");
			count++;
			words[i] = stdin.readLine();			
		}
		
		sortArray(words); //sorts array of Strings in separate method
		System.out.println();
		System.out.println("Sorted Strings: ");
		
		for (String s : words) { //prints each String after being sorted
			
			System.out.println(s);
		}

	}
	
	public static void sortArray(String[] words) { //uses selection sort to sort Strings
		
		for (int i = 0; i < words.length - 1; i++) { //outer loop
			
			int min = i; //min = 1st String alphabetically
			
			for (int j = i + 1; j < words.length; j++) { //inner loop
				
				//uses the String compareTo method to find which String comes first
				if (words[j].compareTo(words[min]) < 0) { 
					min = j; 
				}
			}
			
			//switches current element and min
			String temp = words[i];
			words[i] = words[min]; 
			words[min] = temp;
		}
	}


}
