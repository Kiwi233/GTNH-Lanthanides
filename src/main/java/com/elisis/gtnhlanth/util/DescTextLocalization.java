package com.elisis.gtnhlanth.util;

import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

public class DescTextLocalization {

    public static final String BLUEPRINT_INFO =
            "Follow the" + EnumChatFormatting.BLUE + " Structure" + EnumChatFormatting.DARK_BLUE + "Lib"
                    + EnumChatFormatting.GRAY + " hologram projector to build the main structure.";

    public static String[] addText(String preFix, int length) {
        String[] text = new String[length];
        for (int i = 0; i < length; i++) {
            text[i] = StatCollector.translateToLocal(preFix + "." + i);
        }
        return text;
    }
}
