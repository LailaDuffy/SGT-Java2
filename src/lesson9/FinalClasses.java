package lesson9;

public final class FinalClasses {

    private int someInt;

    /**
     *
     * @param anotherInt
     * @return
     */
    public int multiplyBySomeInt(int anotherInt) {
      return someInt * anotherInt;
    }
}

// cannot extend a final class
// class ExtendedFinalClasses extends  {}
