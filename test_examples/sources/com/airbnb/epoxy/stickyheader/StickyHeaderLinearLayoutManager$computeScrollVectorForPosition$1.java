package com.airbnb.epoxy.stickyheader;

import android.graphics.PointF;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.a;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/PointF;", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class StickyHeaderLinearLayoutManager$computeScrollVectorForPosition$1 extends Lambda implements a<PointF> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ StickyHeaderLinearLayoutManager f6703j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f6704k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickyHeaderLinearLayoutManager$computeScrollVectorForPosition$1(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, int i10) {
        super(0);
        this.f6703j = stickyHeaderLinearLayoutManager;
        this.f6704k = i10;
    }

    @Override // u7.a
    public final PointF k0() {
        PointF a10;
        a10 = super/*androidx.recyclerview.widget.LinearLayoutManager*/.a(this.f6704k);
        return a10;
    }
}
