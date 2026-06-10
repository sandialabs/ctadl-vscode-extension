package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* renamed from: i  reason: collision with root package name */
    public final IntentSender f489i;

    /* renamed from: j  reason: collision with root package name */
    public final Intent f490j;

    /* renamed from: k  reason: collision with root package name */
    public final int f491k;

    /* renamed from: l  reason: collision with root package name */
    public final int f492l;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i10) {
            return new h[i10];
        }
    }

    public h(IntentSender intentSender, Intent intent, int i10, int i11) {
        this.f489i = intentSender;
        this.f490j = intent;
        this.f491k = i10;
        this.f492l = i11;
    }

    public h(Parcel parcel) {
        this.f489i = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f490j = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f491k = parcel.readInt();
        this.f492l = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f489i, i10);
        parcel.writeParcelable(this.f490j, i10);
        parcel.writeInt(this.f491k);
        parcel.writeInt(this.f492l);
    }
}
