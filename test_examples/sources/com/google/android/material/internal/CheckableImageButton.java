package com.google.android.material.internal;

import a3.j0;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.o;
import com.noto.R;

/* loaded from: classes.dex */
public class CheckableImageButton extends o implements Checkable {

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f7191o = {16842912};

    /* renamed from: l  reason: collision with root package name */
    public boolean f7192l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f7193m;
    public boolean n;

    /* loaded from: classes.dex */
    public static class a extends h3.a {
        public static final Parcelable.Creator<a> CREATOR = new C0063a();

        /* renamed from: k  reason: collision with root package name */
        public boolean f7194k;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0063a implements Parcelable.ClassLoaderCreator<a> {
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
            boolean z10 = true;
            if (parcel.readInt() != 1) {
                z10 = false;
            }
            this.f7194k = z10;
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // h3.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f11358i, i10);
            parcel.writeInt(this.f7194k ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        this.f7193m = true;
        this.n = true;
        j0.p(this, new u5.a(this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f7192l;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        return this.f7192l ? View.mergeDrawableStates(super.onCreateDrawableState(i10 + 1), f7191o) : super.onCreateDrawableState(i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f11358i);
        setChecked(aVar.f7194k);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f7194k = this.f7192l;
        return aVar;
    }

    public void setCheckable(boolean z10) {
        if (this.f7193m != z10) {
            this.f7193m = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!this.f7193m || this.f7192l == z10) {
            return;
        }
        this.f7192l = z10;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z10) {
        this.n = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.n) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f7192l);
    }
}
