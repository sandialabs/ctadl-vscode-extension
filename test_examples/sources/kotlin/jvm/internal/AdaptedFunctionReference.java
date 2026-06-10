package kotlin.jvm.internal;

import a4.b;
import com.noto.app.components.BaseActivity;
import java.io.Serializable;
import v7.f;
import v7.g;
import v7.i;

/* loaded from: classes.dex */
public class AdaptedFunctionReference implements f, Serializable {

    /* renamed from: i  reason: collision with root package name */
    public final Object f13040i;

    /* renamed from: j  reason: collision with root package name */
    public final Class f13041j = BaseActivity.class;

    /* renamed from: k  reason: collision with root package name */
    public final String f13042k = "setupTheme";

    /* renamed from: l  reason: collision with root package name */
    public final String f13043l = "setupTheme(Lcom/noto/app/domain/model/Theme;)V";

    /* renamed from: m  reason: collision with root package name */
    public final boolean f13044m = false;
    public final int n = 2;

    /* renamed from: o  reason: collision with root package name */
    public final int f13045o = 2;

    public AdaptedFunctionReference(Object obj) {
        this.f13040i = obj;
    }

    @Override // v7.f
    public final int D() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdaptedFunctionReference) {
            AdaptedFunctionReference adaptedFunctionReference = (AdaptedFunctionReference) obj;
            return this.f13044m == adaptedFunctionReference.f13044m && this.n == adaptedFunctionReference.n && this.f13045o == adaptedFunctionReference.f13045o && g.a(this.f13040i, adaptedFunctionReference.f13040i) && g.a(this.f13041j, adaptedFunctionReference.f13041j) && this.f13042k.equals(adaptedFunctionReference.f13042k) && this.f13043l.equals(adaptedFunctionReference.f13043l);
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        Object obj = this.f13040i;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = i10 * 31;
        Class cls = this.f13041j;
        if (cls != null) {
            i12 = cls.hashCode();
        }
        int g10 = b.g(this.f13043l, b.g(this.f13042k, (i13 + i12) * 31, 31), 31);
        if (this.f13044m) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return ((((g10 + i11) * 31) + this.n) * 31) + this.f13045o;
    }

    public final String toString() {
        return i.f18169a.h(this);
    }
}
