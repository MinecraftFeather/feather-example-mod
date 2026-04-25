package com.feather.example;

import com.feather.loader.api.FeatherEvents;

public class ExampleMod {

    // This method is called automatically by the ModLoader
    public void init() {
        System.out.println("[HelloMod] Mod has been recognized successfully!");

        // Using the event system to subscribe to the engine initialization event
        FeatherEvents.subscribeInit(() -> {
            System.out.println("=======================================");
            System.out.println("  Welcome to Feather Loader!           ");
            System.out.println("  The example mod is running smoothly. ");
            System.out.println("=======================================");
        });
    }
}
