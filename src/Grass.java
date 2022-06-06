public class Grass extends Pokémon{
    private String defence, color;

    public Grass(String name, int level, String defence, String color) {
        super(name,level);
        super.setType("Grass");
        this.defence =defence;
        this.color =color;
    }

    @Override
    public void eat(){
        System.out.println("I eat green stuff");
    }

    public void leaveBlade(){
        System.out.println("I am leaving the blades");
    }

        public String getDefence() {
        return defence;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
