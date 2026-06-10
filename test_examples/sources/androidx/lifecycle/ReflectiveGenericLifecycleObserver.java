package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.c;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements o {

    /* renamed from: i  reason: collision with root package name */
    public final Object f5347i;

    /* renamed from: j  reason: collision with root package name */
    public final c.a f5348j;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f5347i = obj;
        this.f5348j = c.c.b(obj.getClass());
    }

    @Override // androidx.lifecycle.o
    public final void f(q qVar, Lifecycle.Event event) {
        HashMap hashMap = this.f5348j.f5369a;
        Object obj = this.f5347i;
        c.a.a((List) hashMap.get(event), qVar, event, obj);
        c.a.a((List) hashMap.get(Lifecycle.Event.ON_ANY), qVar, event, obj);
    }
}
