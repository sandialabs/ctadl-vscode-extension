package c9;

import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e  reason: collision with root package name */
    public static final c f6566e = new c(null, false);

    /* renamed from: a  reason: collision with root package name */
    public final NullabilityQualifier f6567a;

    /* renamed from: b  reason: collision with root package name */
    public final MutabilityQualifier f6568b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f6569d;

    public c(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z10, boolean z11) {
        this.f6567a = nullabilityQualifier;
        this.f6568b = mutabilityQualifier;
        this.c = z10;
        this.f6569d = z11;
    }

    public /* synthetic */ c(NullabilityQualifier nullabilityQualifier, boolean z10) {
        this(nullabilityQualifier, null, z10, false);
    }
}
