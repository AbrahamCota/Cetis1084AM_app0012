package a1.cetis108.cetis1084am_app001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void BtnNombre_onClick (View v) {
        TextView texto=(TextView)findViewById(R.id.texto);
        EditText editar=(EditText)findViewById(R.id.textoeditar);

        texto.setText("K rollo k pez "+editar.getText());

    }
}
