package com.noto.app.settings.whatsnew;

import a1.c;
import android.content.Context;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import f7.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import t6.g;
import t6.h;
import t6.i;
import t6.j;
import t6.k;
import t6.l;
import t6.m;
import t6.n;
import t6.o;
import t6.p;
import t6.r;
import t6.s;
import t6.t;
import t6.u;
import u7.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lt6/g;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class WhatsNewFragment$releases$2 extends Lambda implements a<List<? extends g>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ WhatsNewFragment f9808j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhatsNewFragment$releases$2(WhatsNewFragment whatsNewFragment) {
        super(0);
        this.f9808j = whatsNewFragment;
    }

    @Override // u7.a
    public final List<? extends g> k0() {
        List<? extends g> O0;
        Context j2 = this.f9808j.j();
        if (j2 == null || (O0 = c.O0(new u(q.f(j2, R.string.release_2_2_3, new Object[0])), new t(q.f(j2, R.string.release_2_2_2, new Object[0])), new s(q.f(j2, R.string.release_2_2_1, new Object[0])), new r(q.f(j2, R.string.release_2_2_0, new Object[0])), new t6.q(q.f(j2, R.string.release_2_1_6, new Object[0])), new p(q.f(j2, R.string.release_2_1_5, new Object[0])), new o(q.f(j2, R.string.release_2_1_4, new Object[0])), new n(q.f(j2, R.string.release_2_1_3, new Object[0])), new m(q.f(j2, R.string.release_2_1_2, new Object[0])), new l(q.f(j2, R.string.release_2_1_1, new Object[0])), new k(q.f(j2, R.string.release_2_1_0, new Object[0])), new j(q.f(j2, R.string.release_2_0_1, new Object[0])), new i(q.f(j2, R.string.release_2_0_0, new Object[0])), new h(q.f(j2, R.string.release_1_8_0, new Object[0])))) == null) {
            return EmptyList.f12981i;
        }
        return O0;
    }
}
