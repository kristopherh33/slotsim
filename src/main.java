public class main
{
    public static void main(String[] args)
    {
        int win = 0; //how much the payline wins

        //generate three reels
        reel newReel1 = new reel();
        reel newReel2 = new reel();
        reel newReel3 = new reel();

        //generate one payline: line 1
        payline lineOne = new payline(3);

        //group the reels
        reel[] reelGroup = new reel[] {newReel1, newReel2, newReel3};

        //get the value of the win
        win = readPayline(lineOne, reelGroup);
    }

    public static int readPayline(payline inPayline, reel[] reels)
    {
        int win = 0;
        sym.sym[] storedsym = new sym.sym[3];

        //read the sym.symbols along the payline
        for (int i = 0; i < reels.length; i++)
        {
            storedsym[i] = reels[i].returnsymbolAtPos(inPayline.paylinePositions[i]);

        }

        //check for cherries
        int numCherries = 0;
        for (int i = 0; i < storedsym.symbols.length; i++)
        {
            if (storedsym.symbols[i] == sym.sym.CHERRY)
            {
                numCherries++;
            }
            //loop through until we reach the end
        }

        //pay based on cherries
        switch (numCherries)
        {
            case 0:
                break;
            case 3:
                return 10;
            case 2:
                return 5;
            case 1:
                return 2;
            default:
                break;
        }


        //check first sym.symbol
        sym.sym firstsym.sym = storedsym.symbols[0];

        //determine that sym.symbol
        //bars are special case
        case (storedsym.symbols[0])
        {
            case sym.sym.ONEBAR:
                    if ((storedsym.symbols[1] == sym.sym.TWOBAR) || (storedsym.symbols[1] == sym.sym.THREEBAR))
                    {
                        if ((storedsym.symbols[2] == sym.sym.TWOBAR) || (storedsym.symbols[2] == sym.sym.THREEBAR))
                        {
                            return 5;
                        }
                    }
                    break;
            case sym.sym.TWOBAR:
                if ((storedsym.symbols[1] == sym.sym.ONEBAR) || (storedsym.symbols[1] == sym.sym.THREEBAR))
                {
                    if ((storedsym.symbols[2] == sym.sym.ONEBAR) || (storedsym.symbols[2] == sym.sym.THREEBAR))
                    {
                        return 5;
                    }
                }
                break;
            case sym.sym.THREEBAR:
                if ((storedsym.symbols[1] == sym.sym.ONEBAR) || (storedsym.symbols[1] == sym.sym.TWOBAR))
                {
                    if ((storedsym.symbols[2] == sym.sym.ONEBAR) || (storedsym.symbols[2] == sym.sym.TWOBAR))
                    {
                        return 5;
                    }
                }
                break;
            default:
                break;
        }

        //check for 3oaks
        case (storedsym.symbols[0])
        {
            case sym.sym.ONEBAR:
                if ((storedsym.symbols[1] == sym.sym.ONEBAR) && (storedsym.symbols[2] == sym.sym.ONEBAR))
                {
                    return 10;
                }
            case sym.sym.TWOBAR:
                if ((storedsym.symbols[1] == sym.sym.TWOBAR) && (storedsym.symbols[2] == sym.sym.TWOBAR))
                {
                   return 20;
                }
            case sym.sym.THREEBAR:
                if ((storedsym.symbols[1] == sym.sym.THREEBAR) && (storedsym.symbols[2] == sym.sym.THREEBAR))
                {
                    return 40;
                }
            case sym.sym.SEVEN:
                if ((storedsym.symbols[1] == sym.sym.SEVEN) && (storedsym.symbols[2] == sym.sym.SEVEN))
                {
                    return 80;
                }
            case sym.sym.BLANK:
                return 0; //we checked cherries, so blanks automatically break a 3oak
            default:
                break;
        }
        return win;
    }

    /*
    Here is our paytable
         7 x3 - 80
         3Bar x3 - 40
         2Bar x3 - 25
         1Bar x3 - 10
         Cherries x3 - 10
         Mixed (any) bars - 5
         Two cherries anywhere - 5
         One cherry anywhere - 2
         Everything else - nothing
     */
    //the amount of money depends on FIRST sym.symbol AND that we have all three of that sym.symbol
    //EXCEPT for anybar and cherries 1 and 2
}

