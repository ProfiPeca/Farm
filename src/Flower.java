public abstract class Flower {

    protected String name;
    protected int price;
    protected int neededArea;
    protected double chanceOfGrowth;

    /**
     * waters the current plant, giving it higher chance of growing
     */
    public void waterPlant(){
        this.chanceOfGrowth=2*chanceOfGrowth;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }

}
