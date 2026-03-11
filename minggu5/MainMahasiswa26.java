package minggu5;

public class MainMahasiswa26 {

    public static void main(String[] args) {

        String nama[] = {"Ahmad","Budi","Cindy","Dian","Eko","Fajar","Gina","Hadi"};

        int uts[] = {78,85,90,76,92,88,80,82};
        int uas[] = {82,88,87,79,95,85,83,84};

        NilaiMahasiswa26 nm = new NilaiMahasiswa26(nama.length);

        nm.uts = uts;
        nm.uas = uas;

        int utsTertinggi = nm.maxUTS(nm.uts, 0, nm.uts.length - 1);
        int utsTerendah = nm.minUTS(nm.uts, 0, nm.uts.length - 1);
        double rataUAS = nm.rataUAS();

        System.out.println("Nilai UTS Tertinggi (Divide and Conquer): " + utsTertinggi);
        System.out.println("Nilai UTS Terendah (Divide and Conquer): " + utsTerendah);
        System.out.println("Rata-rata Nilai UAS (Brute Force): " + rataUAS);
    }
}