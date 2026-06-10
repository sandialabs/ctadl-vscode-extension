package com.noto.app;

import a1.c;
import androidx.lifecycle.w;
import java.util.List;
import u7.l;
import v7.e;
import v7.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f7593a = c.O0("android.intent.action.SEND", "com.noto.intent.action.CREATE_FOLDER", "com.noto.intent.action.CREATE_NOTE", "com.noto.intent.action.OPEN_FOLDER", "com.noto.intent.action.OPEN_NOTE", "com.noto.intent.action.SETTINGS");

    /* renamed from: com.noto.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0067a implements w, e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f7594a;

        public C0067a(l lVar) {
            this.f7594a = lVar;
        }

        @Override // v7.e
        public final l a() {
            return this.f7594a;
        }

        @Override // androidx.lifecycle.w
        public final /* synthetic */ void b(Object obj) {
            this.f7594a.U(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof w) && (obj instanceof e)) {
                return g.a(this.f7594a, ((e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f7594a.hashCode();
        }
    }
}
