package com.java.funda;
class TemperatureObject {     
    int temperature;
    TemperatureObject(int temp) {
        temperature = temp;
    }
    void test() throws TooHot, TooCold {
        if ( temperature < 70 ) 
            throw new TooCold("Very Cold");
        if ( temperature > 80 ) 
            throw new TooHot("Very Hot");
    }
}
