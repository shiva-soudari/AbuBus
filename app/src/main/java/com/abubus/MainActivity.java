package com.abubus;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.models.cities.City;
import com.models.cities.CityList;
import com.retrofit.ApiInterface;
import com.retrofit.RetrofitApiClient;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView etFromCity,etToCity;
    ArrayList<String> citiNames=new ArrayList<>();
    TextView txtSearchBus;
    EditText txtDoJ;
    List<City> citiesData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFromCity = findViewById(R.id.etFromCity);
        etToCity=findViewById(R.id.etToCity);
        txtSearchBus = findViewById(R.id.txtSearchBus);

        txtDoJ = (EditText)findViewById(R.id.txtDoJ);

        txtDoJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // ShowDatePickerDialog(MainActivity.this);
            }
        });

        txtSearchBus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,AvailTripsActivity.class));
            }
        });
        Login();
    }


    public void Login() {

        final ApiInterface service = RetrofitApiClient.retGet().create(ApiInterface.class);

        retrofit2.Call<CityList> call = service.loginn();
        call.enqueue(new Callback<CityList>() {
            @Override
            public void onResponse(retrofit2.Call<CityList> call, Response<CityList> response)
            {
                if (response.isSuccessful() && response.body() != null) {
                    CityList list = response.body();
                    citiesData = list.getCities();
                    setDataToActv();
                }

                //System.out.println("The Total Data:====="+citiesData.toString());
                Toast.makeText(MainActivity.this, "No of cities is:==="+citiesData.toString()+"", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<CityList> call, Throwable t) {
                call.cancel();
                Toast.makeText(MainActivity.this, "Please check your network connection and internet permission", Toast.LENGTH_LONG).show();
            }
        });
        // startActivity(new Intent(getApplicationContext(), Home.class));
    }

    public void ShowDatePickerDialog(Activity activity) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(activity.getFragmentManager(), "datePicker");
    }

    @SuppressLint("ValidFragment")
    public class DatePickerFragment extends DialogFragment
            implements DatePickerDialog.OnDateSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the current date as the default date in the picker
            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            //Create a new instance of DatePickerDialog and return it
            return new DatePickerDialog(getActivity(), this, year, month, day);
        }

        public void onDateSet(DatePicker view, int year, int month, int day) {
            // Do something with the date chosen by the user

            int MotnhVal=month+1;

            String monthval;

            if (MotnhVal<10){
                monthval="0"+MotnhVal+"/"+day+"/"+year;
            }else {
                monthval=+MotnhVal+"/"+day+"/"+year;
            }
            txtDoJ.setText(monthval);

        }

    }

    private  void setDataToActv()
    {
        for(int i=0;i<citiesData.size();i++)
        {
            citiNames.add(citiesData.get(i).getName());
        }

        etFromCity.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,citiNames));
        etToCity.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,citiNames));
    }

}
