package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.Lambda;
import u7.l;

/* loaded from: classes.dex */
public final class FunctionsKt$ALWAYS_TRUE$1 extends Lambda implements l<Object, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public static final FunctionsKt$ALWAYS_TRUE$1 f15116j = new FunctionsKt$ALWAYS_TRUE$1();

    public FunctionsKt$ALWAYS_TRUE$1() {
        super(1);
    }

    @Override // u7.l
    public final Boolean U(Object obj) {
        return Boolean.TRUE;
    }
}
