package ds00.searching;

public class LinearSearch {
	public static void main(String[] args) {
		int se = 25;
		int arr[] = { 11, 3, 25, 12, 7, 19, 4 };
		int pos = Lin_sear(arr, se);
		if (pos == -1)
			System.out.println("Element not found");
		else
			System.out.println(pos);

	}

	public static int Lin_sear(int a[], int se) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == se) {
				return i;
			}
		}
		return -1;
	}

}
