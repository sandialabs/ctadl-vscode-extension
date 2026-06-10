package androidx.compose.ui.platform;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f1 implements ga.h<e1> {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f3842a = new ArrayList();

    public final void b(Object obj, String str) {
        this.f3842a.add(new e1(obj, str));
    }

    @Override // ga.h
    public final Iterator<e1> iterator() {
        return this.f3842a.iterator();
    }
}
