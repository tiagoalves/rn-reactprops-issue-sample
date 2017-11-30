package com.rnreactpropsissuesample.SampleModule;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

import android.view.View;

public class SampleModuleManager extends SimpleViewManager<SampleModuleView> {

    public static final String REACT_CLASS = "SampleModule";
    public static final String PROP_START_POS = "start";
    public static final String PROP_START_FOO_BAR_POS = "startfoobar";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected SampleModuleView createViewInstance(ThemedReactContext context) {
        return new SampleModuleView(context);
    }

    @ReactProp(name=PROP_START_POS)
    public void setStartPosition(SampleModuleView gradientView, ReadableArray startPos) {
        gradientView.setStartPosition(startPos);
    }

    @ReactProp(name=PROP_START_FOO_BAR_POS)
    public void setStartFooBarPosition(SampleModuleView gradientView, ReadableArray startPos) {
        gradientView.setStartPosition(startPos);
    }
}
