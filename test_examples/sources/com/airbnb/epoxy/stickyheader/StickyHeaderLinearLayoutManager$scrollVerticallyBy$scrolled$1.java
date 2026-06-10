package com.airbnb.epoxy.stickyheader;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.a;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class StickyHeaderLinearLayoutManager$scrollVerticallyBy$scrolled$1 extends Lambda implements a<Integer> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ StickyHeaderLinearLayoutManager f6722j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f6723k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.s f6724l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.x f6725m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickyHeaderLinearLayoutManager$scrollVerticallyBy$scrolled$1(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        super(0);
        this.f6722j = stickyHeaderLinearLayoutManager;
        this.f6723k = i10;
        this.f6724l = sVar;
        this.f6725m = xVar;
    }

    @Override // u7.a
    public final Integer k0() {
        int x02;
        x02 = super/*androidx.recyclerview.widget.LinearLayoutManager*/.x0(this.f6723k, this.f6724l, this.f6725m);
        return Integer.valueOf(x02);
    }
}
