package com.noto.app.settings;

import androidx.activity.e;
import v7.g;

/* loaded from: classes.dex */
public interface b {

    /* loaded from: classes.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f9656a = new a();
    }

    /* renamed from: com.noto.app.settings.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0091b implements b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f9657a;

        public final boolean equals(Object obj) {
            if (!(obj instanceof C0091b)) {
                return false;
            }
            if (this.f9657a != ((C0091b) obj).f9657a) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            boolean z10 = this.f9657a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public final String toString() {
            return "Switch(isChecked=" + this.f9657a + ")";
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final String f9658a;

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            if (!g.a(this.f9658a, ((c) obj).f9658a)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f9658a.hashCode();
        }

        public final String toString() {
            return e.k(new StringBuilder("Text(value="), this.f9658a, ")");
        }
    }
}
