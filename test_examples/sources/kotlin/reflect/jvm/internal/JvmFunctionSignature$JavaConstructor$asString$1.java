package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import u7.l;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JvmFunctionSignature$JavaConstructor$asString$1 extends Lambda implements l<Class<?>, CharSequence> {

    /* renamed from: j  reason: collision with root package name */
    public static final JvmFunctionSignature$JavaConstructor$asString$1 f13087j = new JvmFunctionSignature$JavaConstructor$asString$1();

    public JvmFunctionSignature$JavaConstructor$asString$1() {
        super(1);
    }

    @Override // u7.l
    public final CharSequence U(Class<?> cls) {
        Class<?> cls2 = cls;
        v7.g.e(cls2, "it");
        return ReflectClassUtilKt.b(cls2);
    }
}
