package j$.util.stream;

import androidx.datastore.preferences.PreferencesProto$Value;
import j$.util.function.BiConsumer;
import j$.util.function.C0303s0;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC0284i0;
import j$.util.function.InterfaceC0312z;

/* renamed from: j$.util.stream.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0330b implements IntFunction, j$.util.function.y0, BiConsumer, InterfaceC0312z, j$.util.function.K0, j$.util.function.N0, j$.util.function.Q0, j$.util.function.V, j$.util.function.B0, j$.util.function.v0, j$.util.function.T0, j$.util.function.E0, InterfaceC0284i0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12434a;

    public /* synthetic */ C0330b(int i10) {
        this.f12434a = i10;
    }

    @Override // j$.util.function.v0
    public final j$.util.function.v0 a(j$.util.function.v0 v0Var) {
        v0Var.getClass();
        return new C0303s0(this, v0Var, 1);
    }

    @Override // j$.util.function.y0
    public final void accept(Object obj, double d5) {
        switch (this.f12434a) {
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                double[] dArr = (double[]) obj;
                AbstractC0385n.a(dArr, d5);
                dArr[2] = dArr[2] + d5;
                return;
            default:
                double[] dArr2 = (double[]) obj;
                dArr2[2] = dArr2[2] + 1.0d;
                AbstractC0385n.a(dArr2, d5);
                dArr2[3] = dArr2[3] + d5;
                return;
        }
    }

    @Override // j$.util.function.B0
    public final void accept(Object obj, int i10) {
        long[] jArr = (long[]) obj;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + i10;
    }

    @Override // j$.util.function.E0
    public final void accept(Object obj, long j2) {
        long[] jArr = (long[]) obj;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + j2;
    }

    @Override // j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f12434a) {
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                AbstractC0385n.a(dArr, dArr2[0]);
                AbstractC0385n.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                return;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                AbstractC0385n.a(dArr3, dArr4[0]);
                AbstractC0385n.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                return;
            case 19:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                return;
            default:
                long[] jArr3 = (long[]) obj;
                long[] jArr4 = (long[]) obj2;
                jArr3[0] = jArr3[0] + jArr4[0];
                jArr3[1] = jArr3[1] + jArr4[1];
                return;
        }
    }

    @Override // j$.util.function.IntFunction
    public final Object apply(int i10) {
        switch (this.f12434a) {
            case 0:
                return new Object[i10];
            case 1:
                return new Double[i10];
            case 14:
                int i11 = U.f12385h;
                return new Object[i10];
            case 20:
                return new Integer[i10];
            default:
                return new Long[i10];
        }
    }

    @Override // j$.util.function.InterfaceC0284i0
    public final Object apply(long j2) {
        switch (this.f12434a) {
            case 27:
                return AbstractC0421w0.X0(j2);
            case 28:
                return AbstractC0421w0.h1(j2);
            default:
                return AbstractC0421w0.j1(j2);
        }
    }

    @Override // j$.util.function.N0
    public final double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // j$.util.function.Q0
    public final int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // j$.util.function.InterfaceC0312z
    public final long applyAsLong(double d5) {
        return 1L;
    }

    @Override // j$.util.function.V
    public final long applyAsLong(int i10) {
        return 1L;
    }

    @Override // j$.util.function.v0
    public final long applyAsLong(long j2) {
        return 1L;
    }

    @Override // j$.util.function.T0
    public final long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // j$.util.function.v0
    public final j$.util.function.v0 b(j$.util.function.v0 v0Var) {
        v0Var.getClass();
        return new C0303s0(this, v0Var, 0);
    }

    @Override // j$.util.function.BiConsumer
    public final BiConsumer c(BiConsumer biConsumer) {
        switch (this.f12434a) {
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                biConsumer.getClass();
                return new j$.util.concurrent.u(1, this, biConsumer);
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                biConsumer.getClass();
                return new j$.util.concurrent.u(1, this, biConsumer);
            case 19:
                biConsumer.getClass();
                return new j$.util.concurrent.u(1, this, biConsumer);
            default:
                biConsumer.getClass();
                return new j$.util.concurrent.u(1, this, biConsumer);
        }
    }

    @Override // j$.util.function.K0
    public final Object get() {
        switch (this.f12434a) {
            case 5:
                return new double[4];
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 14:
            case ma.i.f16049q /* 15 */:
            case 16:
            default:
                return new long[2];
            case ma.i.f16046m /* 9 */:
                return new double[3];
            case ma.i.f16047o /* 10 */:
                return new I();
            case 11:
                return new K();
            case 12:
                return new L();
            case 13:
                return new J();
            case 17:
                return new long[2];
        }
    }
}
