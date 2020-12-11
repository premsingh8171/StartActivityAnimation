# StartActivityAnimation
StartActivityAnimation basically use in Intent when one activity to another activity show.

<img src="https://raw.githubusercontent.com/premsingh8171/StartActivityAnimation/master/app/src/main/res/drawable/gifimg.gif" width="300" height="550" />

## Installation

-  Add the following to your project level `build.gradle`:
 
```gradle
allprojects {
	repositories {
		maven { url 'https://jitpack.io' }
	}
}
```
  -  Add this to your app `build.gradle`:
 
```gradle
dependencies {
      
	       implementation 'com.github.premsingh8171:StartActivityAnimation:1.0.0'

}
```

## Using onClick

```java

       Clickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                           //here we use activity Intent with animation
                AppUtils.startActivityRightToLeft(MainActivity.this, intent);

            }
        });
        
       backMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //here we use activity finish with animation
                AppUtils.finishActivityLeftToRight(MainActivity.this);

            }
        });
```

## update feature

Function      				   | description
-------------------------------------------| -------------
.startActivityRightToLeft()  | RIGHT TO Left ANIMATION
.finishActivityLeftToRight()  | LEFT TO RIGHT ANIMATION
.finishActivityRightToLeft()    | RIGHT TO LEFT ANIMATION
.startActivityForResultRightToLeft()    | RIGHT TO Left ANIMATION with data passing by intent
.startActivityForResultWithRightToLeftfinish()    | Right TO Left ANIMATION  startActivityForResult finish intent second activity to before intent activity
.startActivityBrowserIntent()    | Intent method by pass url and acti




<h2>Created and maintained by:</h2>
<p>Er.Prem singh daksha  premsingh8171@gmail.com</p>
<p><a href="https://www.linkedin.com/in/prem-singh-daksha-82az/"> <img src="https://github.com/anitaa1990/DeviceInfo-Sample/blob/master/media/linkedin-icon.png" alt="Linkedin" style="max-width:100%;"> </a></p>
