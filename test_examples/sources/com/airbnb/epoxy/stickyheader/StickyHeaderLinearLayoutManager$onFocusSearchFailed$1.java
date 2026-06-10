package com.airbnb.epoxy.stickyheader;

import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.a;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class StickyHeaderLinearLayoutManager$onFocusSearchFailed$1 extends Lambda implements a<View> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ StickyHeaderLinearLayoutManager f6711j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ View f6712k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f6713l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.s f6714m;
    public final /* synthetic */ RecyclerView.x n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickyHeaderLinearLayoutManager$onFocusSearchFailed$1(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, View view, int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        super(0);
        this.f6711j = stickyHeaderLinearLayoutManager;
        this.f6712k = view;
        this.f6713l = i10;
        this.f6714m = sVar;
        this.n = xVar;
    }

    @Override // u7.a
    public final View k0() {
        View Z;
        Z = super/*androidx.recyclerview.widget.LinearLayoutManager*/.Z(this.f6712k, this.f6713l, this.f6714m, this.n);
        return Z;
    }
}
