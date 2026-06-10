package z7;

import java.util.Random;
import v7.g;

/* loaded from: classes.dex */
public final class b extends z7.a {

    /* renamed from: k  reason: collision with root package name */
    public final a f19176k = new a();

    /* loaded from: classes.dex */
    public static final class a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        public final Random initialValue() {
            return new Random();
        }
    }

    @Override // z7.a
    public final Random b() {
        Random random = this.f19176k.get();
        g.e(random, "implStorage.get()");
        return random;
    }
}
