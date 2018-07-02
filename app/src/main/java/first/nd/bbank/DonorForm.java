package first.nd.bbank;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;

import static first.nd.bbank.MainActivity.database;

public class DonorForm extends AppCompatActivity {
    Spinner cityChoice;
    Spinner groupChoice;

    EditText Name;
    EditText Mobile;

    Button Save;

    ProgressBar progressBar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new DonorFormFragment())
                .commit();
      /*  cityChoice = (Spinner) findViewById(R.id.dropdownCity);

        String[] citis = new String[]{"Bhopal","Dewas", "Indore", "Gwalior","Jabalpur", "Ratlam", "Khandwa", "Sagar"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, citis);
        cityChoice.setAdapter(adapter);


        groupChoice = (Spinner) findViewById(R.id.dropdownGroup);
        String[] group = new String[]{"O+","O-", "A+", "B+","A-", "B-", "AB+", "AB-"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, group);
        groupChoice.setAdapter(adapter1);

        Name = (EditText) findViewById(R.id.edt_name);
        Mobile = (EditText) findViewById(R.id.edt_mobileNumber);
        Save = (Button) findViewById(R.id.btn_saveDonor);



        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = Name.getText().toString();
                String city = cityChoice.getSelectedItem().toString();
                String group = groupChoice.getSelectedItem().toString();
                String mobile = Mobile.getText().toString();
            //    String lat = MainActivity.lat.toString();
              //  String lng = MainActivity.lng.toString();

                if(name.length() == 0 )
                {
                    Toast.makeText(DonorForm.this,"Enter the Name",Toast.LENGTH_SHORT).show();
                }

                else if(mobile.length() != 10 )
                {
                    Toast.makeText(DonorForm.this,"Enter Correct Mobile Number",Toast.LENGTH_SHORT).show();
                }
                else {

                    Donor donor = new Donor(name, mobile, group, city);//,lat, lng);
                    DatabaseReference myRef = database.getReference("donors");
                    myRef.child(city).child(group).push().setValue(donor);


                    Toast.makeText(DonorForm.this, "Donor Added Successfully", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
*/
    }
}
