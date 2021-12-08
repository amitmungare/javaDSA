package test7;

class FindMaximum {
	int maxIndexDiff(int arr[], int n)
	{
		int maxDiff = -1;
		int i, j;

		for (i = 0; i < n; ++i) {
			for (j = n - 1; j > i; --j) {
				if (arr[j] > arr[i] && maxDiff < (j - i))
					maxDiff = j - i;
			}
		}
		return maxDiff;
	}
}

public class Code {

	public static void main(String[] args){
		FindMaximum max = new FindMaximum();
		int arr[] = {30,2,3,27,22};
		int n = arr.length;
		int maxDiff = max.maxIndexDiff(arr, n);
		System.out.println(maxDiff);
	}

}
