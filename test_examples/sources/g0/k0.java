package g0;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class k0<T> extends b1<T> implements Parcelable {
    public static final Parcelable.Creator<k0<Object>> CREATOR = new a();

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.ClassLoaderCreator<k0<Object>> {
        public static k0 a(Parcel parcel, ClassLoader classLoader) {
            c1 c1Var;
            v7.g.f(parcel, "parcel");
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            Object readValue = parcel.readValue(classLoader);
            int readInt = parcel.readInt();
            if (readInt != 0) {
                if (readInt != 1) {
                    if (readInt == 2) {
                        c1Var = s0.f11078a;
                    } else {
                        throw new IllegalStateException(a4.b.i("Unsupported MutableState policy ", readInt, " was restored"));
                    }
                } else {
                    c1Var = j1.f11059a;
                }
            } else {
                c1Var = h0.f11052a;
            }
            return new k0(readValue, c1Var);
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            v7.g.f(parcel, "parcel");
            return a(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* bridge */ /* synthetic */ k0<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return a(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i10) {
            return new k0[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(T t10, c1<T> c1Var) {
        super(t10, c1Var);
        v7.g.f(c1Var, "policy");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11;
        v7.g.f(parcel, "parcel");
        parcel.writeValue(getValue());
        h0 h0Var = h0.f11052a;
        c1<T> c1Var = this.f11035i;
        if (v7.g.a(c1Var, h0Var)) {
            i11 = 0;
        } else if (v7.g.a(c1Var, j1.f11059a)) {
            i11 = 1;
        } else if (!v7.g.a(c1Var, s0.f11078a)) {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        } else {
            i11 = 2;
        }
        parcel.writeInt(i11);
    }
}
