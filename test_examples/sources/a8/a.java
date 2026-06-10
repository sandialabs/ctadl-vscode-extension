package a8;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import v7.g;

/* loaded from: classes.dex */
public final class a extends z7.a {
    @Override // z7.a
    public final Random b() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        g.e(current, "current()");
        return current;
    }
}
