public class Grapewine extends Flower{
    @Override
    public void waterPlant() {
        this.chanceOfGrowth=1.5*chanceOfGrowth;
    }
}
