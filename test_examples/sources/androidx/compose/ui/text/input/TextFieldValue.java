package androidx.compose.ui.text.input;

import androidx.compose.runtime.saveable.SaverKt;
import m0.b;
import p1.a;
import p1.o;
import v7.g;

/* loaded from: classes.dex */
public final class TextFieldValue {

    /* renamed from: a  reason: collision with root package name */
    public final a f4131a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4132b;
    public final o c;

    static {
        SaverKt.a(TextFieldValue$Companion$Saver$1.f4133j, TextFieldValue$Companion$Saver$2.f4134j);
    }

    public TextFieldValue(a aVar, long j2, o oVar) {
        o oVar2;
        this.f4131a = aVar;
        String str = aVar.f16641i;
        this.f4132b = b.M(j2, str.length());
        if (oVar != null) {
            oVar2 = new o(b.M(oVar.f16702a, str.length()));
        } else {
            oVar2 = null;
        }
        this.c = oVar2;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        long j2 = textFieldValue.f4132b;
        int i10 = o.c;
        if (this.f4132b == j2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && g.a(this.c, textFieldValue.c) && g.a(this.f4131a, textFieldValue.f4131a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = o.c;
        long j2 = this.f4132b;
        int hashCode = (((int) (j2 ^ (j2 >>> 32))) + (this.f4131a.hashCode() * 31)) * 31;
        o oVar = this.c;
        if (oVar != null) {
            long j10 = oVar.f16702a;
            i10 = (int) (j10 ^ (j10 >>> 32));
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f4131a) + "', selection=" + ((Object) o.b(this.f4132b)) + ", composition=" + this.c + ')';
    }
}
