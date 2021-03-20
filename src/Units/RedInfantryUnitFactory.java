package Units;

public class RedInfantryUnitFactory extends InfantryFactory {

    @Override
    public InfantryUnit createUnit(UnitType type) {

        switch (type){
            case TANK:
                return new Tank(200,0,20);
            case RIFLEMAN:
                return new Rifleman(100,0,10);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }
}
