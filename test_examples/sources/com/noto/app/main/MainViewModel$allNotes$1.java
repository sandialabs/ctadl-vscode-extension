package com.noto.app.main;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import t6.d;
import u7.q;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0000H\u008a@"}, d2 = {"", "Lt6/d;", "notes", "Lt6/a;", "folders", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.main.MainViewModel$allNotes$1", f = "MainViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class MainViewModel$allNotes$1 extends SuspendLambda implements q<List<? extends d>, List<? extends t6.a>, p7.c<? super List<? extends d>>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ List f8928m;
    public /* synthetic */ List n;

    public MainViewModel$allNotes$1(p7.c<? super MainViewModel$allNotes$1> cVar) {
        super(3, cVar);
    }

    @Override // u7.q
    public final Object O(List<? extends d> list, List<? extends t6.a> list2, p7.c<? super List<? extends d>> cVar) {
        MainViewModel$allNotes$1 mainViewModel$allNotes$1 = new MainViewModel$allNotes$1(cVar);
        mainViewModel$allNotes$1.f8928m = list;
        mainViewModel$allNotes$1.n = list2;
        return mainViewModel$allNotes$1.k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        boolean z10;
        m0.b.n1(obj);
        List list = this.f8928m;
        List list2 = this.n;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            d dVar = (d) obj2;
            boolean z11 = false;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((t6.a) it.next()).f17592a == dVar.f17622b) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (z10) {
                        z11 = true;
                        break;
                    }
                }
            }
            if (z11) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
