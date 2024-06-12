package Day05.Task2_3;

interface InstrumentPlayer {
    default void playInstrument() {
        System.out.println("InstrumentPlayer: Plays an instrument.");
    }
}