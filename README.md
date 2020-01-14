# hinter

       

# 引入
## Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

## Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.sinothk:Hinter:1.3.0819'
	}
    
 # 使用
       findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HinterManager.applyCount(MainActivity.this, 21);
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HinterManager.removeCount(MainActivity.this); //for 1.1.4+
            }
        });
