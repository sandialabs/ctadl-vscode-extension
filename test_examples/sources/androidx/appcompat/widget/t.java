package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
public class t {
    public static final int[] c = {16843067, 16843068};

    /* renamed from: a  reason: collision with root package name */
    public final ProgressBar f1107a;

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f1108b;

    public t(ProgressBar progressBar) {
        this.f1107a = progressBar;
    }

    public void a(AttributeSet attributeSet, int i10) {
        ProgressBar progressBar = this.f1107a;
        d1 m10 = d1.m(progressBar.getContext(), attributeSet, c, i10);
        Drawable f10 = m10.f(0);
        if (f10 != null) {
            if (f10 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) f10;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i11 = 0; i11 < numberOfFrames; i11++) {
                    Drawable b5 = b(animationDrawable.getFrame(i11), true);
                    b5.setLevel(10000);
                    animationDrawable2.addFrame(b5, animationDrawable.getDuration(i11));
                }
                animationDrawable2.setLevel(10000);
                f10 = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(f10);
        }
        Drawable f11 = m10.f(1);
        if (f11 != null) {
            progressBar.setProgressDrawable(b(f11, false));
        }
        m10.n();
    }

    public final Drawable b(Drawable drawable, boolean z10) {
        int layerGravity;
        int layerWidth;
        int layerHeight;
        int layerInsetLeft;
        int layerInsetRight;
        int layerInsetTop;
        int layerInsetBottom;
        int layerInsetStart;
        int layerInsetEnd;
        boolean z11;
        if (drawable instanceof r2.c) {
            r2.c cVar = (r2.c) drawable;
            Drawable b5 = cVar.b();
            if (b5 != null) {
                cVar.a(b(b5, z10));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                int id = layerDrawable.getId(i10);
                Drawable drawable2 = layerDrawable.getDrawable(i10);
                if (id != 16908301 && id != 16908303) {
                    z11 = false;
                    drawableArr[i10] = b(drawable2, z11);
                }
                z11 = true;
                drawableArr[i10] = b(drawable2, z11);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i11 = 0; i11 < numberOfLayers; i11++) {
                layerDrawable2.setId(i11, layerDrawable.getId(i11));
                if (Build.VERSION.SDK_INT >= 23) {
                    layerGravity = layerDrawable.getLayerGravity(i11);
                    layerDrawable2.setLayerGravity(i11, layerGravity);
                    layerWidth = layerDrawable.getLayerWidth(i11);
                    layerDrawable2.setLayerWidth(i11, layerWidth);
                    layerHeight = layerDrawable.getLayerHeight(i11);
                    layerDrawable2.setLayerHeight(i11, layerHeight);
                    layerInsetLeft = layerDrawable.getLayerInsetLeft(i11);
                    layerDrawable2.setLayerInsetLeft(i11, layerInsetLeft);
                    layerInsetRight = layerDrawable.getLayerInsetRight(i11);
                    layerDrawable2.setLayerInsetRight(i11, layerInsetRight);
                    layerInsetTop = layerDrawable.getLayerInsetTop(i11);
                    layerDrawable2.setLayerInsetTop(i11, layerInsetTop);
                    layerInsetBottom = layerDrawable.getLayerInsetBottom(i11);
                    layerDrawable2.setLayerInsetBottom(i11, layerInsetBottom);
                    layerInsetStart = layerDrawable.getLayerInsetStart(i11);
                    layerDrawable2.setLayerInsetStart(i11, layerInsetStart);
                    layerInsetEnd = layerDrawable.getLayerInsetEnd(i11);
                    layerDrawable2.setLayerInsetEnd(i11, layerInsetEnd);
                }
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f1108b == null) {
                this.f1108b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z10) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
        return drawable;
    }
}
