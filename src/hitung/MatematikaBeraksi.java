
package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        // Membuat objek 
        Matematika cici = new Matematika(1, 2);
        
        System.out.println("Hasil Penjumlahan: " +cici.setPenjumlahan());
        System.out.println("Hasil Pengurangan: " +cici.setPengurangan());
        System.out.println("Hasil Perkalian: " +cici.setPerkalian());
        System.out.println("Hasil Pembagian: " +cici.setPembagian());
        
        
    }
}
