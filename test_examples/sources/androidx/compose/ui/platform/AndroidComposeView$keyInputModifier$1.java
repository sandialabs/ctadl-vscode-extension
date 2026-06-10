package androidx.compose.ui.platform;

import android.view.KeyEvent;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le1/b;", "it", "", "invoke-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class AndroidComposeView$keyInputModifier$1 extends Lambda implements u7.l<e1.b, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f3605j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$keyInputModifier$1(AndroidComposeView androidComposeView) {
        super(1);
        this.f3605j = androidComposeView;
    }

    @Override // u7.l
    public final Boolean U(e1.b bVar) {
        boolean a10;
        boolean a11;
        boolean a12;
        t0.a aVar;
        char c;
        int i10;
        KeyEvent keyEvent = bVar.f10599a;
        v7.g.f(keyEvent, "it");
        AndroidComposeView androidComposeView = this.f3605j;
        androidComposeView.getClass();
        long j2 = m0.b.j(keyEvent.getKeyCode());
        boolean z10 = true;
        if (e1.a.a(j2, e1.a.f10594g)) {
            if (keyEvent.isShiftPressed()) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            aVar = new t0.a(i10);
        } else if (e1.a.a(j2, e1.a.f10592e)) {
            aVar = new t0.a(4);
        } else if (e1.a.a(j2, e1.a.f10591d)) {
            aVar = new t0.a(3);
        } else if (e1.a.a(j2, e1.a.f10590b)) {
            aVar = new t0.a(5);
        } else if (e1.a.a(j2, e1.a.c)) {
            aVar = new t0.a(6);
        } else {
            if (e1.a.a(j2, e1.a.f10593f)) {
                a10 = true;
            } else {
                a10 = e1.a.a(j2, e1.a.f10595h);
            }
            if (a10) {
                a11 = true;
            } else {
                a11 = e1.a.a(j2, e1.a.f10597j);
            }
            if (a11) {
                aVar = new t0.a(7);
            } else {
                if (e1.a.a(j2, e1.a.f10589a)) {
                    a12 = true;
                } else {
                    a12 = e1.a.a(j2, e1.a.f10596i);
                }
                if (a12) {
                    aVar = new t0.a(8);
                } else {
                    aVar = null;
                }
            }
        }
        if (aVar != null) {
            int action = keyEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    c = 0;
                } else {
                    c = 1;
                }
            } else {
                c = 2;
            }
            if (c != 2) {
                z10 = false;
            }
            if (z10) {
                return Boolean.valueOf(androidComposeView.getFocusManager().a(aVar.f17542a));
            }
        }
        return Boolean.FALSE;
    }
}
