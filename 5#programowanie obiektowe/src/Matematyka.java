public class Matematyka {
    public static void main(String[] args) {

        Matematyka n = new Matematyka();
        n.className();
        System.out.println(n.sqrt(5));
        System.out.println(n.sqrt(55));
        System.out.println(n.sqrt(555));
        System.out.println(n.sqrt(5.5));
        System.out.println(n.sqrt(10.5));
        System.out.println(n.sqrt(55.5));
    }

    public void className()

    {
        System.out.printf("Matematyka");
    }

    public int sqrt(int a)
    {
        return a*a;
    }
    public double sqrt(double a)
    {
        return a*a;
    }
}

