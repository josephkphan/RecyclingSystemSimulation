package resources;

import currency.Cash;
import currency.USMoney;

/**
 * Contains Constants used throughout the project
 */
public class Constants {
    public static int GLASS_PRICE = 150;
    public static int METAL_PRICE = 200;
    public static int PAPER_PRICE = 50;
    public static int PLASTIC_PRICE = 100;
    //Note that since data is now Persistent ^ These values dont matter. they'll be overwritten by the data file

    public static double MAX_GLASS_LOAD = 100;
    public static double MAX_METAL_LOAD = 100;
    public static double MAX_PAPER_LOAD = 100;
    public static double MAX_PLASTIC_LOAD = 100;

    public static String getPrice(int cents) {
        USMoney temp = new Cash(0, cents);
        return temp.toString();
    }
}
