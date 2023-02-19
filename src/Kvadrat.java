public class Kvadrat extends Predmet{

    @Override
    protected void povrsina() {
        super.povrsina();
        System.out.println(Math.pow(x, 2));
    }
}
