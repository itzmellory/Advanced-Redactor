package advancedredactor;

import arc.*;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;

public class AdvancedRedactorMod extends Mod {

    public AdvancedRedactorMod() {
        Events.on(ClientLoadEvent.class, e -> {
            Log.info("Advanced Redactor loaded!");
        });
    }

    @Override
    public void init() {
    }
}
