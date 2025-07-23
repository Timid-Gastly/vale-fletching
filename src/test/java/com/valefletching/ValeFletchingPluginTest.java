package com.valefletching;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ValeFletchingPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(ValeFletchingPlugin.class);
		RuneLite.main(args);
	}
}