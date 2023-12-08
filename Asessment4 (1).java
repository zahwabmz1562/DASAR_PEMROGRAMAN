import java.util.Scanner;
public class Asessment4{
  public static void main(String[] args){
    //Deklarasi variable
    double subtotalgaji;
    double pajak;
    double total_gaji;
    
    Scanner wawa = new Scanner(System.in);

    //Input
    System.out.print("Input subtotalgaji=");
    subtotalgaji = wawa.nextInt();

    System.out.print("Input pajak=");
    pajak = wawa.nextInt();

    //Proses
    total_gaji = subtotalgaji - pajak;

    //Output
    System.out.println("Input gaji ="+ total_gaji);
  }
}    