import Units.InfantryFactory;
import Units.RedInfantryUnitFactory;
import Units.UnitType;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        InfantryFactory infantryFactory = new RedInfantryUnitFactory();
        ArrayList army = new ArrayList();

        for(int i=0; i<10; i++) {
            army.add(infantryFactory.createUnit(UnitType.TANK));
        }

        System.out.println(army);
    }
}
