import Units.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Factory blueFactory = new BlueFactory();
        Factory redFactory = new RedFactory();

        MechanizedUnit redTank = redFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit blueRifleman = blueFactory.createInfantryUnit(UnitType.RIFLEMAN);
        NavyUnit redWarschip = redFactory.createNavyUnit(UnitType.WARSHIP);

    }
}
