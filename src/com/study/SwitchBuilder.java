package com.study;

public class SwitchBuilder {

    private StringBuilder mBuilder;

    public SwitchBuilder(String str) {
        this.mBuilder = new StringBuilder(str);
    }

    public SwitchBuilder(int num, int noun) {
        String binaryString = Integer.toBinaryString(num);
        if(binaryString.length() > noun){
            mBuilder = new StringBuilder(binaryString.substring(binaryString.length()-noun));
        }else {
            mBuilder = new StringBuilder();
            for (int i = binaryString.length(); i < noun; i++) {
                mBuilder.append('0');
            }
            mBuilder.append(binaryString);
        }
    }

    public SwitchBuilder reverse() {
        mBuilder.reverse();
        return this;
    }

    public SwitchBuilder turnOver() {
        for (int i = 0; i < mBuilder.length(); i++) {
            mBuilder.setCharAt(i, mBuilder.charAt(i) == '0' ? '1' : '0');
        }
        return this;
    }

    public String build(){
        return mBuilder.toString();
    }
}

