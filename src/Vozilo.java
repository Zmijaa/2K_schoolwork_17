class Vozilo {
    protected int brzina;
    protected int kapacitetNaGorivo;

    
    public Vozilo(int brzina, int kapacitetNaGorivo) {
        this.brzina = brzina;
        this.kapacitetNaGorivo = kapacitetNaGorivo;
    }

   
    public int getBrzina() {
        return brzina;
    }

    public int getKapacitetNaGorivo() {
        return kapacitetNaGorivo;
    }
}


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