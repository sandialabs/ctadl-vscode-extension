package com.airbnb.epoxy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ImmutableModelException extends RuntimeException {
    public ImmutableModelException(r rVar, String str, int i10) {
        super(str + " Position: " + i10 + " Model: " + rVar.toString() + "\n\nEpoxy attribute fields on a model cannot be changed once the model is added to a controller. Check that these fields are not updated, or that the assigned objects are not mutated, outside of the buildModels method. The only exception is if the change is made inside an Interceptor callback. Consider using an interceptor if you need to change a model after it is added to the controller and before it is set on the adapter. If the model is already set on the adapter then you must call `requestModelBuild` instead to recreate all models.");
    }
}
