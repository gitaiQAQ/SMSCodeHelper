/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnErrorListener
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 */
import android.media.MediaPlayer;
import android.util.Log;

class acn
implements MediaPlayer.OnErrorListener {
    final /* synthetic */ ach a;

    acn(ach ach2) {
        this.a = ach2;
    }

    public boolean onError(MediaPlayer mediaPlayer, int n2, int n3) {
        Log.d((String)"VoicePlayer", (String)"setTreamType():onPlaybackError()~~~~");
        ach.d(this.a);
        return true;
    }
}

