package androidx.compose.foundation.layout;

import a3.j0;
import a3.v0;
import android.os.Build;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.p;
import g0.q;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.l;
import v.j;
import v.w;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WindowInsetsHolder$Companion$current$1 extends Lambda implements l<q, p> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ c f1983j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ View f1984k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsHolder$Companion$current$1(c cVar, View view) {
        super(1);
        this.f1983j = cVar;
        this.f1984k = view;
    }

    @Override // u7.l
    public final p U(q qVar) {
        g.f(qVar, "$this$DisposableEffect");
        c cVar = this.f1983j;
        cVar.getClass();
        View view = this.f1984k;
        g.f(view, "view");
        if (cVar.f2025q == 0) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j jVar = cVar.f2026r;
            j0.i.u(view, jVar);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(jVar);
            if (Build.VERSION.SDK_INT >= 30) {
                j0.s(view, jVar);
            }
        }
        cVar.f2025q++;
        return new w(cVar, view);
    }
}
