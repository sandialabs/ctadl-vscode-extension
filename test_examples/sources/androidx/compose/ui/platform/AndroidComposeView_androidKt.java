package androidx.compose.ui.platform;

/* loaded from: classes.dex */
public final class AndroidComposeView_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final u7.l<? super v1.c, ? extends v1.d> f3653a = AndroidComposeView_androidKt$textInputServiceFactory$1.f3654j;

    public static final void a(float[] fArr, float[] fArr2) {
        float b5 = b(fArr2, 0, fArr, 0);
        float b10 = b(fArr2, 0, fArr, 1);
        float b11 = b(fArr2, 0, fArr, 2);
        float b12 = b(fArr2, 0, fArr, 3);
        float b13 = b(fArr2, 1, fArr, 0);
        float b14 = b(fArr2, 1, fArr, 1);
        float b15 = b(fArr2, 1, fArr, 2);
        float b16 = b(fArr2, 1, fArr, 3);
        float b17 = b(fArr2, 2, fArr, 0);
        float b18 = b(fArr2, 2, fArr, 1);
        float b19 = b(fArr2, 2, fArr, 2);
        float b20 = b(fArr2, 2, fArr, 3);
        float b21 = b(fArr2, 3, fArr, 0);
        float b22 = b(fArr2, 3, fArr, 1);
        float b23 = b(fArr2, 3, fArr, 2);
        float b24 = b(fArr2, 3, fArr, 3);
        fArr[0] = b5;
        fArr[1] = b10;
        fArr[2] = b11;
        fArr[3] = b12;
        fArr[4] = b13;
        fArr[5] = b14;
        fArr[6] = b15;
        fArr[7] = b16;
        fArr[8] = b17;
        fArr[9] = b18;
        fArr[10] = b19;
        fArr[11] = b20;
        fArr[12] = b21;
        fArr[13] = b22;
        fArr[14] = b23;
        fArr[15] = b24;
    }

    public static final float b(float[] fArr, int i10, float[] fArr2, int i11) {
        int i12 = i10 * 4;
        float f10 = (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12 + 0] * fArr2[0 + i11]);
        return (fArr[i12 + 3] * fArr2[12 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + f10;
    }
}
