public class mobil {
    String merk = "Honda", model = "X100", spekMesin,transmisi;

    int tahun;
    void menyalakanMesin()
    {
        System.out.println("mesin mobil Menyala");
    }
    String mengemudi(String arah)
    {
        return "Mobil bergerak ke arah " +arah;
    }
    String mengerem()
    {
    return "Berhenti";
    }
    int topSpeed(int topSpeed)
    {
        return topSpeed;
    }
    public static void main(String[] args)
    {
        mobil Mobil = new mobil();
        Mobil.menyalakanMesin();
        System.out.println("Mobil baru saya adalah " + Mobil.merk);
        System.out.println(Mobil.model);
    }
}


