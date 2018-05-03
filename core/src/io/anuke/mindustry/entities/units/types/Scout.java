package io.anuke.mindustry.entities.units.types;

import io.anuke.mindustry.content.AmmoTypes;
import io.anuke.mindustry.entities.units.GroundUnitType;

public class Scout extends GroundUnitType {

    public Scout(){
        super("scout");
        setAmmo(AmmoTypes.basicIron);
    }
}
