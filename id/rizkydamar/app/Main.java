package id.rizkydamar.app;
import id.rizkydamar.PetugasBank;
import id.rizkydamar.Rekening;
import id.rizkydamar.prioritas.RekeningPrioritas;

public class Main
{
    public static void main(String[] args) {
        Rekening rekening = new Rekening("Rizky", 200000, "Sragen02");
        RekeningPrioritas prioritas = new RekeningPrioritas("Diaz", 100000, "Solo01");
        PetugasBank petugas = new PetugasBank();

        System.out.println("1. Public");
        System.out.println("Pemilik: " + rekening.getNamaPemilik());
        System.out.println("Saldo: " + rekening.getSaldo());
        rekening.setor(300000);
        rekening.tarik(25000);
        rekening.tarik(1000000000);
        System.out.println("saldo: " + rekening.getSaldo());
        
        System.out.println("\n2. Private");
        // rekening.saldo = 999999999;
        System.out.println("saldo tidak bisa diakses langsung, hanya lewat setor() dan tarik()");

        System.out.println("\n3. Default");
        petugas.lihatkodecabang(rekening);
        // System.out.println(rekening.kodeCabang);

        System.out.println("\n4. Protected");
        prioritas.tampilkan();
        // rekening.catatTransaksi("Tes", 0);
        prioritas.setor(500000);
        System.out.println("Saldo prioritas: " + prioritas.getSaldo());
    }
}