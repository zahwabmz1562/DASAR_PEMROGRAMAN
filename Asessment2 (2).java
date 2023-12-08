import java.util.Scanner;
public class Asessment2{
  public static void main(String[] args){
    //Deklarasi variable
    int kelilingpersegi;
    int kelilingpersegipanjang;
    int sisi;
    int panjang;
    int lebar;
    
    Scanner wawa = new Scanner(System.in);

    //Input
    System.out.print("Input sisi=");
    sisi = wawa.nextInt();

    System.out.print("Input panjang=");
    panjang = wawa.nextInt();

    System.out.print("Input lebar=");
    lebar = wawa.nextInt();

    //Proses
    kelilingpersegi= 4 * sisi;
    kelilingpersegipanjang = ((panjang + lebar ) + (panjang + lebar));

    //Output
    System.out.println("keliling persegi="+kelilingpersegi);
    System.out.println("keliling persegi panjang="+kelilingpersegipanjang);
  }
}