public class Suma100 {
    public static void main(String[] args) {
        // 1️⃣ Afișează toate numerele de la 1 la 50
        System.out.println("Toate numerele de la 1 la 50:");
        for (int i = 1; i <= 50; i++) {
            System.out.println(i);
        }

        // 2️⃣ Afișează doar numerele impare
        System.out.println("\nNumerele impare de la 1 la 50:");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        // 3️⃣ Calculează suma numerelor impare
        int sumaImp = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                sumaImp += i;
            }
        }

        // 4️⃣ Afișează suma finală
        System.out.println("\nSuma numerelor impare de la 1 la 50 este: " + sumaImp);
    }
}