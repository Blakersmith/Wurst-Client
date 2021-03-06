/*
 * Copyright � 2014 - 2015 | Alexander01998 | All rights reserved.
 * 
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package tk.wurst_client.mod;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeMap;

import tk.wurst_client.mod.Mod.Info;
import tk.wurst_client.mod.mods.*;

public class ModManager
{
	private final TreeMap<String, Mod> mods = new TreeMap<String, Mod>(
		new Comparator<String>()
		{
			@Override
			public int compare(String o1, String o2)
			{
				return o1.compareToIgnoreCase(o2);
			}
		});
	
	public ModManager()
	{
		addMod(new AntiAFK());
		addMod(new AntiBlind());
		addMod(new AntiFire());
		addMod(new AntiKnockback());
		addMod(new AntiPotion());
		addMod(new AntiSpam());
		addMod(new ArenaBrawl());
		addMod(new AutoArmor());
		addMod(new AutoEat());
		addMod(new AutoFish());
		addMod(new AutoMine());
		addMod(new AutoRespawn());
		addMod(new AutoSign());
		addMod(new AutoSprint());
		addMod(new AutoSteal());
		addMod(new AutoSwitch());
		addMod(new AutoSword());
		addMod(new AutoTool());
		addMod(new AutoWalk());
		addMod(new BaseFinder());
		addMod(new Blink());
		addMod(new BowAimbot());
		addMod(new BuildRandom());
		addMod(new BunnyHop());
		addMod(new ChestESP());
		addMod(new ClickGUI());
		addMod(new Criticals());
		addMod(new Derp());
		addMod(new Dolphin());
		addMod(new FastBreak());
		addMod(new FastBow());
		addMod(new FastEat());
		addMod(new FastLadder());
		addMod(new FastPlace());
		addMod(new FightBot());
		addMod(new Flight());
		addMod(new Follow());
		addMod(new ForceOP());
		addMod(new Freecam());
		addMod(new Fullbright());
		addMod(new Glide());
		addMod(new GoToCmd());
		addMod(new Headless());
		addMod(new HealthTags());
		addMod(new HighJump());
		addMod(new Home());
		addMod(new InstantBunker());
		addMod(new Invisibility());
		addMod(new ItemESP());
		addMod(new Jesus());
		addMod(new Jetpack());
		addMod(new Kaboom());
		addMod(new Killaura());
		addMod(new KillauraLegit());
		addMod(new Liquids());
		addMod(new LSD());
		addMod(new MassTPA());
		addMod(new MileyCyrus());
		addMod(new MobESP());
		addMod(new MultiAura());
		addMod(new NameProtect());
		addMod(new NameTags());
		addMod(new NoFall());
		addMod(new NoHurtcam());
		addMod(new NoSlowdown());
		addMod(new NoWeb());
		addMod(new Nuker());
		addMod(new NukerLegit());
		addMod(new Overlay());
		addMod(new Panic());
		addMod(new Phase());
		addMod(new PlayerESP());
		addMod(new PlayerFinder());
		addMod(new ProphuntESP());
		addMod(new Protect());
		addMod(new Pwnage());
		addMod(new Regen());
		addMod(new RemoteView());
		addMod(new Search());
		addMod(new Sneak());
		addMod(new Spammer());
		addMod(new SpeedNuker());
		addMod(new Spider());
		addMod(new Step());
		addMod(new Throw());
		addMod(new Timer());
		addMod(new Tracers());
		addMod(new TriggerBot());
		addMod(new TrueSight());
		addMod(new XRay());
		addMod(new YesCheat());
		addMod(new AutoBuild());
	}
	
	public Mod getModByClass(Class<?> modClass)
	{
		return mods.get(modClass.getAnnotation(Info.class).name());
	}
	
	public Mod getModByName(String name)
	{
		return mods.get(name);
	}
	
	public Collection<Mod> getAllMods()
	{
		return mods.values();
	}
	
	public int countMods()
	{
		return mods.size();
	}
	
	private void addMod(Mod mod)
	{
		mods.put(mod.getName(), mod);
		mod.initSliders();
	}
}
