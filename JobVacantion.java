import java.util.Scanner;

public class JobVacantion {
    public static void main( String[] args){
	    //Deklarasi variable yang diperlukan.
		int umur, pengalaman;
		double penampilan;
		String lulusan, nama, jenisKelamin;
		boolean reqKoor1, reqKoor2, reqAdmin1, reqAdmin2;
		boolean isPassingKoor, isPassingAdmin;
		Scanner input = new Scanner(System.in);
		
		//Buat output Text yang dibutuhkan
		System.out.println("Selamat datang di PT. Secret Semut 79");
		System.out.println("=====================================\n");
		System.out.println("Silahkan input Data Anda");
		System.out.println("Nama : ");
		nama = input.next();
		
		System.out.println("Umur : ");
		umur = input.nextInt();
		
		System.out.println("Jenis Kelamin (Pria/Wanita) : ");
		jenisKelamin = input.next();
		
		System.out.println("Lulusan (SMK/D3/S1) : ");
		lulusan = input.next();
		
		System.out.println("Pengalaman : ");
		pengalaman = input.nextInt();
		
		System.out.println("Penampilan : ");
		penampilan = input.nextDouble();
	}
}