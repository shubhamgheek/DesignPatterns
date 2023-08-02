package simpleFactoryDesignPatternV1.factory;

import simpleFactoryDesignPatternV1.IAppleProduct;
import simpleFactoryDesignPatternV1.enums.AppleProductEnum;
import simpleFactoryDesignPatternV1.enums.AppleProductTypeEnum;

public abstract class AppleFactory {

    public abstract IAppleProduct buildProduct(AppleProductEnum appleProductEnum);

    public static AppleFactory getFactory(AppleProductTypeEnum appleProductTypeEnum) {
        if (appleProductTypeEnum == AppleProductTypeEnum.LAPTOP) {
            return new AppleMacBookFactory();
        } else if (appleProductTypeEnum == AppleProductTypeEnum.SMARTPHONE) {
            return new ApplePhoneFactory();
        } else if (appleProductTypeEnum == AppleProductTypeEnum.TABLET) {
            return new AppleIPadFactory();
        }
        return null;
    }
}
