package com.dicoding.picodiploma.academy.ui.reader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dicoding.picodiploma.academy.R;

public class CourseReaderActivity extends AppCompatActivity {

    public static final String EXTRA_COURSE_ID = "extra_course_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_reader);
    }
}
