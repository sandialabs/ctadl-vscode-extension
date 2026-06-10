package com.noto.app.main;

import android.content.Context;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.airbnb.epoxy.m;
import com.noto.app.util.ModelUtilsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import v7.g;
import z6.a0;
import z6.f;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Pair;", "Lt6/a;", "", "entry", "depth", "Lm7/n;", "invoke", "(Lkotlin/Pair;I)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SelectFolderDialogFragment$setupFolders$1$1$5$1 extends Lambda implements p<Pair<? extends t6.a, ? extends Integer>, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ m f8966j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ boolean f8967k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ SelectFolderDialogFragment f8968l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ p<Long, String, n> f8969m;
    public final /* synthetic */ Context n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectFolderDialogFragment$setupFolders$1$1$5$1(m mVar, boolean z10, SelectFolderDialogFragment selectFolderDialogFragment, p<? super Long, ? super String, n> pVar, Context context) {
        super(2);
        this.f8966j = mVar;
        this.f8967k = z10;
        this.f8968l = selectFolderDialogFragment;
        this.f8969m = pVar;
        this.n = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0051  */
    @Override // u7.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n R(Pair<? extends t6.a, ? extends Integer> pair, Integer num) {
        boolean z10;
        boolean z11;
        final Pair<? extends t6.a, ? extends Integer> pair2 = pair;
        int intValue = num.intValue();
        g.f(pair2, "entry");
        f fVar = new f();
        t6.a aVar = (t6.a) pair2.f12962i;
        fVar.M(aVar.f17592a);
        fVar.L(aVar);
        fVar.Q(((Number) pair2.f12963j).intValue());
        boolean z12 = this.f8967k;
        SelectFolderDialogFragment selectFolderDialogFragment = this.f8968l;
        if (z12) {
            int i10 = SelectFolderDialogFragment.f8953x0;
            if (!selectFolderDialogFragment.g0().f19131e) {
                z10 = true;
                fVar.P(z10);
                int i11 = SelectFolderDialogFragment.f8953x0;
                if (aVar.f17592a != selectFolderDialogFragment.g0().c) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                fVar.O(z11);
                fVar.N(false);
                fVar.p();
                fVar.f19137p = intValue;
                final p<Long, String, n> pVar = this.f8969m;
                final Context context = this.n;
                fVar.R(new View.OnClickListener() { // from class: z6.b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        u7.p pVar2 = u7.p.this;
                        v7.g.f(pVar2, "$callback");
                        Pair pair3 = pair2;
                        v7.g.f(pair3, "$entry");
                        Context context2 = context;
                        v7.g.f(context2, "$context");
                        t6.a aVar2 = (t6.a) pair3.f12962i;
                        pVar2.R(Long.valueOf(aVar2.f17592a), ModelUtilsKt.o(context2, aVar2));
                    }
                });
                fVar.T(new a0());
                fVar.S(new w6.f(1));
                this.f8966j.add(fVar);
                return n.f16010a;
            }
        }
        z10 = false;
        fVar.P(z10);
        int i112 = SelectFolderDialogFragment.f8953x0;
        if (aVar.f17592a != selectFolderDialogFragment.g0().c) {
        }
        fVar.O(z11);
        fVar.N(false);
        fVar.p();
        fVar.f19137p = intValue;
        final p pVar2 = this.f8969m;
        final Context context2 = this.n;
        fVar.R(new View.OnClickListener() { // from class: z6.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u7.p pVar22 = u7.p.this;
                v7.g.f(pVar22, "$callback");
                Pair pair3 = pair2;
                v7.g.f(pair3, "$entry");
                Context context22 = context2;
                v7.g.f(context22, "$context");
                t6.a aVar2 = (t6.a) pair3.f12962i;
                pVar22.R(Long.valueOf(aVar2.f17592a), ModelUtilsKt.o(context22, aVar2));
            }
        });
        fVar.T(new a0());
        fVar.S(new w6.f(1));
        this.f8966j.add(fVar);
        return n.f16010a;
    }
}
