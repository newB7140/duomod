package duomod.content;

import arc.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.struct.*;
import mindustry.content.*;
import mindustry.ctype.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.experimental.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import duomod.content.duomodItems.*;

import static mindustry.type.ItemStack.*;

public class duomodBlocks implements ContentList{
    public static Block

    //production
    duoniumcomposer;

    @Override
    public void load(){

        duoniumcomposer = new GenericCrafter("duoniumcomposer"){{
            requirements(Category.crafting, with(Items.copper, 60));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(Items.copper, 1);
        }};
    }
}
