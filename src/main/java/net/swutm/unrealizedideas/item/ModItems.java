package net.swutm.unrealizedideas.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.swutm.unrealizedideas.item.custom.ModArmorMaterials;
import net.swutm.unrealizedideas.unrealizedideas;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, unrealizedideas.MOD_ID);

    public static final RegistryObject<Item> LEATHER_AND_MAIL_HELMET = ITEMS.register("leather_and_mail_helmet",
            () -> new ArmorItem(ModArmorMaterials.LEATHER_AND_MAIL, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LEATHER_AND_MAIL_CHESTPLATE = ITEMS.register("leather_and_mail_chestplate",
            () -> new ArmorItem(ModArmorMaterials.LEATHER_AND_MAIL, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LEATHER_AND_MAIL_LEGGING = ITEMS.register("leather_and_mail_leggings",
            () -> new ArmorItem(ModArmorMaterials.LEATHER_AND_MAIL, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LEATHER_AND_MAIL_BOOTS = ITEMS.register("leather_and_mail_boots",
            () -> new ArmorItem(ModArmorMaterials.LEATHER_AND_MAIL, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
