package utils;

import Base.BaseClass;

public class Utilities extends BaseClass {

    public static String getCurrentUrl()
    {
      return   getDriver().getCurrentUrl();

    }
}
