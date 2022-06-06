public class Main {
    public static void main(String[] args) {
        Fire charmander = new Fire("charmander", 1, 200, "wood");
        Electric pikachu = new Electric("pikachu", 24, "pokidoki", "strong!!!!");
        Grass bulbasaur = new Grass("bulbasaur", 56, "weak", "green");
        Water squirtle = new Water("squirtle", -45, "Spanish", 85);
        charmander.flamethrower();
        pikachu.eat();
        squirtle.rainDance();
        System.out.println(bulbasaur.getType());
        squirtle.speaks();
    }
}
