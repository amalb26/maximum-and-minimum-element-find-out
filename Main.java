/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int arr[]={9,7,3,6,2,};
		int min=arr[0];
		int max=arr[0];
		
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]<min){
	            min=arr[i];
	        }if(arr[i]>max){
	            max=arr[i];
	        }
	    }
	    
	    System.out.println("minimum number of the array is :"+ min);
	     System.out.print("maximum number of the array is :"+ max);
	}
}
