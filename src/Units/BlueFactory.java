package Units;

public class BlueFactory extends Factory{

    @Override
    public InfantryUnit createInfantryUnit(UnitType type) {

        switch (type){
            case RIFLEMAN:
                return new Rifleman(90,0,11);
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType type) {
        switch (type){
            case TANK:
                return new Tank(200,0,20);
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
