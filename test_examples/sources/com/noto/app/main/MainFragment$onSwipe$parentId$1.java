package com.noto.app.main;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import u7.l;
import v7.g;
import z6.d;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "Lt6/a;", "", "it", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class MainFragment$onSwipe$parentId$1 extends Lambda implements l<Pair<? extends t6.a, ? extends Integer>, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ d f8851j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainFragment$onSwipe$parentId$1(d dVar) {
        super(1);
        this.f8851j = dVar;
    }

    @Override // u7.l
    public final Boolean U(Pair<? extends t6.a, ? extends Integer> pair) {
        boolean z10;
        Pair<? extends t6.a, ? extends Integer> pair2 = pair;
        g.f(pair2, "it");
        long j2 = ((t6.a) pair2.f12962i).f17592a;
        Long l2 = this.f8851j.E().f17593b;
        if (l2 != null && j2 == l2.longValue()) {
            z10 = true;
            return Boolean.valueOf(z10);
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
