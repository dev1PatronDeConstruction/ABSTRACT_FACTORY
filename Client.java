public class Client {
    public static void main(String[] args) {
        String categorie = args.length == 0 ? "Essence" : args[0];
        AbstractFactory factory = AbstractFactory.pourCategorie(categorie);

        System.out.println("Famille " + categorie + " :");
        Automobile automobile = factory.construireAutomobile();
        Scooter scooter = factory.construireScooter();

        automobile.methodeAutomobile();
        scooter.methodeScooter();
    }
}
