package b;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import b.a;
import v7.g;

/* loaded from: classes.dex */
public final class e extends a<String, Boolean> {
    @Override // b.a
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        String str = (String) obj;
        g.f(componentActivity, "context");
        g.f(str, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
        g.e(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    @Override // b.a
    public final a.C0051a b(ComponentActivity componentActivity, Object obj) {
        boolean z10;
        String str = (String) obj;
        g.f(componentActivity, "context");
        g.f(str, "input");
        if (n2.a.a(componentActivity, str) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new a.C0051a(Boolean.TRUE);
        }
        return null;
    }

    @Override // b.a
    public final Object c(Intent intent, int i10) {
        boolean z10;
        boolean z11;
        if (intent != null && i10 == -1) {
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            boolean z12 = false;
            if (intArrayExtra != null) {
                int length = intArrayExtra.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        if (intArrayExtra[i11] == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            z10 = true;
                            break;
                        }
                        i11++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    z12 = true;
                }
            }
            return Boolean.valueOf(z12);
        }
        return Boolean.FALSE;
    }
}
