public class TestVozila {
    public static void main(String[] args) {
       
        Vozilo vozilo = new Vozilo(120, 60);

        
        System.out.println("Информации за Возилото:");
        System.out.println("Брзина: " + vozilo.getBrzina() + " km/h");
        System.out.println("Капацитет на гориво: " + vozilo.getKapacitetNaGorivo() + " литри");
        System.out.println();

        
        Avtomobil avtomobil = new Avtomobil(160, 50, 4);

      
        System.out.println("Информации за Автомобилот:");
        System.out.println("Брзина: " + avtomobil.getBrzina() + " km/h");
        System.out.println("Капацитет на гориво: " + avtomobil.getKapacitetNaGorivo() + " литри");
        System.out.println("Број на врати: " + avtomobil.getBrojNaVrati());
        avtomobil.zapali();
    }
}