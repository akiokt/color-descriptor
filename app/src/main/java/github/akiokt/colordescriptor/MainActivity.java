package github.akiokt.colordescriptor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner_colors;
    private TextView text_view_description_temp;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner_colors = findViewById(R.id.spinner_colors);
        text_view_description_temp = findViewById(R.id.description_temp);
    }

    public void showDescription(View view) {
        int selected_color = spinner_colors.getSelectedItemPosition();
        String description = getDescriptionBySelectedColor(selected_color);
        text_view_description_temp.setText(description);
    }

    private String getDescriptionBySelectedColor(int color_id) {
        String[] colors_description = getResources().getStringArray(R.array.description_of_character);
        return colors_description[color_id];
    }
}