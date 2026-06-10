package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.j0;
import androidx.datastore.preferences.protobuf.q0;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.t0;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.u0;
import androidx.datastore.preferences.protobuf.y;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class c extends GeneratedMessageLite<c, a> implements j0 {
    private static final c DEFAULT_INSTANCE;
    private static volatile q0<c> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private u.c<String> strings_ = t0.f4939l;

    /* loaded from: classes.dex */
    public static final class a extends GeneratedMessageLite.a<c, a> implements j0 {
        public a() {
            super(c.DEFAULT_INSTANCE);
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        GeneratedMessageLite.o(c.class, cVar);
    }

    public static void q(c cVar, Set set) {
        int i10;
        if (!cVar.strings_.r()) {
            u.c<String> cVar2 = cVar.strings_;
            int size = cVar2.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size * 2;
            }
            cVar.strings_ = cVar2.k(i10);
        }
        List list = cVar.strings_;
        Charset charset = u.f4942a;
        set.getClass();
        if (set instanceof y) {
            List<?> b5 = ((y) set).b();
            y yVar = (y) list;
            int size2 = list.size();
            for (Object obj : b5) {
                if (obj == null) {
                    String str = "Element at index " + (yVar.size() - size2) + " is null.";
                    int size3 = yVar.size();
                    while (true) {
                        size3--;
                        if (size3 < size2) {
                            break;
                        }
                        yVar.remove(size3);
                    }
                    throw new NullPointerException(str);
                } else if (obj instanceof ByteString) {
                    yVar.n((ByteString) obj);
                } else {
                    yVar.add((String) obj);
                }
            }
        } else if (set instanceof r0) {
            list.addAll(set);
        } else {
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(set.size() + list.size());
            }
            int size4 = list.size();
            for (Object obj2 : set) {
                if (obj2 == null) {
                    String str2 = "Element at index " + (list.size() - size4) + " is null.";
                    int size5 = list.size();
                    while (true) {
                        size5--;
                        if (size5 < size4) {
                            break;
                        }
                        list.remove(size5);
                    }
                    throw new NullPointerException(str2);
                }
                list.add(obj2);
            }
        }
    }

    public static c r() {
        return DEFAULT_INSTANCE;
    }

    public static a t() {
        return (a) ((GeneratedMessageLite.a) DEFAULT_INSTANCE.k(GeneratedMessageLite.MethodToInvoke.NEW_BUILDER));
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object k(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                return new u0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                return new c();
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q0<c> q0Var = PARSER;
                if (q0Var == null) {
                    synchronized (c.class) {
                        q0Var = PARSER;
                        if (q0Var == null) {
                            q0Var = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                            PARSER = q0Var;
                        }
                    }
                }
                return q0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final u.c s() {
        return this.strings_;
    }
}
