package simpleFactoryDesignPatternV1.factory;

import simpleFactoryDesignPatternV1.IAppleProduct;
import simpleFactoryDesignPatternV1.enums.AppleProductEnum;
import simpleFactoryDesignPatternV1.iPad.AppleIPadAir4;
import simpleFactoryDesignPatternV1.iPad.AppleIPadPro;

public class AppleIPadFactory extends AppleFactory {

    @Override
    public IAppleProduct buildProduct(AppleProductEnum appleProductEnum) {
        if (appleProductEnum == AppleProductEnum.IPAD_AIR_4) {
            return new AppleIPadAir4();
        } else if (appleProductEnum == AppleProductEnum.IPAD_PRO) {
            return new AppleIPadPro();
        }
        return null;
    }
}
