class Avtomobil extends Vozilo {
    private int brojNaVrati;

  
    public Avtomobil(int brzina, int kapacitetNaGorivo, int brojNaVrati) {
        super(brzina, kapacitetNaGorivo);
        this.brojNaVrati = brojNaVrati;
    }

    
    public void zapali() {
        System.out.println("Автомобилот е запален.");
    }

   
    public int getBrojNaVrati() {
        return brojNaVrati;
    }
}