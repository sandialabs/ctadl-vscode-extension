package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final p3.b f5023a;

    /* renamed from: b  reason: collision with root package name */
    public final char[] f5024b;
    public final a c = new a(1024);

    /* renamed from: d  reason: collision with root package name */
    public final Typeface f5025d;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<a> f5026a;

        /* renamed from: b  reason: collision with root package name */
        public i f5027b;

        public a() {
            this(1);
        }

        public a(int i10) {
            this.f5026a = new SparseArray<>(i10);
        }

        public final void a(i iVar, int i10, int i11) {
            a aVar;
            int a10 = iVar.a(i10);
            SparseArray<a> sparseArray = this.f5026a;
            if (sparseArray == null) {
                aVar = null;
            } else {
                aVar = sparseArray.get(a10);
            }
            if (aVar == null) {
                aVar = new a();
                sparseArray.put(iVar.a(i10), aVar);
            }
            if (i11 > i10) {
                aVar.a(iVar, i10 + 1, i11);
            } else {
                aVar.f5027b = iVar;
            }
        }
    }

    public n(Typeface typeface, p3.b bVar) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        this.f5025d = typeface;
        this.f5023a = bVar;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i13 = a10 + bVar.f16750a;
            i10 = bVar.f16751b.getInt(bVar.f16751b.getInt(i13) + i13);
        } else {
            i10 = 0;
        }
        this.f5024b = new char[i10 * 2];
        int a11 = bVar.a(6);
        if (a11 != 0) {
            int i14 = a11 + bVar.f16750a;
            i11 = bVar.f16751b.getInt(bVar.f16751b.getInt(i14) + i14);
        } else {
            i11 = 0;
        }
        for (int i15 = 0; i15 < i11; i15++) {
            i iVar = new i(this, i15);
            p3.a c = iVar.c();
            int a12 = c.a(4);
            if (a12 != 0) {
                i12 = c.f16751b.getInt(a12 + c.f16750a);
            } else {
                i12 = 0;
            }
            Character.toChars(i12, this.f5024b, i15 * 2);
            if (iVar.b() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            v8.b.k("invalid metadata codepoint length", z10);
            this.c.a(iVar, 0, iVar.b() - 1);
        }
    }
}
