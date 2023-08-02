package simpleFactoryDesignPatternV1.macbook;

import simpleFactoryDesignPatternV1.IAppleProduct;
import simpleFactoryDesignPatternV1.enums.AppleProductEnum;
import simpleFactoryDesignPatternV1.enums.AppleProductTypeEnum;

public class AppleMacBookProM1 implements IAppleProduct {

    @Override
    public String getType() {
        return AppleProductTypeEnum.LAPTOP.name();
    }

    @Override
    public String getProductName() {
        return "Apple MacBook";
    }

    @Override
    public String getModel() {
        return AppleProductEnum.MACBOOK_PRO_M1.name();
    }
}
