import java.util.Arrays;

public class task5 {
    /*    1.Найти минимальный и максимальный  елемент массива,
     найти индекс минимального и максимального значения масива,
     найти сумму четных и нечетных елементов массива.
          2.Сделать реверс массива (массив в обратном направлении),
     Посчитать количество нечетных элементов массива.
          3.Поменять местами первую и вторую половину массива, например,
     для массива 1 2 3 4, результат 3 4 1 2.
          4.Отсортировать массив (пузырьком (Bubble), выбором (Select), вставками (Insert)).
          5. Отсортировать массив (Quick, Merge, Shell, Heap).*/
    public static void main(String[] args) {
        int [] array = {222, 200, 22, -33, -5};
        int min = array[0];
        int max = array[0];
        int indexMin = 0;
        int indexMax = 0;
        int sum1 = 0;
        int sum2 = 0;
        int numbers = 0;
        int numbers1 = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];                    //  минимальное значение массива
                indexMin = i;                      //  индекс минимального елемента массива
            }
            if (array[i] > max) {
                max = array[i];                //  максимальное значение массива
                indexMax = i;                  //  индекс максимального елемента массива
            }
            if (i % 2 == 1) {
                sum1 = sum1 + array[i];        //  сумму нечётных елементов масива
            }
            if (i % 2 == 0) {
                sum2 = sum2 + array[i];        //  сумму четных елементов массива
            }

        }
        System.out.println("Min Element " + min);
        System.out.println("Max Element " + max);
        System.out.println("Index Min Element in array " + indexMin);
        System.out.println("Index Max Elrment in array " + indexMax);
        System.out.println("Element 1+3 = " + sum1);
        System.out.println("Element 0+2+4 = " + sum2);


        for (int a = 0; a < array.length / 2; a++) {
            int revers = array[a] ;
            array[a] = array[array.length - a - 1];
            array[array.length - a - 1] = revers; // реверс  массива
        }
        System.out.println(Arrays.toString(array));

        for (int a = 0; a< array.length ; a++){
            if (a%2 == 1){
                numbers++;                         //  количество нечетных елементов массива
            }
            if (array[a]%2!=0){
                numbers1++;                       // количество нечетных елементов в масиве
            }
        }
        System.out.println("Numbers quantity = " + numbers);
        System.out.println("Numbers quantity in array = " + numbers1);

        int [] array1 = {222, 200, 22, -33, -5};
        int swap = array1[0];
        int swap1 = array1[1];                                  // меняем местами первую и вторую половину массива;
        array1[0] = array1[3];
        array1[3] = swap;
        array1[1] = array1[4];
        array1[4] = swap1;
        System.out.println(Arrays.toString(array1));

        int [] array2 = {222, 200, 22, -33, -5};
        boolean Sorted = false;
        int big;
        while (!Sorted) {
            Sorted = true;
            for  (int a = 0; a < array2.length - 1; a++) {         // сортировка пузырьком;
                if (array2 [a] > array2 [a + 1]){
                    Sorted = false;

                    big = array2[a];
                    array2[a] = array2[a + 1];
                    array2[a + 1] = big;

                }
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}







