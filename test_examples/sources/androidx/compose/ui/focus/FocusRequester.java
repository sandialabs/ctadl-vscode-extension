package androidx.compose.ui.focus;

import h0.e;
import t0.j;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class FocusRequester {

    /* renamed from: b  reason: collision with root package name */
    public static final FocusRequester f3054b = new FocusRequester();
    public static final FocusRequester c = new FocusRequester();

    /* renamed from: a  reason: collision with root package name */
    public final e<j> f3055a = new e<>(new j[16]);

    public final Boolean a(l<? super FocusModifier, Boolean> lVar) {
        g.f(lVar, "onFound");
        if (g.a(this, c)) {
            return Boolean.FALSE;
        }
        if (g.a(this, f3054b)) {
            return null;
        }
        e<j> eVar = this.f3055a;
        int i10 = eVar.f11334k;
        boolean z10 = false;
        if (i10 > 0) {
            j[] jVarArr = eVar.f11332i;
            g.d(jVarArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i11 = 0;
            boolean z11 = false;
            do {
                FocusModifier d5 = jVarArr[i11].d();
                if (d5 != null) {
                    if (!lVar.U(d5).booleanValue() && !z11) {
                        z11 = false;
                    }
                    z11 = true;
                }
                i11++;
            } while (i11 < i10);
            z10 = z11;
        }
        return Boolean.valueOf(z10);
    }

    public final void b() {
        if (!this.f3055a.j()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
        }
        a(FocusRequester$requestFocus$2.f3056j);
    }
}
