package com.airbnb.epoxy;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView$r;", "invoke", "()Landroidx/recyclerview/widget/RecyclerView$r;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class EpoxyRecyclerView$initViewPool$1 extends Lambda implements u7.a<RecyclerView.r> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ EpoxyRecyclerView f6590j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyRecyclerView$initViewPool$1(EpoxyRecyclerView epoxyRecyclerView) {
        super(0);
        this.f6590j = epoxyRecyclerView;
    }

    @Override // u7.a
    public final RecyclerView.r k0() {
        this.f6590j.getClass();
        return new p0();
    }
}
