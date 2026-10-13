package id.rizkydamar;

public class Rekening
{
    private String namaPemilik;     
    private double saldo;
    String kodeCabang;

    public Rekening(String namaPemilik, double saldo, String kodeCabang)
    {
        this.namaPemilik = namaPemilik;
        if (saldo < 0 )
        {
            this.saldo = 0;
        }
        else
        {
            this.saldo = saldo;
        }
        this.kodeCabang = kodeCabang;
    }

    public String getNamaPemilik()
    {
        return namaPemilik;
    }
    public double getSaldo()
    {
        return saldo;
    }

    private boolean jumlahcocok(double jumlah)
    {
        return jumlah > 0;
    }

    protected void catatTransaksi(String jenis, double jumlah)
    {
        System.out.println("Jenis: " + jenis + " Rp." + jumlah);
    }
    public void setor(double jumlah)
    {
        if (!jumlahcocok(jumlah))
        {
            System.out.println("setor gagal saldo harus lebih dari 0!!!");
            return;
        }
        else
        {
            saldo += jumlah;
            catatTransaksi("Setor", jumlah);
        }
    }
    public boolean tarik(double jumlah)
    {
        if (!jumlahcocok(jumlah))
        {
            System.out.println("tarik gagal, jumlah penarikan harus > 0");
            return false;
        }
        else if (jumlah > saldo)
        {
            System.out.println("tarik gagal saldo tidak mencukupi!!!");
            return false;
        }
        else
        {
            saldo -= jumlah;
            catatTransaksi("Tarik: ", jumlah);
            return true;
        }
    }

}