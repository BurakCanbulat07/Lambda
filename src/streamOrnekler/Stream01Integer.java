package streamOrnekler;

import java.util.ArrayList;
import java.util.List;

public class Stream01Integer {
    public static void main(String[] args) {
        List<Integer> rakamlar = new ArrayList<>();
        rakamlar.add(5);
        rakamlar.add(7);
        rakamlar.add(7);
        rakamlar.add(9);
        rakamlar.add(-1);
        rakamlar.add(2);
        rakamlar.add(4);
        rakamlar.add(-1000);
        rakamlar.add(4);

        System.out.println("=======Tek Sayilar=======");
        System.out.print("       ");
        rakamlar.stream().filter(t-> t%2 !=0).forEach(x-> System.out.print(x+" "));
        System.out.println();
        System.out.println("=======Cift Sayilar=======");
        System.out.print("       ");
        rakamlar.stream().filter(t-> t%2 ==0).forEach(Stream01Integer::yazdir);
        System.out.println();
        System.out.println("=======Cift Sayilar(Method)=======");
        System.out.print("       ");
        ciftleriYazdir(rakamlar);

    }

    public static void ciftleriYazdirRef(List<Integer> list){
        list.stream().filter(Stream01Integer::ciftMi).forEach(Stream01Integer::yazdir);
        System.out.println();
    }
    public static boolean ciftMi(int x){
        return x%2==0;
    }
    public static void ciftleriYazdir(List<Integer> list){
        list.stream().filter(x->x%2==0).forEach(x-> System.out.print(x+" "));
        System.out.println();
    }

    public static boolean tekMi(int x) {
        return x%2!=0;
    }

    public static void yazdir(int x){
        System.out.print(x+" ");
    }
}