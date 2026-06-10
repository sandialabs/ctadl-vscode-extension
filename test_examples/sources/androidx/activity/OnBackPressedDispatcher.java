package androidx.activity;

import android.annotation.SuppressLint;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.o;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f438a;
    public final j c;

    /* renamed from: d  reason: collision with root package name */
    public final OnBackInvokedCallback f440d;

    /* renamed from: e  reason: collision with root package name */
    public OnBackInvokedDispatcher f441e;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<i> f439b = new ArrayDeque<>();

    /* renamed from: f  reason: collision with root package name */
    public boolean f442f = false;

    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements o, androidx.activity.a {

        /* renamed from: i  reason: collision with root package name */
        public final Lifecycle f443i;

        /* renamed from: j  reason: collision with root package name */
        public final i f444j;

        /* renamed from: k  reason: collision with root package name */
        public b f445k;

        public LifecycleOnBackPressedCancellable(Lifecycle lifecycle, i iVar) {
            this.f443i = lifecycle;
            this.f444j = iVar;
            lifecycle.a(this);
        }

        @Override // androidx.activity.a
        public final void cancel() {
            this.f443i.c(this);
            this.f444j.f463b.remove(this);
            b bVar = this.f445k;
            if (bVar != null) {
                bVar.cancel();
                this.f445k = null;
            }
        }

        @Override // androidx.lifecycle.o
        public final void f(q qVar, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                ArrayDeque<i> arrayDeque = onBackPressedDispatcher.f439b;
                i iVar = this.f444j;
                arrayDeque.add(iVar);
                b bVar = new b(iVar);
                iVar.f463b.add(bVar);
                if (v2.a.a()) {
                    onBackPressedDispatcher.c();
                    iVar.c = onBackPressedDispatcher.c;
                }
                this.f445k = bVar;
            } else if (event == Lifecycle.Event.ON_STOP) {
                b bVar2 = this.f445k;
                if (bVar2 != null) {
                    bVar2.cancel();
                }
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public static OnBackInvokedCallback a(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new k(runnable, 0);
        }

        public static void b(Object obj, int i10, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) obj2);
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* loaded from: classes.dex */
    public class b implements androidx.activity.a {

        /* renamed from: i  reason: collision with root package name */
        public final i f447i;

        public b(i iVar) {
            this.f447i = iVar;
        }

        @Override // androidx.activity.a
        public final void cancel() {
            OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
            ArrayDeque<i> arrayDeque = onBackPressedDispatcher.f439b;
            i iVar = this.f447i;
            arrayDeque.remove(iVar);
            iVar.f463b.remove(this);
            if (v2.a.a()) {
                iVar.c = null;
                onBackPressedDispatcher.c();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.activity.j] */
    public OnBackPressedDispatcher(Runnable runnable) {
        this.f438a = runnable;
        if (v2.a.a()) {
            this.c = new z2.a() { // from class: androidx.activity.j
                @Override // z2.a
                public final void accept(Object obj) {
                    Boolean bool = (Boolean) obj;
                    OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                    onBackPressedDispatcher.getClass();
                    if (v2.a.a()) {
                        onBackPressedDispatcher.c();
                    }
                }
            };
            this.f440d = a.a(new androidx.activity.b(2, this));
        }
    }

    @SuppressLint({"LambdaLast"})
    public final void a(q qVar, i iVar) {
        r i02 = qVar.i0();
        if (i02.f5413d == Lifecycle.State.DESTROYED) {
            return;
        }
        iVar.f463b.add(new LifecycleOnBackPressedCancellable(i02, iVar));
        if (v2.a.a()) {
            c();
            iVar.c = this.c;
        }
    }

    public final void b() {
        Iterator<i> descendingIterator = this.f439b.descendingIterator();
        while (descendingIterator.hasNext()) {
            i next = descendingIterator.next();
            if (next.f462a) {
                next.a();
                return;
            }
        }
        Runnable runnable = this.f438a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c() {
        boolean z10;
        Iterator<i> descendingIterator = this.f439b.descendingIterator();
        while (true) {
            if (descendingIterator.hasNext()) {
                if (descendingIterator.next().f462a) {
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f441e;
        if (onBackInvokedDispatcher != null) {
            OnBackInvokedCallback onBackInvokedCallback = this.f440d;
            if (z10 && !this.f442f) {
                a.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f442f = true;
            } else if (!z10 && this.f442f) {
                a.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f442f = false;
            }
        }
    }
}
