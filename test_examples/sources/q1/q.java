package q1;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class q extends Canvas {

    /* renamed from: a  reason: collision with root package name */
    public Canvas f16867a;

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        boolean clipOutPath;
        v7.g.f(path, "path");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            clipOutPath = canvas.clipOutPath(path);
            return clipOutPath;
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f10, float f11, float f12, float f13) {
        boolean clipOutRect;
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            clipOutRect = canvas.clipOutRect(f10, f11, f12, f13);
            return clipOutRect;
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i10, int i11, int i12, int i13) {
        boolean clipOutRect;
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            clipOutRect = canvas.clipOutRect(i10, i11, i12, i13);
            return clipOutRect;
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        boolean clipOutRect;
        v7.g.f(rect, "rect");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            clipOutRect = canvas.clipOutRect(rect);
            return clipOutRect;
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        boolean clipOutRect;
        v7.g.f(rectF, "rect");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            clipOutRect = canvas.clipOutRect(rectF);
            return clipOutRect;
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        v7.g.f(path, "path");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        v7.g.f(path, "path");
        v7.g.f(op, "op");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            return canvas.clipPath(path, op);
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f10, float f11, float f12, float f13) {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            return canvas.clipRect(f10, f11, f12, f13);
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f10, float f11, float f12, float f13, Region.Op op) {
        v7.g.f(op, "op");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            return canvas.clipRect(f10, f11, f12, f13, op);
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i10, int i11, int i12, int i13) {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            return canvas.clipRect(i10, i11, i12, i13);
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        v7.g.f(rect, "rect");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        v7.g.f(rect, "rect");
        v7.g.f(op, "op");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        v7.g.f(rectF, "rect");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            return canvas.clipRect(rectF);
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        v7.g.f(rectF, "rect");
        v7.g.f(op, "op");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            return canvas.clipRect(rectF, op);
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.concat(matrix);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.disableZ();
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i10, int i11, int i12, int i13) {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawARGB(i10, i11, i12, i13);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, Paint paint) {
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawArc(f10, f11, f12, f13, f14, f15, z10, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f10, float f11, boolean z10, Paint paint) {
        v7.g.f(rectF, "oval");
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawArc(rectF, f10, f11, z10, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f10, float f11, Paint paint) {
        v7.g.f(bitmap, "bitmap");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, f10, f11, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        v7.g.f(bitmap, "bitmap");
        v7.g.f(matrix, "matrix");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, matrix, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        v7.g.f(bitmap, "bitmap");
        v7.g.f(rect2, "dst");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        v7.g.f(bitmap, "bitmap");
        v7.g.f(rectF, "dst");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i10, int i11, float f10, float f11, int i12, int i13, boolean z10, Paint paint) {
        v7.g.f(iArr, "colors");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i10, i11, f10, f11, i12, i13, z10, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, Paint paint) {
        v7.g.f(iArr, "colors");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i10, i11, i12, i13, i14, i15, z10, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i10, int i11, float[] fArr, int i12, int[] iArr, int i13, Paint paint) {
        v7.g.f(bitmap, "bitmap");
        v7.g.f(fArr, "verts");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawBitmapMesh(bitmap, i10, i11, fArr, i12, iArr, i13, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f10, float f11, float f12, Paint paint) {
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawCircle(f10, f11, f12, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i10) {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawColor(i10);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i10, BlendMode blendMode) {
        v7.g.f(blendMode, "mode");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawColor(i10, blendMode);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i10, PorterDuff.Mode mode) {
        v7.g.f(mode, "mode");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawColor(i10, mode);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j2) {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawColor(j2);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j2, BlendMode blendMode) {
        v7.g.f(blendMode, "mode");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawColor(j2, blendMode);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f10, float f11, RectF rectF2, float f12, float f13, Paint paint) {
        v7.g.f(rectF, "outer");
        v7.g.f(rectF2, "inner");
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawDoubleRoundRect(rectF, f10, f11, rectF2, f12, f13, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        v7.g.f(rectF, "outer");
        v7.g.f(fArr, "outerRadii");
        v7.g.f(rectF2, "inner");
        v7.g.f(fArr2, "innerRadii");
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i10, float[] fArr, int i11, int i12, Font font, Paint paint) {
        v7.g.f(iArr, "glyphIds");
        v7.g.f(fArr, "positions");
        v7.g.f(font, "font");
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawGlyphs(iArr, i10, fArr, i11, i12, font, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f10, float f11, float f12, float f13, Paint paint) {
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawLine(f10, f11, f12, f13, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i10, int i11, Paint paint) {
        v7.g.f(fArr, "pts");
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawLines(fArr, i10, i11, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        v7.g.f(fArr, "pts");
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawLines(fArr, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f10, float f11, float f12, float f13, Paint paint) {
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawOval(f10, f11, f12, f13, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        v7.g.f(rectF, "oval");
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawOval(rectF, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawPaint(paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        v7.g.f(ninePatch, "patch");
        v7.g.f(rect, "dst");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawPatch(ninePatch, rect, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        v7.g.f(ninePatch, "patch");
        v7.g.f(rectF, "dst");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawPatch(ninePatch, rectF, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        v7.g.f(path, "path");
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawPath(path, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        v7.g.f(picture, "picture");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawPicture(picture);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        v7.g.f(picture, "picture");
        v7.g.f(rect, "dst");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawPicture(picture, rect);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        v7.g.f(picture, "picture");
        v7.g.f(rectF, "dst");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawPicture(picture, rectF);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f10, float f11, Paint paint) {
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawPoint(f10, f11, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i10, int i11, Paint paint) {
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawPoints(fArr, i10, i11, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        v7.g.f(fArr, "pts");
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawPoints(fArr, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        v7.g.f(str, "text");
        v7.g.f(fArr, "pos");
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawPosText(str, fArr, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i10, int i11, float[] fArr, Paint paint) {
        v7.g.f(cArr, "text");
        v7.g.f(fArr, "pos");
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawPosText(cArr, i10, i11, fArr, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i10, int i11, int i12) {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawRGB(i10, i11, i12);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f10, float f11, float f12, float f13, Paint paint) {
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawRect(f10, f11, f12, f13, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        v7.g.f(rect, "r");
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawRect(rect, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        v7.g.f(rectF, "rect");
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawRect(rectF, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        v7.g.f(renderNode, "renderNode");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawRenderNode(renderNode);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f10, float f11, float f12, float f13, float f14, float f15, Paint paint) {
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawRoundRect(f10, f11, f12, f13, f14, f15, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f10, float f11, Paint paint) {
        v7.g.f(rectF, "rect");
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawRoundRect(rectF, f10, f11, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i10, int i11, float f10, float f11, Paint paint) {
        v7.g.f(charSequence, "text");
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawText(charSequence, i10, i11, f10, f11, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f10, float f11, Paint paint) {
        v7.g.f(str, "text");
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawText(str, f10, f11, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i10, int i11, float f10, float f11, Paint paint) {
        v7.g.f(str, "text");
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawText(str, i10, i11, f10, f11, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i10, int i11, float f10, float f11, Paint paint) {
        v7.g.f(cArr, "text");
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawText(cArr, i10, i11, f10, f11, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f10, float f11, Paint paint) {
        v7.g.f(str, "text");
        v7.g.f(path, "path");
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawTextOnPath(str, path, f10, f11, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i10, int i11, Path path, float f10, float f11, Paint paint) {
        v7.g.f(cArr, "text");
        v7.g.f(path, "path");
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawTextOnPath(cArr, i10, i11, path, f10, f11, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        v7.g.f(measuredText, "text");
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawTextRun(measuredText, i10, i11, i12, i13, f10, f11, z10, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        v7.g.f(charSequence, "text");
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawTextRun(charSequence, i10, i11, i12, i13, f10, f11, z10, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        v7.g.f(cArr, "text");
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawTextRun(cArr, i10, i11, i12, i13, f10, f11, z10, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i10, float[] fArr, int i11, float[] fArr2, int i12, int[] iArr, int i13, short[] sArr, int i14, int i15, Paint paint) {
        v7.g.f(vertexMode, "mode");
        v7.g.f(fArr, "verts");
        v7.g.f(paint, "paint");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.drawVertices(vertexMode, i10, fArr, i11, fArr2, i12, iArr, i13, sArr, i14, i15, paint);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.enableZ();
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        v7.g.f(rect, "bounds");
        Canvas canvas = this.f16867a;
        if (canvas == null) {
            v7.g.l("nativeCanvas");
            throw null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            return canvas.getDensity();
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            return canvas.getHeight();
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        v7.g.f(matrix, "ctm");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.getMatrix(matrix);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            return canvas.getWidth();
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f10, float f11, float f12, float f13) {
        boolean quickReject;
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            quickReject = canvas.quickReject(f10, f11, f12, f13);
            return quickReject;
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f10, float f11, float f12, float f13, Canvas.EdgeType edgeType) {
        v7.g.f(edgeType, "type");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            return canvas.quickReject(f10, f11, f12, f13, edgeType);
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        boolean quickReject;
        v7.g.f(path, "path");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            quickReject = canvas.quickReject(path);
            return quickReject;
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        v7.g.f(path, "path");
        v7.g.f(edgeType, "type");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            return canvas.quickReject(path, edgeType);
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        boolean quickReject;
        v7.g.f(rectF, "rect");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            quickReject = canvas.quickReject(rectF);
            return quickReject;
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        v7.g.f(rectF, "rect");
        v7.g.f(edgeType, "type");
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            return canvas.quickReject(rectF, edgeType);
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.restore();
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i10) {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.restoreToCount(i10);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f10) {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.rotate(f10);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int save() {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            return canvas.save();
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f10, float f11, float f12, float f13, Paint paint) {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            return canvas.saveLayer(f10, f11, f12, f13, paint);
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f10, float f11, float f12, float f13, Paint paint, int i10) {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            return canvas.saveLayer(f10, f11, f12, f13, paint, i10);
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint);
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i10) {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint, i10);
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f10, float f11, float f12, float f13, int i10) {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f10, f11, f12, f13, i10);
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f10, float f11, float f12, float f13, int i10, int i11) {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f10, f11, f12, f13, i10, i11);
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i10) {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i10);
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i10, int i11) {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i10, i11);
        }
        v7.g.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void scale(float f10, float f11) {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.scale(f10, f11);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.setBitmap(bitmap);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i10) {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.setDensity(i10);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.setDrawFilter(drawFilter);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.setMatrix(matrix);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void skew(float f10, float f11) {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.skew(f10, f11);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void translate(float f10, float f11) {
        Canvas canvas = this.f16867a;
        if (canvas != null) {
            canvas.translate(f10, f11);
        } else {
            v7.g.l("nativeCanvas");
            throw null;
        }
    }
}
