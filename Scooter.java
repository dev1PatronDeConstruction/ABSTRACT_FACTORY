public abstract class Scooter {
    public abstract void methodeScooter();
}

class ScooterEssence extends Scooter {
    @Override
    public void methodeScooter() {
        System.out.println("Scooter à essence");
    }
}

class ScooterElectrique extends Scooter {
    @Override
    public void methodeScooter() {
        System.out.println("Scooter électrique");
    }
}
