package Units;

public class RedFactory extends Factory {
    @Override
    public InfantryUnit createInfantryUnit(UnitType type) {

        switch (type){
            case RIFLEMAN:
                return new Rifleman(100,0,10);
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType type) {
        switch (type){
            case TANK:
                return new Tank(180,0,18);
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public NavyUnit createNavyUnit(UnitType type) {
        switch (type){
            case WARSHIP:
                return new Warship(500,0,50);
            default:
                throw new UnsupportedOperationException();
        }
    }
}
