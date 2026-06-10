package androidx.navigation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: i  reason: collision with root package name */
    public final UUID f5490i;

    /* renamed from: j  reason: collision with root package name */
    public final int f5491j;

    /* renamed from: k  reason: collision with root package name */
    public final Bundle f5492k;

    /* renamed from: l  reason: collision with root package name */
    public final Bundle f5493l;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i10) {
            return new j[i10];
        }
    }

    public j(Parcel parcel) {
        this.f5490i = UUID.fromString(parcel.readString());
        this.f5491j = parcel.readInt();
        this.f5492k = parcel.readBundle(j.class.getClassLoader());
        this.f5493l = parcel.readBundle(j.class.getClassLoader());
    }

    public j(i iVar) {
        this.f5490i = iVar.n;
        this.f5491j = iVar.f5479j.f5511k;
        this.f5492k = iVar.f5480k;
        Bundle bundle = new Bundle();
        this.f5493l = bundle;
        iVar.f5482m.c(bundle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5490i.toString());
        parcel.writeInt(this.f5491j);
        parcel.writeBundle(this.f5492k);
        parcel.writeBundle(this.f5493l);
    }
}
