package AppLess;

import java.util.Random;
import java.util.Scanner;

public class MainApp {
    static int b;
    public static void main(String[] args) {
        m1();


    }

    public static void m1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adiniz");
        String a = sc.nextLine();
        System.out.println("Parolunuz");
        String b = sc.nextLine();
        if (a.equals("farid") && b.equals("12345")) {
            System.out.println("Giris ugurludur");
            m4();
        } else {
            m2();
        }
    }

    public static void m2() {
        System.out.println(" 2 şans qaldi");
        Scanner sc = new Scanner(System.in);
        System.out.println("Adiniz ");
        String a = sc.nextLine();
        System.out.println(" Parolunuz");
        String b = sc.nextLine();
        if (a.equals("farid") && b.equals("12345")) {
            System.out.println("Giris ugurludur");
            m4();
        } else {
         m3();
        }
    }

    public static void m3() {
        System.out.println(" 1 şansınız qaldı");
        Scanner sc = new Scanner(System.in);
        System.out.println("Adiniz ");
        String a = sc.nextLine();
        System.out.println("Parolunuz ");
        String b = sc.nextLine();
        if (a.equals("farid") && b.equals("12345")) {
            System.out.println("Giris ugurludur");
            m4();
        } else {
            System.out.println("Ban olundunuz");
             System.exit(0);
        }
    }
    public static void m4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n1 Yarışmacılrı Register et"+"\n2 Yarismaya Basla" + "\n3 Logout" +"\n4 Exit");
        int a =  sc.nextInt();
        if (a==1){
           // sc = new Scanner(System.in);
            System.out.println("Yarismada nece sexs istirak edecek?");
             b = sc.nextInt();
            for (int i =0;i<b;i++){
                System.out.println("Yarismacainin Adi");
                sc.nextLine();
                String ss = sc.next();
                System.out.println("Yarismacinin Yasi");
               // sc = new Scanner(System.in);
                int sss =sc.nextInt();
                System.out.println("Yarismacinin Cekisi");
                int ssss = sc.nextInt();

            }
            System.out.println("Qeydiyyat Ugurludur");
            System.out.println("Novbeti Emeliyyat ");
            m4();

        }else if (a==2){
            Random r = new Random();
            Scanner ss = new Scanner(System.in);
            int number = 0;
            if (b==1){
                System.out.println("Zehmet Olmasa 1den cox secin");
            }else{
            for (int count=0;count<1;count++) {
                number = r.nextInt(b);
            }
            }
            System.out.println("Sizce necenci oyuncu secildi");
            int player = sc.nextInt();
            if (player==number){
                System.out.println("Duz secim edildi");
            }else{
                System.out.println("sehv secim edildi");
            }


        }else if (a==3){
            m1();
        }else if (a==4){
            System.out.println("Hələlik");
            System.exit(0);
        }

    }
}
