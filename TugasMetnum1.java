import java.util.Scanner;
public class TugasMetnum1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int pilih=6;
        do{
	System.out.println("\n**************************************************************");
        System.out.println("*PROGRAM METNUM TUGAS1 By Nadya Kurnia // 3411151140 // SIE-C*");
	System.out.println("**************************************************************");
        System.out.println("1. Menghitung Penjumlahan");
        System.out.println("2. Menghitung Pengurangan");
	System.out.println("3. Menghitung Pembagian");
	System.out.println("4. Menghitung Perpangkatan");
	System.out.println("5. Menghitung Fungsi f(x)=2x^2-3x+1");
	System.out.println("6. Keluar");
        System.out.print("Masukkan pilihan anda : ");
        pilih=in.nextInt();
        switch(pilih){
            case 1: Penjumlahan();break;
            case 2: Pengurangan();break;  
	    case 3: Pembagian();break;
	    case 4: Perpangkatan();break;  
	    case 5: Fungsi();break;
        }
	System.out.println("**************************************************************");
        }while(pilih!= 6);     
}
    static int perulangan(int n){
        int hasil=1;
        for(int i=1;i<=n;i++){
            hasil=hasil*i;
    }
        return(hasil);
    }
    private static void Penjumlahan(){
        Scanner input=new Scanner(System.in);
	int A;
	int B;
	int hasil;
        System.out.print("Masukkan nilai A : ");
        A = input.nextInt();
        System.out.print("Masukkan nilai B : ");
        B  = input.nextInt();
        hasil = A + B;
        System.out.println("Hasil penjumlahannya adalah "+hasil);

    }
    private static void Pengurangan(){
       Scanner input=new Scanner(System.in);
	int A;
	int B;
	int hasil;
        System.out.print("Masukkan nilai A : ");
        A = input.nextInt();
        System.out.print("Masukkan nilai B : ");
        B = input.nextInt();
        hasil = A - B;
        System.out.println("Hasil penguranganya adalah "+hasil);
}
   private static void Pembagian(){
       Scanner input=new Scanner(System.in);
	int A;
	int B;
	int hasil;
        System.out.print("Masukkan nilai A : ");
        A = input.nextInt();
        System.out.print("Masukkan nilai B : ");
        B = input.nextInt();
        hasil = A / B;
        System.out.println("Hasil peerkalianya adalah "+hasil);
}
private static void Perpangkatan(){
       Scanner input=new Scanner(System.in);
	int A;
	int B;
	int hasil;
        System.out.print("Masukkan nilai A : ");
        A = input.nextInt();
        System.out.print("Masukkan nilai B : ");
        B = input.nextInt();
        hasil = (int) Math.pow (A,B);
        System.out.println("Hasil perpangkatanya adalah "+hasil);
}
private static void Fungsi (){
 	Scanner input=new Scanner(System.in);
	int A;
	int B;
	int hasil;
        System.out.print("Masukkan nilai A : ");
        A = input.nextInt();
        System.out.print("Masukkan nilai B : ");
        B = input.nextInt();
	for (int i=A; i<=B; i++) {
	hasil = (2*i*2) - ((4*1)+1);
	System.out.println("Hasil fungsi dari f(x)=2x^2-3x+1 adalah "+hasil);
}
}
}