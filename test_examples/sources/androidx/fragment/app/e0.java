package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new a();

    /* renamed from: i  reason: collision with root package name */
    public final String f5136i;

    /* renamed from: j  reason: collision with root package name */
    public final String f5137j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f5138k;

    /* renamed from: l  reason: collision with root package name */
    public final int f5139l;

    /* renamed from: m  reason: collision with root package name */
    public final int f5140m;
    public final String n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f5141o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f5142p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f5143q;

    /* renamed from: r  reason: collision with root package name */
    public final Bundle f5144r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f5145s;

    /* renamed from: t  reason: collision with root package name */
    public final int f5146t;

    /* renamed from: u  reason: collision with root package name */
    public Bundle f5147u;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<e0> {
        @Override // android.os.Parcelable.Creator
        public final e0 createFromParcel(Parcel parcel) {
            return new e0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final e0[] newArray(int i10) {
            return new e0[i10];
        }
    }

    public e0(Parcel parcel) {
        this.f5136i = parcel.readString();
        this.f5137j = parcel.readString();
        boolean z10 = true;
        this.f5138k = parcel.readInt() != 0;
        this.f5139l = parcel.readInt();
        this.f5140m = parcel.readInt();
        this.n = parcel.readString();
        this.f5141o = parcel.readInt() != 0;
        this.f5142p = parcel.readInt() != 0;
        this.f5143q = parcel.readInt() != 0;
        this.f5144r = parcel.readBundle();
        if (parcel.readInt() == 0) {
            z10 = false;
        }
        this.f5145s = z10;
        this.f5147u = parcel.readBundle();
        this.f5146t = parcel.readInt();
    }

    public e0(Fragment fragment) {
        this.f5136i = fragment.getClass().getName();
        this.f5137j = fragment.f5040m;
        this.f5138k = fragment.f5047u;
        this.f5139l = fragment.D;
        this.f5140m = fragment.E;
        this.n = fragment.F;
        this.f5141o = fragment.I;
        this.f5142p = fragment.f5046t;
        this.f5143q = fragment.H;
        this.f5144r = fragment.n;
        this.f5145s = fragment.G;
        this.f5146t = fragment.T.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f5136i);
        sb.append(" (");
        sb.append(this.f5137j);
        sb.append(")}:");
        if (this.f5138k) {
            sb.append(" fromLayout");
        }
        int i10 = this.f5140m;
        if (i10 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i10));
        }
        String str = this.n;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f5141o) {
            sb.append(" retainInstance");
        }
        if (this.f5142p) {
            sb.append(" removing");
        }
        if (this.f5143q) {
            sb.append(" detached");
        }
        if (this.f5145s) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5136i);
        parcel.writeString(this.f5137j);
        parcel.writeInt(this.f5138k ? 1 : 0);
        parcel.writeInt(this.f5139l);
        parcel.writeInt(this.f5140m);
        parcel.writeString(this.n);
        parcel.writeInt(this.f5141o ? 1 : 0);
        parcel.writeInt(this.f5142p ? 1 : 0);
        parcel.writeInt(this.f5143q ? 1 : 0);
        parcel.writeBundle(this.f5144r);
        parcel.writeInt(this.f5145s ? 1 : 0);
        parcel.writeBundle(this.f5147u);
        parcel.writeInt(this.f5146t);
    }
}
