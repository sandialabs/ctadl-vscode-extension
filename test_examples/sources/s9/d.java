package s9;

import y9.r;

/* loaded from: classes.dex */
public final class d extends a {
    public final kotlin.reflect.jvm.internal.impl.descriptors.a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, r rVar, g gVar) {
        super(rVar, gVar);
        if (aVar == null) {
            d(0);
            throw null;
        } else if (rVar == null) {
            d(1);
            throw null;
        } else {
            this.c = aVar;
        }
    }

    public static /* synthetic */ void d(int i10) {
        String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 2 ? 3 : 2];
        if (i10 == 1) {
            objArr[0] = "receiverType";
        } else if (i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i10 != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String format = String.format(str, objArr);
        if (i10 == 2) {
            throw new IllegalStateException(format);
        }
    }

    public final String toString() {
        return b() + ": Ext {" + this.c + "}";
    }
}
