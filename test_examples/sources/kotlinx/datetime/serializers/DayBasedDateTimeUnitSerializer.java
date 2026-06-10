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
public final class DayBasedDateTimeUnitSerializer implements b<a.c> {

    /* renamed from: a  reason: collision with root package name */
    public static final DayBasedDateTimeUnitSerializer f15566a = new DayBasedDateTimeUnitSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptorImpl f15567b = kotlinx.serialization.descriptors.a.b("DayBased", new e[0], DayBasedDateTimeUnitSerializer$descriptor$1.f15568j);

    @Override // qa.b, qa.e, qa.a
    public final e a() {
        return f15567b;
    }

    @Override // qa.e
    public final void b(d dVar, Object obj) {
        a.c cVar = (a.c) obj;
        g.f(dVar, "encoder");
        g.f(cVar, "value");
        SerialDescriptorImpl serialDescriptorImpl = f15567b;
        ta.b b5 = dVar.b(serialDescriptorImpl);
        try {
            b5.r(0, cVar.f16141b, serialDescriptorImpl);
            b5.a(serialDescriptorImpl);
        } finally {
        }
    }

    @Override // qa.a
    public final Object e(c cVar) {
        g.f(cVar, "decoder");
        SerialDescriptorImpl serialDescriptorImpl = f15567b;
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
                        return new a.c(i10);
                    }
                    throw new MissingFieldException("days");
                }
            }
        } finally {
        }
    }
}
