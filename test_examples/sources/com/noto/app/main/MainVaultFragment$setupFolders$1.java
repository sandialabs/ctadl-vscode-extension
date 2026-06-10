package com.noto.app.main;

import android.content.Context;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.airbnb.epoxy.m;
import com.noto.R;
import com.noto.app.util.ModelUtilsKt;
import f7.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m7.n;
import o6.i;
import u7.l;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/airbnb/epoxy/m;", "Lm7/n;", "invoke", "(Lcom/airbnb/epoxy/m;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MainVaultFragment$setupFolders$1 extends Lambda implements l<m, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ MainVaultFragment f8895j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ List<Pair<t6.a, Integer>> f8896k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ boolean f8897l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainVaultFragment$setupFolders$1(MainVaultFragment mainVaultFragment, List<Pair<t6.a, Integer>> list, boolean z10) {
        super(1);
        this.f8895j = mainVaultFragment;
        this.f8896k = list;
        this.f8897l = z10;
    }

    @Override // u7.l
    public final n U(m mVar) {
        m mVar2 = mVar;
        g.f(mVar2, "$this$withModels");
        MainVaultFragment mainVaultFragment = this.f8895j;
        Context j2 = mainVaultFragment.j();
        if (j2 != null) {
            List<Pair<t6.a, Integer>> list = this.f8896k;
            if (list.isEmpty()) {
                i iVar = new i();
                iVar.E();
                iVar.F(q.f(j2, R.string.vault_is_empty, new Object[0]));
                mVar2.add(iVar);
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((t6.a) ((Pair) obj).f12962i).f17600j) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (!((t6.a) ((Pair) obj2).f12962i).f17600j) {
                        arrayList2.add(obj2);
                    }
                }
                boolean z10 = !arrayList.isEmpty();
                boolean z11 = this.f8897l;
                if (z10) {
                    o6.g gVar = new o6.g();
                    gVar.l("pinned");
                    gVar.H(q.f(j2, R.string.pinned, new Object[0]));
                    mVar2.add(gVar);
                    ModelUtilsKt.l(arrayList, 1, new MainVaultFragment$setupFolders$1$1$2$1(mVar2, mainVaultFragment, z11));
                    if (!arrayList2.isEmpty()) {
                        o6.g gVar2 = new o6.g();
                        gVar2.l("libraries");
                        gVar2.H(q.f(j2, R.string.folders, new Object[0]));
                        mVar2.add(gVar2);
                    }
                }
                ModelUtilsKt.l(arrayList2, 1, new MainVaultFragment$setupFolders$1$1$2$1(mVar2, mainVaultFragment, z11));
            }
        }
        return n.f16010a;
    }
}
