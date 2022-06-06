public class Water extends Pokémon {
    private String language;
    private int weight;

    public Water(String name, int level, String language, int weight) {
        super(name, level);
        super.setType("Water");
        this.language = language;
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("I eat fish");
    }

    public void rainDance() {
        System.out.println("I am doing the rain dance:)");
    }


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
