import android.text.Editable;
import android.text.TextWatcher;
import com.android.mms.quickreply.EditQuickReplyView;
import com.android.mms.quickreply.EditQuickReplyView.a;

public class mp
  implements TextWatcher
{
  public mp(EditQuickReplyView paramEditQuickReplyView) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (EditQuickReplyView.b(a) != null) {
      EditQuickReplyView.b(a).e();
    }
  }
}

/* Location:
 * Qualified Name:     mp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */