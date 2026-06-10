package com.noto.app.settings;

import androidx.lifecycle.w;
import u7.l;
import v7.e;
import v7.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final long f9582a = a1.c.k(4293227379L);

    /* renamed from: com.noto.app.settings.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0074a implements w, e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f9583a;

        public C0074a(l lVar) {
            this.f9583a = lVar;
        }

        @Override // v7.e
        public final l a() {
            return this.f9583a;
        }

        @Override // androidx.lifecycle.w
        public final /* synthetic */ void b(Object obj) {
            this.f9583a.U(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof w) && (obj instanceof e)) {
                return g.a(this.f9583a, ((e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f9583a.hashCode();
        }
    }
}
