//Merge Sort
public class Assignment2Q4 {

	    public static void main(String[] args) {
	        int[] arr = {9, 5, 1, 8, 3, 2, 7, 6, 4};

	        System.out.println("Original array:");
	        printArray(arr);

	        mergeSort(arr);

	        System.out.println("Sorted array:");
	        printArray(arr);
	    }

	    public static void mergeSort(int[] arr) {
	        if (arr.length <= 1) {
	            return;
	        }

	        int mid = arr.length / 2;
	        int[] leftArray = new int[mid];
	        int[] rightArray = new int[arr.length - mid];

	        System.arraycopy(arr, 0, leftArray, 0, mid);
	        System.arraycopy(arr, mid, rightArray, 0, arr.length - mid);

	        mergeSort(leftArray);
	        mergeSort(rightArray);

	        merge(arr, leftArray, rightArray);
	    }

	    public static void merge(int[] arr, int[] leftArray, int[] rightArray) {
	        int i = 0, j = 0, k = 0;

	        while (i < leftArray.length && j < rightArray.length) {
	            if (leftArray[i] <= rightArray[j]) {
	                arr[k] = leftArray[i];
	                i++;
	            } else {
	                arr[k] = rightArray[j];
	                j++;
	            }
	            k++;
	        }

	        while (i < leftArray.length) {
	            arr[k] = leftArray[i];
	            i++;
	            k++;
	        }

	        while (j < rightArray.length) {
	            arr[k] = rightArray[j];
	            j++;
	            k++;
	        }
	    }

	    public static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}

