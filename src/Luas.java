class Luas {

    private double phi = 3.14;
    private double jari2;

    public double setLuas(double jari2) {
        this.jari2 = jari2;

        return this.phi * (jari2 * jari2);
    }

    public void hasil() {
        System.out.println("Luas lingkaran = " + this.setLuas(jari2));
    }
}