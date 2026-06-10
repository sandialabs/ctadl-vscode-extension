package com.noto.app.util;

import com.airbnb.epoxy.EpoxyRecyclerView;
import com.noto.app.domain.model.NotoColor;

/* loaded from: classes.dex */
public final class EpoxyUtilsKt {
    public static final void a(EpoxyRecyclerView epoxyRecyclerView, NotoColor notoColor) {
        epoxyRecyclerView.p0(new EpoxyUtilsKt$setupProgressIndicator$1(notoColor));
    }
}
