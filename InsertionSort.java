class InsertionSort {
	public static void main(String[] args) {
		int[] a = {6,4,10,2,11};
		int num, j;
		for(int i = 0; i < a.length; i++) {
			num = a[i];
			j = i;
			while(j > 0 && a[j-1]>num) {
				a[j] = a[j-1];
				j--;
			}
			a[j] = num;
		}
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}