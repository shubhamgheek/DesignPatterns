package simpleFactoryDesignPatternV1.iPad;

import simpleFactoryDesignPatternV1.IAppleProduct;
import simpleFactoryDesignPatternV1.enums.AppleProductEnum;
import simpleFactoryDesignPatternV1.enums.AppleProductTypeEnum;

public class AppleIPadAir4 implements IAppleProduct {

    @Override
    public String getType() {
        return AppleProductTypeEnum.TABLET.name();
    }

    @Override
    public String getProductName() {
        return "Apple iPad";
    }

    @Override
    public String getModel() {
        return AppleProductEnum.IPAD_AIR_4.name();
    }
}
