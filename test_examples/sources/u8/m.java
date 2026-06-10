package u8;

import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStatesImpl;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final h9.c f17855a;

    /* renamed from: b  reason: collision with root package name */
    public static final h9.c[] f17856b;
    public static final NullabilityAnnotationStatesImpl c;

    /* renamed from: d  reason: collision with root package name */
    public static final n f17857d;

    static {
        h9.c cVar = new h9.c("org.jspecify.nullness");
        f17855a = cVar;
        h9.c cVar2 = new h9.c("io.reactivex.rxjava3.annotations");
        h9.c cVar3 = new h9.c("org.checkerframework.checker.nullness.compatqual");
        String b5 = cVar2.b();
        f17856b = new h9.c[]{new h9.c(b5.concat(".Nullable")), new h9.c(b5.concat(".NonNull"))};
        h9.c cVar4 = new h9.c("org.jetbrains.annotations");
        n nVar = n.f17858d;
        h9.c cVar5 = new h9.c("androidx.annotation.RecentlyNullable");
        ReportLevel reportLevel = ReportLevel.f13626k;
        m7.d dVar = new m7.d(9, 0);
        ReportLevel reportLevel2 = ReportLevel.f13627l;
        c = new NullabilityAnnotationStatesImpl(kotlin.collections.d.M1(new Pair(cVar4, nVar), new Pair(new h9.c("androidx.annotation"), nVar), new Pair(new h9.c("android.support.annotation"), nVar), new Pair(new h9.c("android.annotation"), nVar), new Pair(new h9.c("com.android.annotations"), nVar), new Pair(new h9.c("org.eclipse.jdt.annotation"), nVar), new Pair(new h9.c("org.checkerframework.checker.nullness.qual"), nVar), new Pair(cVar3, nVar), new Pair(new h9.c("javax.annotation"), nVar), new Pair(new h9.c("edu.umd.cs.findbugs.annotations"), nVar), new Pair(new h9.c("io.reactivex.annotations"), nVar), new Pair(cVar5, new n(reportLevel, 4)), new Pair(new h9.c("androidx.annotation.RecentlyNonNull"), new n(reportLevel, 4)), new Pair(new h9.c("lombok"), nVar), new Pair(cVar, new n(reportLevel, dVar, reportLevel2)), new Pair(cVar2, new n(reportLevel, new m7.d(8, 0), reportLevel2))));
        f17857d = new n(reportLevel, 4);
    }
}
