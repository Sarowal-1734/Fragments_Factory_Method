# Application Name: GitHub Repo

## Introduction

In this project, I have implemented the GitHub REST API so that user can search for a repository and can see the most active contributor at the same time.

## Contents

* Retrofit
* Navigation Component
* Pagination
* MVVM
* Coroutines
* and many more...

## How to Install and Run the Project

You can run this project:

1. Direct on Android Studio Emulator by this link
2. Physical Device. [Apk_link](https://drive.google.com/file/d/1YfojhbgxeCb8anExtJmMJTVpmJSOGXip/view?usp=sharing)

## How to Use the Project

* Run this project on emulator or device
* You will find an editText in the main UI with a search button
* Type repositoey name and click the search icon on the editText or on the keyboard
* It will take some times to load the repositories because of finding the most active contributor needs huge calculation
* You will get 10 repositories per page (pagination)
* Tap any item to view the repository information in web browser

N.B: It would be better to see the most active contributor in another UI

## Sample Output Screenshots
1 Initial UI: 
<img src="https://firebasestorage.googleapis.com/v0/b/kitbag-ca2b0.appspot.com/o/personal%2F1.png?alt=media&token=5ae17c04-4caf-438a-8df7-39b927669200" width="100">

2 Searching UI: 
![Searching UI](https://firebasestorage.googleapis.com/v0/b/kitbag-ca2b0.appspot.com/o/personal%2F2.png?alt=media&token=30e9200d-9269-414b-82cd-b4be33fdeaa5 "Searching for repositories")

3 Search Result (10 repo): 
![Search Result](https://firebasestorage.googleapis.com/v0/b/kitbag-ca2b0.appspot.com/o/personal%2F3.png?alt=media&token=4a95a3ff-79da-4bdb-836d-defdb29cbf2c "Search Result")

4 Paginating (next 10 repo): 
![Paginating](https://firebasestorage.googleapis.com/v0/b/kitbag-ca2b0.appspot.com/o/personal%2F4.png?alt=media&token=7736bd34-ddbe-47dd-9f7b-0b501f1ff270 "Paginating for next 10 repositories")

5 Click item to open in web browser: 
![Open web](https://firebasestorage.googleapis.com/v0/b/kitbag-ca2b0.appspot.com/o/personal%2F5.png?alt=media&token=e75b0dce-3371-45f0-99d3-f2e7051cc821 "Click item to open in web browser")
