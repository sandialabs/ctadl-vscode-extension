package androidx.datastore.preferences;

import androidx.datastore.preferences.c;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.j0;
import androidx.datastore.preferences.protobuf.q0;
import androidx.datastore.preferences.protobuf.u0;

/* loaded from: classes.dex */
public final class PreferencesProto$Value extends GeneratedMessageLite<PreferencesProto$Value, a> implements j0 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final PreferencesProto$Value DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile q0<PreferencesProto$Value> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    /* loaded from: classes.dex */
    public enum ValueCase {
        f4755i,
        f4756j,
        f4757k,
        f4758l,
        f4759m,
        n,
        f4760o,
        f4761p;

        ValueCase() {
        }
    }

    /* loaded from: classes.dex */
    public static final class a extends GeneratedMessageLite.a<PreferencesProto$Value, a> implements j0 {
        public a() {
            super(PreferencesProto$Value.DEFAULT_INSTANCE);
        }
    }

    static {
        PreferencesProto$Value preferencesProto$Value = new PreferencesProto$Value();
        DEFAULT_INSTANCE = preferencesProto$Value;
        GeneratedMessageLite.o(PreferencesProto$Value.class, preferencesProto$Value);
    }

    public static a G() {
        return (a) ((GeneratedMessageLite.a) DEFAULT_INSTANCE.k(GeneratedMessageLite.MethodToInvoke.NEW_BUILDER));
    }

    public static void p(PreferencesProto$Value preferencesProto$Value, long j2) {
        preferencesProto$Value.valueCase_ = 4;
        preferencesProto$Value.value_ = Long.valueOf(j2);
    }

    public static void q(PreferencesProto$Value preferencesProto$Value, String str) {
        preferencesProto$Value.getClass();
        str.getClass();
        preferencesProto$Value.valueCase_ = 5;
        preferencesProto$Value.value_ = str;
    }

    public static void r(PreferencesProto$Value preferencesProto$Value, c.a aVar) {
        preferencesProto$Value.getClass();
        preferencesProto$Value.value_ = aVar.i();
        preferencesProto$Value.valueCase_ = 6;
    }

    public static void s(PreferencesProto$Value preferencesProto$Value, double d5) {
        preferencesProto$Value.valueCase_ = 7;
        preferencesProto$Value.value_ = Double.valueOf(d5);
    }

    public static void u(PreferencesProto$Value preferencesProto$Value, boolean z10) {
        preferencesProto$Value.valueCase_ = 1;
        preferencesProto$Value.value_ = Boolean.valueOf(z10);
    }

    public static void v(PreferencesProto$Value preferencesProto$Value, float f10) {
        preferencesProto$Value.valueCase_ = 2;
        preferencesProto$Value.value_ = Float.valueOf(f10);
    }

    public static void w(PreferencesProto$Value preferencesProto$Value, int i10) {
        preferencesProto$Value.valueCase_ = 3;
        preferencesProto$Value.value_ = Integer.valueOf(i10);
    }

    public static PreferencesProto$Value y() {
        return DEFAULT_INSTANCE;
    }

    public final float A() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int B() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long C() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String D() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final c E() {
        return this.valueCase_ == 6 ? (c) this.value_ : c.r();
    }

    public final ValueCase F() {
        switch (this.valueCase_) {
            case 0:
                return ValueCase.f4761p;
            case 1:
                return ValueCase.f4755i;
            case FLOAT_FIELD_NUMBER /* 2 */:
                return ValueCase.f4756j;
            case INTEGER_FIELD_NUMBER /* 3 */:
                return ValueCase.f4757k;
            case LONG_FIELD_NUMBER /* 4 */:
                return ValueCase.f4758l;
            case 5:
                return ValueCase.f4759m;
            case 6:
                return ValueCase.n;
            case DOUBLE_FIELD_NUMBER /* 7 */:
                return ValueCase.f4760o;
            default:
                return null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object k(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case FLOAT_FIELD_NUMBER /* 2 */:
                return new u0(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", c.class});
            case INTEGER_FIELD_NUMBER /* 3 */:
                return new PreferencesProto$Value();
            case LONG_FIELD_NUMBER /* 4 */:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q0<PreferencesProto$Value> q0Var = PARSER;
                if (q0Var == null) {
                    synchronized (PreferencesProto$Value.class) {
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

    public final boolean x() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final double z() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }
}
