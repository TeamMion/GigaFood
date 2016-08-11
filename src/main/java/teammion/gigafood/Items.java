/*
 * Copyright (c) 2016, Team Mion
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package teammion.gigafood;

import teammion.gigafood.item.*;
import teammion.gigafood.util.Registry;

/**
 * Created on 11.08.16 at 14:19
 *
 * @author Stefan Wimmer <stefanwimmer128@gmail.com>
 */
public class Items extends net.minecraft.init.Items
{
    public static final Item APPLE_CHOCOLATE = new Item("apple_chocolate");
    public static final ItemFood APPLE_CHOCOLATE_COATED = new ItemFood("apple_chocolate_coated", 8);
    public static final Item BREAD_DOUGH = new Item("bread_dough");
    public static final Item BREAD_SLICE = new Item("bread_slice");
    public static final ItemFood CHOCOLATE = new ItemFood("chocolate", 8);
    public static final ItemDrink CHOCOLATE_DRINK = new ItemDrink("chocolate_drink", 4);
    public static final ItemFood CHOCOLATE_PIECE = new ItemFood("chocolate_piece", 1);
    public static final Item COCOA_BEAN_GROUND = new Item("cocoa_bean_ground");
    public static final Item COCOA_BEAN_ROASTED = new Item("cocoa_bean_roasted");
    public static final ItemFood EGG_BOILED = new ItemFood("egg_boiled", 3);
    public static final ItemFood FISH_STICK = new ItemFood("fish_stick", 6);
    public static final Item FISH_STICK_RAW = new Item("fish_stick_raw");
    public static final Item FLOUR = new Item("flour");
    public static final ItemFood FRENCH_FRIES = new ItemFood("french_fries", 6);
    public static final Item FRENCH_FRIES_RAW = new Item("french_fries_raw");
    public static final ItemMilkBottle MILK_BOTTLE = new ItemMilkBottle();
    public static final ItemFood SANDWICH_CHICKEN = new ItemFood("sandwich_chicken", 5);
    public static final ItemFood SANDWICH_FISH = new ItemFood("sandwich_fish", 5);
    public static final ItemFood SANDWICH_PORKCHOP = new ItemFood("sandwich_porkchop", 5);
    public static final ItemFood SANDWICH_SCHNITZEL = new ItemFood("sandwich_schnitzel", 5);
    public static final ItemFood SCHNITZEL = new ItemFood("schnitzel", 4);
    public static final Item SCHNITZEL_RAW = new Item("schnitzel_raw");
    public static final ItemStrawberry STRAWBERRY = new ItemStrawberry();
    public static final Item STRAWBERRY_CHOCOLATE = new Item("strawberry_chocolate");
    public static final ItemFood STRAWBERRY_CHOCOLATE_COATED = new ItemFood("strawberry_chocolate_coated", 8);
    
    public static void register()
    {
        Registry.register(APPLE_CHOCOLATE);
        Registry.register(APPLE_CHOCOLATE_COATED);
        Registry.register(BREAD_DOUGH);
        Registry.register(BREAD_SLICE);
        Registry.register(CHOCOLATE);
        Registry.register(CHOCOLATE_DRINK);
        Registry.register(CHOCOLATE_PIECE);
        Registry.register(COCOA_BEAN_GROUND);
        Registry.register(COCOA_BEAN_ROASTED);
        Registry.register(EGG_BOILED);
        Registry.register(FISH_STICK);
        Registry.register(FISH_STICK_RAW);
        Registry.register(FLOUR);
        Registry.register(FRENCH_FRIES);
        Registry.register(FRENCH_FRIES_RAW);
        Registry.register(MILK_BOTTLE);
        Registry.register(SANDWICH_CHICKEN);
        Registry.register(SANDWICH_FISH);
        Registry.register(SANDWICH_PORKCHOP);
        Registry.register(SANDWICH_SCHNITZEL);
        Registry.register(SCHNITZEL);
        Registry.register(SCHNITZEL_RAW);
        Registry.register(STRAWBERRY);
        Registry.register(STRAWBERRY_CHOCOLATE);
        Registry.register(STRAWBERRY_CHOCOLATE_COATED);
    }
    
    public static void render()
    {
        Registry.render(APPLE_CHOCOLATE);
        Registry.render(APPLE_CHOCOLATE_COATED);
        Registry.render(BREAD_DOUGH);
        Registry.render(BREAD_SLICE);
        Registry.render(CHOCOLATE);
        Registry.render(CHOCOLATE_DRINK);
        Registry.render(CHOCOLATE_PIECE);
        Registry.render(COCOA_BEAN_GROUND);
        Registry.render(COCOA_BEAN_ROASTED);
        Registry.render(EGG_BOILED);
        Registry.render(FISH_STICK);
        Registry.render(FISH_STICK_RAW);
        Registry.render(FLOUR);
        Registry.render(FRENCH_FRIES);
        Registry.render(FRENCH_FRIES_RAW);
        Registry.render(MILK_BOTTLE);
        Registry.render(SANDWICH_CHICKEN);
        Registry.render(SANDWICH_FISH);
        Registry.render(SANDWICH_PORKCHOP);
        Registry.render(SANDWICH_SCHNITZEL);
        Registry.render(SCHNITZEL);
        Registry.render(SCHNITZEL_RAW);
        Registry.render(STRAWBERRY);
        Registry.render(STRAWBERRY_CHOCOLATE);
        Registry.render(STRAWBERRY_CHOCOLATE_COATED);
    }
}
