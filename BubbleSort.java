class BubbleSort {
	public static void main(String[] args){
		int arr[] = {12,10,15,4,5};
		int temp;
		
		System.out.print("Before Sorting : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i = 0; i < arr.length; i++) {
			int f = 0;
			for(int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					f = 1;
				}
			}
			if(f == 0) {
				break;
			}
		}
		System.out.println();
		System.out.print("After Sorting : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}