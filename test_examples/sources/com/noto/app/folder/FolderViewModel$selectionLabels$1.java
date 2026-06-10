package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.util.ModelUtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x6.h0;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\u008a@"}, d2 = {"Ln6/c;", "", "Lx6/h0;", "notes", "Ly6/h;", "labels", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.FolderViewModel$selectionLabels$1", f = "FolderViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FolderViewModel$selectionLabels$1 extends SuspendLambda implements u7.q<n6.c<? extends List<? extends h0>>, List<? extends y6.h>, p7.c<? super List<? extends y6.h>>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ n6.c f8531m;
    public /* synthetic */ List n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ FolderViewModel f8532o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderViewModel$selectionLabels$1(FolderViewModel folderViewModel, p7.c<? super FolderViewModel$selectionLabels$1> cVar) {
        super(3, cVar);
        this.f8532o = folderViewModel;
    }

    @Override // u7.q
    public final Object O(n6.c<? extends List<? extends h0>> cVar, List<? extends y6.h> list, p7.c<? super List<? extends y6.h>> cVar2) {
        FolderViewModel$selectionLabels$1 folderViewModel$selectionLabels$1 = new FolderViewModel$selectionLabels$1(this.f8532o, cVar2);
        folderViewModel$selectionLabels$1.f8531m = cVar;
        folderViewModel$selectionLabels$1.n = list;
        return folderViewModel$selectionLabels$1.k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        n6.c cVar = this.f8531m;
        List<y6.h> list = this.n;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) n6.d.a(cVar, EmptyList.f12981i)) {
            if (((h0) obj2).c) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(n7.l.Z1(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((h0) it.next()).f18684b);
        }
        ArrayList a22 = n7.l.a2(arrayList2);
        ArrayList arrayList3 = new ArrayList(n7.l.Z1(list, 10));
        for (y6.h hVar : list) {
            t6.c cVar2 = hVar.f18912a;
            arrayList3.add(new y6.h(cVar2, a22.contains(cVar2)));
        }
        if (!arrayList3.isEmpty()) {
            FolderViewModel folderViewModel = this.f8532o;
            if (folderViewModel.f8443w) {
                folderViewModel.f8443w = false;
                return kotlin.collections.c.G2(arrayList3, ModelUtilsKt.f9849b);
            }
            return arrayList3;
        }
        return arrayList3;
    }
}
