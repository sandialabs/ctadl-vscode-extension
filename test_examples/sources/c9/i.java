package c9;

import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import u8.q;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final b f6580a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f6581b;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6582a;

        static {
            int[] iArr = new int[NullabilityQualifier.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6582a = iArr;
        }
    }

    static {
        h9.c cVar = q.f17877p;
        v7.g.e(cVar, "ENHANCED_NULLABILITY_ANNOTATION");
        f6580a = new b(cVar);
        h9.c cVar2 = q.f17878q;
        v7.g.e(cVar2, "ENHANCED_MUTABILITY_ANNOTATION");
        f6581b = new b(cVar2);
    }
}
