package f6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p.h;

/* loaded from: classes.dex */
public final class a extends h3.a {
    public static final Parcelable.Creator<a> CREATOR = new C0116a();

    /* renamed from: k  reason: collision with root package name */
    public final h<String, Bundle> f10942k;

    /* renamed from: f6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0116a implements Parcelable.ClassLoaderCreator<a> {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i10) {
            return new a[i10];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader);
        }
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f10942k = new h<>(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f10942k.put(strArr[i10], bundleArr[i10]);
        }
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f10942k = new h<>();
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f10942k + "}";
    }

    @Override // h3.a, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f11358i, i10);
        h<String, Bundle> hVar = this.f10942k;
        int i11 = hVar.f16580k;
        parcel.writeInt(i11);
        String[] strArr = new String[i11];
        Bundle[] bundleArr = new Bundle[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            strArr[i12] = hVar.i(i12);
            bundleArr[i12] = hVar.k(i12);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
