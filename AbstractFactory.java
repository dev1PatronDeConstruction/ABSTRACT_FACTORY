public abstract class AbstractFactory {
    public abstract Automobile construireAutomobile();

    public abstract Scooter construireScooter();

    public static AbstractFactory pourCategorie(String categorie) {
        if ("essence".equalsIgnoreCase(categorie)) {
            return new FactoryEssence();
        }
        if ("electrique".equalsIgnoreCase(categorie) || "électrique".equalsIgnoreCase(categorie)) {
            return new FactoryElectrique();
        }
        throw new IllegalArgumentException("Catégorie inconnue : " + categorie);
    }
}

class FactoryEssence extends AbstractFactory {
    @Override
    public Automobile construireAutomobile() {
        return new AutomobileEssence();
    }

    @Override
    public Scooter construireScooter() {
        return new ScooterEssence();
    }
}

class FactoryElectrique extends AbstractFactory {
    @Override
    public Automobile construireAutomobile() {
        return new AutomobileElectrique();
    }

    @Override
    public Scooter construireScooter() {
        return new ScooterElectrique();
    }
}
