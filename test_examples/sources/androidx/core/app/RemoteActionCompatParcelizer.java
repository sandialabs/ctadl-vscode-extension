package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import j4.a;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f4610a;
        if (aVar.h(1)) {
            obj = aVar.l();
        }
        remoteActionCompat.f4610a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.f4611b;
        if (aVar.h(2)) {
            charSequence = aVar.g();
        }
        remoteActionCompat.f4611b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (aVar.h(3)) {
            charSequence2 = aVar.g();
        }
        remoteActionCompat.c = charSequence2;
        Parcelable parcelable = remoteActionCompat.f4612d;
        if (aVar.h(4)) {
            parcelable = aVar.j();
        }
        remoteActionCompat.f4612d = (PendingIntent) parcelable;
        boolean z10 = remoteActionCompat.f4613e;
        if (aVar.h(5)) {
            z10 = aVar.e();
        }
        remoteActionCompat.f4613e = z10;
        boolean z11 = remoteActionCompat.f4614f;
        if (aVar.h(6)) {
            z11 = aVar.e();
        }
        remoteActionCompat.f4614f = z11;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f4610a;
        aVar.m(1);
        aVar.t(iconCompat);
        CharSequence charSequence = remoteActionCompat.f4611b;
        aVar.m(2);
        aVar.p(charSequence);
        CharSequence charSequence2 = remoteActionCompat.c;
        aVar.m(3);
        aVar.p(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f4612d;
        aVar.m(4);
        aVar.r(pendingIntent);
        boolean z10 = remoteActionCompat.f4613e;
        aVar.m(5);
        aVar.n(z10);
        boolean z11 = remoteActionCompat.f4614f;
        aVar.m(6);
        aVar.n(z11);
    }
}
