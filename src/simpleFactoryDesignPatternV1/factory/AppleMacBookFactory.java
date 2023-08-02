package simpleFactoryDesignPatternV1.factory;

import simpleFactoryDesignPatternV1.IAppleProduct;
import simpleFactoryDesignPatternV1.enums.AppleProductEnum;
import simpleFactoryDesignPatternV1.enums.AppleProductTypeEnum;
import simpleFactoryDesignPatternV1.macbook.AppleMacBookAirM1;
import simpleFactoryDesignPatternV1.macbook.AppleMacBookAirM2;
import simpleFactoryDesignPatternV1.macbook.AppleMacBookProM1;
import simpleFactoryDesignPatternV1.macbook.AppleMacBookProM2;

public class AppleMacBookFactory extends AppleFactory {

    @Override
    public IAppleProduct buildProduct(AppleProductEnum appleProductEnum) {
        IAppleProduct macbook = null;
        if (appleProductEnum == AppleProductEnum.MACBOOK_AIR_M1) {
            macbook = new AppleMacBookAirM1();
        } else if (appleProductEnum == AppleProductEnum.MACBOOK_AIR_M2) {
            macbook = new AppleMacBookAirM2();
        } else if (appleProductEnum == AppleProductEnum.MACBOOK_PRO_M1) {
            macbook = new AppleMacBookProM1();
        } else if (appleProductEnum == AppleProductEnum.MACBOOK_PRO_M2) {
            macbook = new AppleMacBookProM2();
        }
        return macbook;
    }
}
