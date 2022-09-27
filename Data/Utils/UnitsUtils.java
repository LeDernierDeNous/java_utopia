package Data.Utils;

import Data.Units.Units;

public class UnitsUtils {
    public static float getDPM(Units unit){
        return unit.getDamage()*(unit.getReloadTime() / 60);
    }
    
}
