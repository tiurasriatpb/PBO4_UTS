class Mobil {
    private String merek;
    private int kecepatan;
    private int posisiX;
    private int posisiY;

    public Mobil(String merek) {
        this.merek = merek;
        this.kecepatan = 0;
        this.posisiX = 0;
        this.posisiY = 0;
    }

    public void maju() {
        this.kecepatan += 1;
        updatePosisi();
    }

    public void mundur() {
        this.kecepatan -= 1;
        updatePosisi();
    }

    public void belokKanan() {
        this.posisiX += this.kecepatan;
        updateKecepatan();
    }

    public void belokKiri() {
        this.posisiX -= this.kecepatan;
        updateKecepatan();
    }

    private void updatePosisi() {
        this.posisiY += this.kecepatan;
    }

    private void updateKecepatan() {
        if (this.posisiY > 0) {
            this.kecepatan = Math.max(1, this.kecepatan - 1);
        }
    }

    public void status() {
        System.out.println("Merek: " + this.merek);
        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("Posisi: (" + this.posisiX + ", " + this.posisiY + ")");
    }
}

public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota");
        mobil.maju();
        mobil.maju();
        mobil.belokKanan();
        mobil.status();
    }
}