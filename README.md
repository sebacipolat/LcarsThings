# LcarsThings
A single sample of an Star Trek TNG LCARS Interface for Android Thins

<img src='https://thegeekkitty.files.wordpress.com/2018/05/tng-logo.jpg?w=470&h=279g'/>

## DeliveryYa
###### by Sebastian Cipolat
[@seba_cipolat](http://twitter.com/seba_cipolat)

[www.sebastiancipolat.com](www.sebastiancipolat.com)

[sebastiancipolat Linkedin](www.linkedin.com/in/sebastiancipolat)


DeliveryYa is a single Android Instant App Example


## Download 
<p>
<a href='https://play.google.com/store/apps/details?id=com.cipolat.deliveryya'>
<img alt='Get it on Google Play' src='https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png' height="100"/>
</a>
</p>  

## Test as Instant App
 <a href='https://pedidosonline-357d1.firebaseapp.com/deliveryya/order?id=112233445566'>Click this link to launch</a>


<a href='https://www.youtube.com/watch?v=0zLxNS-ePYYs'>Watch Example Video </a>
 

## BEFORE RUN

This app use as data sources Firebase Realtime Database

Import json file from bd_firebase/pedidosonline-357d1-export.json into your firebase database

Reeplace the google-services.json with your own files

## Home
<img src='https://github.com/sebacipolat/DeliveryYa/blob/master/ImagesGithub/home.png' height="350"/>


## Order Detail

<img src='https://github.com/sebacipolat/DeliveryYa/blob/master/ImagesGithub/pizza.png' height="350"/>

## Technologies
This is a simple example I only use firebase, appcompat,glide.

Butterknife, databinding was not used due issues related to feature modules and google play

## Architecture

<p>Normally an app will be like that, all  together into an unique application module.</p>
<img src='https://github.com/sebacipolat/DeliveryYa/blob/master/ImagesGithub/app.png' height="350"/>

Instant apps is based on split the app in multiple modules by function o feature.

<img src='https://github.com/sebacipolat/DeliveryYa/blob/master/ImagesGithub/modules.png' height="450"/>

The app is componed by this modules:

deliveryya-based: Base Feature Module, has all the common code use by the other modules.
deliveryya-home:  Home Screen Feature Module
deliveryya-order: Order Detail Screen Feature Module

deliveryya-app:   Installed Application Module
deliveryya-instant:Instant app Module
  
**FeedBack**

  Please feel free to report bugs, suggestion,etc. I'll be pending.
  
  If you will made a fork an use on your project let me know! to add to the description.

[@seba_cipolat](http://twitter.com/seba_cipolat)

[www.sebastiancipolat.com](www.sebastiancipolat.com)

[sebastiancipolat Linkedin](www.linkedin.com/in/sebastiancipolat)

## License
    Copyright 2018 sebastian cipolat

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
