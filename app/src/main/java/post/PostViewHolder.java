package post;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.menu_demo.R;

public class PostViewHolder extends RecyclerView.ViewHolder {

    TextView titleTextView;
    TextView bodyTextView;

    public PostViewHolder(View itemView) {
        super(itemView);
        titleTextView = itemView.findViewById(R.id.titleTextView);
        bodyTextView = itemView.findViewById(R.id.bodyTextView);
    }
}
