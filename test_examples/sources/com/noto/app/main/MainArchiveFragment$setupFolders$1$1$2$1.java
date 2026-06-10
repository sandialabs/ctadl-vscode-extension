package com.noto.app.main;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.airbnb.epoxy.m;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import v7.g;
import z6.f;
import z6.k;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Pair;", "Lt6/a;", "", "entry", "depth", "Lm7/n;", "invoke", "(Lkotlin/Pair;I)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class MainArchiveFragment$setupFolders$1$1$2$1 extends Lambda implements p<Pair<? extends t6.a, ? extends Integer>, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ m f8831j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ MainArchiveFragment f8832k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ boolean f8833l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainArchiveFragment$setupFolders$1$1$2$1(m mVar, MainArchiveFragment mainArchiveFragment, boolean z10) {
        super(2);
        this.f8831j = mVar;
        this.f8832k = mainArchiveFragment;
        this.f8833l = z10;
    }

    @Override // u7.p
    public final n R(Pair<? extends t6.a, ? extends Integer> pair, Integer num) {
        boolean z10;
        Pair<? extends t6.a, ? extends Integer> pair2 = pair;
        int intValue = num.intValue();
        g.f(pair2, "entry");
        f fVar = new f();
        t6.a aVar = (t6.a) pair2.f12962i;
        fVar.M(aVar.f17592a);
        fVar.L(aVar);
        fVar.Q(((Number) pair2.f12963j).intValue());
        fVar.N(false);
        MainArchiveFragment mainArchiveFragment = this.f8832k;
        Long l2 = (Long) mainArchiveFragment.f8825v0.getValue();
        if (l2 != null) {
            if (aVar.f17592a == l2.longValue()) {
                z10 = true;
                fVar.O(z10);
                fVar.P(this.f8833l);
                fVar.p();
                fVar.f19137p = intValue;
                fVar.R(new z6.g(mainArchiveFragment, 0, pair2));
                fVar.T(new k(mainArchiveFragment, pair2, 2));
                fVar.S(new w6.f(0));
                this.f8831j.add(fVar);
                return n.f16010a;
            }
        }
        z10 = false;
        fVar.O(z10);
        fVar.P(this.f8833l);
        fVar.p();
        fVar.f19137p = intValue;
        fVar.R(new z6.g(mainArchiveFragment, 0, pair2));
        fVar.T(new k(mainArchiveFragment, pair2, 2));
        fVar.S(new w6.f(0));
        this.f8831j.add(fVar);
        return n.f16010a;
    }
}
