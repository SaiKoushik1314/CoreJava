package com.java.funda;

public class MyArrayCopy {

	public static void main(String[] args) {
int [] myarray1 ={1,2,3,4,0,5,6,7};

   int	myarray2[] = new int[6];
   
   System.arraycopy(myarray1, 0, myarray2, 0, 5);
   int array3[] = java.util.Arrays.copyOfRange(myarray1,2,5 );
   
	for(int i:myarray2){
		System.out.println("Contents are:"+i);
	}
	
	for(int j:array3){
		System.out.println(j);
	}
	
	String names[][] ={{"Mr","Ms","Fuck"},{"Sai","Divya","Subramanyam veliventi"}};
	System.out.println(names[0][0]+names[1][0]);
	System.out.println(names[0][1]+names[1][1]);
	System.out.println(names[0][2]+names[1][2]);

	
	
	}

}
