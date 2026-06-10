package ua;

import kotlinx.serialization.internal.TaggedDecoder;

/* loaded from: classes.dex */
public abstract class b1 extends TaggedDecoder<String> {
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final String w(sa.e eVar, int i10) {
        v7.g.f(eVar, "<this>");
        String z10 = z(eVar, i10);
        v7.g.f(z10, "nestedName");
        String str = (String) kotlin.collections.c.w2(this.f15649i);
        return z10;
    }

    public abstract String z(sa.e eVar, int i10);
}
