public abstract class Animal {

    protected String type;
    protected String name;
    protected Size size;
    protected String specialCare;

    /**
     * gives you the ability to pet your animals
     */
    public abstract void animalPetting();

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", specialCare='" + specialCare + '\'' +
                '}';
    }
}
