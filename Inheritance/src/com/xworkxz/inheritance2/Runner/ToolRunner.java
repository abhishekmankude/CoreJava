package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.subclass.Hammer;
import com.xworkxz.inheritance2.superclass.Tool;

public class ToolRunner {
    public static void main(String[] args) {
        Tool tool = new Tool();
        tool.useTool();
        tool.sharpen();
        tool.clean();
        tool.store();
        tool.repair();

        Tool tool1 = new Hammer();
        tool1.useTool();
        tool1.sharpen();
        tool1.clean();
        tool1.store();
        tool1.repair();

        Hammer hammer = new Hammer();
        hammer.useTool();
        hammer.sharpen();
        hammer.clean();
        hammer.store();
        hammer.repair();
    }
}