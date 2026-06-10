package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import u5.n;

/* loaded from: classes.dex */
public class a {
    public static RectF a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.M && (view instanceof TabLayout.h)) {
            TabLayout.h hVar = (TabLayout.h) view;
            int contentWidth = hVar.getContentWidth();
            int contentHeight = hVar.getContentHeight();
            int b5 = (int) n.b(hVar.getContext(), 24);
            if (contentWidth < b5) {
                contentWidth = b5;
            }
            int right = (hVar.getRight() + hVar.getLeft()) / 2;
            int bottom = (hVar.getBottom() + hVar.getTop()) / 2;
            int i10 = contentWidth / 2;
            return new RectF(right - i10, bottom - (contentHeight / 2), i10 + right, (right / 2) + bottom);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public void b(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        RectF a10 = a(tabLayout, view);
        RectF a11 = a(tabLayout, view2);
        drawable.setBounds(e5.a.b(f10, (int) a10.left, (int) a11.left), drawable.getBounds().top, e5.a.b(f10, (int) a10.right, (int) a11.right), drawable.getBounds().bottom);
    }
}
