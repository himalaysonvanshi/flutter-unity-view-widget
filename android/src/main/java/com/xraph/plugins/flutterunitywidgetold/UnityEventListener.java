package com.xraph.plugins.flutterunitywidgetold;

public interface UnityEventListener {
    void onMessage(String message);

    void onSceneLoaded(String name, int buildIndex, boolean isLoaded, boolean isValid);
}
