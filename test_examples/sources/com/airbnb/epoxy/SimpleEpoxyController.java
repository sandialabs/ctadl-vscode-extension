package com.airbnb.epoxy;

import java.util.List;

/* loaded from: classes.dex */
public class SimpleEpoxyController extends m {
    private List<? extends r<?>> currentModels;
    private boolean insideSetModels;

    @Override // com.airbnb.epoxy.m
    public final void buildModels() {
        if (!isBuildingModels()) {
            throw new IllegalEpoxyUsage("You cannot call `buildModels` directly. Call `setModels` instead.");
        }
        add(this.currentModels);
    }

    @Override // com.airbnb.epoxy.m
    public final void requestModelBuild() {
        if (!this.insideSetModels) {
            throw new IllegalEpoxyUsage("You cannot call `requestModelBuild` directly. Call `setModels` instead.");
        }
        super.requestModelBuild();
    }

    public void setModels(List<? extends r<?>> list) {
        this.currentModels = list;
        this.insideSetModels = true;
        requestModelBuild();
        this.insideSetModels = false;
    }
}
