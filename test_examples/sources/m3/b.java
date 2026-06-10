package m3;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.SingleProcessDataStore;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.c;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.u;
import j3.h;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import l3.a;
import m3.a;
import m7.n;
import ma.i;
import v7.g;

/* loaded from: classes.dex */
public final class b implements h<m3.a> {

    /* renamed from: a  reason: collision with root package name */
    public static final b f15976a = new b();

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15977a;

        static {
            int[] iArr = new int[PreferencesProto$Value.ValueCase.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[6] = 3;
            iArr[2] = 4;
            iArr[3] = 5;
            iArr[4] = 6;
            iArr[5] = 7;
            iArr[7] = 8;
            f15977a = iArr;
        }
    }

    @Override // j3.h
    public final MutablePreferences a() {
        return new MutablePreferences(true, 1);
    }

    @Override // j3.h
    public final n b(Object obj, SingleProcessDataStore.b bVar) {
        PreferencesProto$Value.a G;
        Map<a.C0185a<?>, Object> a10 = ((m3.a) obj).a();
        a.C0180a s10 = l3.a.s();
        for (Map.Entry<a.C0185a<?>, Object> entry : a10.entrySet()) {
            Object value = entry.getValue();
            String str = entry.getKey().f15975a;
            if (value instanceof Boolean) {
                G = PreferencesProto$Value.G();
                boolean booleanValue = ((Boolean) value).booleanValue();
                G.k();
                PreferencesProto$Value.u((PreferencesProto$Value) G.f4805j, booleanValue);
            } else if (value instanceof Float) {
                G = PreferencesProto$Value.G();
                float floatValue = ((Number) value).floatValue();
                G.k();
                PreferencesProto$Value.v((PreferencesProto$Value) G.f4805j, floatValue);
            } else if (value instanceof Double) {
                G = PreferencesProto$Value.G();
                double doubleValue = ((Number) value).doubleValue();
                G.k();
                PreferencesProto$Value.s((PreferencesProto$Value) G.f4805j, doubleValue);
            } else if (value instanceof Integer) {
                G = PreferencesProto$Value.G();
                int intValue = ((Number) value).intValue();
                G.k();
                PreferencesProto$Value.w((PreferencesProto$Value) G.f4805j, intValue);
            } else if (value instanceof Long) {
                G = PreferencesProto$Value.G();
                long longValue = ((Number) value).longValue();
                G.k();
                PreferencesProto$Value.p((PreferencesProto$Value) G.f4805j, longValue);
            } else if (value instanceof String) {
                G = PreferencesProto$Value.G();
                G.k();
                PreferencesProto$Value.q((PreferencesProto$Value) G.f4805j, (String) value);
            } else if (value instanceof Set) {
                G = PreferencesProto$Value.G();
                c.a t10 = c.t();
                t10.k();
                c.q((c) t10.f4805j, (Set) value);
                G.k();
                PreferencesProto$Value.r((PreferencesProto$Value) G.f4805j, t10);
            } else {
                throw new IllegalStateException(g.k(value.getClass().getName(), "PreferencesSerializer does not support type: "));
            }
            s10.getClass();
            str.getClass();
            s10.k();
            l3.a.q((l3.a) s10.f4805j).put(str, G.i());
        }
        l3.a i10 = s10.i();
        int b5 = i10.b();
        Logger logger = CodedOutputStream.f4780j;
        if (b5 > 4096) {
            b5 = 4096;
        }
        CodedOutputStream.c cVar = new CodedOutputStream.c(bVar, b5);
        i10.e(cVar);
        if (cVar.n > 0) {
            cVar.K1();
        }
        return n.f16010a;
    }

    @Override // j3.h
    public final MutablePreferences c(FileInputStream fileInputStream) {
        int i10;
        a.C0185a<?> c0185a;
        Object valueOf;
        a.C0185a<?> c0185a2;
        Object valueOf2;
        a.C0185a<?> c0185a3;
        try {
            l3.a t10 = l3.a.t(fileInputStream);
            MutablePreferences mutablePreferences = new MutablePreferences(false, 1);
            a.b[] bVarArr = (a.b[]) Arrays.copyOf(new a.b[0], 0);
            g.f(bVarArr, "pairs");
            mutablePreferences.c();
            if (bVarArr.length <= 0) {
                Map<String, PreferencesProto$Value> r3 = t10.r();
                g.e(r3, "preferencesProto.preferencesMap");
                for (Map.Entry<String, PreferencesProto$Value> entry : r3.entrySet()) {
                    String key = entry.getKey();
                    PreferencesProto$Value value = entry.getValue();
                    g.e(key, "name");
                    g.e(value, "value");
                    PreferencesProto$Value.ValueCase F = value.F();
                    if (F == null) {
                        i10 = -1;
                    } else {
                        i10 = a.f15977a[F.ordinal()];
                    }
                    switch (i10) {
                        case -1:
                            throw new CorruptionException("Value case is null.");
                        case 0:
                        default:
                            throw new NoWhenBranchMatchedException();
                        case 1:
                            c0185a2 = new a.C0185a<>(key);
                            valueOf2 = Boolean.valueOf(value.x());
                            c0185a3 = c0185a2;
                            mutablePreferences.e(c0185a3, valueOf2);
                        case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                            c0185a2 = new a.C0185a<>(key);
                            valueOf2 = Float.valueOf(value.A());
                            c0185a3 = c0185a2;
                            mutablePreferences.e(c0185a3, valueOf2);
                        case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                            c0185a = new a.C0185a<>(key);
                            valueOf = Double.valueOf(value.z());
                            mutablePreferences.e(c0185a, valueOf);
                        case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                            c0185a2 = new a.C0185a<>(key);
                            valueOf2 = Integer.valueOf(value.B());
                            c0185a3 = c0185a2;
                            mutablePreferences.e(c0185a3, valueOf2);
                        case 5:
                            c0185a3 = i.C(key);
                            valueOf2 = Long.valueOf(value.C());
                            mutablePreferences.e(c0185a3, valueOf2);
                        case 6:
                            c0185a3 = i.N(key);
                            valueOf2 = value.D();
                            g.e(valueOf2, "value.string");
                            mutablePreferences.e(c0185a3, valueOf2);
                        case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                            c0185a = new a.C0185a<>(key);
                            u.c s10 = value.E().s();
                            g.e(s10, "value.stringSet.stringsList");
                            valueOf = kotlin.collections.c.Q2(s10);
                            mutablePreferences.e(c0185a, valueOf);
                        case 8:
                            throw new CorruptionException("Value not set.");
                    }
                }
                return new MutablePreferences((Map<a.C0185a<?>, Object>) d.P1(mutablePreferences.a()), true);
            }
            bVarArr[0].getClass();
            mutablePreferences.e(null, null);
            throw null;
        } catch (InvalidProtocolBufferException e10) {
            throw new CorruptionException(e10);
        }
    }
}
