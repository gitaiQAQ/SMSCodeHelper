package sdk.meizu.traffic;

import android.app.Application;
import org.json.JSONException;
import org.json.JSONObject;
import sdk.meizu.traffic.hybird.HyBirdView;
import sdk.meizu.traffic.hybird.JsCmd;

class TrafficSellerActivity$5$3
  implements Runnable
{
  TrafficSellerActivity$5$3(TrafficSellerActivity.5 param5, JsCmd paramJsCmd) {}
  
  public void run()
  {
    JSONObject localJSONObject;
    if ((TrafficSellerActivity.access$000(this$1.this$0) != null) && (TrafficSellerActivity.access$000(this$1.this$0).getWebView() != null)) {
      localJSONObject = new JSONObject();
    }
    try
    {
      localJSONObject.put("packageName", this$1.this$0.getApplication().getPackageName());
      val$cmd.setMethodArgs(new String[] { localJSONObject.toString() }).execute(TrafficSellerActivity.access$000(this$1.this$0).getWebView());
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        localJSONException.printStackTrace();
      }
    }
  }
}

/* Location:
 * Qualified Name:     sdk.meizu.traffic.TrafficSellerActivity.5.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */