package com.dicoding.picodiploma.academy.ui.bookmark;

import com.dicoding.picodiploma.academy.data.CourseEntity;

interface BookmarkFragmentCallback {
    void onShareClick(CourseEntity course);
}