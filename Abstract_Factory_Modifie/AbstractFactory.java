public abstract class AbstractFactory {
    public abstract Automobile construireAutomobile();
    public abstract Scooter construireScooter();
    public abstract Camion construireCamion();
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

    @Override
    public Camion construireCamion() {
        return new CamionEssence();
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

    @Override
    public Camion construireCamion() {
        return new CamionElectrique();
    }
}
