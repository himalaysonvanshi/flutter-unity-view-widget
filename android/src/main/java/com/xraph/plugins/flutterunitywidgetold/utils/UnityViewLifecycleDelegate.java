package com.xraph.plugins.flutterunitywidgetold.utils;

import com.xraph.plugins.flutterunitywidgetold.OnCreateUnityViewCallback;

public interface UnityViewLifecycleDelegate extends LifecycleDelegate {
  void getUnityPlayerAsync(OnCreateUnityViewCallback callback);
}
