package console;

/**
 * Created by dalub on 28.01.2017.
 */
public class Misc {

    public Misc()
    {
    }

    public int getRandomNumber(int min,int max)
    {
        int rand = 0;
        while (rand < min)
        {
            rand = (int) (Math.random() * max);
        }
        return rand;
    }

}
