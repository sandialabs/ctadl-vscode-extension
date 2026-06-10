package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import m9.g;
import y9.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MemberDeserializer$loadProperty$4 extends Lambda implements u7.a<x9.f<? extends g<?>>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ MemberDeserializer f14788j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ ProtoBuf$Property f14789k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ w9.g f14790l;

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$4$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements u7.a<g<?>> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ MemberDeserializer f14791j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ ProtoBuf$Property f14792k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ w9.g f14793l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MemberDeserializer memberDeserializer, ProtoBuf$Property protoBuf$Property, w9.g gVar) {
            super(0);
            this.f14791j = memberDeserializer;
            this.f14792k = protoBuf$Property;
            this.f14793l = gVar;
        }

        @Override // u7.a
        public final g<?> k0() {
            MemberDeserializer memberDeserializer = this.f14791j;
            f a10 = memberDeserializer.a(memberDeserializer.f14777a.c);
            v7.g.c(a10);
            b<m8.c, g<?>> bVar = memberDeserializer.f14777a.f17920a.f17904e;
            r k3 = this.f14793l.k();
            v7.g.e(k3, "property.returnType");
            return bVar.h(a10, this.f14792k, k3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemberDeserializer$loadProperty$4(MemberDeserializer memberDeserializer, ProtoBuf$Property protoBuf$Property, w9.g gVar) {
        super(0);
        this.f14788j = memberDeserializer;
        this.f14789k = protoBuf$Property;
        this.f14790l = gVar;
    }

    @Override // u7.a
    public final x9.f<? extends g<?>> k0() {
        MemberDeserializer memberDeserializer = this.f14788j;
        return memberDeserializer.f14777a.f17920a.f17901a.g(new AnonymousClass1(memberDeserializer, this.f14789k, this.f14790l));
    }
}
