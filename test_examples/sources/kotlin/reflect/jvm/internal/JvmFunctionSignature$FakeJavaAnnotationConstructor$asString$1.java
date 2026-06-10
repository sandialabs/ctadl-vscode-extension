package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import u7.l;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JvmFunctionSignature$FakeJavaAnnotationConstructor$asString$1 extends Lambda implements l<Method, CharSequence> {

    /* renamed from: j  reason: collision with root package name */
    public static final JvmFunctionSignature$FakeJavaAnnotationConstructor$asString$1 f13085j = new JvmFunctionSignature$FakeJavaAnnotationConstructor$asString$1();

    public JvmFunctionSignature$FakeJavaAnnotationConstructor$asString$1() {
        super(1);
    }

    @Override // u7.l
    public final CharSequence U(Method method) {
        Class<?> returnType = method.getReturnType();
        v7.g.e(returnType, "it.returnType");
        return ReflectClassUtilKt.b(returnType);
    }
}
