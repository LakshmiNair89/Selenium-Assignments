package BasicsJava;
public class ArrayConcepts {

	public static void main(String[] args) {
		
//array - to store similar data type in an array
//one dimensional array
// two disadvantages
		//1.size is fixed -- static array --- to overcome this problem we use Collections(Arraylist,Hashtable)-dynamic array
		//2.stores only similar data types--- to overcome we use Object array

//Create a one dimensional array------------------------------------------------------
int i[] = new int[4];
	i[0]=0;
	i[1]=2;
	i[2]=4;
	i[3]=6;
		
//i[4] =7; // ArrayOutOfBoundException will display since the length of the array is 4
//-----------------------------------------------------------------------------------------------------------------------	
	
//To get the size of array
System.out.println("length of the array  "+i.length);

//----------------------------------------------------------------------------------------------------------------------		
//To print all the numbers in array we should use for loop
	for(int j=0;j<=i.length-1;j++) {
			System.out.println(i[j]);
		}

System.out.println();

//------------------------------------------------------------------------------------------------------------------------------
System.out.println("Object array");
	
//Object Array
	
	Object[] ob =new Object[4];
	ob[0]=1;
	ob[1]="Lakshmi";
	ob[2]='F';
	ob[3]=4.11;
	
	for(int j=0;j<=i.length-1;j++) {
		System.out.println(ob[j]);
	}
	
//-------------------------------Two dimensional array------------------------------------------------------------------------
	
String cell[][] = new String[3][5];
	
//To get the no:of rows
	System.out.println("No:of rows " + cell.length);
	
//To get the no:of columns
	System.out.println("No:of columns "+ cell[0].length );
	
//To give values in array
	cell[0][0] = "A";
	cell[0][1] ="B";
	cell[0][2] ="C";
	cell[0][3] ="D";
	cell[0][4]="E";
	
	cell[1][0] = "A1";
	cell[1][1] ="B1";
	cell[1][2] ="C1";
	cell[1][3] ="D1";
	cell[1][4]="E1";
	
	cell[2][0] = "A2";
	cell[2][1] ="B2";
	cell[2][2] ="C2";
	cell[2][3] ="D2";
	cell[2][4]="E2";
	
//To print all the values
	for( int a =0;a<=cell.length-1;a++) {
		for(int b=0;b<=cell[0].length-1;b++) {
			System.out.println(cell[a][b]);
		}
	}
	}	
}
