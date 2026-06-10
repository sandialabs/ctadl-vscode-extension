package g0;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f11050a;

    public /* synthetic */ f1(int i10) {
        this.f11050a = new ArrayList(i10);
    }

    public f1(int i10, int i11) {
        if (i10 != 1) {
            this.f11050a = new ArrayList();
        } else {
            this.f11050a = new ArrayList(5);
        }
    }

    public static Lifecycle c(Context context) {
        if (context instanceof androidx.lifecycle.q) {
            return ((androidx.lifecycle.q) context).i0();
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            v7.g.e(baseContext, "baseContext");
            return c(baseContext);
        }
        return null;
    }

    public final void a(Object obj) {
        this.f11050a.add(obj);
    }

    public final void b(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z10 = obj instanceof Object[];
        ArrayList arrayList = this.f11050a;
        if (z10) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
            }
        } else if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
        } else if (obj instanceof Iterable) {
            for (Object obj2 : (Iterable) obj) {
                arrayList.add(obj2);
            }
        } else if (!(obj instanceof Iterator)) {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        } else {
            Iterator it = (Iterator) obj;
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
    }

    public final Object d() {
        ArrayList arrayList = this.f11050a;
        return arrayList.remove(arrayList.size() - 1);
    }

    public final void e(Object obj) {
        this.f11050a.add(obj);
    }

    public final int f() {
        return this.f11050a.size();
    }

    public final Object[] g(Object[] objArr) {
        return this.f11050a.toArray(objArr);
    }
}
