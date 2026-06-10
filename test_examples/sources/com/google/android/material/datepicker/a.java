package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0061a();

    /* renamed from: i  reason: collision with root package name */
    public final u f7035i;

    /* renamed from: j  reason: collision with root package name */
    public final u f7036j;

    /* renamed from: k  reason: collision with root package name */
    public final c f7037k;

    /* renamed from: l  reason: collision with root package name */
    public final u f7038l;

    /* renamed from: m  reason: collision with root package name */
    public final int f7039m;
    public final int n;

    /* renamed from: o  reason: collision with root package name */
    public final int f7040o;

    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0061a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a((u) parcel.readParcelable(u.class.getClassLoader()), (u) parcel.readParcelable(u.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (u) parcel.readParcelable(u.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: f  reason: collision with root package name */
        public static final long f7041f = c0.a(u.J(1900, 0).n);

        /* renamed from: g  reason: collision with root package name */
        public static final long f7042g = c0.a(u.J(2100, 11).n);

        /* renamed from: a  reason: collision with root package name */
        public final long f7043a;

        /* renamed from: b  reason: collision with root package name */
        public final long f7044b;
        public Long c;

        /* renamed from: d  reason: collision with root package name */
        public final int f7045d;

        /* renamed from: e  reason: collision with root package name */
        public final c f7046e;

        public b(a aVar) {
            this.f7043a = f7041f;
            this.f7044b = f7042g;
            this.f7046e = new e(Long.MIN_VALUE);
            this.f7043a = aVar.f7035i.n;
            this.f7044b = aVar.f7036j.n;
            this.c = Long.valueOf(aVar.f7038l.n);
            this.f7045d = aVar.f7039m;
            this.f7046e = aVar.f7037k;
        }
    }

    /* loaded from: classes.dex */
    public interface c extends Parcelable {
        boolean o(long j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
        if (r5.f7100i.compareTo(r3.f7100i) > 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        throw new java.lang.IllegalArgumentException("current Month cannot be after end Month");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(u uVar, u uVar2, c cVar, u uVar3, int i10) {
        Objects.requireNonNull(uVar, "start cannot be null");
        Objects.requireNonNull(uVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f7035i = uVar;
        this.f7036j = uVar2;
        this.f7038l = uVar3;
        this.f7039m = i10;
        this.f7037k = cVar;
        Calendar calendar = uVar.f7100i;
        if (uVar3 != null && calendar.compareTo(uVar3.f7100i) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (i10 >= 0 && i10 <= c0.d(null).getMaximum(7)) {
            if (calendar instanceof GregorianCalendar) {
                int i11 = uVar2.f7102k;
                int i12 = uVar.f7102k;
                this.f7040o = (uVar2.f7101j - uVar.f7101j) + ((i11 - i12) * 12) + 1;
                this.n = (i11 - i12) + 1;
                return;
            }
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f7035i.equals(aVar.f7035i) && this.f7036j.equals(aVar.f7036j) && z2.b.a(this.f7038l, aVar.f7038l) && this.f7039m == aVar.f7039m && this.f7037k.equals(aVar.f7037k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7035i, this.f7036j, this.f7038l, Integer.valueOf(this.f7039m), this.f7037k});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f7035i, 0);
        parcel.writeParcelable(this.f7036j, 0);
        parcel.writeParcelable(this.f7038l, 0);
        parcel.writeParcelable(this.f7037k, 0);
        parcel.writeInt(this.f7039m);
    }
}
