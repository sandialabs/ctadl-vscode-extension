package com.noto.app.settings.whatsnew;

import android.content.Context;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import f7.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import t6.u;
import u7.a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lt6/u;", "invoke", "()Lt6/u;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class WhatsNewDialogFragment$currentRelease$2 extends Lambda implements a<u> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ WhatsNewDialogFragment f9802j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhatsNewDialogFragment$currentRelease$2(WhatsNewDialogFragment whatsNewDialogFragment) {
        super(0);
        this.f9802j = whatsNewDialogFragment;
    }

    @Override // u7.a
    public final u k0() {
        Context j2 = this.f9802j.j();
        if (j2 != null) {
            return new u(q.f(j2, R.string.release_2_2_3, new Object[0]));
        }
        return null;
    }
}
