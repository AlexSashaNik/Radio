package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void validateRadioWaveOverPossible() {
        radio.setCurrentRadioWave(18);
        Assertions.assertEquals(0, radio.getCurrentRadioWave());
    }
    @Test
    public void validateRadioWaveLessPossible() {
        radio.setCurrentRadioWave(-1);
        Assertions.assertEquals(9, radio.getCurrentRadioWave());
    }
    @Test
    public void currentRadioWaveUp() {
        radio.setCurrentRadioWave(9);
        Assertions.assertEquals(0, radio.currentRadioWaveUp());
    }
    @Test
    public void currentRadioWaveDown() {
        radio.setCurrentRadioWave(0);
        Assertions.assertEquals(9, radio.currentRadioWaveDown());
    }
    @Test
    public void validateChangeSoundLevelOverPossible() {
        radio.setCurrentSoundLevel(15);
        Assertions.assertEquals(0, radio.getCurrentSoundLevel());
    }
    @Test
    public void validateChangeSoundLevelUnderPossible() {
        radio.setCurrentSoundLevel(-8);
        Assertions.assertEquals(0, radio.getCurrentSoundLevel());
    }
    @Test
    public void currentSoundLevelUp() {
        radio.setCurrentSoundLevel(10);
        Assertions.assertEquals(10, radio.getCurrentSoundLevel());
    }
    @Test
    public void currentSoundLevelDown() {
        radio.setCurrentSoundLevel(0);
        Assertions.assertEquals(0, radio.getCurrentSoundLevel());
    }
}
