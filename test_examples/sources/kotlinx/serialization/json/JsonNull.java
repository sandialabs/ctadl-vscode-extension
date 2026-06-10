package kotlinx.serialization.json;

import kotlin.LazyThreadSafetyMode;
import m7.e;
import qa.d;
import va.n;

@d(with = n.class)
/* loaded from: classes.dex */
public final class JsonNull extends c {
    public static final JsonNull INSTANCE = new JsonNull();

    /* renamed from: i  reason: collision with root package name */
    public static final String f15671i = "null";

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ e<qa.b<Object>> f15672j = kotlin.a.a(LazyThreadSafetyMode.PUBLICATION, JsonNull$$cachedSerializer$delegate$1.f15673j);

    @Override // kotlinx.serialization.json.c
    public final String c() {
        return f15671i;
    }

    public final qa.b<JsonNull> serializer() {
        return f15672j.getValue();
    }
}
