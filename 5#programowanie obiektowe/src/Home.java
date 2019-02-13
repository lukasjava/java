public class Home
{
    public static void main(String[] args)
    {
    TV sony= new TV( 45, "sony2");
    TV sung= new TV(32, "sung2");

        System.out.println(sung.getSize() +" " + sung.getName());
        System.out.println(sony.getSize() +" " + sony.getName());
    }
}
