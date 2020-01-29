package com.gildedrose;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GildedRoseSafetyNet {
    @Test
    public void safetyNet() throws IOException {
        String expected = Files.toString(new File("src/test/test.txt"), Charsets.UTF_8);
        assertThat(TexttestFixture.generateTestString(), is(expected));
    }
}
