# hinter

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
