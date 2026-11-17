public abstract class Camion {
    public abstract void methodeCamion();
}

class CamionEssence extends Camion {
    @Override
    public void methodeCamion() {
        System.out.println("Camion à essence");
    }
}

class CamionElectrique extends Camion {
    @Override
    public void methodeCamion() {
        System.out.println("Camion électrique");
    }
}
