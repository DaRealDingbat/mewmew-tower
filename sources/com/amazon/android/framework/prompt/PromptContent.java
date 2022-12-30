package com.amazon.android.framework.prompt;

public class PromptContent {
    private final C0082a[] buttonActions;
    private final String[] buttonLabels;
    private final int errorCode;
    private final int legacyButton;
    private final String legacyTitle;
    private final String message;
    private final boolean shouldShowFixup;
    private final String title;
    private final boolean visible;

    public PromptContent(String str, String str2, String str3, boolean z) {
        this(str, str2, str3, z, false);
    }

    public PromptContent(String str, String str2, String str3, boolean z, boolean z2) {
        this(str, str2, new String[]{str3}, new C0082a[]{C0082a.DEFAULT}, z, z2, 0);
    }

    public PromptContent(String str, String str2, String[] strArr, C0082a[] aVarArr, boolean z, boolean z2, int i) {
        this(new String[]{str}, str2, strArr, aVarArr, z, z2, i);
    }

    public PromptContent(String[] strArr, String str, String[] strArr2, C0082a[] aVarArr, boolean z, boolean z2, int i) {
        this(strArr, str, strArr2, aVarArr, z, z2, i, -1);
    }

    public PromptContent(String[] strArr, String str, String[] strArr2, C0082a[] aVarArr, boolean z, boolean z2, int i, int i2) {
        this.title = strArr[0];
        if (strArr.length > 1) {
            this.legacyTitle = strArr[1];
        } else {
            this.legacyTitle = strArr[0];
        }
        this.message = str;
        this.buttonLabels = strArr2;
        this.buttonActions = aVarArr;
        this.visible = z;
        this.shouldShowFixup = z2;
        this.legacyButton = i;
        this.errorCode = i2;
    }

    public C0082a[] getButtonActions() {
        return this.buttonActions;
    }

    public String getButtonLabel() {
        return this.buttonLabels[this.legacyButton];
    }

    public String[] getButtonLabels() {
        return this.buttonLabels;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getExtendedTitle() {
        return this.title;
    }

    public String getMessage() {
        return this.message;
    }

    public String getTitle() {
        return this.legacyTitle;
    }

    public boolean isVisible() {
        return this.visible;
    }

    public boolean shouldShowFixup() {
        return this.shouldShowFixup;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PromptContent: [ title:");
        sb.append(this.title).append(", message: ").append(this.message).append(", label: ").append(this.buttonLabels[0]).append(", visible: ").append(this.visible).append(", shouldShowFixup: ").append(this.shouldShowFixup).append("]");
        return sb.toString();
    }
}
