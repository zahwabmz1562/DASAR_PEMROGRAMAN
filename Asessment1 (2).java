import java.util.Scanner;
public class Asessment1{
  public static void main(String[] args){
  //Deklarasi variabel
  Scanner wawa = new Scanner(System.in);
  String namakaryawan;
  int gajipokok = 100000 ;
  int uangtransport;
  int bonus;
  int harikerja;
  int jumlah_terlambat;
  int jumlah_lembur;
  int gaji;
  int totalgaji;
  int subtotalgaji;

  //INPUT
  System.out.print("Input nama karyawan=");
  namakaryawan = wawa.next();

  System.out.print("jumlah hari kerja=");
  harikerja = wawa.nextInt();

  System.out.print("jumlah terlambat=");
  jumlah_terlambat = wawa.nextInt();

  //PROSES
  gaji = gajipokok *harikerja;
  uangtransport = (harikerja - jumlah_terlambat)*15000;
  totalgaji = gaji + uangtransport;
  bonus = (harikerja < 20 ) && (jumlah_terlambat <=3) ? totalgaji*10/100:0;
  subtotalgaji= totalgaji + bonus;

 //OUTPUT
 System.out.println("Input nama karyawan="+namakaryawan);
 System.out.println("Input jumlah hari kerja="+harikerja);
 System.out.println("Input jumlah terlambat="+jumlah_terlambat);
 System.out.println("Tnput gaji="+gaji);
 System.out.println("Input uang transport="+uangtransport);
 System.out.println("Input total gaji="+totalgaji);
 System.out.println("Input bonus="+bonus);
 System.out.println("Input subtotalgaji="+subtotalgaji);
 System.out.println("gaji karyawan ="+namakaryawan+subtotalgaji);

  }
}

