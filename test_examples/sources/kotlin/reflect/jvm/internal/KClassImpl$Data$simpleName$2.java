package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KClassImpl;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KClassImpl$Data$simpleName$2 extends Lambda implements u7.a<String> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ KClassImpl<T> f13129j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ KClassImpl<T>.Data f13130k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$simpleName$2(KClassImpl.Data data, KClassImpl kClassImpl) {
        super(0);
        this.f13129j = kClassImpl;
        this.f13130k = data;
    }

    @Override // u7.a
    public final String k0() {
        Method enclosingMethod;
        Constructor<?> enclosingConstructor;
        String str;
        KClassImpl<T> kClassImpl = this.f13129j;
        if (kClassImpl.f13104j.isAnonymousClass()) {
            return null;
        }
        h9.b r3 = kClassImpl.r();
        if (r3.c) {
            this.f13130k.getClass();
            Class<T> cls = kClassImpl.f13104j;
            String simpleName = cls.getSimpleName();
            if (cls.getEnclosingMethod() != null) {
                str = enclosingMethod.getName() + '$';
            } else {
                if (cls.getEnclosingConstructor() != null) {
                    str = enclosingConstructor.getName() + '$';
                } else {
                    return kotlin.text.b.s1(simpleName);
                }
            }
            return kotlin.text.b.r1(simpleName, str, simpleName);
        }
        String b5 = r3.j().b();
        v7.g.e(b5, "classId.shortClassName.asString()");
        return b5;
    }
}
