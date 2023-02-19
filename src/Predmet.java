public class Predmet {

    protected double x;
    protected double y;
    protected double r;

    protected double PI = Math.PI;
    protected void povrsina(){
        System.out.println("Povrsina predmeta je: ");
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }
}
