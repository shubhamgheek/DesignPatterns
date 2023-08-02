package simpleFactoryDesignPatternV1.factory;

import simpleFactoryDesignPatternV1.IAppleProduct;
import simpleFactoryDesignPatternV1.enums.AppleProductEnum;
import simpleFactoryDesignPatternV1.enums.AppleProductTypeEnum;
import simpleFactoryDesignPatternV1.iPhone.AppleIPhone13;
import simpleFactoryDesignPatternV1.iPhone.AppleIPhone14;
import simpleFactoryDesignPatternV1.iPhone.AppleIPhone14Pro;

public class ApplePhoneFactory extends AppleFactory {

    @Override
    public IAppleProduct buildProduct(AppleProductEnum appleProductEnum) {
        IAppleProduct iPhone = null;

        if (appleProductEnum == AppleProductEnum.IPHONE_13) {
            iPhone = new AppleIPhone13();
        } else if (appleProductEnum == AppleProductEnum.IPHONE_14) {
            iPhone = new AppleIPhone14();
        } else if (appleProductEnum == AppleProductEnum.IPHONE_14_PRO) {
            iPhone = new AppleIPhone14Pro();
        }
        return iPhone;
    }
}
