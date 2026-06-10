package kotlinx.datetime.serializers;

import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import m7.n;
import na.a;
import qa.b;
import sa.e;
import ta.c;
import ta.d;
import v7.g;

/* loaded from: classes.dex */
public final class MonthBasedDateTimeUnitSerializer implements b<a.d> {

    /* renamed from: a  reason: collision with root package name */
    public static final MonthBasedDateTimeUnitSerializer f15569a = new MonthBasedDateTimeUnitSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptorImpl f15570b = kotlinx.serialization.descriptors.a.b("MonthBased", new e[0], MonthBasedDateTimeUnitSerializer$descriptor$1.f15571j);

    @Override // qa.b, qa.e, qa.a
    public final e a() {
        return f15570b;
    }

    @Override // qa.e
    public final void b(d dVar, Object obj) {
        a.d dVar2 = (a.d) obj;
        g.f(dVar, "encoder");
        g.f(dVar2, "value");
        SerialDescriptorImpl serialDescriptorImpl = f15570b;
        ta.b b5 = dVar.b(serialDescriptorImpl);
        try {
            b5.r(0, dVar2.f16142b, serialDescriptorImpl);
            b5.a(serialDescriptorImpl);
        } finally {
        }
    }

    @Override // qa.a
    public final Object e(c cVar) {
        g.f(cVar, "decoder");
        SerialDescriptorImpl serialDescriptorImpl = f15570b;
        ta.a b5 = cVar.b(serialDescriptorImpl);
        try {
            b5.C();
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                int t10 = b5.t(serialDescriptorImpl);
                if (t10 != -1) {
                    if (t10 == 0) {
                        i10 = b5.u(serialDescriptorImpl, 0);
                        z10 = true;
                    } else {
                        throw new UnknownFieldException(t10);
                    }
                } else {
                    n nVar = n.f16010a;
                    b5.a(serialDescriptorImpl);
                    if (z10) {
                        return new a.d(i10);
                    }
                    throw new MissingFieldException("months");
                }
            }
        } finally {
        }
    }
}
