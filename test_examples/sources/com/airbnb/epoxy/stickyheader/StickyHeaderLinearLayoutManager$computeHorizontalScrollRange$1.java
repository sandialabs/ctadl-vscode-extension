package com.airbnb.epoxy.stickyheader;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.a;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class StickyHeaderLinearLayoutManager$computeHorizontalScrollRange$1 extends Lambda implements a<Integer> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ StickyHeaderLinearLayoutManager f6701j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.x f6702k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickyHeaderLinearLayoutManager$computeHorizontalScrollRange$1(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.x xVar) {
        super(0);
        this.f6701j = stickyHeaderLinearLayoutManager;
        this.f6702k = xVar;
    }

    @Override // u7.a
    public final Integer k0() {
        return Integer.valueOf(this.f6701j.N0(this.f6702k));
    }
}
