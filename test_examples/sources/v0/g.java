package v0;

import android.graphics.Paint;

/* loaded from: classes.dex */
public final /* synthetic */ class g {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f18110a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f18111b;

    static {
        new int[Paint.Style.values().length][Paint.Style.STROKE.ordinal()] = 1;
        int[] iArr = new int[Paint.Cap.values().length];
        iArr[Paint.Cap.BUTT.ordinal()] = 1;
        iArr[Paint.Cap.ROUND.ordinal()] = 2;
        iArr[Paint.Cap.SQUARE.ordinal()] = 3;
        f18110a = iArr;
        int[] iArr2 = new int[Paint.Join.values().length];
        iArr2[Paint.Join.MITER.ordinal()] = 1;
        iArr2[Paint.Join.BEVEL.ordinal()] = 2;
        iArr2[Paint.Join.ROUND.ordinal()] = 3;
        f18111b = iArr2;
    }
}
