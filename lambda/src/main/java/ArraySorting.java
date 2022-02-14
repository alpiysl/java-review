public class ArraySorting {

    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();
//        as.sort();
        QuickSort quickSort = new QuickSort();
        BubbleSort bubbleSort = new BubbleSort();
        as.sort(quickSort);
        as.sort(bubbleSort);

        MyLambda myLambda = () -> System.out.println("print sth");

        Sorting quick = () -> System.out.println("quick");
        as.sort(quick);
        Sorting buble = () -> System.out.println("buble");
        as.sort(buble);
    }

    private void sort(Sorting sorting) {
        sorting.sort();
    }
}

interface MyLambda {
    void print();
}

