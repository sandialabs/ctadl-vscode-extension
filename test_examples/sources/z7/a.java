package z7;

import kotlin.random.Random;

/* loaded from: classes.dex */
public abstract class a extends Random {
    @Override // kotlin.random.Random
    public final int a() {
        return b().nextInt();
    }

    public abstract java.util.Random b();
}
