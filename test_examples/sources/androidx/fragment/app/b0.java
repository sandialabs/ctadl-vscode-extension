package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.z;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class b0 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new a();

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<e0> f5114i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<String> f5115j;

    /* renamed from: k  reason: collision with root package name */
    public b[] f5116k;

    /* renamed from: l  reason: collision with root package name */
    public int f5117l;

    /* renamed from: m  reason: collision with root package name */
    public String f5118m;
    public final ArrayList<String> n;

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList<Bundle> f5119o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList<z.l> f5120p;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<b0> {
        @Override // android.os.Parcelable.Creator
        public final b0 createFromParcel(Parcel parcel) {
            return new b0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b0[] newArray(int i10) {
            return new b0[i10];
        }
    }

    public b0() {
        this.f5118m = null;
        this.n = new ArrayList<>();
        this.f5119o = new ArrayList<>();
    }

    public b0(Parcel parcel) {
        this.f5118m = null;
        this.n = new ArrayList<>();
        this.f5119o = new ArrayList<>();
        this.f5114i = parcel.createTypedArrayList(e0.CREATOR);
        this.f5115j = parcel.createStringArrayList();
        this.f5116k = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f5117l = parcel.readInt();
        this.f5118m = parcel.readString();
        this.n = parcel.createStringArrayList();
        this.f5119o = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f5120p = parcel.createTypedArrayList(z.l.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedList(this.f5114i);
        parcel.writeStringList(this.f5115j);
        parcel.writeTypedArray(this.f5116k, i10);
        parcel.writeInt(this.f5117l);
        parcel.writeString(this.f5118m);
        parcel.writeStringList(this.n);
        parcel.writeTypedList(this.f5119o);
        parcel.writeTypedList(this.f5120p);
    }
}
