package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import c8.d;
import java.io.InputStream;
import kotlin.jvm.internal.FunctionReference;
import u7.l;
import v7.g;
import v7.i;
import v9.b;

/* loaded from: classes.dex */
public /* synthetic */ class BuiltInsLoaderImpl$createPackageFragmentProvider$1 extends FunctionReference implements l<String, InputStream> {
    public BuiltInsLoaderImpl$createPackageFragmentProvider$1(b bVar) {
        super(1, bVar);
    }

    @Override // u7.l
    public final InputStream U(String str) {
        String str2 = str;
        g.f(str2, "p0");
        ((b) this.f13048j).getClass();
        return b.a(str2);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final d d() {
        return i.a(b.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String e() {
        return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
    }

    @Override // kotlin.jvm.internal.CallableReference, c8.a
    public final String getName() {
        return "loadResource";
    }
}
