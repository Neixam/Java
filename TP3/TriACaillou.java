public class TriACaillou {
    
    private static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
    
    private static int indexOfMin(int[] array, int index1, int index2) {
        int min = index1;
        int i = index1 + 1;

        while (i < index2) {
            if (array[i] < array[min])
                min = i;
            i++;
        }
        return (min);
    }

    public static void sort(int[] array) {
        int i = 0;

        while (i < array.length) {
            TriACaillou.swap(array, i, TriACaillou.indexOfMin(array, i, array.length));
            i++;
        }
    }

    public static void main(String[] args) {
        int[] a = {23, 45, 12, 105, 8, 5, 4, 25};

        TriACaillou.sort(a);
        for (var i : a)
            System.out.println(i);
    }
}
