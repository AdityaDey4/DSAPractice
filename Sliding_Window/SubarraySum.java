package Sliding_Window;

public class SubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,2,4,7,1,3};
		int size = 3;
		int sum = 0, i, ans;
		for(i=0; i<size; i++) {
			sum = sum+arr[i];
		}
		ans= sum;
		i=0;
		for(; size<arr.length; size++) {
			sum = sum-arr[i];
			i++;
			sum += arr[size];
			ans = Math.max(ans, sum);
		}
		System.out.print(ans);
	}
}
