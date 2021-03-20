package Units;

public abstract class Factory {
    public abstract InfantryUnit createInfantryUnit(UnitType type);
    public abstract MechanizedUnit createMechanizedUnit(UnitType type);
    public abstract NavyUnit createNavyUnit(UnitType type);

}
