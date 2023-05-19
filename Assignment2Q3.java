//Bubble Sort
public class Assignment2Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int[]a= {7,5,2,3,1,4,6,8};
            
            for(int i=0;i<a.length;i++) {
            	for(int j=1;j<a.length-1;j++) {
            		if(a[j]<a[j-1]) {
            			int tempVar=a[j];
            			a[j]=a[j-1];
            			a[j-1]=tempVar;
            		}
            	}
               }
            for(int e1:a) {
            	System.out.print(e1+" ");
            }
	}

}

