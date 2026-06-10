package l3;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.MapFieldLite;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.WireFormat$FieldType;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.g;
import androidx.datastore.preferences.protobuf.j0;
import androidx.datastore.preferences.protobuf.m;
import androidx.datastore.preferences.protobuf.q0;
import androidx.datastore.preferences.protobuf.u0;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends GeneratedMessageLite<a, C0180a> implements j0 {
    private static final a DEFAULT_INSTANCE;
    private static volatile q0<a> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private MapFieldLite<String, PreferencesProto$Value> preferences_ = MapFieldLite.f4819j;

    /* renamed from: l3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0180a extends GeneratedMessageLite.a<a, C0180a> implements j0 {
        public C0180a() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final c0<String, PreferencesProto$Value> f15792a = new c0<>(WireFormat$FieldType.f4825k, WireFormat$FieldType.f4827m, PreferencesProto$Value.y());
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        GeneratedMessageLite.o(a.class, aVar);
    }

    public static MapFieldLite q(a aVar) {
        MapFieldLite<String, PreferencesProto$Value> mapFieldLite = aVar.preferences_;
        if (!mapFieldLite.f4820i) {
            aVar.preferences_ = mapFieldLite.c();
        }
        return aVar.preferences_;
    }

    public static C0180a s() {
        return (C0180a) ((GeneratedMessageLite.a) DEFAULT_INSTANCE.k(GeneratedMessageLite.MethodToInvoke.NEW_BUILDER));
    }

    public static a t(FileInputStream fileInputStream) {
        GeneratedMessageLite n = GeneratedMessageLite.n(DEFAULT_INSTANCE, new g.b(fileInputStream), m.a());
        if (n.a()) {
            return (a) n;
        }
        throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object k(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                return new u0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f15792a});
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                return new a();
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                return new C0180a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q0<a> q0Var = PARSER;
                if (q0Var == null) {
                    synchronized (a.class) {
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

    public final Map<String, PreferencesProto$Value> r() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
