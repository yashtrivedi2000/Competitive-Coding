import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;


class CodeJam {

	public static void main(String[] args) {
		ArrayList<Character> storei = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		int testcases=sc.nextInt();
		int[] count=new int[testcases];
		for (int i = 0; i < testcases; i++) {
			
			String str = sc.next();
			ArrayList<Character> al = (ArrayList<Character>) str.chars().mapToObj(c -> (char) c)
					.collect(Collectors.toList());
			
			count[i] = getCount(storei, str, al);
			
		}
		for (int i = 0; i < testcases; i++) {
			System.out.println("Case #"+(i+1)+": "+count[i]);
		}
		sc.close();
	}

	private static int getCount(ArrayList<Character> storei, String str, ArrayList<Character> al) {
		char ch;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			ch = al.get(i);
			if (ch == 'I' || ch == 'i') {
				storei.add(ch);
				
			} else {
				if (ch == 'O') {
					
					if (storei.contains('I')) {
						count++;
						storei.remove((Character)'I');
					}
					else{
						storei.remove((Character)'i');
					}
				} else 
				{
					if(storei.contains('i')) {

						storei.remove((Character)'i');
					}
					else
					{
						storei.remove((Character)'I');
					}
				} 
			}
		}
		return count;
	}
}