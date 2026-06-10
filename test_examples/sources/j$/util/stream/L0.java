package j$.util.stream;

import androidx.datastore.preferences.PreferencesProto$Value;
import j$.util.Spliterator;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC0277f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class L0 extends M0 {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f12345k = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.util.stream.K0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [j$.util.stream.K0] */
    /* JADX WARN: Type inference failed for: r1v3, types: [j$.util.stream.K0] */
    public L0(int i10, Spliterator spliterator, AbstractC0421w0 abstractC0421w0) {
        super(abstractC0421w0, spliterator, new C0330b(27), new InterfaceC0277f() { // from class: j$.util.stream.K0
            @Override // j$.util.function.BiFunction
            public final BiFunction a(Function function) {
                switch (r1) {
                    case 0:
                        function.getClass();
                        return new j$.util.concurrent.u(this, function);
                    case 1:
                        function.getClass();
                        return new j$.util.concurrent.u(this, function);
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                        function.getClass();
                        return new j$.util.concurrent.u(this, function);
                    default:
                        function.getClass();
                        return new j$.util.concurrent.u(this, function);
                }
            }

            @Override // j$.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (r1) {
                    case 0:
                        return new N0((B0) obj, (B0) obj2);
                    case 1:
                        return new O0((C0) obj, (C0) obj2);
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                        return new P0((D0) obj, (D0) obj2);
                    default:
                        return new R0((F0) obj, (F0) obj2);
                }
            }
        });
        if (i10 == 1) {
            super(abstractC0421w0, spliterator, new C0330b(28), new InterfaceC0277f() { // from class: j$.util.stream.K0
                @Override // j$.util.function.BiFunction
                public final BiFunction a(Function function) {
                    switch (r1) {
                        case 0:
                            function.getClass();
                            return new j$.util.concurrent.u(this, function);
                        case 1:
                            function.getClass();
                            return new j$.util.concurrent.u(this, function);
                        case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                            function.getClass();
                            return new j$.util.concurrent.u(this, function);
                        default:
                            function.getClass();
                            return new j$.util.concurrent.u(this, function);
                    }
                }

                @Override // j$.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    switch (r1) {
                        case 0:
                            return new N0((B0) obj, (B0) obj2);
                        case 1:
                            return new O0((C0) obj, (C0) obj2);
                        case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                            return new P0((D0) obj, (D0) obj2);
                        default:
                            return new R0((F0) obj, (F0) obj2);
                    }
                }
            });
        } else if (i10 != 2) {
        } else {
            super(abstractC0421w0, spliterator, new C0330b(29), new InterfaceC0277f() { // from class: j$.util.stream.K0
                @Override // j$.util.function.BiFunction
                public final BiFunction a(Function function) {
                    switch (r1) {
                        case 0:
                            function.getClass();
                            return new j$.util.concurrent.u(this, function);
                        case 1:
                            function.getClass();
                            return new j$.util.concurrent.u(this, function);
                        case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                            function.getClass();
                            return new j$.util.concurrent.u(this, function);
                        default:
                            function.getClass();
                            return new j$.util.concurrent.u(this, function);
                    }
                }

                @Override // j$.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    switch (r1) {
                        case 0:
                            return new N0((B0) obj, (B0) obj2);
                        case 1:
                            return new O0((C0) obj, (C0) obj2);
                        case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                            return new P0((D0) obj, (D0) obj2);
                        default:
                            return new R0((F0) obj, (F0) obj2);
                    }
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [j$.util.stream.K0] */
    public /* synthetic */ L0(Spliterator spliterator, IntFunction intFunction, AbstractC0421w0 abstractC0421w0) {
        super(abstractC0421w0, spliterator, new C0325a(2, intFunction), new InterfaceC0277f() { // from class: j$.util.stream.K0
            @Override // j$.util.function.BiFunction
            public final BiFunction a(Function function) {
                switch (r1) {
                    case 0:
                        function.getClass();
                        return new j$.util.concurrent.u(this, function);
                    case 1:
                        function.getClass();
                        return new j$.util.concurrent.u(this, function);
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                        function.getClass();
                        return new j$.util.concurrent.u(this, function);
                    default:
                        function.getClass();
                        return new j$.util.concurrent.u(this, function);
                }
            }

            @Override // j$.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (r1) {
                    case 0:
                        return new N0((B0) obj, (B0) obj2);
                    case 1:
                        return new O0((C0) obj, (C0) obj2);
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                        return new P0((D0) obj, (D0) obj2);
                    default:
                        return new R0((F0) obj, (F0) obj2);
                }
            }
        });
    }
}
