package d9;

import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;

/* loaded from: classes.dex */
public final class i implements w9.d {

    /* renamed from: b  reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.load.kotlin.h f10462b;

    public i(kotlin.reflect.jvm.internal.impl.load.kotlin.h hVar, DeserializedContainerAbiStability deserializedContainerAbiStability) {
        this.f10462b = hVar;
    }

    @Override // l8.d0
    public final void a() {
    }

    @Override // w9.d
    public final String b() {
        return "Class '" + this.f10462b.d().b().b() + '\'';
    }

    public final String toString() {
        return i.class.getSimpleName() + ": " + this.f10462b;
    }
}
