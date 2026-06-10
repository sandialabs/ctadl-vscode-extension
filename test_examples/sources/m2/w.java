package m2;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import n2.a;

/* loaded from: classes.dex */
public final class w implements Iterable<Intent> {

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList<Intent> f15973i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public final Context f15974j;

    /* loaded from: classes.dex */
    public static class a {
        public static PendingIntent a(Context context, int i10, Intent[] intentArr, int i11, Bundle bundle) {
            return PendingIntent.getActivities(context, i10, intentArr, i11, bundle);
        }
    }

    public w(Context context) {
        this.f15974j = context;
    }

    public final void c(ComponentName componentName) {
        Context context = this.f15974j;
        ArrayList<Intent> arrayList = this.f15973i;
        int size = arrayList.size();
        while (true) {
            try {
                Intent b5 = l.b(context, componentName);
                if (b5 == null) {
                    return;
                }
                arrayList.add(size, b5);
                componentName = b5.getComponent();
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e10);
            }
        }
    }

    public final PendingIntent d(int i10) {
        ArrayList<Intent> arrayList = this.f15973i;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return a.a(this.f15974j, 0, intentArr, i10, null);
    }

    public final void g() {
        ArrayList<Intent> arrayList = this.f15973i;
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            Object obj = n2.a.f16069a;
            a.C0190a.a(this.f15974j, intentArr, null);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.f15973i.iterator();
    }
}
