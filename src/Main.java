public class Main {
    public static void main(String[] args) {

        Pravougaonik pravougaonik = new Pravougaonik();
        pravougaonik.setX(3);
        pravougaonik.setY(6);
        pravougaonik.povrsina();


        Kvadrat kvadrat = new Kvadrat();
        kvadrat.setX(9);
        kvadrat.povrsina();


        Krug krug = new Krug();
        krug.setR(4);
        krug.povrsina();

    }
}