package com.airbnb.epoxy;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import com.noto.R;

/* loaded from: classes.dex */
public final class q0 extends p.e<b> implements Parcelable {
    public static final Parcelable.Creator<q0> CREATOR = new a();

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<q0> {
        @Override // android.os.Parcelable.Creator
        public final q0 createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            q0 q0Var = new q0(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                q0Var.J(parcel.readLong(), (b) parcel.readParcelable(b.class.getClassLoader()));
            }
            return q0Var;
        }

        @Override // android.os.Parcelable.Creator
        public final q0[] newArray(int i10) {
            return new q0[i10];
        }
    }

    /* loaded from: classes.dex */
    public static class b extends SparseArray<Parcelable> implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<b> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                int[] iArr = new int[readInt];
                parcel.readIntArray(iArr);
                return new b(readInt, iArr, parcel.readParcelableArray(null));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new b[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                int readInt = parcel.readInt();
                int[] iArr = new int[readInt];
                parcel.readIntArray(iArr);
                return new b(readInt, iArr, parcel.readParcelableArray(classLoader));
            }
        }

        public b() {
        }

        public b(int i10, int[] iArr, Parcelable[] parcelableArr) {
            super(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                put(iArr[i11], parcelableArr[i11]);
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            int size = size();
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = keyAt(i11);
                parcelableArr[i11] = valueAt(i11);
            }
            parcel.writeInt(size);
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }
    }

    public q0() {
    }

    public q0(int i10) {
        super(i10);
    }

    public final void N(b0 b0Var) {
        b0Var.s();
        if (!b0Var.f6617u.s()) {
            return;
        }
        b bVar = (b) h(b0Var.f5669e, null);
        if (bVar == null) {
            bVar = new b();
        }
        View view = b0Var.f5666a;
        int id = view.getId();
        if (view.getId() == -1) {
            view.setId(R.id.view_model_state_saving_id);
        }
        view.saveHierarchyState(bVar);
        view.setId(id);
        J(b0Var.f5669e, bVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int L = L();
        parcel.writeInt(L);
        for (int i11 = 0; i11 < L; i11++) {
            parcel.writeLong(t(i11));
            parcel.writeParcelable(M(i11), 0);
        }
    }
}
