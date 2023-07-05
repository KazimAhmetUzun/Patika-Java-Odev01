import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaOdev01 {
    public static void main(String[] args) {
        
        Map<String, List<String>> siniflar = new HashMap<>();

        // A sınıfındaki öğrenciler
        List<String> sinifA = new ArrayList<>();
        sinifA.add("Kazım Uzun");
        sinifA.add("Ayşecan Öztürk");
        sinifA.add("Mehmet Özkan");
        siniflar.put("A", sinifA);

        // B sınıfındaki öğrenciler 
        List<String> sinifB = new ArrayList<>();
        sinifB.add("Zeynep Anıl");
        sinifB.add("Canan Yılmaz");
        sinifB.add("Ahmet Demir");
        siniflar.put("B", sinifB);

        // C sınıfındaki öğrenciler
        List<String> sinifC = new ArrayList<>();
        sinifC.add("Ahmet Uzun");
        sinifC.add("Deniz İnan");
        sinifC.add("Merthan Demir");
        siniflar.put("C", sinifC); 

        // D sınıfındaki öğrenciler
        List<String> sinifD = new ArrayList<>();
        sinifD.add("Baran Ay");
        sinifD.add("Denizhan İnanç");
        sinifD.add("Murat Anıl");
        siniflar.put("D", sinifD); 

        // E sınıfındaki öğrenciler
        List<String> sinifE = new ArrayList<>();
        sinifE.add("Kamuran Baş");
        sinifE.add("Erkan Yağan");
        sinifE.add("Ece Bahçe");
        siniflar.put("E", sinifE); 



        // İsmi "an" ile biten öğrencileri bulma
        for (String sinif : siniflar.keySet()) {
            List<String> ogrenciler = siniflar.get(sinif);
            System.out.println(sinif + " Sınıfı:");

            for (String ogrenci : ogrenciler) {
                String[] adSoyad = ogrenci.split(" ");
                String ad = adSoyad[0]; 

                if (ad.endsWith("an")) {
                    System.out.println(ogrenci);
                }
            }
            System.out.println();
        }
    }
}
