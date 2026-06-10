package com.noto.app.util;

import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.epoxy.EpoxyRecyclerView;
import kotlin.Metadata;
import v7.g;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/noto/app/util/PreviewRecyclerView;", "Lcom/airbnb/epoxy/EpoxyRecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PreviewRecyclerView extends EpoxyRecyclerView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        g.f(context, "context");
        g.f(attributeSet, "attrs");
        setNestedScrollingEnabled(false);
    }
}
