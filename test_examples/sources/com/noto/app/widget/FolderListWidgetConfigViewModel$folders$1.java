package com.noto.app.widget;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import n7.l;
import q7.c;
import t6.b;
import u7.q;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u00050\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0000H\u008a@"}, d2 = {"", "Lt6/a;", "folders", "Lt6/b;", "foldersNotesCount", "Lkotlin/Pair;", "", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.widget.FolderListWidgetConfigViewModel$folders$1", f = "FolderListWidgetConfigViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FolderListWidgetConfigViewModel$folders$1 extends SuspendLambda implements q<List<? extends t6.a>, List<? extends b>, p7.c<? super List<? extends Pair<? extends t6.a, ? extends Integer>>>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ List f9983m;
    public /* synthetic */ List n;

    public FolderListWidgetConfigViewModel$folders$1(p7.c<? super FolderListWidgetConfigViewModel$folders$1> cVar) {
        super(3, cVar);
    }

    @Override // u7.q
    public final Object O(List<? extends t6.a> list, List<? extends b> list2, p7.c<? super List<? extends Pair<? extends t6.a, ? extends Integer>>> cVar) {
        FolderListWidgetConfigViewModel$folders$1 folderListWidgetConfigViewModel$folders$1 = new FolderListWidgetConfigViewModel$folders$1(cVar);
        folderListWidgetConfigViewModel$folders$1.f9983m = list;
        folderListWidgetConfigViewModel$folders$1.n = list2;
        return folderListWidgetConfigViewModel$folders$1.k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        int i10;
        Object obj2;
        boolean z10;
        m0.b.n1(obj);
        List<t6.a> list = this.f9983m;
        List list2 = this.n;
        ArrayList arrayList = new ArrayList(l.Z1(list, 10));
        for (t6.a aVar : list) {
            Iterator it = list2.iterator();
            while (true) {
                i10 = 0;
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (((b) obj2).f17613a == aVar.f17592a) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (z10) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            b bVar = (b) obj2;
            if (bVar != null) {
                i10 = bVar.f17614b;
            }
            arrayList.add(new Pair(aVar, new Integer(i10)));
        }
        return arrayList;
    }
}
