package b;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import b.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import v7.g;

/* loaded from: classes.dex */
public final class d extends a<String[], Map<String, Boolean>> {
    @Override // b.a
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        String[] strArr = (String[]) obj;
        g.f(componentActivity, "context");
        g.f(strArr, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        g.e(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    @Override // b.a
    public final a.C0051a b(ComponentActivity componentActivity, Object obj) {
        boolean z10;
        boolean z11;
        String[] strArr = (String[]) obj;
        g.f(componentActivity, "context");
        g.f(strArr, "input");
        boolean z12 = true;
        if (strArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new a.C0051a((Serializable) kotlin.collections.d.K1());
        }
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (n2.a.a(componentActivity, strArr[i10]) == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                z12 = false;
                break;
            }
            i10++;
        }
        if (z12) {
            int O0 = m0.b.O0(strArr.length);
            if (O0 < 16) {
                O0 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(O0);
            for (String str : strArr) {
                linkedHashMap.put(str, Boolean.TRUE);
            }
            return new a.C0051a(linkedHashMap);
        }
        return null;
    }

    @Override // b.a
    public final Object c(Intent intent, int i10) {
        boolean z10;
        if (i10 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i11 : intArrayExtra) {
                    if (i11 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList.add(Boolean.valueOf(z10));
                }
                return kotlin.collections.d.N1(kotlin.collections.c.S2(kotlin.collections.b.k2(stringArrayExtra), arrayList));
            }
        }
        return kotlin.collections.d.K1();
    }
}
