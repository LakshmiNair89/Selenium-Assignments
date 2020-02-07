package BasicsJava;

public class LoopConcepts {

	public static void main(String[] args) {
		
//1.while loop
	// disadvantage of while loop is that it will generate infinite loop if the incremental/decremental part is missed
		int i=1;
		while(i<=10) {
			System.out.print(i+",");
			i++;
		}
System.out.println(" ");
		
//2.for loop
		for(int j=1;j<=15;j++) {
			System.out.print(j+",");
		}
System.out.println();

//Increment and Decrement concepts
//post increment
		int h=1;
		int j =h++;  // here it takes the value of h and then increment so the value of h is 2 and j is 1
		System.out.println(h);
		System.out.println(j);
		
//pre increment
		int n=1;
		int m=++n;
		System.out.println(n);
		System.out.println(m);
		
	}
	
	

	

}
