package hukh.data.type.loop;

public class BinarySearch {
	
	public int search(int[] arr, int k) {
		if (arr == null)
			return -1;
		
		int a = 0;
		int b = arr.length;
		
		while (a < b) {
			//int m = (a + b) / 2;
			int m = a + (a - b) / 2; // 避免stack overflow，数组长度足够大，a+b存在超出int最大值的可能。
			if (k < arr[m]) {
				b = m;
			} else if (k > arr[m]) {
				a = m + 1;
			} else {
				return m;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		BinarySearch biSearch = new BinarySearch();
		System.out.println(biSearch.search(new int[]{1, 3, 5, 6, 7}, 5));
		System.out.println(biSearch.search(new int[]{1, 3, 5, 6, 6, 7}, 6));
		System.out.println(biSearch.search(new int[]{1, 3, 5, 6, 7}, 8));
		System.out.println(biSearch.search(new int[]{1, 3, 5, 6, 7}, 0));
		System.out.println("==============");
		System.out.println(biSearch.search(new int[]{}, 5));
		System.out.println(biSearch.search(new int[]{1}, 5));
		System.out.println(biSearch.search(new int[]{6}, 6));
		System.out.println(biSearch.search(new int[]{6, 7}, 6));
		System.out.println("==============");
		System.out.println(biSearch.search(new int[]{1, 3, 5, 6, 7}, 5));
		

	}

}
