package JJavaJuliePro1;

import java.util.ArrayList;
//import java.util.Collections.reverseOrder();
import java.util.Arrays;
//import java.util.Collections;
//import java.awt.List;
import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
//import java.lang.reflect.Array;
//import java.util.stream.IntStream;

public class firstClass {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

firstClass f1=  new firstClass();
String filepath="C:/Testfiles/employees.txt";
f1.readMyEmployeeListInAscendingOrder(filepath);
//f1.sortMyArrayAndPrint(UnsortedNames);

//String[] companies = { "Google", "Apple", "Sony" };
//f1.sortMyArrayAndPrint(companies);


//int sum = f1.addNumbers(3, 4);
//System.out.println(sum);
//int[] myNumberList= {36,25,48,12,58};
//System.out.println(myNumberList.length);
//f1.readMyArrayAndPrint(myNumberList);
//f1.compareMyString();
System.out.println("helo world");	
	}//end main
	
	
/* int addNumbers(int x, int y)
	{
	 int n= x+y;
	 return n;

	}
	*/
	
public void readMyEmployeeListInAscendingOrder(String filepath) throws IOException
{
	FileReader file_to_read = new FileReader("C:\\Testfiles\\employees.txt");
	BufferedReader bf = new BufferedReader(file_to_read);
	String aLine;
	int numberOfLines=0;
	ArrayList <String> employeeList= new ArrayList<>();
	//
	
	while ( (aLine=bf.readLine()) !=null ) {
		
		employeeList.add(numberOfLines, aLine);
		numberOfLines++;
		}// end while
	bf.close();// close buffer
	
	int l= employeeList.size();
	String[] unSortedemployeeList = new String[l];
for(int j=0; j<l; j++) {
	//String s= employeeList.get(j);
	//System.out.println(j + " " +s);
	unSortedemployeeList[j]= employeeList.get(j);
	//System.out.println(unSortedemployeeList[j]);
	}//end for
System.out.println("I am done reading and storing names to array");

// Call method to sort array elements
sortMyArrayAndPrint(unSortedemployeeList);
		
}// end readEMployeelist
	
public void sortMyArrayAndPrint(String[] arrayTOPrint) {
	//printNumbers(arrayTOPrint);
	Arrays.sort(arrayTOPrint);
	System.out.println("Here is my sorted list");
	for (int i=0; i<arrayTOPrint.length; i++)
		System.out.println(arrayTOPrint[i]);
};

	/*
public void readMyArrayAndPrint(int[] myNumberlist) {

int[] mySortedList = IntStream.of(myNumberlist).sorted().toArray();
//System.out.println(mySortedList.length);
	for(int i= 0; i<mySortedList.length; i++) {
	//	System.out.println(i);
		System.out.println(mySortedList[i]);
		
		}

}//end readMyArray

/*	private void compareMyString()
	{
				
		String s1= "Tharshini";
		String s2= "Bamini";
		String[] sortedList= new String[2];
				if (s1.compareToIgnoreCase(s2)>0)
				{
					sortedList[0]=s2;
					sortedList[1]=s1;
					System.out.println("Bamini goes first");
				}
				else {
					System.out.println("Tharshini goes first");
				}
	}
	
	*/
	
}//end first class