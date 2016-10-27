package selectionSort;

public class SelectionSort {
	/**
	 * select min of subarray a[1..n]
	 * swap min with a[0]
	 *
	 */
	public static int[] selectionSort(int[] a){
		int l = a.length;
		for(int i=0;i<l-1;i++){
			int min = i;
			int j=i+1;
			while(j<=l-1){
				if(a[j]<a[min]){
					min=j;
				}
				j=j+1;
			}
			int temp = a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		return a;
	}
	
	public static void main(String[] args) {
		int[] a = {60,40,20,50,80,30,10,90};
		long startTime = System.currentTimeMillis();
		a = selectionSort(a);
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
	    System.out.println(elapsedTime);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}
