import java.util.Arrays;

public class payline
{
    //a payline looks at a row of symbols and looks for a set of symbols. if there are a certain combo, the game pays
    //a payline can have any combination of high, mid low: example: Reel 1 mid, reel 2 mid, reel 3 mid.


    //get number of positions per reel
    int positionsPerReel = reel.sym.values().length;
    int[] paylinePositions;

    public payline(int numReels)
    {
        //get number of reels, and group the reels together
        reel[] payline = new reel[numReels];
        paylinePositions = new int[reel.numberOfPositions];

        //determine which section of reel 1 to read
        //this can be an array location for the reel 0 - length-1
        paylinePositions[0] = 1; //equals center

        //same for reel 2
        paylinePositions[1] = 1; //equals center

        //same for reel 3
        paylinePositions[2] = 1; //equals center
    }

    public int returnPaylinePosLocation(int pos)
    {
        return paylinePositions[pos];
    }

    @Override
    public String toString() {
        return "payline{" +
                "positionsPerReel=" + positionsPerReel +
                ", paylinePositions=" + Arrays.toString(paylinePositions) +
                '}';
    }
}
