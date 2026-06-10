package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class u implements Comparable<u>, Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* renamed from: i  reason: collision with root package name */
    public final Calendar f7100i;

    /* renamed from: j  reason: collision with root package name */
    public final int f7101j;

    /* renamed from: k  reason: collision with root package name */
    public final int f7102k;

    /* renamed from: l  reason: collision with root package name */
    public final int f7103l;

    /* renamed from: m  reason: collision with root package name */
    public final int f7104m;
    public final long n;

    /* renamed from: o  reason: collision with root package name */
    public String f7105o;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<u> {
        @Override // android.os.Parcelable.Creator
        public final u createFromParcel(Parcel parcel) {
            return u.J(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final u[] newArray(int i10) {
            return new u[i10];
        }
    }

    public u(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b5 = c0.b(calendar);
        this.f7100i = b5;
        this.f7101j = b5.get(2);
        this.f7102k = b5.get(1);
        this.f7103l = b5.getMaximum(7);
        this.f7104m = b5.getActualMaximum(5);
        this.n = b5.getTimeInMillis();
    }

    public static u J(int i10, int i11) {
        Calendar d5 = c0.d(null);
        d5.set(1, i10);
        d5.set(2, i11);
        return new u(d5);
    }

    public static u K(long j2) {
        Calendar d5 = c0.d(null);
        d5.setTimeInMillis(j2);
        return new u(d5);
    }

    public final String L() {
        if (this.f7105o == null) {
            this.f7105o = DateUtils.formatDateTime(null, this.f7100i.getTimeInMillis(), 8228);
        }
        return this.f7105o;
    }

    @Override // java.lang.Comparable
    public final int compareTo(u uVar) {
        return this.f7100i.compareTo(uVar.f7100i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            return this.f7101j == uVar.f7101j && this.f7102k == uVar.f7102k;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7101j), Integer.valueOf(this.f7102k)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f7102k);
        parcel.writeInt(this.f7101j);
    }
}
