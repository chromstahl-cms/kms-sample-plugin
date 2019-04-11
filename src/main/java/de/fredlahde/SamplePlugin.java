package de.fredlahde;

import software.kloud.KMSPluginSDK.IKMSPlugin;

public class SamplePlugin implements IKMSPlugin {
    @Override
    public void init() {
        new Foo().bar();
    }
}
