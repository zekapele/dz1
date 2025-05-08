public class ArrayUtils {

    public static void mergeSort(int[] array) {
        if (array == null || array.length < 2) return;
        mergeSort(array, 0, array.length - 1);
    }

    private static void mergeSort(int[] array, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(array, left, L, 0, n1);
        System.arraycopy(array, mid + 1, R, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            array[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        }

        while (i < n1) array[k++] = L[i++];
        while (j < n2) array[k++] = R[j++];
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) return mid;
            if (array[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }
}
