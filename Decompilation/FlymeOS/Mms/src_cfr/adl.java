/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Object
 */
import android.net.Uri;
import com.android.mms.view.MessageListItemBase;

public class adl
implements Runnable {
    final /* synthetic */ vv a;
    final /* synthetic */ MessageListItemBase b;

    public adl(MessageListItemBase messageListItemBase, vv vv2) {
        this.b = messageListItemBase;
        this.a = vv2;
    }

    @Override
    public void run() {
        zn.a().a(this.a.t, 131, this.a.T);
    }
}

