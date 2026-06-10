package com.noto.app.components;

import android.app.NotificationManager;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.AppViewModel;
import com.noto.app.domain.model.Icon;
import com.noto.app.util.ModelUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import t6.a;
import t6.d;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lt6/a;", "folder", "Lt6/d;", "note", "Lm7/n;", "invoke", "(Lt6/a;Lt6/d;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TransparentActivity$onCreate$2 extends Lambda implements p<a, d, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TransparentActivity f7685j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransparentActivity$onCreate$2(TransparentActivity transparentActivity) {
        super(2);
        this.f7685j = transparentActivity;
    }

    @Override // u7.p
    public final n R(a aVar, d dVar) {
        a aVar2 = aVar;
        d dVar2 = dVar;
        g.f(aVar2, "folder");
        g.f(dVar2, "note");
        int i10 = TransparentActivity.H;
        TransparentActivity transparentActivity = this.f7685j;
        Icon icon = (Icon) ((AppViewModel) transparentActivity.F.getValue()).f7549i.getValue();
        if (ModelUtilsKt.w(dVar2)) {
            f7.p.c((NotificationManager) transparentActivity.G.getValue(), transparentActivity, aVar2, dVar2, icon);
        }
        transparentActivity.finish();
        return n.f16010a;
    }
}
