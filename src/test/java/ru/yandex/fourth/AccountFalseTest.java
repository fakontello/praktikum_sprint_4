package ru.yandex.fourth;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountFalseTest {
    boolean expected;
    String cardHolderName;

    public AccountFalseTest(boolean expected, String cardHolderName) {
        this.expected = expected;
        this.cardHolderName = cardHolderName;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] checkForFalse() {
        return new Object[][] {
                { false, "kajsdhflaksjdhfalskdjfhalskdjfhalskdjfhalsdkf"},
                { false, " sdf sdf sdf"},
                {false, " sdfdf sdfsdf "},
                {false, "ss"},
                {false, ""}
        };
    }

    @Test
    public void falseTest() {
        Account account = new Account(cardHolderName);
        Boolean actual = account.checkNameToEmboss();
        Assert.assertEquals(expected, actual);
    }
}
