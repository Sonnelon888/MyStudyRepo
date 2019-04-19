public class BubbleSort {

    public int[] bubblesort(int[] sort){
        for (int i = sort.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (sort[j] > sort[j + 1]) {
                    int checked = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = checked;
                }
            }
        }
        return sort;
    }


    public static void main(String[] args) {
        int[] sort = {19, 2, 7, 3, 5};
        BubbleSort bs = new BubbleSort();
        for(int i : bs.bubblesort(sort)) {
            System.out.println(i);
        }
    }
}
