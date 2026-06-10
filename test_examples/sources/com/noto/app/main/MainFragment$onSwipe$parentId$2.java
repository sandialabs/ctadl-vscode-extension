package com.noto.app.main;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.util.ModelUtilsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import u7.l;
import v7.g;
import z6.d;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "Lt6/a;", "", "it", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class MainFragment$onSwipe$parentId$2 extends Lambda implements l<Pair<? extends t6.a, ? extends Integer>, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ d f8852j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ d f8853k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainFragment$onSwipe$parentId$2(d dVar, d dVar2) {
        super(1);
        this.f8852j = dVar;
        this.f8853k = dVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    @Override // u7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean U(Pair<? extends t6.a, ? extends Integer> pair) {
        boolean z10;
        boolean z11;
        Pair<? extends t6.a, ? extends Integer> pair2 = pair;
        g.f(pair2, "it");
        t6.a aVar = (t6.a) pair2.f12962i;
        boolean a10 = g.a(aVar.f17593b, this.f8852j.E().f17593b);
        boolean z12 = false;
        d dVar = this.f8853k;
        if (dVar != null) {
            if (aVar.f17592a == dVar.E().f17592a) {
                z10 = true;
                if (ModelUtilsKt.j(aVar.f17610u, new MainFragment$onSwipe$parentId$2$isWithinPreviousFolders$1(dVar)) == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (a10 && (z10 || z11)) {
                    z12 = true;
                }
                return Boolean.valueOf(z12);
            }
        }
        z10 = false;
        if (ModelUtilsKt.j(aVar.f17610u, new MainFragment$onSwipe$parentId$2$isWithinPreviousFolders$1(dVar)) == null) {
        }
        if (a10) {
            z12 = true;
        }
        return Boolean.valueOf(z12);
    }
}
