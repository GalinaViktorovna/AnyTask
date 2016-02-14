/**
 * Created by Галка on 09.02.2016.
 */
public class Mass_sort {
    public static void main(String[] args) {
        int[] mass = new int[8];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) Math.round(Math.random() * 100);
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + "    ");
        }
        System.out.println();
        Select_Mass_Sort.selectionSort(mass);
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + "    ");
        }
    }

    public static int[] bubbleSort(int[] mas1) {
        int []mass = mas1;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length - i - 1; j++) {
                if (mass[j] > mass[j + 1]) {
                    int t = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = t;

                }
            }//http://study-java.ru/uroki-java/urok-11-sortirovka-massiva/

        }return mass;
    }
}



  /*  public static void bubbleSort(int[] arr){
    /*Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
}*/