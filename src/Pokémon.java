public abstract class Pokémon {
    private String name,type;
    private int level;

    public Pokémon(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void eat() {
        System.out.println("I eat");
    }

    public void speaks() {
        System.out.println("bla bla bla");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
