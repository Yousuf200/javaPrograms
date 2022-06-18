class circle {
    private int r;

    public void setrad(int i) {
        r = i;
    }

    public int getrad() {
        return r;
    }

}

public class gettersetter {
    public static void main(String[] args) {

        circle c = new circle();

        c.setrad(112);
        System.out.println(c.getrad());
    }

}
