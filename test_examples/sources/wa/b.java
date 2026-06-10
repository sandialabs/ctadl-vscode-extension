package wa;

import java.util.NoSuchElementException;
import kotlinx.serialization.descriptors.b;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import sa.h;
import ua.b1;
import ua.j0;

/* loaded from: classes.dex */
public abstract class b extends b1 implements va.f {

    /* renamed from: k  reason: collision with root package name */
    public final va.a f18501k;

    /* renamed from: l  reason: collision with root package name */
    public final va.e f18502l;

    public b(va.a aVar) {
        this.f18501k = aVar;
        this.f18502l = aVar.f18191a;
    }

    public static va.k B(kotlinx.serialization.json.c cVar, String str) {
        va.k kVar = cVar instanceof va.k ? (va.k) cVar : null;
        if (kVar != null) {
            return kVar;
        }
        throw a1.c.r("Unexpected 'null' when " + str + " was expected", -1);
    }

    public abstract kotlinx.serialization.json.b D(String str);

    public final kotlinx.serialization.json.b G() {
        kotlinx.serialization.json.b D;
        String str = (String) kotlin.collections.c.w2(this.f15649i);
        if (str == null || (D = D(str)) == null) {
            return L();
        }
        return D;
    }

    @Override // va.f
    public final va.a H() {
        return this.f18501k;
    }

    public final kotlinx.serialization.json.c I(String str) {
        v7.g.f(str, "tag");
        kotlinx.serialization.json.b D = D(str);
        kotlinx.serialization.json.c cVar = D instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) D : null;
        if (cVar != null) {
            return cVar;
        }
        throw a1.c.q(-1, "Expected JsonPrimitive at " + str + ", found " + D, G().toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, ta.c
    public final <T> T J(qa.a<? extends T> aVar) {
        v7.g.f(aVar, "deserializer");
        return (T) a1.b.J(this, aVar);
    }

    public abstract kotlinx.serialization.json.b L();

    public final void M(String str) {
        throw a1.c.q(-1, "Failed to parse '" + str + '\'', G().toString());
    }

    @Override // va.f
    public final kotlinx.serialization.json.b N() {
        return G();
    }

    public void a(sa.e eVar) {
        v7.g.f(eVar, "descriptor");
    }

    @Override // ta.c, ta.d
    public ta.a b(sa.e eVar) {
        boolean z10;
        ta.a cVar;
        v7.g.f(eVar, "descriptor");
        kotlinx.serialization.json.b G = G();
        sa.h h10 = eVar.h();
        if (v7.g.a(h10, b.C0175b.f15610a)) {
            z10 = true;
        } else {
            z10 = h10 instanceof sa.c;
        }
        va.a aVar = this.f18501k;
        if (z10) {
            if (G instanceof kotlinx.serialization.json.a) {
                cVar = new n(aVar, (kotlinx.serialization.json.a) G);
            } else {
                throw a1.c.r("Expected " + v7.i.a(kotlinx.serialization.json.a.class) + " as the serialized body of " + eVar.b() + ", but had " + v7.i.a(G.getClass()), -1);
            }
        } else if (v7.g.a(h10, b.c.f15611a)) {
            sa.e a10 = w.a(eVar.j(0), aVar.f18192b);
            sa.h h11 = a10.h();
            if (!(h11 instanceof sa.d) && !v7.g.a(h11, h.b.f17531a)) {
                if (aVar.f18191a.f18211d) {
                    if (G instanceof kotlinx.serialization.json.a) {
                        cVar = new n(aVar, (kotlinx.serialization.json.a) G);
                    } else {
                        throw a1.c.r("Expected " + v7.i.a(kotlinx.serialization.json.a.class) + " as the serialized body of " + eVar.b() + ", but had " + v7.i.a(G.getClass()), -1);
                    }
                } else {
                    throw a1.c.p(a10);
                }
            }
            if (G instanceof JsonObject) {
                cVar = new o(aVar, (JsonObject) G);
            } else {
                throw a1.c.r("Expected " + v7.i.a(JsonObject.class) + " as the serialized body of " + eVar.b() + ", but had " + v7.i.a(G.getClass()), -1);
            }
        } else if (G instanceof JsonObject) {
            cVar = new kotlinx.serialization.json.internal.c(aVar, (JsonObject) G, null, null);
        } else {
            throw a1.c.r("Expected " + v7.i.a(JsonObject.class) + " as the serialized body of " + eVar.b() + ", but had " + v7.i.a(G.getClass()), -1);
        }
        return cVar;
    }

    @Override // ta.a
    public final androidx.datastore.preferences.protobuf.k c() {
        return this.f18501k.f18192b;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final boolean d(String str) {
        String str2 = str;
        v7.g.f(str2, "tag");
        kotlinx.serialization.json.c I = I(str2);
        if (!this.f18501k.f18191a.c && B(I, "boolean").f18222i) {
            throw a1.c.q(-1, a4.b.m("Boolean literal for key '", str2, "' should be unquoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON."), G().toString());
        }
        try {
            Boolean a10 = va.g.a(I);
            if (a10 != null) {
                return a10.booleanValue();
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException unused) {
            M("boolean");
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final byte e(String str) {
        boolean z10;
        Byte b5;
        String str2 = str;
        v7.g.f(str2, "tag");
        kotlinx.serialization.json.c I = I(str2);
        try {
            j0 j0Var = va.g.f18220a;
            int parseInt = Integer.parseInt(I.c());
            if (-128 <= parseInt && parseInt <= 127) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                b5 = Byte.valueOf((byte) parseInt);
            } else {
                b5 = null;
            }
            if (b5 != null) {
                return b5.byteValue();
            }
            M("byte");
            throw null;
        } catch (IllegalArgumentException unused) {
            M("byte");
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final char h(String str) {
        String str2 = str;
        v7.g.f(str2, "tag");
        try {
            String c = I(str2).c();
            v7.g.f(c, "<this>");
            int length = c.length();
            if (length != 0) {
                if (length == 1) {
                    return c.charAt(0);
                }
                throw new IllegalArgumentException("Char sequence has more than one element.");
            }
            throw new NoSuchElementException("Char sequence is empty.");
        } catch (IllegalArgumentException unused) {
            M("char");
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final double i(String str) {
        boolean z10;
        String str2 = str;
        v7.g.f(str2, "tag");
        kotlinx.serialization.json.c I = I(str2);
        try {
            j0 j0Var = va.g.f18220a;
            double parseDouble = Double.parseDouble(I.c());
            if (!this.f18501k.f18191a.f18218k) {
                if (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    throw a1.c.n(Double.valueOf(parseDouble), str2, G().toString());
                }
            }
            return parseDouble;
        } catch (IllegalArgumentException unused) {
            M("double");
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final int j(String str, sa.e eVar) {
        String str2 = str;
        v7.g.f(str2, "tag");
        v7.g.f(eVar, "enumDescriptor");
        return kotlinx.serialization.json.internal.b.b(eVar, this.f18501k, I(str2).c(), "");
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final float k(String str) {
        boolean z10;
        String str2 = str;
        v7.g.f(str2, "tag");
        kotlinx.serialization.json.c I = I(str2);
        try {
            j0 j0Var = va.g.f18220a;
            float parseFloat = Float.parseFloat(I.c());
            if (!this.f18501k.f18191a.f18218k) {
                if (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    throw a1.c.n(Float.valueOf(parseFloat), str2, G().toString());
                }
            }
            return parseFloat;
        } catch (IllegalArgumentException unused) {
            M("float");
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final ta.c n(String str, sa.e eVar) {
        String str2 = str;
        v7.g.f(str2, "tag");
        v7.g.f(eVar, "inlineDescriptor");
        if (t.a(eVar)) {
            return new j(new u(I(str2).c()), this.f18501k);
        }
        this.f15649i.add(str2);
        return this;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, ta.c
    public boolean o() {
        return !(G() instanceof JsonNull);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final int p(String str) {
        String str2 = str;
        v7.g.f(str2, "tag");
        kotlinx.serialization.json.c I = I(str2);
        try {
            j0 j0Var = va.g.f18220a;
            return Integer.parseInt(I.c());
        } catch (IllegalArgumentException unused) {
            M("int");
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final long r(String str) {
        String str2 = str;
        v7.g.f(str2, "tag");
        kotlinx.serialization.json.c I = I(str2);
        try {
            j0 j0Var = va.g.f18220a;
            return Long.parseLong(I.c());
        } catch (IllegalArgumentException unused) {
            M("long");
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final short s(String str) {
        boolean z10;
        Short sh;
        String str2 = str;
        v7.g.f(str2, "tag");
        kotlinx.serialization.json.c I = I(str2);
        try {
            j0 j0Var = va.g.f18220a;
            int parseInt = Integer.parseInt(I.c());
            if (-32768 <= parseInt && parseInt <= 32767) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                sh = Short.valueOf((short) parseInt);
            } else {
                sh = null;
            }
            if (sh != null) {
                return sh.shortValue();
            }
            M("short");
            throw null;
        } catch (IllegalArgumentException unused) {
            M("short");
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final String v(String str) {
        String str2 = str;
        v7.g.f(str2, "tag");
        kotlinx.serialization.json.c I = I(str2);
        if (!this.f18501k.f18191a.c && !B(I, "string").f18222i) {
            throw a1.c.q(-1, a4.b.m("String literal for key '", str2, "' should be quoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON."), G().toString());
        }
        if (!(I instanceof JsonNull)) {
            return I.c();
        }
        throw a1.c.q(-1, "Unexpected 'null' value instead of string literal", G().toString());
    }
}
