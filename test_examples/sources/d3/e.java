package d3;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import d3.h;

/* loaded from: classes.dex */
public final class e extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f10387a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InputConnection inputConnection, d dVar) {
        super(inputConnection, false);
        this.f10387a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        h hVar;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            hVar = new h(new h.a(inputContentInfo));
            if (!((d) this.f10387a).b(hVar, i10, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i10, bundle);
        }
        hVar = null;
        if (!((d) this.f10387a).b(hVar, i10, bundle)) {
        }
    }
}
