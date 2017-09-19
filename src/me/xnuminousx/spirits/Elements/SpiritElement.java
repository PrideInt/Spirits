package me.xnuminousx.spirits.Elements;

import com.projectkorra.projectkorra.Element;
import com.projectkorra.projectkorra.Element.SubElement;
import com.projectkorra.projectkorra.ProjectKorra;

public class SpiritElement {
	
	public static final Element SPIRIT = new Element("Spirit", null, ProjectKorra.plugin);
	public static final SubElement LIGHT_SPIRIT = new SubElement("LightSpirit", SpiritElement.SPIRIT, null, ProjectKorra.plugin);
	public static final SubElement DARK_SPIRIT = new SubElement("DarkSpirit", SpiritElement.SPIRIT, null, ProjectKorra.plugin);
	
	public static final SubElement ENERGY= new SubElement("Energy", Element.AVATAR, null, ProjectKorra.plugin);
	public static final Element DARK_AVATAR = new Element("DarkAvatar", null, ProjectKorra.plugin);
}
