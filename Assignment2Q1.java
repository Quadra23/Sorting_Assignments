//Program to find duplicates in an array
public class Assignment2Q1 {

	    public static void main(String[] args) {
	        
	        int[] arr = {2, 4, 6, 8, 4, 10, 6, 8};
     
	        for (int i = 0; i < arr.length - 1; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    System.out.println("Duplicate found: " + arr[i]);
	                }
	            }
	        }
	    }
	}


