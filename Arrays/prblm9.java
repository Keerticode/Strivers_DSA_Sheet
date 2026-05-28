//Given two sorted arrays nums1 and nums2, return an array that contains the union of these two arrays. The elements in the union must be in ascending order.

public class prblm9 {
    public static void main(String[] args) {

        int[] nums1 = { 1, 2, 3, 4, 5 };
        int n1 = nums1.length;

        int[] nums2 = { 1, 2, 7 };
        int n2 = nums2.length;

        int[] union = new int[n1 + n2];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n1 && j < n2) {
            if (nums1[i] == nums2[j]) {
                union[k] = nums1[i];
                i++;
                j++;
                k++;
            } else if (nums1[i] < nums2[j]) {
                union[k] = nums1[i];
                i++;
                k++;
            } else if (nums1[i] > nums2[j]) {
                union[k] = nums2[j];
                j++;
                k++;
            }
        }
        while (i < n1) {
            union[k++] = nums1[i++];
        }

        while (j < n2) {
            union[k++] = nums2[j++];
        }

        for (i = 0; i < k; i++) {
            System.out.print(union[i] + " ");
        }
    }
}
