public class Client {
    public static void main(String[] args) {
        AbstractFactory factoryEssence = new FactoryEssence();
        AbstractFactory factoryElectrique = new FactoryElectrique();

        System.out.println("=== Famille Essence ===");
        Automobile automobileEssence = factoryEssence.construireAutomobile();
        Scooter scooterEssence = factoryEssence.construireScooter();
        Camion camionEssence = factoryEssence.construireCamion();
        automobileEssence.methodeAutomobile();
        scooterEssence.methodeScooter();
        camionEssence.methodeCamion();

        System.out.println("=== Famille Electrique ===");
        Automobile automobileElectrique = factoryElectrique.construireAutomobile();
        Scooter scooterElectrique = factoryElectrique.construireScooter();
        Camion camionElectrique = factoryElectrique.construireCamion();
        automobileElectrique.methodeAutomobile();
        scooterElectrique.methodeScooter();
        camionElectrique.methodeCamion();
    }
}
