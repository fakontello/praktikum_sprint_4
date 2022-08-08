package ru.yandex.fourth;

import org.junit.Assert;
import org.junit.Test;

public class AccountTrueTest {

    @Test
    public void checkNameTrueTest() {
        // Arrange
        Boolean expected = true;
        Account account = new Account("Тимоти Шаламе");
        // Act
        Boolean actual = account.checkNameToEmboss();
        // Assert
        Assert.assertEquals(expected, actual);
    }

}
