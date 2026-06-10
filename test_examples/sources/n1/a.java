package n1;

import android.content.res.Resources;
import androidx.activity.e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import v7.g;
import z0.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<b, WeakReference<C0189a>> f16064a = new HashMap<>();

    /* renamed from: n1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0189a {

        /* renamed from: a  reason: collision with root package name */
        public final c f16065a;

        /* renamed from: b  reason: collision with root package name */
        public final int f16066b;

        public C0189a(c cVar, int i10) {
            this.f16065a = cVar;
            this.f16066b = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0189a) {
                C0189a c0189a = (C0189a) obj;
                return g.a(this.f16065a, c0189a.f16065a) && this.f16066b == c0189a.f16066b;
            }
            return false;
        }

        public final int hashCode() {
            return (this.f16065a.hashCode() * 31) + this.f16066b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
            sb.append(this.f16065a);
            sb.append(", configFlags=");
            return e.h(sb, this.f16066b, ')');
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Resources.Theme f16067a;

        /* renamed from: b  reason: collision with root package name */
        public final int f16068b;

        public b(int i10, Resources.Theme theme) {
            this.f16067a = theme;
            this.f16068b = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return g.a(this.f16067a, bVar.f16067a) && this.f16068b == bVar.f16068b;
            }
            return false;
        }

        public final int hashCode() {
            return (this.f16067a.hashCode() * 31) + this.f16068b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Key(theme=");
            sb.append(this.f16067a);
            sb.append(", id=");
            return e.h(sb, this.f16068b, ')');
        }
    }
}
