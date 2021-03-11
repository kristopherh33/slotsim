public class testMain
{
    public static void main(String[] args)
    {
        reel newReel1 = new reel();
        reel newReel2 = new reel();
        reel newReel3 = new reel();

        System.out.println(newReel1.toString());

        payline newPayline = new payline(3);
        System.out.println(newPayline.toString());
    }
}
