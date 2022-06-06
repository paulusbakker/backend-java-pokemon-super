public class Electric extends Pokémon{
    private String sound, attack;

    public Electric(String name, int level, String sound, String attack) {
        super(name, level);
        super.setType("Electric");
        this.sound=sound;
        this.attack=attack;
    }

    @Override
    public void eat(){
        System.out.println("I eat batteries");
    }

    public void electroBall() {
        System.out.println("doing something");
    }

      public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }
}
