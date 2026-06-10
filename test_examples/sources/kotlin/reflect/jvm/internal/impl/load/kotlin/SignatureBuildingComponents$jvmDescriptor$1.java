package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Lambda;
import u7.l;

/* loaded from: classes.dex */
final class SignatureBuildingComponents$jvmDescriptor$1 extends Lambda implements l<String, CharSequence> {

    /* renamed from: j  reason: collision with root package name */
    public static final SignatureBuildingComponents$jvmDescriptor$1 f13923j = new SignatureBuildingComponents$jvmDescriptor$1();

    public SignatureBuildingComponents$jvmDescriptor$1() {
        super(1);
    }

    @Override // u7.l
    public final CharSequence U(String str) {
        String str2 = str;
        v7.g.f(str2, "it");
        if (str2.length() > 1) {
            return "L" + str2 + ';';
        }
        return str2;
    }
}
