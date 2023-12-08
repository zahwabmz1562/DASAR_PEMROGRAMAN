import java.util.Scanner;
public class Asessment3{
  public static void main(String[] args){
    //Deklarasi variable
    int kelilingpersegi;
    int kelilingpersegipanjang;
    boolean hasil;
   
    Scanner wawa = new Scanner(System.in);

    //Input
    System.out.print("Input kelilingpersegi=");
    kelilingpersegi = wawa.nextInt();

    System.out.print("Input kelilingpersegipanjang=");
    kelilingpersegipanjang = wawa.nextInt();

    //Proses
    hasil = (kelilingpersegi > kelilingpersegipanjang);

    //Output
    System.out.println("Input hasil="+hasil);
   
  }
}