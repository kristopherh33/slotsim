import java.util.*;
public class reel
{
    //each reel has a top, a middle, and a bottom symbol
    public static int numberOfPositions = 3;
    sym[] setOfSymbols = new sym[numberOfPositions];
    int numberForSymbol;
    Random symbolRNG = new Random();

    //create a new reel
    public reel()
    {
        //symbol 0 / top
        numberForSymbol = symbolRNG.nextInt(6);
        setOfSymbols[0] = getSymbol(numberForSymbol);

        //symbol 1 / mid
        numberForSymbol = symbolRNG.nextInt(6);
        setOfSymbols[1] = getSymbol(numberForSymbol);

        //symbol 2 / low
        numberForSymbol = symbolRNG.nextInt(6);
        setOfSymbols[2] = getSymbol(numberForSymbol);
    }

    @Override
    public String toString() {
        return "reel{" +
                "setOfSymbols=" + Arrays.toString(setOfSymbols) +
                '}';
    }

    public sym returnSymbolAtPos(int pos)
    {
        sym symbol;
        symbol = setOfSymbols[pos];
        return symbol;
    }

    //determine the symbol based on the rng
    public sym getSymbol(int rng)
    {
        sym returnSymbol = sym.BLANK;
        switch (rng)
        {
            case 0:
                returnSymbol = sym.CHERRY;
                break;
            case 1:
                returnSymbol = sym.ONEBAR;
                break;
            case 2:
                returnSymbol = sym.TWOBAR;
                break;
            case 3:
                returnSymbol = sym.THREEBAR;
                break;
            case 4:
                returnSymbol = sym.SEVEN;
                break;
            case 5:
                returnSymbol = sym.BLANK;
                break;
        }
        return returnSymbol;
    }

}
