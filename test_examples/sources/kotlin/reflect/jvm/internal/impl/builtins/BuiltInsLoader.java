package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.LazyThreadSafetyMode;
import l8.s;
import l8.v;
import x9.h;

/* loaded from: classes.dex */
public interface BuiltInsLoader {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f13292a = Companion.f13293a;

    /* loaded from: classes.dex */
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f13293a = new Companion();

        /* renamed from: b  reason: collision with root package name */
        public static final m7.e<BuiltInsLoader> f13294b = kotlin.a.a(LazyThreadSafetyMode.PUBLICATION, BuiltInsLoader$Companion$Instance$2.f13295j);
    }

    v a(h hVar, s sVar, Iterable<? extends n8.b> iterable, n8.c cVar, n8.a aVar, boolean z10);
}
