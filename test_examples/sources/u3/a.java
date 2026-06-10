package u3;

import androidx.datastore.preferences.protobuf.k;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.q;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import java.io.PrintWriter;
import p.i;
import t3.c;

/* loaded from: classes.dex */
public final class a extends k {

    /* renamed from: i  reason: collision with root package name */
    public final q f17777i;

    /* renamed from: j  reason: collision with root package name */
    public final b f17778j;

    /* renamed from: u3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0228a<D> extends v<D> {
        @Override // androidx.lifecycle.LiveData
        public final void f() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        public final void g() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public final void h(w<? super D> wVar) {
            super.h(wVar);
        }

        @Override // androidx.lifecycle.v, androidx.lifecycle.LiveData
        public final void i(D d5) {
            super.i(d5);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #0 : ");
            v8.b.h(null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class b extends i0 {

        /* renamed from: e  reason: collision with root package name */
        public static final C0229a f17779e = new C0229a();

        /* renamed from: d  reason: collision with root package name */
        public final i<C0228a> f17780d = new i<>();

        /* renamed from: u3.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0229a implements k0.b {
            @Override // androidx.lifecycle.k0.b
            public final <T extends i0> T a(Class<T> cls) {
                return new b();
            }

            @Override // androidx.lifecycle.k0.b
            public final i0 b(Class cls, c cVar) {
                return a(cls);
            }
        }

        @Override // androidx.lifecycle.i0
        public final void b() {
            i<C0228a> iVar = this.f17780d;
            if (iVar.h() <= 0) {
                int i10 = iVar.f16585l;
                Object[] objArr = iVar.f16584k;
                for (int i11 = 0; i11 < i10; i11++) {
                    objArr[i11] = null;
                }
                iVar.f16585l = 0;
                iVar.f16582i = false;
                return;
            }
            iVar.i(0).getClass();
            throw null;
        }
    }

    public a(q qVar, m0 m0Var) {
        this.f17777i = qVar;
        this.f17778j = (b) new k0(m0Var, b.f17779e).a(b.class);
    }

    @Deprecated
    public final void L0(String str, PrintWriter printWriter) {
        i<C0228a> iVar = this.f17778j.f17780d;
        if (iVar.h() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (iVar.h() > 0) {
                C0228a i10 = iVar.i(0);
                printWriter.print(str);
                printWriter.print("  #");
                if (iVar.f16582i) {
                    iVar.d();
                }
                printWriter.print(iVar.f16583j[0]);
                printWriter.print(": ");
                printWriter.println(i10.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println((Object) null);
                throw null;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        v8.b.h(this.f17777i, sb);
        sb.append("}}");
        return sb.toString();
    }
}
