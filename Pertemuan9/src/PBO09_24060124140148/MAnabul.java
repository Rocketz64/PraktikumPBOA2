package PBO09_24060124140148;

public class MAnabul {
    public static void main(String[] args) {
        Piaraan Animals = new Piaraan(); 

        Anabul cat1 = new Anggora("Oren", "Odi", 3.4);
        Anabul cat2 = new Kembangtelon("Putih", "El", 6.0);
        Anabul cat3 = new Kembangtelon("Hitam", "Blacky", 5.2);
        Anabul dog = new Anjing("Anjing", "Gukgukruyuk");
        Anabul bird = new Burung("Burung", "Birdie");

        Animals.enqueueAnabul(cat1);
        Animals.enqueueAnabul(cat2);
        Animals.enqueueAnabul(cat3);
        Animals.enqueueAnabul(dog);
        Animals.enqueueAnabul(bird);

        Animals.showAnabul();

        System.out.println();

        System.out.println("Total Kucing dalam Koleksi:\n" + Animals.countKucing());

        System.out.println("Total Bobot:\n" + Animals.bobotKucing());

        System.out.println();

        Animals.showJenisAnabul();
    }
}
