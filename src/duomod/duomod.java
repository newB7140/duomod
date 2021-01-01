package duomod;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import duomod.content.*;
import arc.graphics.Color;
import mindustry.type.Item;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class duomod extends Mod{

    public duomod(){}

    @Override
    public void loadContent(){
        new duomodItems().load();
        new duomodBlocks().load();
    }
}
