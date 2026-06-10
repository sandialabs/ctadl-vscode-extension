package androidx.compose.foundation.text;

import androidx.datastore.preferences.PreferencesProto$Value;
import b0.b;
import b0.c;
import b2.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import p1.k;
import p1.p;
import u0.d;
import u7.l;
import v0.m;
import v0.o;
import v7.g;
import x0.f;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx0/f;", "Lm7/n;", "invoke", "(Lx0/f;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class TextController$drawTextAndSelectionBehind$1 extends Lambda implements l<f, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TextController f2113j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextController$drawTextAndSelectionBehind$1(TextController textController) {
        super(1);
        this.f2113j = textController;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6 A[Catch: all -> 0x00d4, TRY_ENTER, TryCatch #0 {all -> 0x00d4, blocks: (B:38:0x0098, B:41:0x00a6, B:42:0x00bc), top: B:52:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc A[Catch: all -> 0x00d4, TRY_LEAVE, TryCatch #0 {all -> 0x00d4, blocks: (B:38:0x0098, B:41:0x00a6, B:42:0x00bc), top: B:52:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0  */
    @Override // u7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n U(f fVar) {
        b bVar;
        long j2;
        boolean z10;
        boolean z11;
        boolean z12;
        m d5;
        boolean z13;
        boolean z14;
        Map<Long, b> c;
        f fVar2 = fVar;
        g.f(fVar2, "$this$drawBehind");
        TextController textController = this.f2113j;
        TextState textState = textController.f2103a;
        p1.n nVar = textState.f2121e;
        if (nVar != null) {
            textState.f2123g.getValue();
            n nVar2 = n.f16010a;
            c cVar = textController.f2104b;
            if (cVar != null && (c = cVar.c()) != null) {
                bVar = c.get(Long.valueOf(textController.f2103a.f2119b));
            } else {
                bVar = null;
            }
            if (bVar == null) {
                o b5 = fVar2.N().b();
                g.f(b5, "canvas");
                float f10 = (int) (nVar.c >> 32);
                p1.c cVar2 = nVar.f16697b;
                if (f10 < cVar2.f16651d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                try {
                    if (!z10) {
                        if (!cVar2.c && h.b(j2) >= cVar2.f16652e) {
                            z14 = false;
                            if (z14) {
                                z11 = false;
                                p1.m mVar = nVar.f16696a;
                                if (z11) {
                                    if (mVar.f16691f == 3) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (!z13) {
                                        z12 = true;
                                        if (z12) {
                                            d t10 = a1.c.t(u0.c.f17721b, a1.c.v(f10, h.b(j2)));
                                            b5.m();
                                            b5.g(t10, 1);
                                        }
                                        d5 = mVar.f16688b.f16703a.f16671a.d();
                                        p pVar = mVar.f16688b;
                                        if (d5 != null) {
                                            p1.c cVar3 = nVar.f16697b;
                                            float n = pVar.f16703a.f16671a.n();
                                            k kVar = pVar.f16703a;
                                            cVar3.a(b5, d5, n, kVar.n, kVar.f16682m);
                                        } else {
                                            p1.c cVar4 = nVar.f16697b;
                                            long a10 = pVar.f16703a.a();
                                            k kVar2 = pVar.f16703a;
                                            cVar4.b(b5, a10, kVar2.n, kVar2.f16682m);
                                        }
                                        if (z12) {
                                            b5.l();
                                        }
                                    }
                                }
                                z12 = false;
                                if (z12) {
                                }
                                d5 = mVar.f16688b.f16703a.f16671a.d();
                                p pVar2 = mVar.f16688b;
                                if (d5 != null) {
                                }
                                if (z12) {
                                }
                            }
                        }
                        z14 = true;
                        if (z14) {
                        }
                    }
                    d5 = mVar.f16688b.f16703a.f16671a.d();
                    p pVar22 = mVar.f16688b;
                    if (d5 != null) {
                    }
                    if (z12) {
                    }
                } catch (Throwable th) {
                    if (z12) {
                        b5.l();
                    }
                    throw th;
                }
                z11 = true;
                p1.m mVar2 = nVar.f16696a;
                if (z11) {
                }
                z12 = false;
                if (z12) {
                }
            } else {
                throw null;
            }
        }
        return n.f16010a;
    }
}
