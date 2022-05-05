package Sorts;

import java.util.*;

public class Sort {

    public static List<Integer> list;

    public static Comparator<Integer> com;

    public static int power(int n, int m) {
        if(m < 1) {
            return 1;
        }
        return n*power(n,m-1);
    }

    public static void main(String[] args) throws Exception {

        System.out.println("5seconds wait ...");
        Thread.sleep(5000);
        System.out.println("start");
        initComparator();

        System.out.println("Random data");
        long l = 0;
        long lcount = 12;
        System.gc();
        for (int i = 5; i <= lcount; i++) {
            long t;
            int loop = power(2, i);
            for (int j = 0; j < 100; j++) {
                initList1(loop);
                System.gc();
                t = System.currentTimeMillis();
                //bubbleSort(list, com);
                //ShellSort(list, com);
                //selectSort(list,com);
                //insertionSort(list,com);
                //quickSort(0, list.size()-1, list,com);
                HeapSort(list);
                t = System.currentTimeMillis() - t;
                l += t;
            }
            System.out.println((l / 1000d));
            System.gc();
            l = 0;

        }

        System.out.println("Sorted data");
        for (int i = 5; i <= lcount; i++) {
            long t;
            int loop = power(2, i);
            for (int j = 0; j < 100; j++) {
                initList2(loop);
                System.gc();
                t = System.currentTimeMillis();
                //bubbleSort(list,com);
                //ShellSort(list, com);
                //selectSort(list,com);
                //insertionSort(list,com);
                //quickSort(0, list.size()-1, list,com);
                HeapSort(list);
                t = System.currentTimeMillis() - t;
                l += t;
            }
            System.out.println((l / 1000d));
            System.gc();
            l = 0;
        }

        System.out.println("reversed data");
        for (int i = 5; i <= lcount; i++) {
            long t;
            int loop = power(2, i);
            for (int j = 0; j < 100; j++) {
                initList3(loop);
                System.gc();
                t = System.currentTimeMillis();
                //bubbleSort(list,com);
                //ShellSort(list, com);
                //selectSort(list,com);
                //insertionSort(list,com);
                //quickSort(0, list.size()-1, list,com);
                HeapSort(list);
                t = System.currentTimeMillis() - t;
                l += t;
            }
            System.out.println((l / 1000d));
            System.gc();
            l = 0;
        }
    }


    public static void initList1(int size) {    //random data
        Random r = new Random();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        for (int i = 0; i < size; i++) {
            int ra = r.nextInt(size - i) + 1;
            int j = 0;
            int c = 0;
            while (ra != c) {
                if (arr[j] == -1) {
                    c++;
                }
                j++;
            }
            arr[j - 1] = i + 1;
        }
        list = new ArrayList<>(size);
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        } // 리스트 설정
    }

    public static void initList2(int size) {    //sorted data
        list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
    }

    public static void initList3(int size) {     //reversed data
        list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(size - i - 1);
        }
    }

    public static void initComparator() {
        com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2) {
                    return -1;
                } else if (o1 == o2) {
                    return 0;
                } else {
                    return 1;
                }
            }
        };// comparator 설정
    }

    public static <T> void bubbleSort(List<T> list, Comparator<T> com) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (com.compare(list.get(i), list.get(j)) > 0) {
                    T arg = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, arg);
                }

            }
        }
    }

    public static <T> void selectSort(List<T> list, Comparator<T> com) {
        for (int i = 0; i < list.size(); i++) {
            int index = i;
            T min = list.get(i);
            for (int j = i; j < list.size(); j++) {
                if (com.compare(min, list.get(j)) > 0) {
                    index = j;
                    min = list.get(j);
                }
            }

            T arg = list.get(i);
            list.set(i, list.get(index));
            list.set(index, arg);
        }
    }

    public static <T> void quickSort(int left, int right, List<T> list, Comparator<T> com) {

        int i = left;
        int j = right - 1;
        if (i < j) {
            T pivot = list.get(right);
            while (i < j) {
                while (com.compare(list.get(i), pivot) < 0) {
                    i++;
                }
                while (i < j && com.compare(pivot, list.get(j)) <= 0) {
                    j--;
                }

                T arg = list.get(i);
                list.set(i, list.get(j));
                list.set(j, arg);
                // Thread.sleep(sleep);
            }
            T arg = list.get(right);
            list.set(right, list.get(j));
            list.set(j, arg);
            // Thread.sleep(sleep);

            // System.out.println(list);
            // Thread.sleep(sleep);
            quickSort(left, i - 1, list, com);
            quickSort(i, right, list, com);
        }
    }

    public static <T> void insertionSort(List<T> list, Comparator<T> com){
        int j= 0;
        for(int i = 1; i < list.size(); i++){
            T temp = list.get(i);
            for(j = i - 1; (j >= 0 )&& (com.compare(temp, list.get(j)) < 0); j--){
                list.set(j+1, list.get(j));
            }
            list.set(j+1, temp);
        }
    }



    public static <T> void ShellSort(List<T> list, Comparator<T> com){
        int gap = list.size() / 2;

        while(gap > 0){
            for(int i = gap; i < list.size(); i++){
                T arg = list.get(i);
                int j = i;
                while((j >= gap) && (com.compare(list.get(j-gap), arg) > 0)){
                    list.set(j, list.get(j-gap));
                    j -= gap;
                }
                list.set(j, arg);
            }
            gap /= 2;
        }


    }

    private static <T> void HeapSort(List<T> list){
        PriorityQueue<T> heap = new PriorityQueue<T>();

        for(int i = 0; i < list.size(); i++){
            heap.add(list.get(i));
        }

        for(int i = 0; i < list.size(); i++){
            list.set(i, heap.poll());
        }
    }




}
