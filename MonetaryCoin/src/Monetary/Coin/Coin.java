package Monetary.Coin;
import java.util.Random;
public class Coin {

//declare HEADS,TAILS and face
private final int HEADS = 0;
private final int Tails = 1;
private int face;

//Set up the coin by flipping it
public Coin() {flip();}

//Flip the coin random (using Math.random method) to choose a face value
public void flip()
{
    face = (int)(Math.random() *2);
}

// Return true if is coin face is HEADS
public boolean isHEADS()
    {
        return (face==HEADS);
    }

    // Return the face of the coin as string

public String toString()
    {
    String faceName;
    if(face == HEADS)
            faceName="Heads";
        else
            faceName= "Tails";
    return faceName;
    }
}
