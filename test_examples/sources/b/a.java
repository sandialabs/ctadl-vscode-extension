package b;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import java.io.Serializable;
import v7.g;

/* loaded from: classes.dex */
public abstract class a<I, O> {

    /* renamed from: b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0051a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f6331a;

        /* JADX WARN: Multi-variable type inference failed */
        public C0051a(Serializable serializable) {
            this.f6331a = serializable;
        }
    }

    public abstract Intent a(ComponentActivity componentActivity, Object obj);

    public C0051a b(ComponentActivity componentActivity, Object obj) {
        g.f(componentActivity, "context");
        return null;
    }

    public abstract Object c(Intent intent, int i10);
}
