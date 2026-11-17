public abstract class AbstractFactory {
    public abstract Automobile construireAutomobile();

    public abstract Scooter construireScooter();
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
