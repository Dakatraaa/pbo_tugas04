package id.rizkydamar.prioritas;
import id.rizkydamar.Rekening;

public class RekeningPrioritas extends Rekening
{
    public RekeningPrioritas(String namaPemilik, double saldo, String kodeCabang)
    {
        super(namaPemilik, saldo, kodeCabang);
    }
    public void tampilkan()
    {
        catatTransaksi("Cek Transaksi", 0);
    }
    public void cobaakses()
    {
        // System.out.println(saldo);
        // System.out.println(kodeCabang);
    }
}