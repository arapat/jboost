package jboost.exceptions;

public class BadDataFileException extends ParseException {

  public BadDataFileException(String errorMessage, long lineNum) {
    super(errorMessage, lineNum);
  }
}
