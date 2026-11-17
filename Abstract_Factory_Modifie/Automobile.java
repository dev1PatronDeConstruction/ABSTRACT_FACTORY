public abstract class Automobile {
    public abstract void methodeAutomobile();
}

class AutomobileEssence extends Automobile {
    @Override
    public void methodeAutomobile() {
        System.out.println("Automobile à essence");
    }
}

class AutomobileElectrique extends Automobile {
    @Override
    public void methodeAutomobile() {
        System.out.println("Automobile électrique");
    }
}
