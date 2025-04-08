package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Hammer;
import com.xworkxz.inheritance2.superclass.Tool;

public class Ladder {
    public void maintain(Tool tool) {
        tool.useTool();
        tool.sharpen();
        tool.clean();
        tool.store();
        tool.repair();

        if(tool instanceof Hammer) {
            Hammer hammer = (Hammer)tool;
            hammer.country();
        }
    }
}