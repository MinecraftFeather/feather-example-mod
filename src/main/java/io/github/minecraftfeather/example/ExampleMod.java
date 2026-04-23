package io.github.minecraftfeather.example;

import com.feather.loader.api.FeatherMod;

public class ExampleMod implements FeatherMod {
    @Override
    public void onInitialize() {
        System.out.println("=======================================");
        System.out.println("  Hello from Feather Example Mod!      ");
        System.out.println("  I am running on the lightest loader. ");
        System.out.println("=======================================");
    }
  }
