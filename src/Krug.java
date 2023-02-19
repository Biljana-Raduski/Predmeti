import java.text.DecimalFormat;

public class Krug extends Predmet{

    @Override
    protected void povrsina() {
        super.povrsina();
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(Math.pow(r, 2) * PI));
    }
}
