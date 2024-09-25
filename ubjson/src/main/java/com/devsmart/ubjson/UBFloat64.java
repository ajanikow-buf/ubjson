package com.devsmart.ubjson;


public final class UBFloat64 extends UBValue {

    private static final long serialVersionUID = -6815484329236340173L;
    private double mValue;

    UBFloat64(double value) {
        mValue = value;
    }

    @Override
    public Type getType() {
        return Type.Float64;
    }

    public float getFloat() {
        return (float) mValue;
    }

    public double getDouble() {
        return mValue;
    }

    @Override
    public String toString() {
        return Double.toString(getDouble());
    }
}
