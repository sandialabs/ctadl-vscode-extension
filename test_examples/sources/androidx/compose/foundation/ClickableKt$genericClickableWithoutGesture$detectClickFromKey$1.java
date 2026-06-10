package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le1/b;", "it", "", "invoke-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class ClickableKt$genericClickableWithoutGesture$detectClickFromKey$1 extends Lambda implements l<e1.b, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ boolean f1453j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ u7.a<n> f1454k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$genericClickableWithoutGesture$detectClickFromKey$1(boolean z10, u7.a<n> aVar) {
        super(1);
        this.f1453j = z10;
        this.f1454k = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    @Override // u7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean U(e1.b bVar) {
        char c;
        boolean z10;
        boolean z11;
        boolean z12;
        KeyEvent keyEvent = bVar.f10599a;
        g.f(keyEvent, "it");
        boolean z13 = false;
        if (this.f1453j) {
            int i10 = c.f1597b;
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
            if (c == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int j2 = (int) (m0.b.j(keyEvent.getKeyCode()) >> 32);
                if (j2 != 23 && j2 != 66 && j2 != 160) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12) {
                    z11 = true;
                    if (z11) {
                        this.f1454k.k0();
                        z13 = true;
                    }
                }
            }
            z11 = false;
            if (z11) {
            }
        }
        return Boolean.valueOf(z13);
    }
}
