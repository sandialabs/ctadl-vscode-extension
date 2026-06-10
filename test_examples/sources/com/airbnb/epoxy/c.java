package com.airbnb.epoxy;

import android.os.Handler;
import androidx.recyclerview.widget.k;
import com.airbnb.epoxy.n;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final f0 f6622a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC0056c f6623b;
    public final k.e<r<?>> c;

    /* renamed from: d  reason: collision with root package name */
    public final b f6624d;

    /* renamed from: e  reason: collision with root package name */
    public volatile List<? extends r<?>> f6625e;

    /* renamed from: f  reason: collision with root package name */
    public volatile List<? extends r<?>> f6626f;

    /* loaded from: classes.dex */
    public static class a extends k.b {

        /* renamed from: a  reason: collision with root package name */
        public final List<? extends r<?>> f6627a;

        /* renamed from: b  reason: collision with root package name */
        public final List<? extends r<?>> f6628b;
        public final k.e<r<?>> c;

        public a(List<? extends r<?>> list, List<? extends r<?>> list2, k.e<r<?>> eVar) {
            this.f6627a = list;
            this.f6628b = list2;
            this.c = eVar;
        }

        @Override // androidx.recyclerview.widget.k.b
        public final boolean a(int i10, int i11) {
            ((n.a) this.c).getClass();
            if (this.f6627a.get(i10).f6681a == this.f6628b.get(i11).f6681a) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.k.b
        public final i b(int i10, int i11) {
            this.f6628b.get(i11);
            ((n.a) this.c).getClass();
            return new i(this.f6627a.get(i10));
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public volatile int f6629a;

        /* renamed from: b  reason: collision with root package name */
        public volatile int f6630b;

        public final synchronized boolean a(int i10) {
            boolean z10;
            z10 = this.f6629a == i10 && i10 > this.f6630b;
            if (z10) {
                this.f6630b = i10;
            }
            return z10;
        }

        public final synchronized boolean b() {
            return this.f6629a > this.f6630b;
        }

        public final synchronized int c() {
            int i10;
            i10 = this.f6629a + 1;
            this.f6629a = i10;
            return i10;
        }
    }

    /* renamed from: com.airbnb.epoxy.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0056c {
    }

    public c(Handler handler, InterfaceC0056c interfaceC0056c) {
        n.a aVar = n.n;
        this.f6624d = new b();
        this.f6626f = Collections.emptyList();
        this.f6622a = new f0(handler);
        this.f6623b = interfaceC0056c;
        this.c = aVar;
    }

    public final boolean a() {
        boolean b5;
        b bVar = this.f6624d;
        synchronized (bVar) {
            b5 = bVar.b();
            bVar.f6630b = bVar.f6629a;
        }
        return b5;
    }

    public final synchronized boolean b(int i10, List list) {
        if (this.f6624d.a(i10)) {
            this.f6625e = list;
            this.f6626f = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            return true;
        }
        return false;
    }
}
