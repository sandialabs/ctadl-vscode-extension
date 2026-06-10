package x6;

import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final t6.d f18683a;

    /* renamed from: b  reason: collision with root package name */
    public final List<t6.c> f18684b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final int f18685d;

    public h0(t6.d dVar, List<t6.c> list, boolean z10, int i10) {
        this.f18683a = dVar;
        this.f18684b = list;
        this.c = z10;
        this.f18685d = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static h0 a(h0 h0Var, EmptyList emptyList, boolean z10, int i10, int i11) {
        t6.d dVar;
        if ((i11 & 1) != 0) {
            dVar = h0Var.f18683a;
        } else {
            dVar = null;
        }
        List list = emptyList;
        if ((i11 & 2) != 0) {
            list = h0Var.f18684b;
        }
        if ((i11 & 4) != 0) {
            z10 = h0Var.c;
        }
        if ((i11 & 8) != 0) {
            i10 = h0Var.f18685d;
        }
        h0Var.getClass();
        v7.g.f(dVar, "note");
        v7.g.f(list, "labels");
        return new h0(dVar, list, z10, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            return v7.g.a(this.f18683a, h0Var.f18683a) && v7.g.a(this.f18684b, h0Var.f18684b) && this.c == h0Var.c && this.f18685d == h0Var.f18685d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.f18684b.hashCode() + (this.f18683a.hashCode() * 31)) * 31;
        boolean z10 = this.c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((hashCode + i10) * 31) + this.f18685d;
    }

    public final String toString() {
        return "NoteItemModel(note=" + this.f18683a + ", labels=" + this.f18684b + ", isSelected=" + this.c + ", selectionOrder=" + this.f18685d + ")";
    }
}
