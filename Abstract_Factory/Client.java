public class Client {
    public static void main(String[] args) {
        // Instanciation directe conforme au diagramme
        AbstractFactory factoryEssence = new FactoryEssence();
        AbstractFactory factoryElectrique = new FactoryElectrique();

        System.out.println("Famille Essence :");
        Automobile automobileEssence = factoryEssence.construireAutomobile();
        Scooter scooterEssence = factoryEssence.construireScooter();
        automobileEssence.methodeAutomobile();
        scooterEssence.methodeScooter();

        System.out.println("Famille Electrique :");
        Automobile automobileElectrique = factoryElectrique.construireAutomobile();
        Scooter scooterElectrique = factoryElectrique.construireScooter();
        automobileElectrique.methodeAutomobile();
        scooterElectrique.methodeScooter();
    }
}
