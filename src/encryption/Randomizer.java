package encryption;


/**
 * Created by dalub on 26.11.2016.
 */
public class Randomizer {

    public static double getRandomDouble(double min, double max)
    {
        double rand = 0.0;
        while (rand < min)
        {
            rand = (Math.random() * max);
        }
        return rand;
    }

    public static int getRandomInt(int min, int max)
    {
        int rand = 0;
        while (rand < min)
        {
            rand = (int)(Math.random() * max);
        }
        return rand;
    }

    public static char getRandomChar(char min, char max)
    {
        char rand = ' ';
        int minCode = (int) min;
        while((int) rand < minCode)
        {
            rand = (char) (Math.random()*(int)max);
        }
        return rand;
    }

}
