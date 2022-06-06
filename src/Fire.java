public class Fire extends Pokémon {
    private int hp;
    private String food;

    public Fire(String name, int level, int hp, String food) {
        super(name,level);
        super.setType("Fire");
        this.hp=hp;
        this.food=food;
    }

    @Override
    public void eat() {
        System.out.println("I eat "+this.food);
    }

    public void flamethrower() {
        System.out.println("I throw flames");
    }


    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
