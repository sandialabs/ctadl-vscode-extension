package d;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.work.impl.utils.futures.AbstractFuture;
import d.w;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.EmptyList;
import l.b;
import y3.f;
import y3.h;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f10330i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f10331j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Object f10332k;

    public /* synthetic */ v(Object obj, int i10, Object obj2) {
        this.f10330i = i10;
        this.f10331j = obj;
        this.f10332k = obj2;
    }

    public /* synthetic */ v(Runnable runnable, y3.p pVar) {
        this.f10330i = 3;
        this.f10332k = runnable;
        this.f10331j = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10330i) {
            case 0:
                w.a aVar = (w.a) this.f10331j;
                Runnable runnable = (Runnable) this.f10332k;
                aVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    aVar.a();
                }
            case 1:
                y3.h hVar = (y3.h) this.f10331j;
                String[] strArr = (String[]) this.f10332k;
                int i10 = h.b.f18858b;
                v7.g.f(hVar, "this$0");
                v7.g.f(strArr, "$tables");
                y3.f fVar = hVar.f18849b;
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                fVar.getClass();
                v7.g.f(strArr2, "tables");
                synchronized (fVar.f18836j) {
                    Iterator<Map.Entry<f.c, f.d>> it = fVar.f18836j.iterator();
                    while (true) {
                        b.e eVar = (b.e) it;
                        if (eVar.hasNext()) {
                            Map.Entry entry = (Map.Entry) eVar.next();
                            v7.g.e(entry, "(observer, wrapper)");
                            f.c cVar = (f.c) entry.getKey();
                            f.d dVar = (f.d) entry.getValue();
                            cVar.getClass();
                            if (!(cVar instanceof h.a)) {
                                dVar.b(strArr2);
                            }
                        } else {
                            m7.n nVar = m7.n.f16010a;
                        }
                    }
                }
                return;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                v7.g.f((y3.i) this.f10331j, "this$0");
                v7.g.f((String) this.f10332k, "$query");
                EmptyList emptyList = EmptyList.f12981i;
                throw null;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                Runnable runnable2 = (Runnable) this.f10332k;
                y3.p pVar = (y3.p) this.f10331j;
                v7.g.f(runnable2, "$command");
                v7.g.f(pVar, "this$0");
                try {
                    runnable2.run();
                    return;
                } finally {
                    pVar.a();
                }
            default:
                x4.u uVar = (x4.u) this.f10331j;
                androidx.work.impl.utils.futures.a aVar2 = (androidx.work.impl.utils.futures.a) this.f10332k;
                if (!(uVar.f18611i.f6306i instanceof AbstractFuture.b)) {
                    aVar2.k(uVar.f18614l.e());
                    return;
                } else {
                    aVar2.cancel(true);
                    return;
                }
        }
    }
}
