/**
 * 1. Save this program along with your programs (C1.java,C2.java,...) in the same folder
 * 2. Open a terminal window
 * 3. Compile this program
 *    javac ThisProgramName.java
 * 4. Compile your programs:
 *    javac C?.java
 * 5. Run this program:
 *    java -ea ThisProgramName
 * 6. Test1 results will be saved to a file results.txt
 *  
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class test3_IS_AI {
	static int total=0;
	static String r = ""; 
	
	public static void main(String[] args) {
		HashMap<String, Integer> results = new HashMap<String, Integer>();

		// C1
		try {
			assert new C1("peter","green").toString().replaceAll(" ", "").equals("Green,P") == true;
			assert new C1("anna","may").toString().replaceAll(" ", "").equals("May,A") == true;
			assert new C1("beatrice","summer").toString().replaceAll(" ", "").equals("Summer,B") == true;
			results.put("C1", 1);
		} catch (Throwable e) {
			results.put("C1", 0);
		}

		// C2
		try {
			String[] v1 = {"KR11111","WD44444","KR11111"};
			String[] v2 = {"KRA3333","GD12345","WD99009","K1 CAR"};
			String[] v3 = {"EL33333","EL22222","EL33333","EL22222"};
			String[] v4 = {"EL11111","EL22222","EL33333","EL44444","EL55555"};
			assert new C2(v1).m() == true;
			assert new C2(v2).m() == false;
			assert new C2(v3).m() == true;
			assert new C2(v4).m() == false;
			results.put("C2", 1);
		} catch (Throwable e) {
			results.put("C2", 0);
		}

		// C3
		try {
			B[] arr1 = {new B(4), new B(8), new B(6), new B(9)};
			B[] arr2 = {new B(7), new B(9), new B(1)};
			assert new C3(arr1).m() == 3;
			assert new C3(arr2).m() == 0;
			results.put("C3", 1);
		} catch (Throwable e) {
			results.put("C3", 0);
		}
		
		// C4
		try {
			String[] animals = {"tiger","cow","lion","elephant","cat","crocodile"};
			assert new C4(animals).m2().equals("tigercowlionelephantcatcrocodile") == true;
			assert new C4(animals).m1('e').m2().equals("tigerelephantcrocodile") == true;
			assert new C4(animals).m1('x').m2().equals("") == true;
			results.put("C4", 1);
		} catch (Throwable e) {
			results.put("C4", 0);
		}

		// C5
		try {
			int[] arr1 = {1,2,3,2};
			int[] arr2 = {1,2,3,-2};
			int[] arr3 = {2,3,6,7};
			int[] arr4 = {2,3,8,7,1,1,2};
			assert new C5(arr1).m() == true;
			assert new C5(arr2).m() == false;
			assert new C5(arr3).m() == false;
			assert new C5(arr4).m() == true;
			assert new C5(arr1).test == 5;
			results.put("C5", 1);
		} catch (Throwable e) {
			results.put("C5", 0);
		}

		// C6
		try {
			int[] annaTest = {8,7,5};
			int[] peterTest = {10,6,4};
			int[] frankTest = {3,9,7};
			C6[] s = {new C6(annaTest), new C6(peterTest), new C6(frankTest) };			
			assert s[0].m() == 5;
			assert s[1].m() == 4;
			assert s[2].m() == 7;
			Arrays.sort(s);
			assert s[0].m() == 7;
			assert s[1].m() == 5;
			assert s[2].m() == 4;
			results.put("C6", 1);
		} catch (Throwable e) {
			results.put("C6", 0);
		}

		// C7
		try {
			assert new C7(5,7).getX()== 5;
			assert new C7(5,7).getY() == 7;
			assert new C7(5,7).swap().getX() == 7;
			assert new C7(5,7).swap().getY() == 5;
			assert new C7(5,7).swap().swap().getX() == 5;
			assert new C7(5,7).swap().swap().getY() == 7;
			results.put("C7", 1);
		} catch (Throwable e) {
			results.put("C7", 0);
		}




		// Display test results
		//results.forEach((k,v)->System.out.print(k+":"+v+" "));
		results.forEach((k,v)->r += k+":"+v+" ");
		r = r.trim();
		System.out.println(r);
		// Save test results to file
		try {
			FileWriter myWriter = new FileWriter("results.txt");
			myWriter.write(r);
			myWriter.close();
		} catch (IOException e){}
		
	}
}



// Class templates
class C1 {
	private String name, surname;
	public C1(String name, String surname){}
	public String toString(){return "";}
}

class C2 {
	String[] numbers;
	public C2(String[] numbers){}
	public boolean m(){return false;}
}

class C3 {
	public C3(B[] obj){}
	public int m(){return -1;}
}

class B {
	private int b;
	public B(int b){this.b = b;}
	public int getB(){return b;}
}
  
class C4 {
	private String[] animals;
	C4(String[] animals){}
	public C4 m1(char c){return null;}	
	public String m2(){return "";}
}

class C5 implements P {
	private int[] arr;
	public C5(int[] arr){}
	public boolean m(){return false;}
}

interface P {final public int test=5; public boolean m();}

class C6 {
	private int[] arr;
	public C6(int[] arr){}
	public int m(){return -1;}
}

class C7 {
	private int x,y;
	public C7(int x, int y){}
	public int getX(){return -1;}
	public int getY(){return -1;}
	public C7 swap(){return null;}
}

