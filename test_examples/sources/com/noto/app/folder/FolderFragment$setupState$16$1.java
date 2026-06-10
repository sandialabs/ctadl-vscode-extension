package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.StateFlowImpl;
import n6.c;
import x6.h0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lm7/n;", "invoke", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FolderFragment$setupState$16$1 extends Lambda implements u7.l<Boolean, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ FolderFragment f8407j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ v<Boolean> f8408k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderFragment$setupState$16$1(FolderFragment folderFragment, v<Boolean> vVar) {
        super(1);
        this.f8407j = folderFragment;
        this.f8408k = vVar;
    }

    @Override // u7.l
    public final m7.n U(Boolean bool) {
        Object bVar;
        Boolean bool2 = bool;
        v7.g.e(bool2, "it");
        if (bool2.booleanValue()) {
            int i10 = FolderFragment.f8358k0;
            FolderViewModel a02 = this.f8407j.a0();
            StateFlowImpl stateFlowImpl = a02.f8434m;
            n6.c cVar = (n6.c) ((kotlinx.coroutines.flow.m) a02.m()).getValue();
            if (cVar instanceof c.a) {
                bVar = c.a.f16110a;
            } else if (cVar instanceof c.b) {
                List<h0> list = (List) ((c.b) cVar).f16111a;
                ArrayList arrayList = new ArrayList(n7.l.Z1(list, 10));
                int i11 = -1;
                for (h0 h0Var : list) {
                    arrayList.add(h0.a(h0Var, null, true, i11, 3));
                    i11++;
                }
                bVar = new c.b(arrayList);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            stateFlowImpl.setValue(bVar);
            this.f8408k.i(Boolean.FALSE);
        }
        return m7.n.f16010a;
    }
}
