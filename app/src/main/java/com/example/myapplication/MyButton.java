package com.example.myapplication;

public enum MyButton {
    LOG_BUTTON1 {
        public int getId() {
            return R.id.logActionButton1;
        }

        public int getTextRes() {
            return R.string.logActionButton1Text;
        }
    },

    LOG_BUTTON2 {
        public int getId() {
            return R.id.logActionButton2;
        }

        public int getTextRes() {
            return R.string.logActionButton2Text;
        }
    },

    LOG_BUTTON3 {
        public int getId() {
            return R.id.logActionButton3;
        }

        public int getTextRes() {
            return R.string.logActionButton3Text;
        }
    };

    public abstract int getId();
    public abstract int getTextRes();
}
