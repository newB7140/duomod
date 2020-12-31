package example.content;

import mindustry.ctype.ContentList;
import example.content.*;

public class duomod implements ContentList;
    private final ContentLists[] contents = {
            new DItems()
    };

    public void load() {
        for (ContentList list : contents) {
            list.load();
        }
    }
