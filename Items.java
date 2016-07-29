package ca.thecow.morearmors.init;

import ca.thecow.morearmors.Ref;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Items {
	
	public static final CreativeTabs tabMoreArmors = new CreativeTabs("moreArmors"){
		@Override
		public Item getTabIconItem(){
			return Items.ruby;
		}
	};
	
	public static ToolMaterial rubby = EnumHelper.addToolMaterial("rubby", 2, 275, 6.5F, 2.5F, 14);
	public static ToolMaterial copper = EnumHelper.addToolMaterial("copper", 1, 131, 5.0F, 1.5F, 5);
	public static ToolMaterial saphir = EnumHelper.addToolMaterial("saphir", 2, 275, 6.5F, 2.5F, 14);
	public static ToolMaterial amethyste = EnumHelper.addToolMaterial("amethyste", 3, 1600, 10.0F, 4.0F, 10);
	public static ToolMaterial perridot = EnumHelper.addToolMaterial("peridot", 3, 1600, 10.0F, 4.0F, 10);
	public static ToolMaterial iri = EnumHelper.addToolMaterial("iri", 3, 2500, 50.0F, 14.0F, 30);
	
	public static ArmorMaterial rubbyy = EnumHelper.addArmorMaterial("rubby", "ruby", 20, new int[]{2, 6, 5, 2}, 9);
	public static ArmorMaterial coper = EnumHelper.addArmorMaterial("coper", "copper", 10, new int[]{2, 5, 4, 1}, 5);
	public static ArmorMaterial sapphire = EnumHelper.addArmorMaterial("sapphire", "sapphir", 20, new int[]{2, 6, 5, 2}, 9);
	public static ArmorMaterial ame = EnumHelper.addArmorMaterial("ame", "amethyst", 33, new int[]{3, 8, 6, 3}, 12);
	public static ArmorMaterial peri = EnumHelper.addArmorMaterial("peri", "peridot", 33, new int[]{3, 8, 6, 3}, 12);
	public static ArmorMaterial irri = EnumHelper.addArmorMaterial("irri", "iridium", 40, new int[]{4, 9, 7, 4}, 20);
	
	public static Item ruby, ruby_axe, ruby_pickaxe, ruby_hoe, ruby_shovel, ruby_sword, ruby_helmet, ruby_chestplate, ruby_leggings, ruby_boots;
	public static Item copper_ingot, copper_axe, copper_pickaxe, copper_hoe, copper_shovel, copper_sword, copper_helmet, copper_chestplate, copper_leggings, copper_boots;
	public static Item sapphir, sapphir_axe, sapphir_pickaxe, sapphir_hoe, sapphir_shovel, sapphir_sword, sapphir_helmet, sapphir_chestplate, sapphir_leggings, sapphir_boots;
	public static Item amethyst, amethyst_axe, amethyst_pickaxe, amethyst_hoe, amethyst_shovel, amethyst_sword, amethyst_helmet, amethyst_chestplate, amethyst_leggings, amethyst_boots;
	public static Item peridot, peridot_axe, peridot_pickaxe, peridot_hoe, peridot_shovel, peridot_sword, peridot_helmet, peridot_chestplate, peridot_leggings, peridot_boots;
	public static Item iridium, iridium_axe, iridium_pickaxe, iridium_hoe, iridium_shovel, iridium_sword, iridium_helmet, iridium_chestplate, iridium_leggings, iridium_boots;

	
	public static void init(){
		//RUBY
		
		ruby = new Item().setUnlocalizedName("ruby").setCreativeTab(Items.tabMoreArmors);
		ruby_axe = new ItemModAxe(rubby).setUnlocalizedName("ruby_axe").setCreativeTab(Items.tabMoreArmors);
		ruby_pickaxe = new ItemModPickaxe(rubby).setUnlocalizedName("ruby_pickaxe").setCreativeTab(Items.tabMoreArmors);
		ruby_hoe = new ItemModHoe(rubby).setUnlocalizedName("ruby_hoe").setCreativeTab(Items.tabMoreArmors);
		ruby_shovel = new ItemModShovel(rubby).setUnlocalizedName("ruby_shovel").setCreativeTab(Items.tabMoreArmors);
		ruby_sword = new ItemModSword(rubby).setUnlocalizedName("ruby_sword").setCreativeTab(Items.tabMoreArmors);
		ruby_helmet = new ItemModArmor(rubbyy, 0).setUnlocalizedName("ruby_helmet").setCreativeTab(Items.tabMoreArmors);
		ruby_chestplate = new ItemModArmor(rubbyy, 1).setUnlocalizedName("ruby_chestplate").setCreativeTab(Items.tabMoreArmors);
		ruby_leggings = new ItemModArmor(rubbyy, 2).setUnlocalizedName("ruby_leggings").setCreativeTab(Items.tabMoreArmors);
		ruby_boots = new ItemModArmor(rubbyy, 3).setUnlocalizedName("ruby_boots").setCreativeTab(Items.tabMoreArmors);
		
		//COPPER
		
		copper_ingot = new Item().setUnlocalizedName("copper_ingot").setCreativeTab(Items.tabMoreArmors);
		copper_axe = new ItemModAxe(copper).setUnlocalizedName("copper_axe").setCreativeTab(Items.tabMoreArmors);
		copper_pickaxe = new ItemModPickaxe(copper).setUnlocalizedName("copper_pickaxe").setCreativeTab(Items.tabMoreArmors);
		copper_hoe = new ItemModHoe(copper).setUnlocalizedName("copper_hoe").setCreativeTab(Items.tabMoreArmors);
		copper_shovel = new ItemModShovel(copper).setUnlocalizedName("copper_shovel").setCreativeTab(Items.tabMoreArmors);
		copper_sword = new ItemModSword(copper).setUnlocalizedName("copper_sword").setCreativeTab(Items.tabMoreArmors);
		copper_helmet = new ItemModArmorCopper(coper, 0).setUnlocalizedName("copper_helmet").setCreativeTab(Items.tabMoreArmors);
		copper_chestplate = new ItemModArmorCopper(coper, 1).setUnlocalizedName("copper_chestplate").setCreativeTab(Items.tabMoreArmors);
		copper_leggings = new ItemModArmorCopper(coper, 2).setUnlocalizedName("copper_leggings").setCreativeTab(Items.tabMoreArmors);
		copper_boots = new ItemModArmorCopper(coper, 3).setUnlocalizedName("copper_boots").setCreativeTab(Items.tabMoreArmors);
		
		//SAPPHIRE
		
		sapphir = new Item().setUnlocalizedName("sapphir").setCreativeTab(Items.tabMoreArmors);
		sapphir_axe = new ItemModAxe(saphir).setUnlocalizedName("sapphir_axe").setCreativeTab(Items.tabMoreArmors);
		sapphir_pickaxe = new ItemModPickaxe(saphir).setUnlocalizedName("sapphir_pickaxe").setCreativeTab(Items.tabMoreArmors);
		sapphir_hoe = new ItemModHoe(saphir).setUnlocalizedName("sapphir_hoe").setCreativeTab(Items.tabMoreArmors);
		sapphir_shovel = new ItemModShovel(saphir).setUnlocalizedName("sapphir_shovel").setCreativeTab(Items.tabMoreArmors);
		sapphir_sword = new ItemModSword(saphir).setUnlocalizedName("sapphir_sword").setCreativeTab(Items.tabMoreArmors);
		sapphir_helmet = new ItemModArmorSapphir(sapphire, 0).setUnlocalizedName("sapphir_helmet").setCreativeTab(Items.tabMoreArmors);
		sapphir_chestplate = new ItemModArmorSapphir(sapphire, 1).setUnlocalizedName("sapphir_chestplate").setCreativeTab(Items.tabMoreArmors);
		sapphir_leggings = new ItemModArmorSapphir(sapphire, 2).setUnlocalizedName("sapphir_leggings").setCreativeTab(Items.tabMoreArmors);
		sapphir_boots = new ItemModArmorSapphir(sapphire, 3).setUnlocalizedName("sapphir_boots").setCreativeTab(Items.tabMoreArmors);
		
		//AMÉTHYSTE
		
		amethyst = new Item().setUnlocalizedName("amethyst").setCreativeTab(Items.tabMoreArmors);
		amethyst_axe = new ItemModAxe(amethyste).setUnlocalizedName("amethyst_axe").setCreativeTab(Items.tabMoreArmors);
		amethyst_pickaxe = new ItemModPickaxe(amethyste).setUnlocalizedName("amethyst_pickaxe").setCreativeTab(Items.tabMoreArmors);
		amethyst_hoe = new ItemModHoe(amethyste).setUnlocalizedName("amethyst_hoe").setCreativeTab(Items.tabMoreArmors);
		amethyst_shovel = new ItemModShovel(amethyste).setUnlocalizedName("amethyst_shovel").setCreativeTab(Items.tabMoreArmors);
		amethyst_sword = new ItemModSword(amethyste).setUnlocalizedName("amethyst_sword").setCreativeTab(Items.tabMoreArmors);
		amethyst_helmet = new ItemModArmorAme(ame, 0).setUnlocalizedName("amethyst_helmet").setCreativeTab(Items.tabMoreArmors);
		amethyst_chestplate = new ItemModArmorAme(ame, 1).setUnlocalizedName("amethyst_chestplate").setCreativeTab(Items.tabMoreArmors);
		amethyst_leggings = new ItemModArmorAme(ame, 2).setUnlocalizedName("amethyst_leggings").setCreativeTab(Items.tabMoreArmors);
		amethyst_boots = new ItemModArmorAme(ame, 3).setUnlocalizedName("amethyst_boots").setCreativeTab(Items.tabMoreArmors);
		
		//PÉRIDOT
		
		peridot = new Item().setUnlocalizedName("peridot").setCreativeTab(Items.tabMoreArmors);
		peridot_axe = new ItemModAxe(perridot).setUnlocalizedName("peridot_axe").setCreativeTab(Items.tabMoreArmors);
		peridot_pickaxe = new ItemModPickaxe(perridot).setUnlocalizedName("peridot_pickaxe").setCreativeTab(Items.tabMoreArmors);
		peridot_hoe = new ItemModHoe(perridot).setUnlocalizedName("peridot_hoe").setCreativeTab(Items.tabMoreArmors);
		peridot_shovel = new ItemModShovel(perridot).setUnlocalizedName("peridot_shovel").setCreativeTab(Items.tabMoreArmors);
		peridot_sword = new ItemModSword(perridot).setUnlocalizedName("peridot_sword").setCreativeTab(Items.tabMoreArmors);
		peridot_helmet = new ItemModArmorPeri(peri, 0).setUnlocalizedName("peridot_helmet").setCreativeTab(Items.tabMoreArmors);
		peridot_chestplate = new ItemModArmorPeri(peri, 1).setUnlocalizedName("peridot_chestplate").setCreativeTab(Items.tabMoreArmors);
		peridot_leggings = new ItemModArmorPeri(peri, 2).setUnlocalizedName("peridot_leggings").setCreativeTab(Items.tabMoreArmors);
		peridot_boots = new ItemModArmorPeri(peri, 3).setUnlocalizedName("peridot_boots").setCreativeTab(Items.tabMoreArmors);
		
		//IRIDIUM
		
		iridium = new Item().setUnlocalizedName("iridium").setCreativeTab(Items.tabMoreArmors);
		iridium_axe = new ItemModAxe(iri).setUnlocalizedName("iridium_axe").setCreativeTab(Items.tabMoreArmors);
		iridium_pickaxe = new ItemModPickaxe(iri).setUnlocalizedName("iridium_pickaxe").setCreativeTab(Items.tabMoreArmors);
		iridium_hoe = new ItemModHoe(iri).setUnlocalizedName("iridium_hoe").setCreativeTab(Items.tabMoreArmors);
		iridium_shovel = new ItemModShovel(iri).setUnlocalizedName("iridium_shovel").setCreativeTab(Items.tabMoreArmors);
		iridium_sword = new ItemModSword(iri).setUnlocalizedName("iridium_sword").setCreativeTab(Items.tabMoreArmors);
		iridium_helmet = new ItemModArmorIri(irri, 0).setUnlocalizedName("iridium_helmet").setCreativeTab(Items.tabMoreArmors);
		iridium_chestplate = new ItemModArmorIri(irri, 1).setUnlocalizedName("iridium_chestplate").setCreativeTab(Items.tabMoreArmors);
		iridium_leggings = new ItemModArmorIri(irri, 2).setUnlocalizedName("iridium_leggings").setCreativeTab(Items.tabMoreArmors);
		iridium_boots = new ItemModArmorIri(irri, 3).setUnlocalizedName("iridium_boots").setCreativeTab(Items.tabMoreArmors);
	}
	
	public static void register(){
		//RUBY
		
		GameRegistry.registerItem(ruby, "ruby");
		GameRegistry.registerItem(ruby_axe, "ruby_axe");
		GameRegistry.registerItem(ruby_pickaxe, "ruby_pickaxe");
		GameRegistry.registerItem(ruby_hoe, "ruby_hoe");
		GameRegistry.registerItem(ruby_shovel, "ruby_shovel");
		GameRegistry.registerItem(ruby_sword, "ruby_sword");
		GameRegistry.registerItem(ruby_helmet, "ruby_helmet");
		GameRegistry.registerItem(ruby_chestplate, "ruby_chestplate");
		GameRegistry.registerItem(ruby_leggings, "ruby_leggings");
		GameRegistry.registerItem(ruby_boots, "ruby_boots");
		
		//COPPER
		
		GameRegistry.registerItem(copper_ingot, "copper_ingot");
		GameRegistry.registerItem(copper_axe, "copper_axe");
		GameRegistry.registerItem(copper_pickaxe, "copper_pickaxe");
		GameRegistry.registerItem(copper_hoe, "copper_hoe");
		GameRegistry.registerItem(copper_shovel, "copper_shovel");
		GameRegistry.registerItem(copper_sword, "copper_sword");
		GameRegistry.registerItem(copper_helmet, "copper_helmet");
		GameRegistry.registerItem(copper_chestplate, "copper_chestplate");
		GameRegistry.registerItem(copper_leggings, "copper_leggings");
		GameRegistry.registerItem(copper_boots, "copper_boots");
		
		//SAPPHIRE
		
		GameRegistry.registerItem(sapphir, "sapphir");
		GameRegistry.registerItem(sapphir_axe, "sapphir_axe");
		GameRegistry.registerItem(sapphir_pickaxe, "sapphir_pickaxe");
		GameRegistry.registerItem(sapphir_hoe, "sapphir_hoe");
		GameRegistry.registerItem(sapphir_shovel, "sapphir_shovel");
		GameRegistry.registerItem(sapphir_sword, "sapphir_sword");
		GameRegistry.registerItem(sapphir_helmet, "sapphir_helmet");
		GameRegistry.registerItem(sapphir_chestplate, "sapphir_chestplate");
		GameRegistry.registerItem(sapphir_leggings, "sapphir_leggings");
		GameRegistry.registerItem(sapphir_boots, "sapphir_boots");
		
		//AMÉTHYSTE
		
		GameRegistry.registerItem(amethyst, "amethyst");
		GameRegistry.registerItem(amethyst_axe, "amethyst_axe");
		GameRegistry.registerItem(amethyst_pickaxe, "amethyst_pickaxe");
		GameRegistry.registerItem(amethyst_hoe, "amethyst_hoe");
		GameRegistry.registerItem(amethyst_shovel, "amethyst_shovel");
		GameRegistry.registerItem(amethyst_sword, "amethyst_sword");
		GameRegistry.registerItem(amethyst_helmet, "amethyst_helmet");
		GameRegistry.registerItem(amethyst_chestplate, "amethyst_chestplate");
		GameRegistry.registerItem(amethyst_leggings, "amethyst_leggings");
		GameRegistry.registerItem(amethyst_boots, "amethyst_boots");
		
		//PÉRIDOT
		
		GameRegistry.registerItem(peridot, "peridot");
		GameRegistry.registerItem(peridot_axe, "peridot_axe");
		GameRegistry.registerItem(peridot_pickaxe, "peridot_pickaxe");
		GameRegistry.registerItem(peridot_hoe, "peridot_hoe");
		GameRegistry.registerItem(peridot_shovel, "peridot_shovel");
		GameRegistry.registerItem(peridot_sword, "peridot_sword");
		GameRegistry.registerItem(peridot_helmet, "peridot_helmet");
		GameRegistry.registerItem(peridot_chestplate, "peridot_chestplate");
		GameRegistry.registerItem(peridot_leggings, "peridot_leggings");
		GameRegistry.registerItem(peridot_boots, "peridot_boots");
		
		
		//IRIDIUM
		
		GameRegistry.registerItem(iridium, "iridium");
		GameRegistry.registerItem(iridium_axe, "iridium_axe");
		GameRegistry.registerItem(iridium_pickaxe, "iridium_pickaxe");
		GameRegistry.registerItem(iridium_hoe, "iridium_hoe");
		GameRegistry.registerItem(iridium_shovel, "iridium_shovel");
		GameRegistry.registerItem(iridium_sword, "iridium_sword");
		GameRegistry.registerItem(iridium_helmet, "iridium_helmet");
		GameRegistry.registerItem(iridium_chestplate, "iridium_chestplate");
		GameRegistry.registerItem(iridium_leggings, "iridium_leggings");
		GameRegistry.registerItem(iridium_boots, "iridium_boots");
		
		//CRAFTS
		
		GameRegistry.addRecipe(new ItemStack(Items.copper_axe, 1), new Object[] {"CC ", "CS ", " S ", 'C', Items.copper_ingot, 'S', net.minecraft.init.Items.stick});
		GameRegistry.addRecipe(new ItemStack(Items.copper_pickaxe, 1), new Object[] {"CCC", " S ", " S ", 'C', Items.copper_ingot, 'S', net.minecraft.init.Items.stick});		
		GameRegistry.addRecipe(new ItemStack(Items.copper_hoe, 1), new Object[] {"CC ", " S ", " S ", 'C', Items.copper_ingot, 'S', net.minecraft.init.Items.stick});		
		GameRegistry.addRecipe(new ItemStack(Items.copper_shovel, 1), new Object[] {" C ", " S ", " S ", 'C', Items.copper_ingot, 'S', net.minecraft.init.Items.stick});
		GameRegistry.addRecipe(new ItemStack(Items.copper_sword, 1), new Object[] {" C ", " C ", " S ", 'C', Items.copper_ingot, 'S', net.minecraft.init.Items.stick});
		GameRegistry.addRecipe(new ItemStack(Items.copper_helmet, 1), new Object[] {"CCC", "C C", "   ", 'C', Items.copper_ingot});
		GameRegistry.addRecipe(new ItemStack(Items.copper_chestplate, 1), new Object[] {"C C", "CCC", "CCC", 'C', Items.copper_ingot});
		GameRegistry.addRecipe(new ItemStack(Items.copper_leggings, 1), new Object[] {"CCC", "C C", "C C", 'C', Items.copper_ingot});
		GameRegistry.addRecipe(new ItemStack(Items.copper_boots, 1), new Object[] {"   ", "C C", "C C", 'C', Items.copper_ingot});

		GameRegistry.addRecipe(new ItemStack(Items.ruby_axe, 1), new Object[] {"RR ", "RS ", " S ", 'R', Items.ruby, 'S', net.minecraft.init.Items.stick});
		GameRegistry.addRecipe(new ItemStack(Items.ruby_pickaxe, 1), new Object[] {"RRR", " S ", " S ", 'R', Items.ruby, 'S', net.minecraft.init.Items.stick});		
		GameRegistry.addRecipe(new ItemStack(Items.ruby_hoe, 1), new Object[] {"RR ", " S ", " S ", 'R', Items.ruby, 'S', net.minecraft.init.Items.stick});		
		GameRegistry.addRecipe(new ItemStack(Items.ruby_shovel, 1), new Object[] {" R ", " S ", " S ", 'R', Items.ruby, 'S', net.minecraft.init.Items.stick});
		GameRegistry.addRecipe(new ItemStack(Items.ruby_sword, 1), new Object[] {" R ", " R ", " S ", 'R', Items.ruby, 'S', net.minecraft.init.Items.stick});
		GameRegistry.addRecipe(new ItemStack(Items.ruby_helmet, 1), new Object[] {"RRR", "R R", "   ", 'R', Items.ruby});
		GameRegistry.addRecipe(new ItemStack(Items.ruby_chestplate, 1), new Object[] {"R R", "RRR", "RRR", 'R', Items.ruby});
		GameRegistry.addRecipe(new ItemStack(Items.ruby_leggings, 1), new Object[] {"RRR", "R R", "R R", 'R', Items.ruby});
		GameRegistry.addRecipe(new ItemStack(Items.ruby_boots, 1), new Object[] {"   ", "R R", "R R", 'R', Items.ruby});
		
		GameRegistry.addRecipe(new ItemStack(Items.sapphir_axe, 1), new Object[] {"BB ", "BS ", " S ", 'B', Items.sapphir, 'S', net.minecraft.init.Items.stick});
		GameRegistry.addRecipe(new ItemStack(Items.sapphir_pickaxe, 1), new Object[] {"BBB", " S ", " S ", 'B', Items.sapphir, 'S', net.minecraft.init.Items.stick});		
		GameRegistry.addRecipe(new ItemStack(Items.sapphir_hoe, 1), new Object[] {"BB ", " S ", " S ", 'B', Items.sapphir, 'S', net.minecraft.init.Items.stick});		
		GameRegistry.addRecipe(new ItemStack(Items.sapphir_shovel, 1), new Object[] {" B ", " S ", " S ", 'B', Items.sapphir, 'S', net.minecraft.init.Items.stick});
		GameRegistry.addRecipe(new ItemStack(Items.sapphir_sword, 1), new Object[] {" B ", " B ", " S ", 'B', Items.sapphir, 'S', net.minecraft.init.Items.stick});
		GameRegistry.addRecipe(new ItemStack(Items.sapphir_helmet, 1), new Object[] {"BBB", "B B", "   ", 'B', Items.sapphir});
		GameRegistry.addRecipe(new ItemStack(Items.sapphir_chestplate, 1), new Object[] {"B B", "BBB", "BBB", 'B', Items.sapphir});
		GameRegistry.addRecipe(new ItemStack(Items.sapphir_leggings, 1), new Object[] {"BBB", "B B", "B B", 'B', Items.sapphir});
		GameRegistry.addRecipe(new ItemStack(Items.sapphir_boots, 1), new Object[] {"   ", "B B", "B B", 'B', Items.sapphir});
		
		GameRegistry.addRecipe(new ItemStack(Items.amethyst_axe, 1), new Object[] {"AA ", "AS ", " S ", 'A', Items.amethyst, 'S', net.minecraft.init.Items.stick});
		GameRegistry.addRecipe(new ItemStack(Items.amethyst_pickaxe, 1), new Object[] {"AAA", " S ", " S ", 'A', Items.amethyst, 'S', net.minecraft.init.Items.stick});		
		GameRegistry.addRecipe(new ItemStack(Items.amethyst_hoe, 1), new Object[] {"AA ", " S ", " S ", 'A', Items.amethyst, 'S', net.minecraft.init.Items.stick});		
		GameRegistry.addRecipe(new ItemStack(Items.amethyst_shovel, 1), new Object[] {" A ", " S ", " S ", 'A', Items.amethyst, 'S', net.minecraft.init.Items.stick});
		GameRegistry.addRecipe(new ItemStack(Items.amethyst_sword, 1), new Object[] {" C ", " C ", " S ", 'C', Items.amethyst, 'S', net.minecraft.init.Items.stick});
		GameRegistry.addRecipe(new ItemStack(Items.amethyst_helmet, 1), new Object[] {"AAA", "A A", "   ", 'A', Items.amethyst});
		GameRegistry.addRecipe(new ItemStack(Items.amethyst_chestplate, 1), new Object[] {"A A", "AAA", "AAA", 'A', Items.amethyst});
		GameRegistry.addRecipe(new ItemStack(Items.amethyst_leggings, 1), new Object[] {"AAA", "A A", "A A", 'A', Items.amethyst});
		GameRegistry.addRecipe(new ItemStack(Items.amethyst_boots, 1), new Object[] {"   ", "A A", "A A", 'A', Items.amethyst});

		GameRegistry.addRecipe(new ItemStack(Items.peridot_axe, 1), new Object[] {"PP ", "PS ", " S ", 'P', Items.peridot, 'S', net.minecraft.init.Items.stick});
		GameRegistry.addRecipe(new ItemStack(Items.peridot_pickaxe, 1), new Object[] {"PPP", " S ", " S ", 'P', Items.peridot, 'S', net.minecraft.init.Items.stick});		
		GameRegistry.addRecipe(new ItemStack(Items.peridot_hoe, 1), new Object[] {"PP ", " S ", " S ", 'P', Items.peridot, 'S', net.minecraft.init.Items.stick});		
		GameRegistry.addRecipe(new ItemStack(Items.peridot_shovel, 1), new Object[] {" P ", " S ", " S ", 'P', Items.peridot, 'S', net.minecraft.init.Items.stick});
		GameRegistry.addRecipe(new ItemStack(Items.peridot_sword, 1), new Object[] {" P ", " P ", " S ", 'P', Items.peridot, 'S', net.minecraft.init.Items.stick});
		GameRegistry.addRecipe(new ItemStack(Items.peridot_helmet, 1), new Object[] {"PPP", "P P", "   ", 'P', Items.peridot});
		GameRegistry.addRecipe(new ItemStack(Items.peridot_chestplate, 1), new Object[] {"P P", "PPP", "PPP", 'P', Items.peridot});
		GameRegistry.addRecipe(new ItemStack(Items.peridot_leggings, 1), new Object[] {"PPP", "P P", "P P", 'P', Items.peridot});
		GameRegistry.addRecipe(new ItemStack(Items.peridot_boots, 1), new Object[] {"   ", "P P", "P P", 'P', Items.peridot});
		
		GameRegistry.addRecipe(new ItemStack(Items.iridium_axe, 1), new Object[] {"II ", "IS ", " S ", 'I', Items.iridium, 'S', net.minecraft.init.Items.stick});
		GameRegistry.addRecipe(new ItemStack(Items.iridium_pickaxe, 1), new Object[] {"III", " S ", " S ", 'I', Items.iridium, 'S', net.minecraft.init.Items.stick});		
		GameRegistry.addRecipe(new ItemStack(Items.iridium_hoe, 1), new Object[] {"II ", " S ", " S ", 'I', Items.iridium, 'S', net.minecraft.init.Items.stick});		
		GameRegistry.addRecipe(new ItemStack(Items.iridium_shovel, 1), new Object[] {" I ", " S ", " S ", 'I', Items.iridium, 'S', net.minecraft.init.Items.stick});
		GameRegistry.addRecipe(new ItemStack(Items.iridium_sword, 1), new Object[] {" I ", " I ", " S ", 'I', Items.iridium, 'S', net.minecraft.init.Items.stick});
		GameRegistry.addRecipe(new ItemStack(Items.iridium_helmet, 1), new Object[] {"III", "I I", "   ", 'I', Items.iridium});
		GameRegistry.addRecipe(new ItemStack(Items.iridium_chestplate, 1), new Object[] {"I I", "III", "III", 'I', Items.iridium});
		GameRegistry.addRecipe(new ItemStack(Items.iridium_leggings, 1), new Object[] {"III", "I I", "I I", 'I', Items.iridium});
		GameRegistry.addRecipe(new ItemStack(Items.iridium_boots, 1), new Object[] {"   ", "I I", "I I", 'I', Items.iridium});
		
		
	}
	
	public static void registerRenders(){
		//RUBY
		
		registerRender(ruby);
		registerRender(ruby_axe);
		registerRender(ruby_pickaxe);
		registerRender(ruby_hoe);
		registerRender(ruby_shovel);
		registerRender(ruby_sword);
		registerRender(ruby_helmet);
		registerRender(ruby_chestplate);
		registerRender(ruby_leggings);
		registerRender(ruby_boots);
		
		//COPPER

		registerRender(copper_ingot);
		registerRender(copper_axe);
		registerRender(copper_pickaxe);
		registerRender(copper_hoe);
		registerRender(copper_shovel);
		registerRender(copper_sword);
		registerRender(copper_helmet);
		registerRender(copper_chestplate);
		registerRender(copper_leggings);
		registerRender(copper_boots);
		
		//SAPPHIRE
		
		registerRender(sapphir);
		registerRender(sapphir_axe);
		registerRender(sapphir_pickaxe);
		registerRender(sapphir_hoe);
		registerRender(sapphir_shovel);
		registerRender(sapphir_sword);
		registerRender(sapphir_helmet);
		registerRender(sapphir_chestplate);
		registerRender(sapphir_leggings);
		registerRender(sapphir_boots);
		
		//AMÉTHYSTE
		
		registerRender(amethyst);
		registerRender(amethyst_axe);
		registerRender(amethyst_pickaxe);
		registerRender(amethyst_hoe);
		registerRender(amethyst_shovel);
		registerRender(amethyst_sword);
		registerRender(amethyst_helmet);
		registerRender(amethyst_chestplate);
		registerRender(amethyst_leggings);
		registerRender(amethyst_boots);
		
		//PÉRIDOT
		
		registerRender(peridot);
		registerRender(peridot_axe);
		registerRender(peridot_pickaxe);
		registerRender(peridot_hoe);
		registerRender(peridot_shovel);
		registerRender(peridot_sword);
		registerRender(peridot_helmet);
		registerRender(peridot_chestplate);
		registerRender(peridot_leggings);
		registerRender(peridot_boots);
		
		//IRIDIUM

		registerRender(iridium);
		registerRender(iridium_axe);
		registerRender(iridium_pickaxe);
		registerRender(iridium_hoe);
		registerRender(iridium_shovel);
		registerRender(iridium_sword);
		registerRender(iridium_helmet);
		registerRender(iridium_chestplate);
		registerRender(iridium_leggings);
		registerRender(iridium_boots);
		
		
	}
	
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Ref.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
