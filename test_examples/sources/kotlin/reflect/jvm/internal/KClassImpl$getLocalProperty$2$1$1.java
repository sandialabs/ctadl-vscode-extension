package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import l8.z;
import u7.p;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class KClassImpl$getLocalProperty$2$1$1 extends FunctionReference implements p<MemberDeserializer, ProtoBuf$Property, z> {

    /* renamed from: r  reason: collision with root package name */
    public static final KClassImpl$getLocalProperty$2$1$1 f13141r = new KClassImpl$getLocalProperty$2$1$1();

    public KClassImpl$getLocalProperty$2$1$1() {
        super(2);
    }

    @Override // u7.p
    public final z R(MemberDeserializer memberDeserializer, ProtoBuf$Property protoBuf$Property) {
        MemberDeserializer memberDeserializer2 = memberDeserializer;
        ProtoBuf$Property protoBuf$Property2 = protoBuf$Property;
        v7.g.f(memberDeserializer2, "p0");
        v7.g.f(protoBuf$Property2, "p1");
        return memberDeserializer2.f(protoBuf$Property2);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final c8.d d() {
        return v7.i.a(MemberDeserializer.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String e() {
        return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
    }

    @Override // kotlin.jvm.internal.CallableReference, c8.a
    public final String getName() {
        return "loadProperty";
    }
}
