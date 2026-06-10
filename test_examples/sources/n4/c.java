package n4;

import android.app.Notification;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f16085a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16086b;
    public final Notification c;

    public c(int i10, int i11, Notification notification) {
        this.f16085a = i10;
        this.c = notification;
        this.f16086b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f16085a == cVar.f16085a && this.f16086b == cVar.f16086b) {
                return this.c.equals(cVar.c);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.f16085a * 31) + this.f16086b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f16085a + ", mForegroundServiceType=" + this.f16086b + ", mNotification=" + this.c + '}';
    }
}
