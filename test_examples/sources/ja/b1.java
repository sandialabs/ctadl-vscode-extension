package ja;

import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes.dex */
public abstract class b1 extends CoroutineDispatcher {
    public abstract b1 W();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        b1 b1Var;
        String str;
        kotlinx.coroutines.scheduling.b bVar = f0.f12766a;
        b1 b1Var2 = kotlinx.coroutines.internal.l.f15491a;
        if (this == b1Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                b1Var = b1Var2.W();
            } catch (UnsupportedOperationException unused) {
                b1Var = null;
            }
            if (this == b1Var) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            return getClass().getSimpleName() + '@' + y.a(this);
        }
        return str;
    }
}
