package com.airbnb.epoxy;

import android.os.Handler;

/* loaded from: classes.dex */
public abstract class TypedEpoxyController<T> extends m {
    private boolean allowModelBuildRequests;
    private T currentData;

    public TypedEpoxyController() {
    }

    public TypedEpoxyController(Handler handler, Handler handler2) {
        super(handler, handler2);
    }

    @Override // com.airbnb.epoxy.m
    public final void buildModels() {
        if (!isBuildingModels()) {
            throw new IllegalStateException("You cannot call `buildModels` directly. Call `setData` instead to trigger a model refresh with new data.");
        }
        buildModels(this.currentData);
    }

    public abstract void buildModels(T t10);

    public final T getCurrentData() {
        return this.currentData;
    }

    @Override // com.airbnb.epoxy.m
    public void moveModel(int i10, int i11) {
        this.allowModelBuildRequests = true;
        super.moveModel(i10, i11);
        this.allowModelBuildRequests = false;
    }

    @Override // com.airbnb.epoxy.m
    public void requestDelayedModelBuild(int i10) {
        if (!this.allowModelBuildRequests) {
            throw new IllegalStateException("You cannot call `requestModelBuild` directly. Call `setData` instead to trigger a model refresh with new data.");
        }
        super.requestDelayedModelBuild(i10);
    }

    @Override // com.airbnb.epoxy.m
    public final void requestModelBuild() {
        if (!this.allowModelBuildRequests) {
            throw new IllegalStateException("You cannot call `requestModelBuild` directly. Call `setData` instead to trigger a model refresh with new data.");
        }
        super.requestModelBuild();
    }

    public final void setData(T t10) {
        this.currentData = t10;
        this.allowModelBuildRequests = true;
        requestModelBuild();
        this.allowModelBuildRequests = false;
    }
}
