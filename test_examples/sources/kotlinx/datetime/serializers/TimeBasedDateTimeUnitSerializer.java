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
public final class TimeBasedDateTimeUnitSerializer implements b<a.e> {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeBasedDateTimeUnitSerializer f15572a = new TimeBasedDateTimeUnitSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptorImpl f15573b = kotlinx.serialization.descriptors.a.b("TimeBased", new e[0], TimeBasedDateTimeUnitSerializer$descriptor$1.f15574j);

    @Override // qa.b, qa.e, qa.a
    public final e a() {
        return f15573b;
    }

    @Override // qa.e
    public final void b(d dVar, Object obj) {
        a.e eVar = (a.e) obj;
        g.f(dVar, "encoder");
        g.f(eVar, "value");
        SerialDescriptorImpl serialDescriptorImpl = f15573b;
        ta.b b5 = dVar.b(serialDescriptorImpl);
        try {
            b5.h(serialDescriptorImpl, 0, eVar.f16143b);
            b5.a(serialDescriptorImpl);
        } finally {
        }
    }

    @Override // qa.a
    public final Object e(c cVar) {
        g.f(cVar, "decoder");
        SerialDescriptorImpl serialDescriptorImpl = f15573b;
        ta.a b5 = cVar.b(serialDescriptorImpl);
        try {
            b5.C();
            long j2 = 0;
            boolean z10 = false;
            while (true) {
                int t10 = b5.t(serialDescriptorImpl);
                if (t10 != -1) {
                    if (t10 == 0) {
                        j2 = b5.y(serialDescriptorImpl, 0);
                        z10 = true;
                    } else {
                        throw new UnknownFieldException(t10);
                    }
                } else {
                    n nVar = n.f16010a;
                    b5.a(serialDescriptorImpl);
                    if (z10) {
                        return new a.e(j2);
                    }
                    throw new MissingFieldException("nanoseconds");
                }
            }
        } finally {
        }
    }
}
