package kotlin.reflect.jvm;

import androidx.datastore.preferences.PreferencesProto$Value;
import c8.d;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.jvm.internal.impl.descriptors.g;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import u7.p;
import v7.i;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* synthetic */ class ReflectLambdaKt$reflect$descriptor$1 extends FunctionReference implements p<MemberDeserializer, ProtoBuf$Function, g> {

    /* renamed from: r  reason: collision with root package name */
    public static final ReflectLambdaKt$reflect$descriptor$1 f13075r = new ReflectLambdaKt$reflect$descriptor$1();

    public ReflectLambdaKt$reflect$descriptor$1() {
        super(2);
    }

    @Override // u7.p
    public final g R(MemberDeserializer memberDeserializer, ProtoBuf$Function protoBuf$Function) {
        MemberDeserializer memberDeserializer2 = memberDeserializer;
        ProtoBuf$Function protoBuf$Function2 = protoBuf$Function;
        v7.g.f(memberDeserializer2, "p0");
        v7.g.f(protoBuf$Function2, "p1");
        return memberDeserializer2.e(protoBuf$Function2);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final d d() {
        return i.a(MemberDeserializer.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String e() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }

    @Override // kotlin.jvm.internal.CallableReference, c8.a
    public final String getName() {
        return "loadFunction";
    }
}
