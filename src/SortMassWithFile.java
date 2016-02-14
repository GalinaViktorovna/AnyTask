import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Галка on 09.02.2016.
 */
public class SortMassWithFile {
  // static File myfyle =  new File("ress\\2.txt");
   static ArrayList<String> mass = new ArrayList<String>();
    static Scanner scn;

    public static void main(String[] args) {
        //
        //String num = sc.nextLine();
        try {
            FileWriter file = new FileWriter("ress\\2.txt");
            boolean s = true;
            while(s) {
                Scanner sc = new Scanner(System.in);
                String num = sc.nextLine();
                if (num.equals("")){s=false;
                continue;}
                file.write(num +" ");

            }
            file.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
        scan();
        read();
        open();
        sortic(mass);
        /*mass = buble(mass);
        for(Integer i :mass){
            System.out.print(i + "    ");
        }*/
    }

    public static void open() {
        for (int i = 0; i < mass.size(); i++) {
            System.out.print(mass.get(i) + "    ");
        }
        System.out.println();
    }

    public static void read() {
        while (scn.hasNext()) {
            for (int i = 0 ;(scn.hasNext());i++) {
                mass.add(i,scn.next());
               // mass.add(i,Integer.parseInt(scn.next()));

            }
        }
    }

    public static void scan() {
        try {
             scn = new Scanner(new File("ress\\2.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

public static ArrayList<Integer> buble(ArrayList<Integer> mas){
    Collections.sort(mas);


   /* for(int i = 0;i<6;i++){
        for (int j = 0;j<6-i-1;j++){
            if((mas.get(j)> mas.get(j+1))){
                int dryan = mas.get(j);
                mas.remove(j);
                mas.add(j,mas.get(j+1));
                mas.add(j+1,dryan);

            }
        }*/
    return mas;}
public static void sortic(ArrayList<String> list1){
    ArrayList<String> list = list1;
     Collections.sort(list);
    for(String s :list){
        System.out.print(s+"    ");
    }
}

}

