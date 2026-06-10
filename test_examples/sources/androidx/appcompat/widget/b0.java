package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f857a;

    /* renamed from: b  reason: collision with root package name */
    public TextClassifier f858b;

    /* loaded from: classes.dex */
    public static final class a {
        public static TextClassifier a(TextView textView) {
            Object systemService;
            TextClassifier textClassifier;
            TextClassifier textClassifier2;
            systemService = textView.getContext().getSystemService(TextClassificationManager.class);
            TextClassificationManager textClassificationManager = (TextClassificationManager) systemService;
            if (textClassificationManager != null) {
                textClassifier2 = textClassificationManager.getTextClassifier();
                return textClassifier2;
            }
            textClassifier = TextClassifier.NO_OP;
            return textClassifier;
        }
    }

    public b0(TextView textView) {
        textView.getClass();
        this.f857a = textView;
    }
}
