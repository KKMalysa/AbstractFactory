package Units;

public class BlueInfantryUnitFactory extends InfantryFactory {

    @Override
    public InfantryUnit createUnit(UnitType type) {

        switch (type){
            case TANK:
                return new Tank(180,0,22);
            case RIFLEMAN:
                return new Rifleman(90,0,11);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }
}
