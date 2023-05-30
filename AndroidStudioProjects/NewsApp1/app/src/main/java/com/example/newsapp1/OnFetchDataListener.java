package com.example.newsapp1;

import com.example.newsapp1.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse> {
    void onFetchData(List<NewsHeadlines> List,String message);
    void onError(String message);
}
