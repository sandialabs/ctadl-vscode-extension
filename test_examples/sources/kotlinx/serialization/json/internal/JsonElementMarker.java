package kotlinx.serialization.json.internal;

import sa.e;
import ua.b0;
import v7.g;

/* loaded from: classes.dex */
public final class JsonElementMarker {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f15677a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f15678b;

    public JsonElementMarker(e eVar) {
        g.f(eVar, "descriptor");
        this.f15677a = new b0(eVar, new JsonElementMarker$origin$1(this));
    }
}
