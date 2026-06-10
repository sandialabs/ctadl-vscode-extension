package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.Metadata;
import v7.f;
import v7.g;
import v7.i;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/jvm/internal/Lambda;", "R", "Lv7/f;", "Ljava/io/Serializable;", "kotlin-stdlib"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class Lambda<R> implements f<R>, Serializable {

    /* renamed from: i  reason: collision with root package name */
    public final int f13055i;

    public Lambda(int i10) {
        this.f13055i = i10;
    }

    @Override // v7.f
    public final int D() {
        return this.f13055i;
    }

    public final String toString() {
        String g10 = i.f18169a.g(this);
        g.e(g10, "renderLambdaToString(this)");
        return g10;
    }
}
