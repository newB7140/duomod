package duomod.content;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.type.*;

public class duomodItems implements ContentList{
    public static Item duonium;

    @Override
    public void load(){
        duonium = new Item("duonium", Color.valueOf("bo7b6e")){{
            hardness = 3;
            cost = 2f;
        }};
    }
}