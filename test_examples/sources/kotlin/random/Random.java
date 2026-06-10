package kotlin.random;

import java.io.Serializable;
import kotlin.Metadata;
import r7.b;

/* loaded from: classes.dex */
public abstract class Random {

    /* renamed from: i  reason: collision with root package name */
    public static final Default f13065i = new Default(0);

    /* renamed from: j  reason: collision with root package name */
    public static final Random f13066j = b.f17134a.b();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "defaultRandom", "Lkotlin/random/Random;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Default extends Random implements Serializable {
        private Default() {
        }

        public /* synthetic */ Default(int i10) {
            this();
        }

        @Override // kotlin.random.Random
        public final int a() {
            return Random.f13066j.a();
        }
    }

    public abstract int a();
}
