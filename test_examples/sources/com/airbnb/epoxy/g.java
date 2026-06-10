package com.airbnb.epoxy;

import com.airbnb.epoxy.m;
import java.util.List;

/* loaded from: classes.dex */
public abstract class g<T extends m> {
    public abstract void resetAutoModels();

    public void setControllerToStageTo(r<?> rVar, T t10) {
        rVar.f6684e = t10;
    }

    public void validateModelHashCodesHaveNotChanged(T t10) {
        List<? extends r<?>> list = t10.getAdapter().f6665j.f6626f;
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.get(i10).v("Model has changed since it was added to the controller.", i10);
        }
    }
}
