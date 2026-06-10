package com.airbnb.epoxy.stickyheader;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class StickyHeaderLinearLayoutManager$onLayoutChildren$1 extends Lambda implements a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ StickyHeaderLinearLayoutManager f6715j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.s f6716k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.x f6717l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickyHeaderLinearLayoutManager$onLayoutChildren$1(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.s sVar, RecyclerView.x xVar) {
        super(0);
        this.f6715j = stickyHeaderLinearLayoutManager;
        this.f6716k = sVar;
        this.f6717l = xVar;
    }

    @Override // u7.a
    public final n k0() {
        super/*androidx.recyclerview.widget.LinearLayoutManager*/.k0(this.f6716k, this.f6717l);
        return n.f16010a;
    }
}
